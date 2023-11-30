import java.util.Scanner;
 public class ReadInput
  {
     public static void main(String args[])
       {
          System.out.println("|n enter a number= ");
          Scanner reader=new Scanner(System.in);//object creation
          int num=reader.nextInt();
          System.out.println("\n entered no is "+num);
       }
  } 