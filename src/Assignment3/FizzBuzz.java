package Assignment3;

public class FizzBuzz {

	public static void main(String[] args) {

		int num = 9;
				
	for ( int i = 0; i < 100; i++) {
		
		if (1 % 3 == 0 && i % 5 == 0)
			
			System.out.println("FizzBuzz");
		
		else if ( i % 3 == 0)
		
			System.out.println("Fizz");
		
		else if (i % 5 == 0)
			
			System.out.println("Buzz");
	
	
		}
		
	}

}
