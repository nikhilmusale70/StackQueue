public class MyLinkedList {
    Node head;
    int totalSize;

    public void add(int key){
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
        System.out.println("Storing "+ key);
        insertAtStart(key);
    }

    public void peak(){
        Node n =head;
        Node n2 = head;
        int n1 ;
        while (n.next.next != null){
            if (n2.key > n2.next.key) {
                n1 = n2.next.key;
                n2.next.key = n2.key;
                n2.key = n1;
            }
            n2=n2.next;

            n=n.next;
        }
        if (n2.key > n2.next.key) {
            n1 = n2.next.key;
            n2.next.key = n2.key;
            n2.key = n1;
        }

        System.out.println("Largest element is "+n2.next.key);
    }

    public int totalSize(){
        Node n = head;
        totalSize =0;

        while (n.next != null){
            n = n.next;
            totalSize++;
        }
        return totalSize;
    }

    public void pop(){
        Node n = head;
        Node n1 = null;
        totalSize();

        for(int i=0;i<totalSize-1;i++)
        {
            n = n.next;
        }
        System.out.println("Poped out :- " + n.next.key);

        n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }

    public void show(){
        Node n = head;

        while (n != null) {
            System.out.println(n.key);
            n=n.next;
        }
    }

    public void insertAtStart(int key){
        Node node = new Node();
        node.key = key;
        node.next = null;
        node.next = head;
        head = node;
    }

}
