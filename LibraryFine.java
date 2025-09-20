//  You are required to develop a Java program to calculate the fine for overdue library books.
// The library charges fines based on the number of days a book is overdue.
// The fine rates are:
// | Days Overdue    | Charges per day |
// | --------------- | --------------- |
// | Up to 7 days    | Ksh. 20         |
// | 8 – 14 days     | Ksh. 50         |
// | 15 days or more | Ksh. 100        |

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class LibraryFine {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

// i) inputs from the user
    System.out.println("Enter Book ID:");
    String bookId = input.nextLine();

    System.out.print("Enter Due Date (YYYY-MM-DD): ");
    String dueDateStr = input.nextLine();

    System.out.print("Enter Return Date (YYYY-MM-DD): ");
    String returnDateStr = input.nextLine();

    LocalDate dueDate = LocalDate.parse(dueDateStr);
    LocalDate returnDate = LocalDate.parse(returnDateStr);

        // calculate the days overdue
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, returnDate);

        System.out.println("Days Overdue = " + daysOverdue);

    int fineRate;
        if (daysOverdue <= 0) {
            fineRate = 0;
            daysOverdue = 0; 
        } else if (daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
        } else {
            fineRate = 100;
        }

        long fineAmount = daysOverdue * fineRate;

        // iv. Display results
        System.out.println("\n--- Fine Details ---");
        System.out.println("Book ID      : " + bookId);
        System.out.println("DueDate:" + dueDate);
        System.out.println("returnDate:" +returnDate);
        System.out.println("Days Overdue : " + daysOverdue);
        System.out.println("Fine Rate    : Ksh " + fineRate + " per day");
        System.out.println("Fine Amount  : Ksh " + fineAmount);

        input.close();

  }  
}

