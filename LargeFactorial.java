import java.math.*;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {

        BigInteger a = BigInteger.valueOf(n);
        while (n > 1) {
            BigInteger b = BigInteger.valueOf(n - 1);
            a = a.multiply(b);
            n--;

        }
        return a;


    }
}

/** Output
*50! is
  30414093201713378043612608166064768844377641568960512000000000000
 */



