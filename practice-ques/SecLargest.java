import java.util.Scanner;

public class SecLargest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int arr[] = new int[N];
    int max = 0;
    int secmax = -1;
    for (int i = 0; i < N; i++) {
      arr[i] = s.nextInt();
    }
    for (int i = 0; i < N; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = 0; i < N; i++) {
      if (arr[i] > secmax && arr[i] < max) {
        secmax = arr[i];
      }
    }
    System.out.println(secmax);
    s.close();
  }
}
