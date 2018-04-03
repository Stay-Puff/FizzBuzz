import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] arguments) {
		Scanner numberReader = new Scanner(System.in);
		int number = -1;
		// While loop to ensure user inputs a positive integer
		while (number < 0) {
			try {
				System.out.println("Please enter a positive integer.");
				number = numberReader.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("That is not an integer");
				main(arguments);
			}
		}
		
		int fizzTotal = 0;
		int buzzTotal = 0;
		int fizzBuzzTotal = 0;
		int noneTotal = 0;
		
		for (int i = 1; i < number+1; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
				fizzBuzzTotal++;
			}
			else if (i%5 == 0) {
				System.out.println("Buzz");
				buzzTotal++;
			}
			else if (i%3 == 0) {
				System.out.println("Fizz");
				fizzTotal++;
			}
			else {
				System.out.println(i);
				noneTotal++;
			}
		}
		System.out.println("Fizz Total: " + fizzTotal + " or " + (fizzTotal * 100.0f) / number + "%");
		System.out.println("Buzz Total: " + buzzTotal + " or " + (buzzTotal * 100.0f) / number + "%");
		System.out.println("FizzBuzz Total: " + fizzBuzzTotal + " or " + (fizzBuzzTotal * 100.0f) / number + "%");
		System.out.println("Other: " + noneTotal+ " or " + (noneTotal * 100.0f) / number + "%");
	}
}
