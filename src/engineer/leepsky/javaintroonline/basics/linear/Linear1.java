package engineer.leepsky.javaintroonline.basics.linear;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Linear1 {

	/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. */
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("a, b, c: ");
			double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
			System.out.println(
					((a-3)*b/2) + c
			);
			in.close();
		} catch (InputMismatchException e) {
			System.out.println("\nInput error! " + e.getMessage());
		}
    }
}
