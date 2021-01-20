import java.util.Scanner;

class Prob3 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a word: ");

  String word = scan.nextLine();
  word= word.LowerCase();

  System.out.println("Enter another word: ");
  String word2 =scan.nextLine();
  word2 = word2.LowerCase();

  System.out.println(word.compareTo(word2));
  }
}