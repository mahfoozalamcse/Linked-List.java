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
    // delet head
    public static Node delet(Node head){
        if(head == null){
            return null; 
        }else{
            return head.next;
        }
    }
    // Delete last node
    public static Node deletLastNode(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    // insert at position
    public static Node insertPos(Node head, int pos, int data){
        Node temp = new Node(data);
        if (head == null) {
            if (pos == 1) return temp;
            else return head;
        }
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=1; i<pos-1; i++){
            curr = curr.next;
        
           if(curr == null){
            System.out.println("Posion Out of the range ");
             return head;
         }
       }
        
        temp.next = curr.next;
        curr.next = temp;
        return head;
    
        
    }
    // sorted insert linked list
    public static Node insertSorted(Node head, int data){

       Node temp = new Node(data);
       if(head == null){
        return temp;
       }
       if (data < head.data) {
          temp.next = head;
          return temp;
       }
       Node curr = head;
       
       while (curr.next != null && curr.next.data < data) {
             curr = curr.next; 
       }
       temp.next = curr.next;
       curr.next = temp;
       return head;
    }

    // Middle of the linked list 
    public static void middleLL(Node head){

        // error in code debug code again

        // if (head == null) {
        //     return;
        // }
        // Node curr;
        // int count = 0;
        // for(curr = head; curr != null; curr = curr.next){
        //     count++;
        // }
        // curr = head;
        // for(int i=0; i<count/2; i++){
        //    curr = curr.next;
        //    System.out.println(curr.data);
        // }

          
        // Neive Approch
       
        // if(head==null)return;
        // int count=0;
        // Node curr;
        // for(curr=head;curr!=null;curr=curr.next)
        //     count++;
        // curr=head;
        // for(int i=0;i<count/2;i++)
        //     curr=curr.next;
        // System.out.print(curr.data);


        // Effiecient Approch
        if (head == null) return;
           Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }


    // N-th node from end of th LL
    public static void nThLL(Node head , int n){
        int len = 0;
        
        for(Node curr = head; curr != null; curr = curr.next){
            len++;
        }
        if(len < n){
            return;
        }
        Node curr = head;
        for(int i=1; i<(len-n+1); i++){
             curr = curr.next;
        }

        System.out.println(curr.data);

      // efficient approch
    //   if(head==null)return;
    //   Node first=head;
    //   for(int i=0;i<n;i++){
    //       if(first==null)return;
    //       first=first.next;
    //   }
    //   Node second=head;
    //   while(first!=null){
    //       second=second.next;
    //       first=first.next;
    //   }
    //   System.out.print(second.data);
        
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

    // head = insertEnd(head, 20);
   //  printList(head);

 // head = delet(head);
//    printList(head);

//    head = delet(head);
//    printList(head);

// head = deletLastNode(head);
// printList(head);


//  insertPos(head, 3, 78);
// printList(head);

// insertSorted(head, 10);
// printList(head);

   middleLL(head);
   nThLL(head, 3);


    }
}
