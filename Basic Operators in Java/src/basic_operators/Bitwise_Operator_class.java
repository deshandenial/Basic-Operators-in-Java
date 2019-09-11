package basic_operators;

public class Bitwise_Operator_class 
{
	public static void main(String[] args) {
		
		int a = 60 ; // 60 = 0011 1100
		int b = 13 ; // 13 = 0000 1101
		int c = 0  ; // 0  = 0000 0000
		
		
		// both the values is "1" the result comes to display "1"
		c = a & b ;  // 12 = 0000 1100
		System.out.println("a & b =" + c);
		
		// either any one value is "1" will be occurs the result should be display "1".
		c = a | b ;  // 61 = 0011 1101
		System.out.println("a | b =" + c);
		
		// either any one value is "1" will be occurs the result should be display "1" but both the value is "1" result is "0". 
		c = a ^ b ; // 49 = 0011 0001 
		System.out.println("a ^ b =" + c);
		
		// flip the values 0 - > 1 & 1 - > 0
		c = ~ a ; // -61 = 1100 0011
		System.out.println("c =~ a ="+ c );
		
		
		// move left side of two value 
		c = a << 2; // 240 = 1111 0000
		System.out.println("a << 2 =" + c);
		
		// move right side of two value
		c = a >> 2; // 15 = 0000 1111
		System.out.println("a >> 2 =" + c);
		
		c = a >>> 2 ; // 15 = 0000 1111
		System.out.println("a >>> 2 =" + c);
		
		
	}

}
