//Need to revisit as code not giving correct output

import java.util.Scanner;

public class inputCalculatorChallenge {

	public static void main(String[] args) {
			
		inputThenPrintSumAndAvg();
		
	}
	
	public static void inputThenPrintSumAndAvg() {
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sum = 0;
			int avg = 0;
			
			if(sc.hasNextInt()) {
				int number = sc.nextInt();
				System.out.println("Enter number #" );
				sum += number;
				n++;
					
			}
			else if(n==0){
				System.out.println("SUM = 0 & AVG = 0");
				break;
			}else 
				avg = sum /n;
				System.out.println("SUM = "+ sum + "AVG = "+ avg);
				break;
		}
		sc.close();
	}
	

}


