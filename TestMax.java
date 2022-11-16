package com.genericpractice;

public class TestMax<E extends Comparable <E>> {
	
	E x, y , z;
	
	public TestMax(E x,E y,E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public E maximum() {
		return TestMax.maximum(x,y,z);
	}
	
	public static <E extends Comparable<E>> E maximum(E x,E y,E z) {
		E max = x;
		if(y.compareTo(max)>0) {
			 max = y;
			}
		if (z.compareTo(max)>0) {
			max = z;
		}
		printMax(x,y,z, max);
		
		return max;
	}
	
	private static <E> void printMax(E x, E y, E z, E max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
		
	}

	public static void main(String[] args) {
		Integer xInt = 7, yInt = 9, zInt = 4;
		new TestMax(xInt, yInt, zInt).maximum();
		
		Float xft = 2.3f, yft = 3.6f, zft = 7.6f;
		new TestMax(xft, yft, zft).maximum();
		
		String xstg = "Captain", ystg = "Bat", zstg = "Spider";
		new TestMax(xstg, ystg, zstg).maximum();
	}
}
