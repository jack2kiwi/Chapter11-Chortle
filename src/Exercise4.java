import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter X: ");
		float x = reader.nextFloat();
		System.out.println("Enter Y: ");
		float y = reader.nextFloat();
		
		float arithmetic = (x + y) / 2;
				
		double harmonic = 2 / ( (1/x) + (1/y) );
		
		System.out.println("Arithmetic mean:  " + arithmetic);
		System.out.println("Harmonic mean:  " + harmonic);
	}

}
