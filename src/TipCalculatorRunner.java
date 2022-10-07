import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("| TIP CALCULATOR |");
        System.out.println("------------------");

        System.out.print("Please enter the number of people: ");
        int numPeople = scanner.nextInt();
        System.out.print("Please enter the tip percentage as a whole number: ");
        int tipPercentage = scanner.nextInt();
        TipCalculator tip = new TipCalculator(numPeople, tipPercentage);
        System.out.println();

        System.out.println("------------------");
        System.out.println("| CONFIGURE BILL |");
        System.out.println("------------------");
        System.out.println("1. Add meal");
        System.out.println("2. Complete");
        boolean loop = true;

        while (loop) {
            System.out.print("Please choose an option by entering its corresponding number: ");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.print("Please enter the cost of the meal: $");
                tip.addMeal(scanner.nextDouble());
                System.out.println();
            }
            else if (option == 2) {
                System.out.println("TOTAL BILL: ");
                System.out.println("Total before tip: $" + tip.getTotalBillBeforeTip());
                System.out.println("Tip percentage: " + tip.getTipPercentage() + "%");
                System.out.println("Tip amount: $" + tip.tipAmount());
                System.out.println("Total bill: $" + tip.totalBill());
                System.out.println("Total per person (before tip): $" + tip.perPersonCostBeforeTip());
                System.out.println("Total tip per person: $" + tip.perPersonTipAmount());
                System.out.println("Total per person (after tip): $" + tip.perPersonTotalCost());
                System.out.print("Thank you for using TIP CALCULATOR!");
                loop = false;
            }
            else {
                System.out.println("ERROR: Please enter either \"1\" or \"2.\"");
            }
        }

    }
}
