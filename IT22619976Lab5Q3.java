import java.util.Scanner;

public class IT22619976Lab5Q3 {

    // Constants
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final double DISCOUNT_10 = 10.0;
    static final double DISCOUNT_20 = 20.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date: ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Start Date must be less than end Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;

        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = totalAmount * discountRate / 100;
        double amountToPay = totalAmount - discount;

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.printf("Total amount to be paid: Rs. %.2f%n", amountToPay);
    }
}