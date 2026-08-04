class Person
{
	String fname,lname;
	Person(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
}
class Student extends Person
{
	int rollno;
	String stream;
	int sem;
	Student(String fname,String lname,int rollno,
	String stream,int sem)
	{
		super(fname,lname);
		this.rollno=rollno;
		this.stream=stream;
		this.sem=sem;
	}
	void display()
	{
		System.out.println("Name :"+fname+"");
		System.out.println("Roll No :"+rollno);
		System.out.println("Division :"+stream +"sem :"+ sem);
	}
}
class StudDemo
{
	public static void main(String args[])
	{
		Student s1=new Student("Radha","Gajera",20,"MBBS",2);
		s1.display();
	}
}
	