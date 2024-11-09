public class TraverseLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void printList(Node head){
        Node curr = head;
        
        while (curr != null) {
           
            System.out.print(curr.data +"-->");
        
            curr = curr.next;
        }
    }
    // recursive implementation
    public static void recursivePrint(Node head){
        Node curr = head;
        if (curr == null) {
            return;
        }
        System.out.print(head.data+" ");
        recursivePrint(head.next);
    }
    // search in LinkedList
    public static int search(Node data, int x){
        int pos = 1;
        Node curr = data;

        while (curr != null) {
            if (curr.data == x) {
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
                
            }
        }
        return -1;

    }
    // search recursive
    public static int recursiveSearch(Node head, int x){
        
        if (head == null) {
            return -1;
        }
        if (head.data == x) {
            return 1;
        }
        
        else{
            
           int res = recursiveSearch(head.next, x);
           if(res == -1) return -1;
           else  return (res+1);
           
        }
            
        
    }
    // insert at begin
    public static Node insertBigin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;

    }

    // insert at end of the linkedList
    public static Node insertEnd(Node head, int x){
        Node temp7  = new Node(x);
        if (head == null) {
            return temp7;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp7;
        return head;
        
    
    }
    public static void main(String[] args) {
        Node head = new Node(12);
        Node temp1 = new Node(13);
        Node temp2 = new Node(14);
        Node temp3 = new Node(15);
        Node temp4 = new Node(16);
        Node temp5 = new Node(17);
        Node temp6 = new Node(18);

        head.next = temp1;
        temp1.next = temp2; 
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = null;
        
       // printList(head);
      // recursivePrint(head);
      // System.out.println(search(head, 13));
     // System.out.println(recursiveSearch(head, 14));
     head = insertBigin(head, 9);
    // System.out.println(insertBigin(head, 9));  // learn give refrence
     //printList(head);

     head = insertEnd(head, 20);
     printList(head);

    }
}
