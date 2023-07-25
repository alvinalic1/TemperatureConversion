import java.util.Scanner;

public class Main {
    private double fahrenheit;
    private double celcius;
    private double conversion;

    public int answer()
    {
        Scanner input = new Scanner(System.in);
        int answer;
        System.out.println("Type 1 to convert F -> C \nType 2 to convert C -> F");
        answer = input.nextInt();
        return answer;
    }

    public void enterTheDegrees(int x)
    {
        Scanner input = new Scanner(System.in);
        double degrees;
        if(x==1)
        {
            System.out.print("Enter the degrees Fahrenheit: ");
            degrees = input.nextDouble();
            System.out.println("That is " + String.format("%.2f",convertToCelcius(degrees)) + " degrees Celcius");
        }
        else if (x==2)
        {
            System.out.print("Enter the degrees Celcius: ");
            degrees = input.nextDouble();
            System.out.println("That is " + converToFahrenheit(degrees) + "degrees Fahrenheit");
        }
    }

    public double convertToCelcius(double degrees)
    {
        return ((degrees - 32) / 1.8);
    }

    public double converToFahrenheit(double degrees)
    {
        return (degrees * 1.8) + 32;
    }
    public static void main(String[] args)
    {
        Main example = new Main();
        example.enterTheDegrees(example.answer());

    }
}