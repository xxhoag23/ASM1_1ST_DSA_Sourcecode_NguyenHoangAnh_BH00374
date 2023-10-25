import java.util.Queue;
public class QueueLinkedListADT {

    //add Queue
    public static void queueAdd(Queue<String> queue){
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.add("lemon");
        queue.add("orange");
        System.out.println("Queue : " + queue);
    }
    //offer Queue
    public static void queueOffer(Queue<Integer> queue){
        for (int i =0; i<=10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : " + queue);

    }
    // peek Queue
    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("accessElement Queue LinkedList : " + accessElement);
        System.out.println("Queue LinkedList : " + queue);

    }
    // poll queue
    public static void  pollQueue(Queue<Integer> queue){
        int element =queue.poll();
        System.out.println("Poll element in Queue :" +element);
        System.out.println("Queue LinkedList: "+ queue);
    }
    // queue search
    public static void queueSearch(Queue<Integer> queue, int value){
        boolean check = queue.contains(value);
        if(check ==false){
            System.out.println(value +"is not found");
        }else{
            System.out.println(value +"is found in queue");
        }
    }
    // for..queue
    public static void forqueue(Queue<Integer>queue){
        for(int i: queue){
            System.out.println(i);
        }
    }
}
