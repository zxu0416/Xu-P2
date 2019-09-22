import java.util.Scanner;
public class p2
{
public static void main(String[] args)
{
double pounds,inches,kilo,meters,BMI=0;
Scanner input=new Scanner(System.in);
System.out.println("Which unit do you prefer to use for your height and weight? \n 1.pounds and inches \n2. kilograms and Meters");
int option=input.nextInt();
switch(option)
{
case 1:System.out.println("What is your weight(pounds)? ");
pounds=input.nextDouble();
System.out.println("What is your height(inches)? ");
inches=input.nextDouble();
BMI= 703*pounds / (inches*inches);
break;
case 2:System.out.println("Enter weight in kilograms:");
kilo=input.nextDouble();
System.out.println("Enter height in meters:");
meters=input.nextDouble();
BMI= kilo / (meters*meters);
break;
default: System.out.println("invalid choice");
break;
}
if(BMI<=18.5)
System.out.println("UnderWeight(<=18.5)");
else if(BMI<=24.9)
System.out.println("Healthy(18.5 - 24.9)");
else if(BMI<=29.9)
System.out.println("Overweight(25 - 29.9");
else
System.out.println("obese(>=30.0)");
}
}