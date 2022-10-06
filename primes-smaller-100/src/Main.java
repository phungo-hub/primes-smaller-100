import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            if (n == 2) {
                System.out.println(n);
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(n);
                }
            }
        }
    }
}