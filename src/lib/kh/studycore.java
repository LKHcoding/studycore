package lib.kh;

public class studycore {

	public static int asdf;

	public static int toInteger(String a) {

		return Integer.parseInt(a);
	}

	public static int toInteger(double a) {
		return (int) (a);
	}

	public static double toDouble(String a) {
		return Double.parseDouble(a);
	}

	public static double toDouble(int a) {
		return (double) (a);
	}

	public static String toString(int a) {
		return Integer.toString(a);
	}

	public static String toString(double a) {
		return Double.toString(a);
	}
}
