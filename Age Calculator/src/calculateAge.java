import java.util.Scanner;
public class calculateAge {
	// Calculate your age from current date (January 28, 2017)
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
		int day;
		int month;
		int year;
		System.out.print("Enter the year you were born: ");
		year = sc.nextInt();
		System.out.print("Enter the month you were born: ");
		month = sc.nextInt();
		System.out.print("Enter the day you were born: ");
		day = sc.nextInt();
		// Now we got the information we need
		int Age = 2017 - year;
		if(month > 1){
			Age = Age - 1;
			System.out.println("Your age is: " + Age);}
		if(month == 1){
			if(day > 28){
				Age = Age - 1;
				System.out.println("Your age is: " + Age);}
			else{
				System.out.println("Your age is: " + Age);}
				
			}
		}}
		
	

	

