package methods;

public class GCD {

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        System.out.println(gcd(a, b));
    }
}