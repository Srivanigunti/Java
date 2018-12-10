class MyCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Addition of numbers is:" +addition(5,6));
		System.out.println("Subtraction of numbers is:" +subtract(6,5));
		System.out.println("Multiplication of numbers is:" +multiply(5,6));
		System.out.println("Division of numbers is:" +divide(10,5));
	}
	static float addition(float numberOne,float numberTwo)
	{
		return(numberOne+numberTwo);	
	}
	static float subtract(float numberOne,float numberTwo)
	{
		return(numberOne-numberTwo);
	}
	static float multiply(float numberOne,float numberTwo)
	{
		return(numberOne*numberTwo);
	}
	static float divide(float numberOne,float numberTwo)
	{
		return(numberOne/numberTwo);
	}
}