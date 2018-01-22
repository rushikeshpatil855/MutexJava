import java.util.Scanner;
class Scannerdemo {
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter roll no. : ");
int roll_no=sc.nextInt();
System.out.println("Enter Name : ");
String name=sc.next();
System.out.println("Enter Marks : ");
double marks=sc.nextDouble();
System.out.println("Enter Percentage : ");
float percentage=sc.nextFloat();
System.out.println("Rollno : "+roll_no+" Name : "+name+" Marks : "+marks+ "Percentage : "+percentage);
}
}