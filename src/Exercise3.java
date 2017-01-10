import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a double: ");
		double n = reader.nextDouble();
				
		double logrithmic = Math.log(n) / Math.log(2);
		
		System.out.println("Base 2 log of  " + n + "  is  " + logrithmic);
	}

}
