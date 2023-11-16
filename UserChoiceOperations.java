import java.util.Scanner;
public class UserChoiceOperations 
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Find the greater between three numbers");
        System.out.println("2. Check if a number is even or odd");
        System.out.println("3. Check if a character is a vowel or not");
        System.out.println("4. Check if a number is divisible by 5 or not");

        int choice = input.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.println("Enter three numbers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int max = Math.max(num1, Math.max(num2, num3));
                System.out.println("The greater number is: " + max);
                break;
            case 2:
                System.out.println("Enter a number:");
                int number = input.nextInt();
                if (number % 2 == 0) 
                {
                    System.out.println(number + " is even");
                } else 
                {
                    System.out.println(number + " is odd");
                }
                break;
            case 3:
                System.out.println("Enter a character:");
                char character = input.next().charAt(0);
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    System.out.println(character + " is a vowel");
                } else 
                {
                    System.out.println(character + " is not a vowel");
                }
                break;
            case 4:
                System.out.println("Enter a number:");
                int num = input.nextInt();
                if (num % 5 == 0) 
                {
                    System.out.println(num + " is divisible by 5");
                } else 
                {
                    System.out.println(num + " is not divisible by 5");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
