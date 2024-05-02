package week2.day2;

import java.util.Arrays;

public class ArrayDuplicates {
	
		
	    public static void main(String args[])
	    {
	    	int a[] = {2, 5, 7, 3, 5, 9, 2, 3};  
	    	Arrays.sort(a);
	        System.out.println(a);
	    	{
				for (int i=0; i<a.length; i++) {
					
					for(int j=i+1; j<a.length; j++) {
						
						if (a[i] == a[j]) {
							
							System.out.println(a[i]);
						}
						
					}
					
				}
	    	}}}
				
			
			
			