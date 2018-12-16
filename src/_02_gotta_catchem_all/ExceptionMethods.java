package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException();

		}
		return a / b;

	}

	public String reverseString(String a) {
		String na = "";
		if (a.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = a.length()-1; i > -1; i--) {
			na = na + (a.charAt(i) + "");
		}
		return na;

	}
}
