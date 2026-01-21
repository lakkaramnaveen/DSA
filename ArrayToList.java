public class ArrayToList {
    public static void main(String[] args) {
        creatLinkedList();
        int[] arr = {2,3,4,5};
        Node n = convertArrayToList(arr);
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void creatLinkedList(){
        Node l1 = new Node(10, new Node(23, null));
        System.out.println(l1.data);
    }
    
    public static Node convertArrayToList(int[] arr){
        Node head = new Node(arr[0], null);
        Node mover = head;

        for (int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

}

class Node {

    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
 
}