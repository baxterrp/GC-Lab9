import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Circle Tester");

		String option = "yes";

		do {
			System.out.println("Enter radius");

			// circle instance
			Circle circle = new Circle(scan.nextInt());
			System.out.println(circle.getFormattedCircumference());
			System.out.println(circle.getFormattedArea());

			// garbage
			scan.nextLine();

			// continue loop
			System.out.println("Continue?(Yes/No)");
			option = scan.nextLine();

		} while (Character.toLowerCase(option.charAt(0)) == 'y');

		System.out.println("Goodbye. You created " + Circle.getObjectCount()
				+ " Circle object(s)");

		scan.close();
	}

}
