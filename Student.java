import java.io.*;
public class Student
{
	private int rollNo;
	private String name;
	private String lastname;
	private static int count;
	public Student(int rollNo, String name)
	{
		this.name=name;
		this.rollNo=rollNo;
		count++;
		System.out.println("2 Arg Constr");
	}
	public Student(int rollNo,String name, String lastname)
	{
		this(rollNo,name);
		this.lastname=lastname;
		System.out.println("3 Arg Constr");
	}
	public static int getCount()
	{
		return count;
	}
	public int getRollNo()
	{
		return this.rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getLastName()
	{
		return this.lastname;
	}
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
}

class TestStudent
{
	public static void main (String args[])
	{
		Student s1= new Student(101,"Ravi","Sharma");
		Student s2=new Student(102,"Riya","Pandey");
		//s1.setRollNo(10);
		//s1.setName("Anurag");
		System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getLastName());
		System.out.println("count:"+Student.getCount());
	}
}
