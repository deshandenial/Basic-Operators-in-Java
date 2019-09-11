package miscellaneous_operators;

public class Conditional_Operator_OR_Ternary_class 
{
	public static void main(String[] args) {
		
		int a = 10 ;
		int b ;
		
		// syntax variable a = (expression) ? value if true : value of false;
		b = (a == 1) ? 20 : 30 ;
		System.out.println("value of false statemet b :"+b);
		
		b = (a == 10) ? 20 : 30 ;
		
		System.out.println("value of true statement b :"+b);
	}

}
