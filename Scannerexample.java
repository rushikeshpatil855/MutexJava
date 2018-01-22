import java.util.*;
class Scannerexample {
public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
String name[] = new String[5];
int roll_no[] = new int[5];
double marks[] = new double[5];
float percentage[] = new float[5];

System.out.println("How many student data u want to store ? ");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println("Enter data of "+i+" Student ");
System.out.println("Enter Name of "+i+"Student : ");
String name[i]=sc.next();

System.out.println("Enter Roll no. of "+i+"Student : ");
int roll_no[i]=sc.nextInt();

System.out.println("Enter Marks of "+i+"Student : ");
double marks[i]=sc.nextDouble();

System.out.println("Enter Percentage of "+i+"Student : ");
float percentage[i]=sc.nextFloat();
}
}
}

