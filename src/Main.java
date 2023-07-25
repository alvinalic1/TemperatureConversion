public class Main {
    private double fahrenheit;
    private double celcius;
    private double conversion;

    public double convertToCelcius(double degrees)
    {
        return (degrees - 32) * (double)(5/9);
    }

    public double converToFahrenheit(double degrees)
    {
        return (degrees * 1.8) + 32;
    }
    public static void main(String[] args)
    {

    }
}