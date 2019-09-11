package basic_operators;

public class Arithmetic_Operators_class 
{

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		
		System.out.println("a + b = " + (a+b) );
		System.out.println("a - b = " + (a-b) );
		System.out.println("c * d = " + (c*d) );
		System.out.println("d / c = " + (c/d) );
		System.out.println("b % c = " + (b%c) );
		
		System.out.println("a++   = " + (a++) ); // a old value = 10 , a new value = 11
		System.out.println("a--   = " + (a--) ); // a old value = 11 , a new value = 12
		
		System.out.println("d++   = " + (d++) ); // old value of d = 25 , d new value = 26
		System.out.println("++d   = " + (++d) ); // new value  of d =27
		
	}
}
