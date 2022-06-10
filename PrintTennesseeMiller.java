/*
1. Alex Miller
2. June 10 2022
3. This program calls a different static method depending on what alphabet character is needed to create the word 'TENNESSEE' vertically twice side-by-side.
4. I believe I should recieve a 100 for this assignment as I completed everything shown on the rubric.
*/

public class PrintTennessee {
  public static void main(String[] args) { // calls each static method in the order needed
    printDoubleT();
    printDoubleE();
    printDoubleN();
    printDoubleN();
    printDoubleE();
    printDoubleS();
    printDoubleS();
    printDoubleE();
    printDoubleE();
  }

  public static void printDoubleT() { // prints out two capital T's side by side
    System.out.println(""); // these are provided to add spacing between each vertical letter
    System.out.println("TTTTTTTTTT          TTTTTTTTTT");
    System.out.println("    TT                  TT    ");
    System.out.println("    TT                  TT    ");
    System.out.println("    TT                  TT    ");
    System.out.println("    TT                  TT    ");
    System.out.println("    TT                  TT    ");
    System.out.println("");

  }

  public static void printDoubleE() { // prints out two capital E's side by side
    System.out.println("");
    System.out.println("EEEEEEEEEE           EEEEEEEEEE");
    System.out.println("EE                   EE        ");
    System.out.println("EE                   EE        ");
    System.out.println("EEEEEEEEEE           EEEEEEEEEE");
    System.out.println("EE                   EE        ");
    System.out.println("EE                   EE        ");
    System.out.println("EEEEEEEEEE           EEEEEEEEEE");
    System.out.println("");

  }

  public static void printDoubleN() { // prints out two capital N's side by side
    System.out.println("");
    System.out.println("N N     N            N N     N");
    System.out.println("N  N    N            N  N    N");
    System.out.println("N   N   N            N    N  N");
    System.out.println("N     N N            N     N N");
    System.out.println("N       N            N       N");
    System.out.println("");
  }

  public static void printDoubleS() { // prints out two capital S's side by side
    System.out.println("");
    System.out.println(" SSSSSSSS             SSSSSSSS ");
    System.out.println("S        S           S        S");
    System.out.println("S                    S         ");
    System.out.println("S                    S         ");
    System.out.println(" SSSSSSSS             SSSSSSSS ");
    System.out.println("         S                    S");
    System.out.println("         S                    S");
    System.out.println("S        S           S        S");
    System.out.println(" SSSSSSSS             SSSSSSSS ");
    System.out.println("");
  }
}
