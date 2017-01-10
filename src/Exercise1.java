import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter cost per kilowatt-hour in cents: ");
		double cost = reader.nextDouble();
		System.out.println("Enter kilowatt-hours used per year: ");
		double amount = reader.nextDouble();
		
		double total_cost = cost * amount / 100;
		
		System.out.println("The annual cost is:  " + total_cost);
	}

}
