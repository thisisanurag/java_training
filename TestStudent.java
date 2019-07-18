import java.util.Scanner;
public class TestStudent 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rollNo,searchRoll,choice;
		boolean found,exit=true;
		String name,searchName;
		int n,pos=0;
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		Student[] s=new Student[n];
	/*	for (int i=0;i<n;i++)
		{
			System.out.println("Please Enter student rollno. name.");
			rollNo=sc.nextInt();
			name=sc.next();
			s[i]=new Student(rollNo,name);
		}
		System.out.println("Record of Students=");
		for (int i=0;i<n;i++)
		{
			System.out.println(s[i].getRollNo()+" "+s[i].getName());
		}*/
		while (exit)
		{
			System.out.println("1.Enter the New student 2.Search Roll   3.Search Name    4.Print record 5.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter the Name ");
				   name=sc.next();
				   System.out.println("Enter the Roll");
				   rollNo=sc.nextInt();
				   try
				   {
					   s[pos]=new Student(rollNo,name);
					   pos++;
				   }
				   catch(StudentException st)
				   {
					   System.out.println(st.getDetails());
				   }
				   break;
			case 2:
				System.out.println("Enter the key Roll No");
				searchRoll=sc.nextInt();
				found=false;
				for (int i=0;i<pos;i++)
				{
					found=false;
					if (s[i].getRollNo()==searchRoll)
					{
						found=true;
						System.out.println("Roll No "+searchRoll+" found");
						break;
					}
				}
				if (found==false)
				{
					System.out.println("Roll No "+searchRoll+" not found");
				}
				break;
			case 3:
				System.out.println("Enter the key name");
				searchName=sc.next();
				found=false;
				for (int i=0;i<pos;i++)
				{
					found=false;
					if (s[i].getName().compareTo(searchName)==0)
					{
						found=true;
						System.out.println("Name "+searchName+" found");
						break;
					}
				}
				if (found==false)
				{
					System.out.println("Name "+searchName+" not found");
				}
				break;
				
			case 4:System.out.println("Record of Students=");
			for (int i=0;i<pos;i++)
			{
				System.out.println(s[i].getRollNo()+" "+s[i].getName());
			}
				   break;	
			case 5:
				exit=false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
