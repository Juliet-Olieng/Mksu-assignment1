import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double discount;

        System.out.println("Enter the amount purchased: ");
        double amount =scanner.nextDouble();

        if (amount>5000) {
            discount =amount*0.1;
                    
        }
        else if (amount>=1000 && amount<= 5000) {
            discount =0.05 *amount;
            
        } else {
            discount=0;
        }
        double amountPay =amount-discount;
        System.out.println("Initial amount:"+ amount);
        System.out.println("Discount:" +discount);
        System.out.println("Amount to pay:" + amountPay);

        scanner.close();
    }
    
}
