package javaapplication33;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueue {

    public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Grapes");
        queue.add("Cherry");
        

       while(!queue.isEmpty ()) {
           System.out.println("Pruts: " + queue.poll());
           
       }
    }
}