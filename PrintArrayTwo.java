package com.genericpractice;

public class PrintArrayTwo <E extends Comparable<E>>{

	public static <E extends Comparable<E>> void large(E[] floatArray) {

		E max = floatArray[0];
		for (int i = 0; i < floatArray.length; i++) {
			if(floatArray[i].compareTo(max)>0)  
				max = floatArray[i];
		}
		System.out.println("Largest element : " +max);
	}	

	public static void main(String[] args) {
		Float[] floatArray = {4.2f,5.7f,6.8f,8.2f,8.9f};
		PrintArrayTwo.large(floatArray);


	}


}
