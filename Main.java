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
    System.out.println("Please enter a number to play FizzBuzz");
   
    int num = input.nextInt();
    int num3 = num%3;
    int num5 = num%5;
  if (num3+num5 >= 2){
      System.out.println(num);
      if (num3 < 1){
      System.out.println("fizz");
      } else if (num5 < 1){
      System.out.println("buzz");
      } else if (num3 + num5 < 1){
      System.out.println("fizzbuzz");
    
  
  }
  }
}
}
  
  
