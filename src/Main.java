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
          if (valueToCompute >= 0 && valueToCompute < 20) {
            break;
          } else {
            System.err.print(
              "You must enter a positive integer less than 20: "
            );
          }
        } catch (NumberFormatException e) {
          System.err.print("Error: you must enter an integer: ");
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
