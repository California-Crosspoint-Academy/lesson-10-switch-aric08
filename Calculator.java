import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Menu
        System.out.println("Make your arithmetic selection from the choices below:\n");
        System.out.println(" Add       → Addition");
        System.out.println(" Subtract  → Subtraction");
        System.out.println(" Multiply  → Multiplication");
        System.out.println(" Divide    → Division\n");

        System.out.print("Your choice? ");
        String choice = kbReader.nextLine();   // read the full string

        System.out.print("\nEnter first operand: ");
        double op1 = kbReader.nextDouble();

        System.out.print("Enter second operand: ");
        double op2 = kbReader.nextDouble();

        System.out.println();

        // Switch directly on the string
        switch (choice) {
            case "Add":
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
                break;

            case "Subtract":
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
                break;

            case "Multiply":
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
                break;

            case "Divide":
                if (op2 != 0) {
                    System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter Add, Subtract, Multiply, or Divide.");
        }

        kbReader.close();
    }
}
