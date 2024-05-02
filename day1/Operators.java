package week1.day1;

public class Operators {
public static void main (String args []) {
		
		int a = 5;
		int b = 3;
		
		//Arithmetic Operators
		System.out.println("Addition: " + (a+b));
		System.out.println("Subtraction: " + (a-b));
		System.out.println("Multiplication: " + (a*b));
		System.out.println("Division: " + (a/b));
		System.out.println("Modulas: " + (a%b));
		
		
		//Comparison Operators
		System.out.println("A Equal to B : " + (a==b));
		System.out.println("A Not equal to B " + (a!=b));
		
		//Logical Operators
		System.out.println("A is greater than B: " + (a>b));
		System.out.println("A is lesser than B: " + (a<b));
		System.out.println("A is greater than or equal to B: " + (a>=b));
		System.out.println("A is lesser than or equal to B: " + (a<=b));
		System.out.println(a>b && a<b);
		System.out.println(a>b || a<b);
		
		//post-increment
		
		System.out.println(a++);
		System.out.println(a);
		
		//pre-increment
		
		System.out.println(++b);
		
		
	}
}


