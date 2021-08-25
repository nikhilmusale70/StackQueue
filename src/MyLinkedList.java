public class MyLinkedList {
    Node head;

    private void add(int key){
        Node node = new Node();
        node.key = key;
        node.next = null;

        if (head == null)
            head=node;
        else {
            Node n = head;
            while (n.next != null){
                n=n.next;
            }
            n.next = node;
        }
    }

    public void push(int key){
        add(key);

    }
}
