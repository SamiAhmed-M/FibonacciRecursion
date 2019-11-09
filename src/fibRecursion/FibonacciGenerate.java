package fibRecursion;

import java.util.Scanner;

public class FibonacciGenerate {

	public static void main(String[] args) {
		// Scanner object
				Scanner myObj = new Scanner(System.in);
				// Prompt user
				System.out.println("Please enter how many fibonacci series elements to display");
				int x = myObj.nextInt();
				myObj.close();
				for (int i=0; i<=x-1; i++) {
				System.out.print(FiboRecursion.display(i) + " ");
				}
	}

}
