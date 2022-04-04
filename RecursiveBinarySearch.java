
/**
 * Performs a binary search recursively.
 *
 * @author APCS-A at Hathaway Brown
 * @version 2022-04
 */

import java.util.Scanner;

public class RecursiveBinarySearch
{
    
    public static void main (String[] args)
    {
        // declare and fill an array of random integers, in increasing order
        
        
        
        // Search the array for a variety of values
        Scanner kbd = new Scanner (System.in);
        
        System.out.println("Enter numbers to search for. Enter 0 to quit.");
        int target = kbd.nextInt();
        while (target != 0)
        {
            // Search for target
            int index = 0;
            if (index == -1)
            {
                System.out.println(target + " not found in the array.");
            }
            else
            {
                System.out.println(target + " found in the array at index " + index);
            }
            
            // Get next target
            System.out.print("Next number: ");
            target = kbd.nextInt();
        }
        
        
        kbd.close();
    }
}
