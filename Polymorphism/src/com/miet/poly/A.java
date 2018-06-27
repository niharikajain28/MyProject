package com.miet.poly;

public class A {
int a;

public A(int a) {
	super();
	this.a = a;
}

public void display()
{
	System.out.println("I am in A");
}}

 class B extends A
 {
	 int b;
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	 
	public void display()
	{
		System.out.println("I am in B an b is"+b);
	}
	 
 }
class C extends B
	{
		int c;

		public C(int a, int b, int c) {
			super(a, b);
			this.c = c;
		}
		public void display()
		{
			System.out.println("I am in C an c is"+c);
		}
		
	}
	
