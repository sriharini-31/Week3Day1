package week3Day1Assignment;

public class Assign4Students {
	
	public void getStudentInfo()
	{
		int studId=3114;

		System.out.println("Method1 Student id is: " + studId);
	}

	public void getStudentInfo(int studId,String name)
	{
		System.out.println("Method2 Student id is: " + studId);
		System.out.println("Method2 Student name is: " + name);

	}
	public void getStudentInfo(long phoneNum,String emailID)
	{
		System.out.println("Method3 Student phonenumber is: " + phoneNum);
		System.out.println("Method3 Student email is: " + emailID);
	}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assign4Students stud1=new Assign4Students();
			stud1.getStudentInfo();
			stud1.getStudentInfo(3114, "sriharini");
	stud1.getStudentInfo(8508933328L, "hari@gmail.com");
		}

}
