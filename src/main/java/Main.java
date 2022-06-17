import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static int SEVEN = 7;
    static String NAME = "Вячеслав";
    static int[] ARRAY = new int[]{1, 3, 55, 4, 5, 13, 18, 26, 99};

    public static void main(String[] args) {

        checkingTheNumber();
        nameVerification();
        checkingArray();

    }

    static void checkingTheNumber() {

        System.out.println("Введите число :");
        try {
            double number = Integer.parseInt(bufferedReader.readLine());
            if (number > SEVEN) {
                System.out.println("Привет");
            } else System.out.println("Введенное число неверно");
            System.out.println();
        } catch (NumberFormatException | IOException e) {
            System.out.println("Мы то ждали число : " + e.getMessage());
        }
    }

    static void nameVerification() {

        System.out.println("Введите имя :");

        try {
            if (bufferedReader.readLine().equals(NAME)) {
                System.out.println("Привет, Вячеслав");
            } else
                System.out.println("Нет такого имени!");
            System.out.println();
        } catch (IOException e) {
            System.out.println("Напишите имя в текстовом формате : " + e.getMessage());
        }
    }

    static void checkingArray() {

        System.out.println("Вывод чисел имеющегося массива ARRAY кратных 3");

        for (int value : ARRAY) {
            if (value % 3 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}
