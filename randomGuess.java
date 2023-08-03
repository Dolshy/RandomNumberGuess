import java.util.Scanner;
import java.lang.Math;
public class randomGuess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int a=1+(int)(Math.random()*99);
        int guess=0;
        System.out.println("I am thinking of a number from 1 to 100...guess what it is ?");
        while(guess!=a){
            guess=sc.nextInt();
            count++;
            if(guess>a){
                System.out.println("the number is too high!");
            }
            else if(guess<a){
                System.out.println("the number is too low!");
            }
        }
        System.out.println("Congratulations. You guessed the number with "+count+" tries!");
    }
}
