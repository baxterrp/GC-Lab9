public class Circle {

	private double radius;
	public static int count = 0;

	// constructor gets radius and sets adds 1 to count for each time instance
	// of Circle is created
	public Circle(double r) {

		radius = r;
		count++;
	}

	// getCircumference returns circ formula
	public double getCircumference() {

		return 2 * Math.PI * radius;
	}

	// output for circumference
	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference());
	}

	// Area formula
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	// output for Area
	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
	}

	// formatter for doubles
	private String formatNumber(double x) {
		return String.format("%.2f", x);
	}

	// returns count
	public static int getObjectCount() {

		return count;
	}

}
