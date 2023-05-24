import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("Computation of Fibonacci Sequence");
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Please enter the range: ");
                int range = scan.nextInt();

                int prevNum = 1;
                int currentNum = 2;
                int nextNum;

                System.out.print(prevNum + " " + currentNum + " ");

                for (int i = 2; i < range; i++) {
                    nextNum = prevNum + currentNum;
                    System.out.print(nextNum + " ");
                    prevNum = currentNum;
                    currentNum = nextNum;
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                validInput = false;
            }
        }
    }
}
