package chapter5;

public class E7 {
    public static void main(String[] args) {

        double annualTuition = 10000;
        double totalTuition = 0;

        for (int year = 1; year <= 14; year++) {
            annualTuition = annualTuition + ( annualTuition * (5 / 100.0) );

            if ( year > 10 ) {
                totalTuition += annualTuition;
            }
        }

        System.out.printf("Total cost for four years after 10 years %.2f", totalTuition);

    }
}
