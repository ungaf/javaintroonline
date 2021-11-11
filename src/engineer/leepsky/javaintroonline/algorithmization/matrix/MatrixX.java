package engineer.leepsky.javaintroonline.algorithmization.matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixX  {
    
    /*  */

    public static void main(String[] args) {

        try {

            Scanner in = new Scanner(System.in);

            System.out.print("n: ");
            int n = in.nextInt();
            int[][] a = new int[n][n];

            in.close();
        
        } catch (InputMismatchException e) {

            System.out.println("\nInput error! " + e.getMessage());
            
        }

    }

}