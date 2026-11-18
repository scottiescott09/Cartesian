import java.util.Scanner;
public class Cartesian {
	public static double[] polarToCartesian(double r, double theta) {
//		Scanner input = new Scanner(System.in);
		
		//Declare variables
//		double r;
//		double theta;
		double x;
		double y;
		
		//Get radius

//		
//		//Get angle in radians
//		System.out.println("Enter angle in radians: ");
//		theta=input.nextDouble();
		
		//Calculate Cartesian Coordinates
		x = r * Math.cos(theta);
		y = r * Math.sin(theta);
		double[] results = {x,y};
		return results;
		//Display results
//		System.out.println("X-Coordinate: "+x);
//		System.out.println("Y-Coordinate: "+y);
//		System.out.println(x+","+y);
	}
	public static void cartesianToPolar() {
		
	}
}