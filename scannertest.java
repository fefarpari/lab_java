import java.util.*;
class scannertest
{
		public static void main(String args[])
		{
				Scanner sc=new Scanner(System.in);
				System.out.println ("Enter your rollno : ");
				int rollno=sc.nextInt();
				System.out.println ("Enter name : ");
				String nm=sc.next();
				System.out.println ("Enter Fees : ");
				double f=sc.nextDouble();
				System.out.println ("Enter stream : ");
				String s=sc.next();
				System.out.println ("Rollno ="+rollno+ "\n Name ="+nm+
				"\n Fees ="+f+ "\n stream ="+s);
				
		}
}
