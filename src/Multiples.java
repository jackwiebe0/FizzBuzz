public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divby3 = i % 3 == 0;
            boolean divby5 = i % 5 == 0;

            if (divby5 || divby3) {
                total += 1;
                sum += i;
            }
        }
        System.out.print(total + " " + sum);
    }
}
