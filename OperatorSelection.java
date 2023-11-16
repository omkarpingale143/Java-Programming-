import java.util.Scanner;

public class OperatorSelection 
{

    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operator category : ");
        int choice = scanner.nextInt();
        System.out.println("1. Arithmetic Operator");
        System.out.println("2. Logical Operator");
        System.out.println("3. Relational Operator");
        System.out.println("4. Bitwise Operator");
        System.out.println("5. Conditional Operator");
        System.out.println("6. Assignment Operator");

        switch (choice) 
        {
            case 1:
                displayArithmeticOperators();
                break;
            case 2:
                displayLogicalOperators();
                break;
            case 3:
                displayRelationalOperators();
                break;
            case 4:
                displayBitwiseOperators();
                break;
            case 5:
                displayConditionalOperators();
                break;
            case 6:
                displayAssignmentOperators();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }

    private static void displayArithmeticOperators() 
    {
        System.out.println("Arithmetic Operators: +, -, *, /, %");
    }

    private static void displayLogicalOperators()   
    {
        System.out.println("Logical Operators: && (AND), || (OR), ! (NOT)");
    }

    private static void displayRelationalOperators() 
    {
        System.out.println("Relational Operators: ==, !=, >, <, >=, <= ");
    }

    private static void displayBitwiseOperators() 
    {
        System.out.println("Bitwise Operators: &, |, ^, ~, <<, >>, >>>");
    }

    private static void displayConditionalOperators() 
    {
        System.out.println("Conditional Operator: ? :");
    }

    private static void displayAssignmentOperators()   
    {
        System.out.println("Assignment Operators: =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |= ");
    }
}
