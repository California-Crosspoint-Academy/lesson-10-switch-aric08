import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        // Show menu to the user
        System.out.println("Make your arithmetic selection from the choices below:\n");
        System.out.println(" Add       → Addition");
        System.out.println(" Subtract  → Subtraction");
        System.out.println(" Multiply  → Multiplication");
        System.out.println(" Divide    → Division\n");

        // Read user's choice as a string
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Your choice? ");
        String choice = kbReader.nextLine();

        // Ask for two operands (numbers to calculate with)
        System.out.print("\nEnter first operand: ");
        double op1 = kbReader.nextDouble();
        System.out.print("Enter second operand: ");
        double op2 = kbReader.nextDouble();
        System.out.println();

        // Switch directly on strings (Java 7+ feature)
        switch (choice) {
            case "Add": // if user types "Add"
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
                break;

            case "Subtract": // if user types "Subtract"
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
                break;

            case "Multiply": // if user types "Multiply"
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
                break;

            case "Divide": // if user types "Divide"
                if (op2 != 0) { // check for divide by zero
                    System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default: // if input does not match any case
                System.out.println("Invalid choice. Use Add, Subtract, Multiply, or Divide.");
        }

        kbReader.close();
    }
}
