
/**
 * Write a description of class MergeSorterArrayList here.
 *
 * @author APCS-A at Hathaway Brown
 * @version 2022-04
 */

import java.util.ArrayList;

public class MergeSorterArrayList implements Sorter
{
    ArrayList<Integer> nums;
    
    public MergeSorterArrayList(int n)
    {
        
    }
    
    // Fill with numbers, then mix them up.
    public void fill()
    {
        
    }
    
    // Fill in the given style
    public void fill(int fillType)
    {
        
    }
    
    // Sort the ArrayList using a Merge Sort
    public void sort()
    {
        
    }
    
    
    // Sort the ArrayList using a Merge Sort and write 
    // some info while doing it.
    public void sortWithAnalytics()
    {
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        double elapsedSec = elapsedTime / 1000.0;
        System.out.println("Total time: " + elapsedSec + " seconds.");
        System.out.println("Total comparisons: " + comparisons + ".");
    }
}
