
import java.util.Scanner;
import java.util.Arrays;

class Student {
	
	public String name;
	public int grade;
}

public class absractData {
   
	public static void main(String[] args){
		
		String[] infoStudent = new String[0];
		 
		int counter = 0;
		int grade;
		String name;
		
		
		while (true){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the student's name (put a period at the end):");
			name = input.nextLine();
			if (name.equals(".")){
				
				for (int info = 0; info<infoStudent.length; info++){
					System.out.println(infoStudent[info]);
				}
				
			}
			else{
				System.out.println("enter the student's grade:");
				grade = input.nextInt();
		
				Student student = new Student();
				student.name = name;
				student.grade = grade;
				infoStudent = Arrays.copyOf(infoStudent, infoStudent.length + 1);
				infoStudent[counter] = "Name: " + student.name + ", Grade: " + Integer.toString(student.grade);
				counter++;
			}
		
		
	}
	
	
	}	
}
