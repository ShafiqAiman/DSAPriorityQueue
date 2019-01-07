/*
 * Data Structure & Algorithm Group Project 
 * This java file illustrates the priority queue code and its operation.
 */
package priorityqueue;

/**
 * Group Members: 1) Shahrain binti Johan (B04180045)
 *                2) Muhammad Shafiq Aiman Bin Shahrul Nizam (B04180002)
 *                3) Low Kean Yong ( )
 *                4) Auni Qistina binti Mohd. Shukran (B01180001)
 *                5) Chan Jia Zhen (B04180040)
 */

import java.util.*;
import javax.swing.JOptionPane;

public class PriorityQueue {
    public static void main(String[] args) {
        
        //Creating an empty priority queue
        priorityQueue<String> pQueue = new priorityQueue<String>();
        
        //Asking user to enter item into the list
        String amount = JOptionPane.showInputDialog(null, "Enter the amount of items you want in the queue: ", "Priority Queue", JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt();
        for(int i = 0; i <= a; i++){
            String input = JOptionPane.showInputDialog(null, "Enter the item into priority queue: ", "Priority Queue", JOptionPane.QUESTION_MESSAGE);
            pQueue.add(input);
        }//end of for loop
        
        //Displaying the element with the highest priority
        System.out.println("Head value using peek function: " + pQueue.peek());
        
        System.out.println("");
        
        //Printing all the elements
        System.out.println("The queue elements: ");
        Iterator itr = pQueue.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        //Removes the element with the highest priority and printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("After removing the an element with the poll function: ");
        Iterator<String> itr2 = pQueue.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());
        
        //Removes the 

    }//end of main
}//end of class PriorityQueue
