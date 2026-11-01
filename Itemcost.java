import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter tax rate (e.g. 7.5 for 7.5%): ");
        double taxRate = input.nextDouble();

        double subtotal = unitPrice * quantity;
        double tax = subtotal * (taxRate / 100);
        double total = subtotal + tax;

        System.out.println("\n----- Item Cost Summary -----");
        System.out.println("Unit Price : " + unitPrice);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Subtotal   : " + subtotal);
        System.out.println("Tax        : " + tax);
        System.out.println("Total Cost : " + total);

        input.close();
    }
}
