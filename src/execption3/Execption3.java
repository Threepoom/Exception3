
package execption3;

import java.util.Scanner;

public class Execption3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try{
            System.out.println(num1+"/"+num2+" is "+(num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("Exception: Divisor cannot be zero! ");
        }
    }

        
    
}
