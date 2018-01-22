import java.util.*;
class Abc {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("How many student data u want to store ? ");
int num=sc.nextInt();
int i;
int roll_no[] = new int[num];
String name[] = new String[num];
double marks[] = new double[num];
double percentage[] = new double[num];
for(i=0;i<=num-1;i++)
{
System.out.println("Enter "+i+" Student data");
System.out.println("Enter Roll no. of "+i+" Student : ");
roll_no[i]=sc.nextInt();
System.out.println("Enter Name of "+i+" Student : ");
name[i]=sc.next();
System.out.println("Enter Marks of "+i+" Student : ");
marks[i]=sc.nextDouble();
System.out.println("Enter Percentage of :"+i+" Student :");
percentage[i]=sc.nextDouble();
}
for(i=0;i<=num-1;i++)
{
System.out.println("Student "+i+" Details ");
System.out.println("Rollno : "+roll_no[i]+" Name : "+name[i]+" Marks : "+marks[i]+ "Percentage : "+percentage[i]);
}
}
}