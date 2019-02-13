package math.numbers;

/**
 * Greatest Common Divisor
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(find(30, 45));
		System.out.println(find(Integer.MAX_VALUE-1, Long.MAX_VALUE));
	}
	
	public static long find(long a, long b) {
		return b == 0 ? a : find(b, a % b);		
	}

}
