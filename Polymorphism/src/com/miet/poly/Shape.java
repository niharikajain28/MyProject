package com.miet.poly;

public class Shape {
 public void Draw()
 {
	 System.out.println("Drawing shape");
 }
 public void Erase()
 {
	 System.out.println("Erasing shape");
 }
}
	
 class Circle extends Shape
{
	 public void Draw()
	 {
		 System.out.println("Drawing circle");
	 }
	 public void Erase()
	 {
		 System.out.println("Erasing circle");
	 }
	}

class Triangle extends Shape
{
	 public void Draw()
	 {
		 System.out.println("Drawing Triangle");
	 }
	 public void Erase()
	 {
		 System.out.println("Erasing Triangle");
	 }
	}

class square extends Shape
{
	 public void Draw()
	 {
		 System.out.println("Drawing Square");
	 }
	 public void Erase()
	 {
		 System.out.println("Erasing Square");
	 }
	}



