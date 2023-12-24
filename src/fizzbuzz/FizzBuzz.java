
package fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = newScanner.nextInt();
        
        if (num % 5 == 0 && num % 3 == 0 ){
            System.out.println("FizzBuzz");
        }else if (num % 5 == 0){
            System.out.println("Fizz");
        }else if(num % 3 == 0){
            System.out.println("Buzz");
        }else
            System.out.println(num);
    }
    
}
