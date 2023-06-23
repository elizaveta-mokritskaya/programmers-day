import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
           System.out.println("12.09." + year + ".");// здесь нужно вывести результат
        } else {
            System.out.println("13.09." + year + ".");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = true;
        if ((year % 4 == 0 ) && (year % 100 != 0)) {
            leapYear = true;
            return leapYear;// здесь нужно определить, является ли переданный год високосным
        } else if (year % 400 ==0) {
            leapYear = true;
            return leapYear;
        } else {
        leapYear = false;
        return leapYear;
        }
    }
}