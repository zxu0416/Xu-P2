import java.util.Scanner;
public class p1
{
  public static void main(String[] args)
  {
     inputNum();
  }  
public static int inputNum()
  {
    int number = 0, stringSize = 0;
    String digits ; 
    Scanner scnr = new Scanner(System.in);
    while (stringSize != 4)
    {
      System.out.println("Enter a four digit number"); 
      digits = scnr.nextLine();
      stringSize = digits.length(); 
      if (stringSize == 4)
      {
        number = Integer.parseInt(digits);
      }
    }
    encrypt(number);
    return number; 
    }
public static int encrypt(int num) 
  {
    int a, b, c, d;
    a = num / 1000;
    b = num / 100 % 10;
    c = num / 10 % 10;
    d = num % 10;
    a = (a + 7)%10;
    b = (b + 7)%10;
    c = (c + 7)%10;
    d = (d + 7)%10;
    System.out.println(c+d+a+b);
    return (c+d+a+b);
    }
}