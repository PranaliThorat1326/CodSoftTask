import java.util.*;
class CodeSoft2
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of subject which you want :");
	int noOsSubjects = sc.nextInt();
	int totalMarks = 0;
	for(int i=1;i<=noOsSubjects;i++)
	{
		System.out.print("Enter a mark in : "+i +" Subjects : ");
		int marks=sc.nextInt();
		totalMarks += marks;
	}
	double averagePercentage=(double)totalMarks/noOsSubjects;
	System.out.println("Total marks obtained : "+totalMarks);
	System.out.println("Average Percentage is :"+averagePercentage  +"%");
	String grade = calculateGrade(averagePercentage);
	System.out.println("Grade :"+grade);

   }
   public static String calculateGrade(double averagePercentage)
   {
   	String grade;
   	String performance;
   	if(averagePercentage>=90)
   	{
   		grade="A+";
   		performance="Excellent";
   		System.out.println("performance : "+performance);
   	}
   	else if(averagePercentage>=75)
   	{
   		grade="A";
   		performance = "very good";
   		System.out.println("performance : "+performance);
   	}
   	else if(averagePercentage>=60)
   	{
   		grade="B+";
   		performance = "Average";
   		System.out.println("performance : "+performance);
   	}
   	else if(averagePercentage>=45)
   	{
   		grade="B";
   		performance = "About Average";
   		System.out.println("performance : "+performance);
   	}
   	else if(averagePercentage>=35)
   	{
   		grade="C";
   		performance = "pass";
   		System.out.println("performance : "+performance);
   	}
   	else {
   		grade="D";
   		performance = "fail";
   		System.out.println("performance : "+performance);
   	}
   	return grade;
   }
}