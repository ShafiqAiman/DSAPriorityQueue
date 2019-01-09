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

class MaxHeapify {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        Scanner input = new Scanner(System.in);
        
        //Operation 1: Adding items to the priority queue
        for (int i = 5; i>0; i--){
            System.out.print("Key in "+i +" more number: ");
            int number = input.nextInt();
            pQueue.add(number);
        }//end of operation to add items to the priority queue
        
        System.out.println("");
        
        do{
            System.out.println("Press 0 to add an element");
            System.out.println("Press 1 to display the element with the highest priority");
            System.out.println("Press 2 to display the size of priority queue");
            System.out.println("Press 3 to display all elements");
            System.out.println("Press 4 remove element with the highest priority and print the modefied pQueue");
            System.out.println("Press 5 to remove a number");
            System.out.println("Press 6 to check if a number exist in the queue");
            System.out.println("Press 7 to clear the queue");
            System.out.println("Press 8 to check if the queue is empty");
            System.out.println("Press 9 to exit");
        
            int number2 = input.nextInt();
        
            if (number2 == 0){
                //Adding any additional input into the priority queue
                System.out.println("\nKey in the number to be added to the queue: ");
                int number5 = input.nextInt();
                pQueue.add(number5);
                System.out.println("\n");
            }//end of operation to display element of highest priority
        
            if (number2 == 1){
                //Operation 3: Displaying the element with the highest priority
                System.out.println("\nThe element with the highest priority: " + pQueue.peek());
                System.out.println("");
            }//end of operation to display element with the highest priority
        
            if (number2 == 2){
                //Operation 3: Returns the size of the priority queue
                System.out.println("\nSize of the priority queue: " + pQueue.size());
                System.out.println("");
            }//end of operation to display size of the priority queue
            
            if(number2 == 3){
                //Operation 4: Displaying all the elements
                System.out.println("\nThe queue elements: ");
                Iterator itr = pQueue.iterator();
                while(itr.hasNext())
                    System.out.println(itr.next());
                System.out.println("");
            }//end of operation to display all elements in the queue
            
            if(number2 == 4){
                //Operation 5: Removes the element with the highest priority and printing the modified pQueue using poll()
                pQueue.poll();
                System.out.println("\nAfter removing the element with highest priority using the poll function: ");
                Iterator<Integer> itr2 = pQueue.iterator();
                while(itr2.hasNext())
                    System.out.println(itr2.next());
                System.out.println("");
            }//end of operation to remove element with highest priority from the priority queue
            
            if(number2 == 5){
                //Operation 5: Removing item using remove() function
                System.out.println("\nWhich number to remove? :");
                int number3 = input.nextInt();
                pQueue.remove(number3);
                System.out.println("After removing: ");
                Iterator<Integer> itr3 = pQueue.iterator();
                while(itr3.hasNext())
                    System.out.println(itr3.next());
            System.out.println("");
            }//end of operation to remove an item from the priority queue
            
            if(number2 == 6){
                //Operation 6: Checks if an element is present inside the queue using contains() method
                System.out.println("\nCheck which number :");
                int number4 = input.nextInt();
                boolean result = pQueue.contains(number4);
                System.out.println("Does the priority queue contain "+number4+" ?" + result);
                System.out.println("");
            }//end of operation to check if the item is inside the priority queue

            if(number2 == 7){
                //Operation 8: Clear the contents in the priority queue
                pQueue.clear();
                System.out.println("\nThe queue is cleared");
                System.out.println("");
            }//end of operation to clear the priority queue
        
            if(number2 == 8){
                //Operation 9: Check to see if the priority queue is empty using isEmpty operation
                boolean answer = pQueue.isEmpty();
                System.out.println("\nThe priority queue is empty: " + answer+"\n");
            }//end of operation to check if priority queue is empty or not
        
            if(number2 == 9){
                System.exit(0);
            } 
        }while(true);
    }//end of main
}//end of class MaxHeapify
