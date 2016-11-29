import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class StudentInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String userFirstname;
		String userLastname;
		int userGrade;
		int userID;
		String userLogin;
		double userAverage;
		
		System.out.println("What is your first name?");
		userFirstname = userInput.next();
				
		System.out.println("What is your last name?");
		userLastname = userInput.next();
		
		System.out.println("What grade are you in?");
		userGrade = userInput.nextInt();
		
		System.out.println("What is your student ID?");
		userID = userInput.nextInt();
		
		System.out.println("What is your student login?");
		userLogin = userInput.next();
		
		System.out.println("What is your school average?");
		userAverage = userInput.nextDouble();
		
		System.out.println("Login:\t" + userLogin);
		
		System.out.println("ID:\t" + userID);
		
		System.out.println("Name:\t" + userLastname + ", " +  userFirstname);
		
		System.out.println("Average:\t" + userAverage);
		
		System.out.println("Grade:\t" + userGrade);
		
		userInput.close();
		
	}

}
