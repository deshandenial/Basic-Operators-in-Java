package miscellaneous_operators;

class cars
{
	String honda="honda cars";
	
	public void method1()
	{
		System.out.println("cars names:"+honda);
		
		
	}
}

public class Instance_Operator_class2 extends cars
{

	public static void main(String[] args) 
	{
		cars obj= new Instance_Operator_class2();
		boolean result = obj instanceof Instance_Operator_class2;
		System.out.println(result);
		obj.method1();
		
		
	}

	
}
