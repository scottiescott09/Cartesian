import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Stores the yser's menu choice
		int choice;
		
		// Display the calculator menu
		System.out.println("Cartesian/Radian Calculator");
		System.out.println("1. Polar to Cartesian");
		System.out.println("2. Cartesian to Polar");
		System.out.println("3. Radians to Degrees");
		System.out.println("4. Degrees to Radians");
		System.out.println("5. Exit");
		
		// Ask the user to select an option
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		
	    if (choice == 1);
			System.out.println("Enter radius: ");
			double r = input.nextDouble();
			double[] results=Cartesian.polarToCartesian(r,theta);
			
	    if (choice == 2);
			Cartesian.cartesianToPolar();
			
	    if (choice == 3);
	    	Radian.radiansToDegrees();
	    
	    if (choice == 4);
	    	Radian.degreesToRadians();
	    	
	    if (choice == 5);
	    	System.out.println("Goodbye!");
		if (choice < 1 || choice > 5) {
			System.out.println("Invalid choice!");
		}
		input.close();
	}

}
