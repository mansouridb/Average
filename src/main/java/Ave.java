import java.util.Scanner;

public class Ave {

    public static void main(String[] args) {
        Scanner reader =new Scanner (System.in);
        System.out.println("please enter first numbers");
        double number1=reader.nextDouble();
        System.out.println("Please enter second number ");
        double number2= reader.nextDouble();
        System.out.println("Please enter third number");
        double number3= reader.nextDouble();
        System.out.print("The average value is " + ave(number1,number2,number3)   +"\n" );
    }
    public static double  ave(double a,double b , double c)
    {
        return   (a + b + c) / 3;

    }

}
