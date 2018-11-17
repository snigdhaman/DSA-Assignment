package programs;

import java.util.Arrays;

public class MinimumPlatform 
{
	/**
	 * Method to find minimum number of platforms required
	 * @param arrival
	 * @param departure
	 * @return
	 */
	static int findMinimumPlatform (int arrival[], int departure[]) 
	{ 
	   // Sort arrival and departure arrays 
	   Arrays.sort(arrival); 
	   Arrays.sort(departure); 
	   
	   // noOfPlatform indicates number of platforms 
	   // needed at a time 
	   int noOfPlatform = 0, minPlatform = 0; 
	   int i = 0, j = 0; 
	   
	   while (i < departure.length && j < departure.length) 
	   { 
	      // If next event in sorted order is arrival,  
	      // increment count of platforms needed 
	      if (arrival[i] <= departure[j]) 
	      { 
	          noOfPlatform++; 
	          i++; 
	          if (noOfPlatform > minPlatform)  
	              minPlatform = noOfPlatform; 
	      } 
	      else
	      { 
	          noOfPlatform--; 
	          j++; 
	      } 
	   } 
	   
	   return minPlatform; 
	} 
	   
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) 
	{ 
	    int arrival[] = {900, 915, 1030, 1045}; 
	    int departure[] = {930, 1300, 1100, 1145}; 
	    int minPlatform =  findMinimumPlatform(arrival, departure);
	    System.out.println("Minimum number of platforms requird for the schedule " + minPlatform); 
	} 
} 