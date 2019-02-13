package math.numbers;

/**
 * Least Common Multiple
 */
public class LeastCommonMultiple {

	public static void main(String[] args) {
		System.out.println(find(30, 65));
	}

	public static long find(long a, long b) {
		return a / GreatestCommonDivisor.find(a, b) * b;
	}

}
