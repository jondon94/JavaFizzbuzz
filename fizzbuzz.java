//Fizzbuzz..........its Fizzbuzz
import java.util.*;

public class fizzbuzz {
  public static void main(String[] args){

    System.out.println("Welcome to Fizzbuzz. How far do you want to fizzbuzz");
    Scanner input=new Scanner(System.in);

    //DECLARATIONS
    int fizznum;
    int i;
    fizznum=input.nextInt();

    System.out.println("You chose: " + fizznum);
    System.out.println( "\n ...Ready...");
    //Here we have a delay for 1 second, it interruptd the thread
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex){
        Thread.currentThread().interrupt();
    }

    System.out.println("\n ...Set... ");
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex){
        Thread.currentThread().interrupt();
    }

    System.out.println("\n ...Fizzbuzz...\n\n");

    //Here's the actual Fizzbuzz code
    for (i=1; i<=fizznum; i++) {
      if (i%15 == 0)
        System.out.println("Fizzbuzz\t");

      else if (i%5 == 0)
        System.out.println("Buzz\t");

      else if (i%3 == 0)
        System.out.println("Fizz\t");

      else System.out.println(i);
    }
  }
}
