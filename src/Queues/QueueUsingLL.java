package Queues;

import ArrayListAndLL.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL() {
        //Implement the Constructor
        front=null;
        rear=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(T data) {
        //Implement the enqueue(element) function
        Node<T> newNode=new Node<T>(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }


    public T dequeue() {
        //Implement the dequeue() function
        if(front==null){
            return null;
        }
        Node<T>temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return temp.data;
    }


    public T front() {
        //Implement the front() function
        if(front==null){
            return null;
        }
        return front.data;
    }
}
