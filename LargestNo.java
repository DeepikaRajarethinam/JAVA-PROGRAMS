import java.util.Scanner;
class LargestNo{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b&&a>c)
System.out.print(a+"is greatest");
else if (b>c)
System.out.print(b+"is greatest");
else
System.out.print(c+"is greatest");
}
}
