import java.util.Scanner;
public class ConstructionTester
{
    public static void main(String[] args)
    {
        int numBoards, numWindows;
        double taxRate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sales tax rate: ");
        taxRate = input.nextDouble();

        System.out.println("How many boards do you need? ");
        numBoards = input.nextInt();

        System.out.println("How many windows do you need? ");
        numWindows = input.nextInt();


        double total = 0;
        Construction calc = new Construction(8, 11, taxRate);

        total += calc.lumberCost(numBoards);
        total += calc.windowCost(numWindows);

        System.out.print("Total: ");
        System.out.println(total);

        System.out.print("Grand Total: ");
        System.out.print(calc.grandTotal(total));
    }
}
