import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double celsius;
        double fahrenheit;
        String trash;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the temperature in Celsius: ");
        if (in.hasNextDouble())
        {
            celsius = in.nextInt();
            fahrenheit = celsius * 1.8 + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

            if (fahrenheit >= 212)
            {
                System.out.println("It is boiling.");
            }
            else if (fahrenheit<= 32)
            {
                System.out.println("It is freezing");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You have input a wrong value: " + trash);
        }



    }
}
