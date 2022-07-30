import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int yearLevel;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int courseFee = 902;
	private static int id = 1000;
	
	
	public Student() {
		//enter first name
		Scanner enter = new Scanner(System.in);
		System.out.print("\nEnter student first name: ");
		this.firstName = enter.nextLine();
		//enter last name
		System.out.print("Enter student last name: ");
		this.lastName = enter.nextLine();
		//enter school year
		System.out.print("1 1st year \n2 2nd year \n3 3rd year\n4 4th year\nEnter class level: ");
		this.yearLevel = enter.nextInt();
		
		setStudentID();
	}
	
	private void setStudentID() {
		id++;
		this.studentID = yearLevel + "" + id; 
	}
	
	public void enroll() {
		
		do {
			System.out.print("Enter a course to enroll(0 to exit): ");
			Scanner enter = new Scanner(System.in);
			String course = enter.nextLine();
			if (!course.equals("0")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + courseFee;
			}
			else { break; }
		}while(1 != 0);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance); 
	}
	
	public void payTuition() {
		System.out.print("902 per Course \nEnter your payment: ");
		Scanner enter = new Scanner(System.in);
		int payment = enter.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of " + payment);
		viewBalance();
	}
	
	public String showInfo() {
		return "Student name: " + firstName + " " + lastName + "\nYear Level: " + yearLevel + "\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses + "\nTuition Balance: " + tuitionBalance;
	}
}
