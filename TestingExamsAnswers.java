import java.io.*;
import java.util.*;

public class TestingExamsAnswers {
	private static String studentName = "";
	private static int score;

	public static void main(String[] args) {
		int c = 0, i = 0;

		Scanner scan = new Scanner(System.in);
		String in;

		System.out.print("Please enter your name: ");

		in = scan.nextLine();
		studentName = in;

		// Question 1
		System.out.println("Question 1: What is OOP?");
		System.out.println("a. A misspelling of Poop");
		System.out.println("b. Object Oriented Programming");
		System.out.println("c. A foreign sandiwch");
		System.out.println("d. A form of Java");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("B")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 2
		System.out.println("\n Question 2: What is an IDE?");
		System.out.println("a. Integrated Development Environment");
		System.out.println("b. Iranian Drone Excusion");
		System.out.println("c. Immediate Dementia Engagement");
		System.out.println("d. All of the Above");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("A")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 3
		System.out.println("\n Question  3: What program is this written in?");
		System.out.println("a. C++");
		System.out.println("b. Python");
		System.out.println("c. Robot");
		System.out.println("d. Java");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("D")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 4
		System.out.println("\n Question 4: What is a neccessary import to track user inputs? ");
		System.out.println("a. Scanner");
		System.out.println("b. Spanner");
		System.out.println("c. UserInput");
		System.out.println("d. A pencil and Paper");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("A")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 5
		System.out.println("\n Question 5: How would you implement a table in GUI?");
		System.out.println("a. InsertTable");
		System.out.println("b. BigTimeTableTime");
		System.out.println("c. JTable");
		System.out.println("d. You can't");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("C")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 6
		System.out.println("\n Question 6: If you used a JButton, how would you track whether the user clicked it or not?");
		System.out.println("a. EventTrigger");
		System.out.println("b. PressListener");
		System.out.println("c. KeyListener");
		System.out.println("d. ActionListener");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("D")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 7
		System.out.println("\n Question 7: Will a Java program run mostly the same across Windows and UNIX?");
		System.out.println("a. Yes.");
		System.out.println("b. No.");

		in = scan.nextLine();

		if (in.equalsIgnoreCase("A")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 8
		System.out.println("\n Question 8: Can you write Java in an application outside of Eclipse?");
		System.out.println("a. No");
		System.out.println("b. Yes");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("B")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 9
		System.out.println("\n Question 9: How would you make the program print something to console?");
		System.out.println("a. Print");
		System.out.println("b. System.println");
		System.out.println("c. System.out.println");
		System.out.println("d. ConsoleWrite");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("C")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		// Question 10
		System.out.println("\n Question 10: Which word ISN'T a part of the 4 pillars of programming?");
		System.out.println("a. Instagramism .");
		System.out.println("b. Polymorphism");
		System.out.println("c. Abstraction");
		System.out.println("d. Inheritence");
		in = scan.nextLine();

		if (in.equalsIgnoreCase("A")) {
			System.out.println("That is correct");
			c++;
		} else {
			System.out.println("That is incorrect");
			i++;
		}

		System.out.println("========================================");
		System.out.println("Answers Correct: " + c);
		System.out.println("Answers Incorrect: " + i);
		System.out.println("========================================");
		System.out.println("You got " + 100*c/10 + "%");
		score = (100*c/10);
		writeExamResults(studentName+ " ", score + "%");
	}

	public static void writeExamResults(String studentName, String score) {
		FileWriter fStream;
		try {
			fStream = new FileWriter("examResults.txt", true);
			BufferedWriter out = new BufferedWriter(fStream);
			out.write("\n" + studentName);
			out.write("scored " + score);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}