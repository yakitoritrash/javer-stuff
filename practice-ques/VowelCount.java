import java.util.Scanner;

public class VowelCount {
  public static void main(String[]args) {
    Scanner s = new Scanner(System.in);
    String S = s.nextLine();
    int vowcount = 0;
    int constcount = 0;
    for (int i = 0; i < S.length(); i++) {
      if (Character.isLetter(S.charAt(i))) {
        if (S.charAt(i) == 'a' ||S.charAt(i) == 'e'||S.charAt(i) == 'i'||S.charAt(i) == 'o'||S.charAt(i) == 'u') {
          vowcount += 1;
        } else {
          constcount += 1;
        }
      }
    }
    System.out.println(vowcount);
    System.out.println(constcount);
    s.close();
  }
}
