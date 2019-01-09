package GroupProject;

/*
 * Data Structure & Algorithm Group Project 
 * This java file illustrates the priority queue code and its operation.
 */

/**
 * Group Members: 1) Shahrain binti Johan (B04180045)
 *                2) Muhammad Shafiq Aiman Bin Shahrul Nizam (B04180002)
 *                3) Low Kean Yong (B04180028)
 *                4) Auni Qistina binti Mohd. Shukran (B01180001)
 *                5) Chan Jia Zhen (B04180040)
 */

import java.util.*;

class DSAGroupProject {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        
        //Operation 1: Adding items to the priority queue
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
        
        //Operation 2: Displaying the element with the highest priority
        System.out.println("Head value using peek function: " + pQueue.peek());
        System.out.println("");
        
        //Operation 3: Returns the size of the priority queue
        System.out.println("Size of the priority queue: " + pQueue.size());
        System.out.println("");
        
        //Operation 4: Displaying all the elements
        System.out.println("The queue elements: ");
        Iterator itr = pQueue.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("");
        
        //Operation 5: Removes the element with the highest priority and printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("After removing the element with highest priority using the poll function: ");
        Iterator<String> itr2 = pQueue.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());
        System.out.println("");
        
        //Removing Orange using remove() function
        pQueue.remove("Java");
        System.out.println("After removing 'Java' with remove() function: ");
        Iterator<String> itr3 = pQueue.iterator();
        while(itr3.hasNext())
            System.out.println(itr3.next());
        System.out.println("");
        
        //Operation 6: Checks if an element is present inside the queue using contains() method
        boolean result = pQueue.contains("C");
        System.out.println("Does the priority queue contain 'C'?: " + result);
        System.out.println("");
        
        //Operation 7: Getting objects from the queue using toArray() in an array and print the array
        Object[] array = pQueue.toArray();
        System.out.println("Current values in the array: ");
        for (Object i : array) {
            System.out.println(i.toString());
        } //end for loop
        System.out.println("");
        
        //Operation 8: Clear the contents in the priority queue
        pQueue.clear();
        System.out.println("Values in the priority queue after using clear() method: " + pQueue);
        System.out.println("");
        
        //Operation 9: Check to see if the priority queue is empty using isEmpty operation
        boolean answer = pQueue.isEmpty();
        System.out.println("The priority queue is empty: " + answer);
    }//end of main
}//end of class PriorityQueue
