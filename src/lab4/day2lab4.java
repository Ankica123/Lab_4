package lab4;

import java.util.Scanner;

public class day2lab4 {

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		String userChoice = "y";

		while (userChoice.equalsIgnoreCase("y")) {

			System.out.println("Enter an Integer: ");
			int integerInput = scan.nextInt();

			System.out.printf("%10s %10s  %10s\n", " Number", "Squared", "Cubed");
			System.out.printf("%10s %10s  %10s\n", "======", "======", "======");

			for (int i = 1; i <= integerInput; i++) {

				int numberSquared = (int) Math.pow(i, 2);
				int numberCubed = (int) Math.pow(i, 3);

				System.out.printf("%10s %10s  %10s\n", i, numberSquared, numberCubed);

			}

				System.out.print("Continue? (y/n): ");
				userChoice = scan.next();
				System.out.println();
			}
		scan.close();
		}


	}


