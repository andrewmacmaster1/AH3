import java.util.Scanner;

public class FizzBuzz
{
    public static void FizzBuzz(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.print("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.print("Buzz");
            }
            else
            {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }

    public static String recursive_fizzbuzz(int n, int i, String result)
    {
        if (i <= n)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                result += "FizzBuzz";
            }
            else if (i % 3 == 0)
            {
                result += "Fizz";
            }
            else if (i % 5 == 0)
            {
                result += "Buzz";
            }
            else
            {
                result += i;
            }
            result += " ";
            i++;
            return recursive_fizzbuzz(n, i, result);
        }
        return result;
        
    }
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number n > 1 to play Fizz Buzz: ");
        System.out.println();
        //FizzBuzz(console.nextInt());
        System.out.println(recursive_fizzbuzz(console.nextInt(), 1, ""));
    }
}
