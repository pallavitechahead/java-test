
public class Calculator_Componenet extends Utility

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a = 200;
		int b= 200;
		int c= (a+b);
		System.out.println("First Sum of number is"     + c);
		
		Calculator_Componenet O = new Calculator_Componenet();
		O.sum1();
		O.sum2(200, 200);
		O.Sub(500, 900);
		
		
		
	}
	
	
	public void sum1() {
		
		int X = 200;
		int Y= 200;
		 int Z= (X+Y);
		System.out.println("Second Sum of number is"     + Z);
	}
	
	public int sum2(int P, int Q)
	{
		
		int S= (P+Q);
		System.out.println("Third Sum of number is with Arguments "     + S);
		return S;
		
	
		
	}
	

}
	
	
	


