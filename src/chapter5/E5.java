package chapter5;

public class E5 {

    public static void main(String[] args) {

        System.out.printf("%-20s %-10s %s %10s %20s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");

        int a = 15;
        for (int i = 1;  i < 200; i += 2) {

            a += 5;

            System.out.printf("%-20d %-10.1f %s %10d %20.2f\n", i, (i * 2.2), "|", a, a / 2.2 );

        }

    }
}
