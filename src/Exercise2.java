import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the time: ");
		double time = reader.nextDouble();
		
		double g = 32.174;
				
		double distance = 0.5 * g * (time * time);
		
		System.out.println("Distance:  " + distance);
	}

}
