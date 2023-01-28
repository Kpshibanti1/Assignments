package Assignment2;

public class AddEvenUsingFor {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 0 ; i < 20; i++)  {
			
			if (i % 2 != 1) {
			
			sum = sum + i;
		}
	}
			
	System.out.println("Sum of all Even numbers between 1 to 20 is " + sum) ;
		
	}	
}
