public class LinkedList {
    public static void main(String[] args) {
        creatLinkedList();
    }

    public static void creatLinkedList(){
        Node l1 = new Node(10, new Node(23, null));
        System.out.println(l1.data);
    }
    
}
class Node {

    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
 
}

/*

relevant intro, mostt recent suff im working, rest api, kafka

asking clarfying questions, thinkig out loud, 

hong -> coding in java -  try new things, conflict resolution, a new ai, automating, complex scenarios, behavioural at end
shreya -> system design -  thinking,  sde2 conversation, basic scenario, architecture, how systems work, simplify
vishnu -> coding - what grow yiur knowkedge, ai, technology trends, product, mentoring, 

"personal, porojects, go getter, events"
"tell me "

can i lookup, syntax

ask questions at the end

*/