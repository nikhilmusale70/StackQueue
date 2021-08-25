public class StackQueueRunner {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.show();
        System.out.println();


        linkedList.peak();
        System.out.println();

        linkedList.pop();
        linkedList.pop();
        linkedList.show();

    }
}
