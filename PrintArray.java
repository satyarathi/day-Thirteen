package com.genericpractice;

public class PrintArray <E extends Comparable<E>>{

	public static <E extends Comparable<E>> void large(E[] intArray) {

		E max = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i].compareTo(max)>0)  
				max = intArray[i];
		}
		System.out.println("Largest element : " +max);
	}	
	
	public static void main(String[] args) {
		Integer[] intArray = {4,5,6,8,9};
		PrintArray.large(intArray);
	}
}
