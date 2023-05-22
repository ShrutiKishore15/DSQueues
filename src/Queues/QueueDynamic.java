package Queues;

public class QueueDynamic {
    private int[] data;
    private int front;
    private int rear;
    private int size;


    public QueueDynamic() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueDynamic(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x){
        if(size==data.length){
            int[] temp= new int[size];
            for(int i=0; i< data.length; i++){
                temp[i]=data[i];
            }
            data=new int[size*2];
            for(int i=0; i< data.length; i++){
                data[i]=temp[i];
            }
        }
        if (size==0) {
            front++;
        }
        rear++;
        //for circular queue
        // rear=(rear+1)%data.length;
        data[rear] = x;
        size++;
    }

    public int dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        int deqValue = data[front];
        front++;
        //for circular queue
        //front=(front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return deqValue;
    }
    public int front() throws QueueEmptyException{
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("No element in queue");
        }
        for(int i=0; i<size; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
