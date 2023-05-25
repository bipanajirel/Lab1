import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i + ":");
            System.out.println("-------------");
            calculateBill(input);
            System.out.println();
        }

        input.close();
    }

    public static void calculateBill(Scanner input) {
        String restaurantName = "Brampton Hamburgers";
        System.out.println(restaurantName);
        System.out.println("Menu:");
        System.out.println("Type of Burger\t\tPrice");
        System.out.println("1. Veggie Burger\t$5.95");
        System.out.println("2. Deluxe Veggie Burger\t$7.95");
        System.out.println("3. Chicken Burger\t$6.45");
        System.out.println("4. Cheese Chicken Burger\t$8.50");
        System.out.println("5. Cheese Bacon Burger\t$9.25");
        System.out.println("6. Deluxe Bacon Burger\t$10.95");
        System.out.println("7. Healthy Organic Burger\t$12.45");
        System.out.println("8. Quit");

        double totalAmount = 0;

        while (true) {
            System.out.print("Select an item (1-8): ");
            int selection = input.nextInt();

            if (selection == 8) {
                break;
            }

            if (selection < 1 || selection > 8) {
                throw new IllegalArgumentException("Invalid selection! Please choose a number between 1 and 8.");
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double price = 0;

            switch (selection) {
                case 1:
                    System.out.println("Veggie Burger");
                    price = 5.95;
                    break;
                case 2:
                    System.out.println("Deluxe Veggie Burger");
                    price = 7.95;
                    break;
                case 3:
                    System.out.println("Chicken Burger");
                    price = 6.45;
                    break;
                case 4:
                    System.out.println("Cheese Chicken Burger");
                    price = 8.50;
                    break;
                case 5:
                    System.out.println("Cheese Bacon Burgerr");
                    price = 9.25;
                    break;
                case 6:
                    System.out.println("Deluxe Bacon Burger");
                    price = 10.95;
                    break;
                case 7:
                    System.out.println("Healthy Organic Burger");
                    price = 12.45;
                    break;
            }

            double itemTotal = price * quantity;
            totalAmount += itemTotal;
        }

        double tax = totalAmount * 0.13;
        double finalAmount = totalAmount + tax;

        if (finalAmount > 100) {
            finalAmount *= 0.9; // Apply 10% discount
        } else if (finalAmount > 50) {
            finalAmount *= 0.95; // Apply 5% discount
        }

        System.out.println("Total bill amount (including tax): $" + finalAmount);
    }
}
