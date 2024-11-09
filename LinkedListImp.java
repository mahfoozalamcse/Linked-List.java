public class LinkedListImp{
     static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(12);
        Node temp1 = new Node(13);
        Node temp2 = new Node(14);

        head.next = temp1;
        temp1.next = temp2;

        System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);
    	
    }
}