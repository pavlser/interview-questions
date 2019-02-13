package prime;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class MillerRabinPrimeTest {

	public static void main(String[] args) {
		int count = 100;
		int precision = 1000;
		BigInteger bigStart = getBigInteger(count);
		
		System.out.println("Calculating " + count 
			+ " prime numbers with probabilty 1/2^" + precision);
		System.out.println("Start number:\n" + bigStart + "\n");
		
		Instant start = Instant.now();
		BigInteger[] primes = getPrimeBiggerThan(bigStart, count, precision);
		Instant end = Instant.now();
		System.out.println("Time: " 
			+ Duration.between(start, end).toString().replace("PT", "")
			+ "\n");

		BigInteger a = bigStart;
		for (int i = 0; i < count; i++) {
			BigInteger p = primes[i];
			System.out.println(p);
			System.out.println(" > distance: " + distance(p, a));
			a = p;
		}
	}

	public static BigInteger[] getPrimeBiggerThan(BigInteger n, int count, int precision) {
		n.isProbablePrime(precision);
		BigInteger a = n;
		BigInteger[] primes = new BigInteger[count];
		int i = 0;
		while (i < count) {
			if (a.isProbablePrime(10)) {
				primes[i++] = a;
			}
			a = a.add(BigInteger.ONE);
		}
		return primes;
	}

	public static BigInteger getBigInteger(int digitCount) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < digitCount) {
			int j = (int) (Math.random() * 9);
			if (i == 0 && j == 0) {
				continue;
			} else {
				sb.append(j);
				i++;
			}
		}
		return new BigInteger(sb.toString());
	}
	
	static BigInteger distance(BigInteger a, BigInteger b) {
		return a.subtract(b);
	}

	static String formatDuration(Duration d) {
		long hr = d.toHours();
		long min = d.toMinutes() % (hr > 0 ? hr : 1);
		long sec = d.getSeconds() % (min > 0 ? min : 1);
		long ms = d.toMillis() % (sec > 0 ? sec : 1);
		return String.format("%02dh:%02d:%d ms", min, sec, ms);
	}
}
