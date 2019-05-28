import java.math.BigInteger;
import java.util.Scanner;

public class KaratsubaMethod {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Karatsuba n = new Karatsuba();
        System.out.println("Enter two integer numbers: ");
        BigInteger n1 = BigInteger.valueOf(scan.nextLong());
        BigInteger n2 = BigInteger.valueOf(scan.nextLong());
        BigInteger product = n.multiply(n1, n2);

        System.out.println("Your product: " + product);
    }
}
