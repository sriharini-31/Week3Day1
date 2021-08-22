package week3Day1Assignment;

public class Student extends Department {
	
	String name= "sriHarini";
	int id = 31;

	public void StudentName() {
		System.out.println(" Student Name Is " + name);
	}
	
	public void StudentDept() {
		System.out.println( name + " department Name Is " + dept);	
	}
	
	public void StudentId() {
		System.out.println(" Student Id Is " + id);
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		System.out.println("**************College*******************");
		stud.CollegeCode();
		stud.CollegeName();
		stud.CollegeRank();		
		
		System.out.println("**************Department**********");
		stud.DeptName();
		
		System.out.println("************Student************");
		stud.StudentName();
		stud.StudentDept();
		stud.StudentId();
		
	}
}
