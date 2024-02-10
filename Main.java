package sample;

public class Main {

    public static void main(String[] args) {

        calculateAve(4, 6, 8);
        totalSalary(1000);
        monthly(24000, 60);

    }

    public static void calculateAve(int first, int second, int third) {
        int average = (first + second + third) / 3;
        System.out.println("The average sum is " + average);
    }

    public static void totalSalary(int money) {
        int period = 12;
        int totalSalary = money * period;
        System.out.println("For one year is " + totalSalary);

    }

    public static void monthly(int loan, int time) {
        int monthly = loan / time;
        int interestYear = 7;
        int years = time / 12;
        int totalAmount = loan * years * interestYear / 100 + loan;
        System.out.println("It is monhly " + monthly);
        System.out.println("It is all the sum with interest " + totalAmount);

    }
}

