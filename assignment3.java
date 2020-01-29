
public class assignment3 {
	// This code will print list of base numbers to the power of the exponent in
	// ascending order
	public static void main(String[] args) {
		// testing the codes by calling method
		PrintPowersOfN(5, 3);
		PrintPowersOfN(2, 7);
		PrintPowersOfN(-2, 8);
		PrintPowersOfN(15, 3);
	}

	public static void PrintPowersOfN(int base, int exponent) { //this method has 2 parameters to be passed base & exponent)													
		//initialize the result variable
		System.out.print("List of " + base + " to the power of " + exponent + " are: ");
		int result = 1;
		System.out.print(result + " "); //printing the default result of x^0 = 1
		
		//looping the power by incrementing the exponent
		for (int i = 1; i <= exponent; i++) {
			result = base * result;
			System.out.print(result + " "); //printing the result of each increment
		}
		System.out.println(); //print the outcome of each methods
	}
}
