package Arrays;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

		Input : {3,2,5,4,1,6}

		Output :

		min: 1

		max: 6
		 */
		
		
		int arr[]={3,2,5,4,1,6};
		minMax(arr);
		
		
	}

	private static void minMax(int[] arr) {
		
		Arrays.sort(arr);
		
		int min=0;
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			
			if (arr[i]==arr[0]) {
				min=arr[0];
			}
			if (arr[i]==arr[5]) {
				max=arr[5];
			}
		}
		System.out.println();
		System.out.println("min : "+min);
		System.out.println();
			System.out.println("max : "+max);
	}
	

}
