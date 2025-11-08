import java.util.Scanner;

class Main {

  static int doubleFactorial(int value) {
    if (value == 0 || value == 1 || value == 2) {
      return value;
    }

    return value * doubleFactorial(value - 2);
  }

  public static void main(String[] args) {
    int valueToCompute;

    System.out.print(
      "Enter the value for which the double factorial is to be computed: "
    );
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          valueToCompute = scanner.nextInt();
          if (valueToCompute >= 0) {
            break;
          } else {
            System.err.println("You must enter a positive integer.");
          }
        } catch (NumberFormatException e) {
          System.err.println("Error: you must enter an integer: ");
        }
      }
    }

    System.out.format(
      "%d!! = %d\n",
      valueToCompute,
      doubleFactorial(valueToCompute)
    );
  }
}
