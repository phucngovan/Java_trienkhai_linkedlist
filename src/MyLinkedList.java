public class MyLinkedList<E> {
    private class Node<E>{
        Node next;
        private E data;

        public Node() {
        }

        public Node(E data){
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    Node head;
    int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
    }

    public Node get(int index) {
        Node temp = head;
        int i = 0;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int index, E element) {
        Node temp = this.get(index-1);
        Node holder = temp.next;
        temp.next = new Node<E>(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node holder = head;
        head = new Node<E>(element);
        head.next = holder;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = this.getLast();
        temp.next = new Node<E>(element);
        numNodes++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = this.get(index - 1);
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public boolean removeObject(E data) {
        Node temp = head;
        int i = 0;
        boolean deleted = false;
        while (temp != null) {
            if (temp.getData() == data) {
                this.remove(i);
                i--;
                deleted = true;
            }
            i++;
        }
        return deleted;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        return this;
    }

    public boolean contains(E data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E data) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public void clear() {
        head = new Node();
    }

    public void printList() {
        Node temp = head;
        System.out.println("My list:");
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
