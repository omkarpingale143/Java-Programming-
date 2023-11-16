//Java program to find perimeter and area of a rectangle
import java.util.Scanner;

public class Rectangle 
{
    public static void main(String[] args) 
  {
        float length, width, area, perimeter;

        // Create scanner class object
        Scanner in = new Scanner(System.in);


        // Input length and width of rectangle
        length = in.nextFloat();
        System.out.print("Enter length of rectangle : ");
        
        width  = in.nextFloat();
        System.out.print("Enter width of rectangle : ");
    
        // Calculate perimeter  of rectangle
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle is : " + perimeter);
    
        // Calculate area of rectangle 
        area = length * width;
        System.out.println("Area of rectangle is : " + area);
    }
}
