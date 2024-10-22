import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();
        calculateSquare(number);

        System.out.println("Enter a radius and height: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = calculateCylinderSquare(radius, height);
        System.out.println("Cylinder volume: " + volume);

        int[] numbers = {1, 2, 3, 4, 5};
        int totalSum = calculateSum(numbers);
        System.out.println("The sum of the array elements: " + totalSum);

        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original line: " + originalString);
        System.out.println("Inverted line: " + reversedString);

        System.out.println("Enter an integer number: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double result = power(number1,number2);
        System.out.println(number1+" " + "to the power of"+" " + number2 +" "+ "is equal to: " + result);

        int n = scanner.nextInt();
        System.out.println("Enter an integer number: ");
        String text = "Привіт, світ!";
        repeatText(n, text);
    }

       public static void calculateSquare (int number){ //task1
          int square = number * number;
          System.out.println("result: " + square);
         }

 public static double calculateCylinderSquare(double r, double h){ //task2
 double volumeCylinder = Math.PI * r * r * h;
 return volumeCylinder;
}

    public static int calculateSum(int[] numbers) { //task3
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static String reverseString(String input) { //task4
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static double power(double a, double b) { //task5
        return Math.pow(a, b);
    }

    public static void repeatText(int n, String text) { //task6
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
