package homeAssignments.week1.day1;

public class Fibonacci {
public static void main (String args[]) {
		
		int a=0, b=1, c, d=8;
		System.out.println("Fibonacci series are: ");
		
		for(int i =0; i<d; i++) {
			
			c = a+b;
			System.out.println(a);
			a=b;
			b=c;
			
		}
		
	}

}
