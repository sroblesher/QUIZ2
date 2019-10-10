import java.util.Scanner;

public class quizz1 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner (System.in);

    int count=0;
    int quescor=0;
    //Question1
    System.out.println("Which cities are country’s capital?");
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
        count += 25;
      }

      System.out.println(count);
  }
}
