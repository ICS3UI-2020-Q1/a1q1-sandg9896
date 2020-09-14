import java.util.Scanner;

/** 
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // declare a variable that will store a temperature
   String name;
   System.out.println("Please enter a temperature you would like to convert in degrees Celsius:");
    
    // Creates a Scanner used for input
    Scanner input = new Scanner(System.in);
     int C = input.nextInt();
    
    // declare and calculate the temperature
   int temperatureF = (C*9)/5 +32;
  
   // Tell the user the temperature
   System.out.println(temperatureF);
  }
}
