import java.util.Scanner;
class LeapYear{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int year =scan.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.print(year+"is leap");
else
System.out.print("not");
else
System.out.print("leap");
else
System.out.print(year+"is not leap");
}
}