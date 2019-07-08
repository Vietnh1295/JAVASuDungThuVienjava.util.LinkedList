public class MyLinkedList<E> {
    Node head;
    int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNode++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        if (index == 0) {
            addFirst(element);
        } else if (index > numNode) {
            addLast(element);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp;
            temp = new Node(element);
            temp.next = holder.next;
            holder.next = temp;

            numNode++;

        }

    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 2 && temp != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNode--;
    }

    public boolean remove(Object e) {

        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (e.equals(temp.getData())) {
                temp = temp.next;
                numNode--;
                return true;

            }
            temp = temp.next;
        }

        return false;
    }

    public int size() {
        return this.numNode;
    }

    public boolean contain(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (element.equals(temp.getData())) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<E>(head.getData());
        Node temp = head;
        for (int i = 0; i < numNode-1; i++) {
            temp = temp.next;
            clone.addLast((E) temp.getData());
        }
        return clone;
    }

    public int indexOf(E element) {
        int index = -1;
        Node temp = head;
        for (int i = 0; i < numNode-1; i++) {
            if (element.equals(temp.getData())) {
                index=i;
            }
            temp = temp.next;
        }
        return index;
    }

    public boolean add(E element) {
        Node temp = head;
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        E element = (E) temp.getData();
        return element;
    }

    public E getFisrt() {
        Node temp = head;
        E element = (E) temp.getData();
        return element;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNode-1; i++) {
            temp = temp.next;
        }
        E element = (E) temp.getData();
        return element;
    }

    public void println() {
        Node temp = head;
        for (int i = 0; i < numNode && temp != null; i++) {
            System.out.print(temp.getData());
            temp = temp.next;
        }

    }


}
