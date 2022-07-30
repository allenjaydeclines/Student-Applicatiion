import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Enter number of new students: ");
		Scanner enter = new Scanner(System.in);
		int studentNumber = enter.nextInt();
		Student[] students = new Student[studentNumber]; 
		
		for (int i = 0; i < studentNumber; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		
		for (int i = 0; i < studentNumber; i++) {
			System.out.println(students[i].showInfo());
		}
	}

}
