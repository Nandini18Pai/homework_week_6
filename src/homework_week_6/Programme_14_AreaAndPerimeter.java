package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to print the ara and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 *
 */
public class Programme_14_AreaAndPerimeter
{
        //Calculating ara and perimeter of rectangle
        public static void areaAndPerimeterOfRectangle(int height, int width)
        {
            int perimeter = 2 * (height + width);
            int area = (height * width);
            System.out.println("The area of the rectangle is: " + area);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
        public static void main( String[] args)
        {
            // scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter the width of the rectangle: ");
            int height = scanner.nextInt();
            System.out.println(" Enter the height of the rectangle");
            int width = scanner.nextInt();
            areaAndPerimeterOfRectangle(height, width);
            // closing the scanner object
            scanner.close();

        }
}
