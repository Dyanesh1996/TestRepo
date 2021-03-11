import java.util.Scanner;

public class nextLineIssues {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int theNumber = sc.nextInt();
		System.out.println(theNumber);
		
		
		System.out.println("Enter ur name : ");
		String myName = sc.nextLine();
		System.out.println(myName);
		
		
	}

}
