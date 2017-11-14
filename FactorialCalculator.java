public class FactorialCalculator {

    public static void main(String[] args) {

        int n = 15;
        if (n < 1 | n > 20) {
            System.out.println("IllegalArgumentException");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}