import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class queue {
    public static void main(String [] args) {

        // FILO
        // it means like first come first serve just like a line of people
        // BEING IN LINE WHO COMES FIRST WILL GET THE SERVICE FIRST
        // Collection which holds the elements prior to processing
        // LINEAR DSA

        // just like office of registrar and registry offices

        // two concepts
        // DEqueue === Removing from the queue
        // ENqueue === Adding to the queue


        // Queue is an interface so we cannot initialize it by itself
        // SO we have to create the linkedlist for this

        // lets create a queue



        // methods of doing queue  under linkedlist
        // ADD  === add to the queue  (ADD TO THE TAIL)
        // REMOVE === remove from the queue  (REMOVE FROM THE HEAD)
        // ELEMENT === peek at the queue  (JUST EXAMINE THE HEAD OF LINKED LIST )


        // here add means to offer;
        // here remove means to poll;
        // here peek  meand to peek;



        Queue<String> queue = new LinkedList<String>();
        queue.offer("Manminder");   // adding to the queue
        queue.offer("Chen");      // adding to the queue
        queue.offer("Melbourne");   // adding to the queue
        queue.offer("Chris");   // adding to the queue

        // as long as the people are in the line the queue will still respond as cool
        // here the queue is not empty

        System.out.println(queue.isEmpty());  // false

        // size of the queue
        System.out.println(queue.size());

        // to check the queue that it contains the certain element

        System.out.println(queue.contains("Melbourne"));


        //======================================================================================

        // printing the queue
        System.out.println(queue);

        // removing the items from the head of the queue

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        //  no items left in queue it is just the empty array []


        // peeking is the same thing
        // no worries

        // ADDITIONAL METHODS WITH QUEUE`
        queue.isEmpty();
        System.out.println(queue.isEmpty()); // at the end here it is empty but go top



        // uses of the queues


    }
}
