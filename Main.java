/**
 *This program out puts the last digit of a number using a method
 * @author Zachary Balean
 */
public class Main {

  //method for last digit
  public static int lastDigit(int number){
    //integer for last digit
    int lastNumber = number % 10;
    //if statement if to write the number not negative if it is
    if(lastNumber < 0){
      lastNumber = lastNumber * (-1);
    }
    //returns the integer
    return lastNumber;
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls the method
    int answer = lastDigit(3572);
    //prints the last digit
    System.out.println(answer);
  
  }
}
