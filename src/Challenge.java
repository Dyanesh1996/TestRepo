import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		
			int n = 1;
			int sumOfNumbers = 0;
			Scanner sc = new Scanner(System.in);
			
			while(n <= 10) {

				System.out.println( "Enter number # " +n);
				int number = sc.nextInt();
				n++;
				sumOfNumbers += number;
				
			}
			sc.close();
			
				System.out.println("Sum of numbers is : " + sumOfNumbers);
			
			
			
	} 
	
}
