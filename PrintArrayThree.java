package com.genericpractice;

public class PrintArrayThree <E extends Comparable<E>>{

	public static <E extends Comparable<E>> void large(E[] StrArray) {

		E max = StrArray[0];
		for (int i = 0; i < StrArray.length; i++) {
			if(StrArray[i].compareTo(max)>0)  
				max = StrArray[i];
		}
		System.out.println("Largest element : " +max);
	}	

	public static void main(String[] args) {
		String [] StrArray = {"apple","banana","xmen","dog","english","fish","nova"};
		PrintArray.large(StrArray);
	}
}


