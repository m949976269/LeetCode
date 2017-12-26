package queue;

public class QueueTest {


    public static void main(String[] args){
        ArrayQueue arrayQueue=new ArrayQueue(5);
        arrayQueue.put(1);
        arrayQueue.put(2);
        arrayQueue.put(3);
        arrayQueue.put(4);
        arrayQueue.put(5);
        arrayQueue.poll();
        arrayQueue.poll();
        arrayQueue.poll();
        arrayQueue.poll();
        arrayQueue.poll();
        arrayQueue.put(6);
        System.out.println(arrayQueue.getSize());
//        System.out.println(arrayQueue.peek());



    }
}
