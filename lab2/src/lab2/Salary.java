package lab2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double currentSalary;
		double raise = 100 ;
		double newSalary;
		String rating;
		Scanner scan=new Scanner(System.in);
				System.out.println("Ener the current salary:");
				currentSalary=scan.nextDouble();
				System.out.println("Enter the performence rating (Excellent, good or poor):");
				rating=scan.nextLine();
				newSalary=currentSalary+raise;
				NumberFormat money=NumberFormat.getCurrencyInstance();
				System.out.println();
				System.out.println("Current salary:"+money.format(currentSalary));
				System.out.println("Amount of your raise:"+money.format(raise));
				System.out.println("Your new salary:" +money.format(newSalary));
				System.out.println();
				scan.close();
				
	}

}
