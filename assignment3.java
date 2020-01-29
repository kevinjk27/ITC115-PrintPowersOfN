import java.lang.Math;

public class assignment3 {
	//This code will print list of base numbers to the power of the exponent in ascending order
	public static void main(String[] args) {
		// Calling the methods --code testing--
		PrintPowersOfN(5, 3);
		PrintPowersOfN(2, 7);
		PrintPowersOfN(-2, 8);
		PrintPowersOfN(15, 3);
	}

	public static void PrintPowersOfN(int base, int exponent) { //this method has 2 parameters to be passed --base & exponent)
		int result; //initialize the result variable
		System.out.print("List of " + base + " to the power of " + exponent + " are: ");
		for (int i = 0; i <= exponent; i++) { //for loop to increment the exponent 
			result = (int) Math.pow(base, i);
			System.out.print(result + " ");
		}
		System.out.println("");

		/*
		 * THIS PIECE OF CODE WILL START AT X^1 INSTEAD OF X^0
		 * 
		 * int result = 1; for (int i = 0; i <= exponent; i++) { result = base * result;
		 * System.out.print(result + " "); } System.out.println();
		 */
	}
}
