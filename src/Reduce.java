public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int n = 100;
        while (n != 0) {
            boolean iseven = n % 2 == 0;
            boolean isodd = n % 2 == 1;

            if (iseven) {
                n = n / 2;
                steps += 1;
            }
            else if (isodd) {
                n = n - 1;
                steps += 1;
            }
        }
        System.out.println(steps);
    }
}
