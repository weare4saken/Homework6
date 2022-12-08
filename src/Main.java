import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static String isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год - високосный год";
        } else {
            return year + " год - невисокосный год";
        }
    }

    public static String installVersion(int releaseYear, int requiredPlatform) {
        int currentYear = LocalDate.now().getYear();
        if (requiredPlatform == 0 && releaseYear < currentYear) {
            return "Установите облегченную версию приложения для iOS";
        } else if (requiredPlatform == 0) {
            return "Установите версию приложения для iOS";
        } else if (requiredPlatform == 1 && releaseYear < currentYear) {
            return "Установите облегченную версию приложения для Android";
        } else if (requiredPlatform == 1) {
            return "Установите версию приложения для Android";
        } else {
            return "На вашу операционную систему невозможно установить приложение";
        }
    }

    public static String deliveryCard (int distanceForClient) {
        if (distanceForClient <= 20) {
            return "Потребуется 1 день";
        } else if (distanceForClient <= 60) {
            return "Потребуется 2 дня";
        } else if (distanceForClient <= 100) {
            return "Потребуется 3 дня";
        } else {
            return "Доставки нет";
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска телефона:");
        int year = scanner.nextInt();
        System.out.println("Выберите тип операционной системы: 0 - iOS / 1 - Android");
        int platform = scanner.nextInt();
        System.out.println(installVersion(year, platform));
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до вашего дома:");
        int distance = scanner.nextInt();
        System.out.println(deliveryCard(distance));
    }
}
