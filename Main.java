import java.util.Scanner;
/**
 * Recreating popular english game fizbuzz
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Asking for integer
    System.out.println("Please enter a number to play FizzBuzz");
   // creating variable
    int num = input.nextInt();
    // creating answer for each scenario
  if (num%3 != 0 && num%5 != 0){
      System.out.println("You should say " + num);
      } else if (num%3 + num%5  < 1){
      System.out.println("You should say FizzBuzz");
      } else if (num%5 < 1){
      System.out.println("You should say Buzz");
      } else if (num%3 < 1){
      System.out.println("You should say Fizz");
  
  }
  }
}

  
  
