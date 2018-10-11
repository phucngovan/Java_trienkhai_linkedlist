public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList<String>("Xin chào");
        list.printList();
        list.addFirst("Phúc");
        list.addLast("Dương");
        list.printList();
        list.remove(1);
        list.printList();
        System.out.println(list.indexOf("Xin chào"));
    }
}
