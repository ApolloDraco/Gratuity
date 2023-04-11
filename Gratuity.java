/* 
 *  Description: A program that reads the subtotal and the gratuity rate and then computes the gratuity and total
*/

import java.util.Scanner;

public class Gratuity {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the subtotal and a gratuity rate: ");
      double subtotal = input.nextDouble();
      double gratuityRate = input.nextDouble();

      if (subtotal <= 0 || gratuityRate <= 0) {
         System.out.println("Invalid input. Subtotal and gratuity rate must be positive.");
         return;
      }

      double gratuity = subtotal * (gratuityRate / 100);
      double total = subtotal + gratuity;

      System.out.printf("The gratuity is $%.2f and total is $%.2f", gratuity, total);
   }
}
