import java.util.Scanner;
public class SampleQuiz {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int Grade = 0;
		int prob1 = 0;
		int prob2 = 0;
		int prob3 = 0;
		int prob4 = 0;
		int answer = 0;
		int quescor = 0;
		int tempNum = 0;

		System.out.println("Which cities are country\'s capital?");
		System.out.println("Hint: There are 2 correct answers");
		System.out.println("Select two correct options for full credit.");
		System.out.println("A) Houston");
		System.out.println("B) Madrid");
		System.out.println("C) Rio de Janeiro");
		System.out.println("D) Tokyo");

		System.out.println("Enter first letter");
		char a = scnr.next().charAt(0);
		System.out.println("Enter second letter");
		char b = scnr.next().charAt(0);

		if (a == 'B' || a == 'D')
        quescor++;
    if ( (b == 'B' || b == 'D') && a !=b )
        quescor++;

    if (quescor == 2)
      {
        prob1 = 100;
		System.out.println("This is correct");
      }

		System.out.println("Question 2: What is the product of 4 and 5?");
		System.out.println("Enter your answer: ");
		tempNum = scnr.nextInt();
		if(tempNum == 20){
			prob2 = 100;
			System.out.println("This is correct");
		}

		System.out.println("What is the output in Java when you compute S.O.P (15%7)?");
		answer = scnr.nextInt();

		if(answer == 1){
			System.out.println("This is correct!");
			prob3 = 100;
		}
		else if(answer > 1){
			System.out.println("Sorry, this is incorrect.");
		}
		System.out.println("Question 4: java _______.");
        System.out.println("A) is a programming language");
        System.out.println("B) is useless");
        System.out.println("C) is an object oriented programming language");
        System.out.println("D) was developed by Sun Microsystems");
        char answer4 = scnr.next().charAt(0);
        if(answer4 == 'A' || answer4 == 'C') {
            prob4 = 100;
			System.out.println("This is correct");
		}
        else if(answer4 == 'D'){
			prob4 = 100;
			System.out.println("This is correct");
		}

		Grade = (prob1 + prob2 + prob3 + prob4) / 4;

		System.out.println("Your grade is: " + Grade + " / 100 ");

		if(Grade >= 75){
			System.out.println("Congrats you Passed the Quiz!");
		}
		else{
			System.out.println("Sorry you Failed the Quiz");
		}
	}
}
