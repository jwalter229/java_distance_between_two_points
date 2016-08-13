/*write a program that  prompts the user to
enter two points (x1, y1) and (x2, y2)
and displays the distance between them
*/
   //importing a scanner
import java.util.Scanner;
   
//Name of the Class   
public class Distance {
      //Main Method
   public static void main(String[] args) {
   
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      //prompting the user to enter two points
      System.out.println("Enter two points (x1,y1):");
      
      //displaying x1 and y1
      double x1 = scanner.nextDouble();
      double y1 = scanner.nextDouble();
   
      //prompting the user to enter two points  
      System.out.println("Enter two points (x2,y2):");
      
      //displaying x2 and y2
      double x2 = scanner.nextDouble();
      double y2 = scanner.nextDouble();
      
      //using Math.pow to calculate the two points
      double a = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
      
      //using Math.pow to take the square root
      double distance = Math.pow(a, 0.5);
      
      //displaying the distance between two points
      System.out.println("The Distance between the two points: " + distance);
     
   }
}//end class Distance