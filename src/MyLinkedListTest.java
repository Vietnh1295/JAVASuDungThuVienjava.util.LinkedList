public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list =new MyLinkedList<Integer>(1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(1,6);
        list.add(2,3);
        list.add(3,4);
        list.add(1,9);
        list.add(2,3);
        list.add(3,4);
        System.out.println(list.size());
        System.out.println(list.contain(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.get(2));
        System.out.println(list.getFisrt());
        System.out.println(list.getLast());
        MyLinkedList<Integer> newlist=list.clone();
        list.println();
        System.out.println();
        newlist.println();
    }

}
