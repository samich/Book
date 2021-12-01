package chapter5;

public class E6 {

    public static void main(String[] args) {

        System.out.printf("%-20s %-15s %s %15s %20s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");

        int a = 15;
        for (int i = 1;  i <= 10; i++) {

            a += 5;

            System.out.printf("%-20d %-15.3f %s %7d %29.3f\n", i, (i * 1.609), "|", a, a / 1.609 );

        }

    }
}
