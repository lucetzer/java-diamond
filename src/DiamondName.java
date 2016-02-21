/**
 * Created by lucetzer on 17/02/2016.
 */
public class DiamondName {
  int lines;
  String name;

  DiamondName(int n, String yourName) {
    lines = n;
    name = yourName;
  }

  public void diamondAndNamePrint() {
    for (int i = 1; i <= lines; i++) {
      for (int k = 0; k < lines - i; k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i-1; k++) {
        System.out.print("*");
      }
      for (int j = 1; j < i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println(name);

    for (int i = lines-1; i >= 1; i--) {
      for (int k = 1; k < lines - i; k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    new DiamondName(3, "Lucy").diamondAndNamePrint();
  }
}
