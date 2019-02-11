import java.util.Scanner;
class VowelrConsonant{
public static void main (String[]qwe){
Scanner scan =new Scanner(System.in);
System.out.print("enter a char");
char ch=scan.next().toLowerCase().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.print("Vowel");
else
System.out.print("Consonant");
}
}