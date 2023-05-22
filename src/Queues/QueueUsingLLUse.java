package Queues;



public class QueueUsingLLUse {
    public static void main(String[] args) {
        QueueUsingLL<Integer> Q=new QueueUsingLL<>();
        System.out.println(Q.isEmpty());
        Q.enqueue(17);


        System.out.println(Q.dequeue());
        Q.enqueue(42);

//        System.out.println(Q.getSize());
//

        System.out.println(Q.front());

//        System.out.println(Q.getSize());
//        System.out.println(Q.isEmpty());
//        System.out.println(Q.dequeue());
        System.out.println(Q.dequeue());

    }
}
