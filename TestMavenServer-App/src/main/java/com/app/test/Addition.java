package com.app.test;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition() {
		
	}
	public int sum( int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		Addition ab=new Addition();
		System.out.println(ab.sum(5,6));
	}
}
