iport java.util.Scanner;

public class SumofEven {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arr_size = s.nextInt();
    int count = 0;
    for (int i =0; i < arr_size; i++) {
      int curr = s.nextInt();
      if (curr % 2 == 0) {
        count += curr;
      }
    }
    System.out.println(count);
    s.close();
  }
}
