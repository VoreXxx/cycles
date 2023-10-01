import java.time.Year;

public class Main {
    public static void main(String[] args) {
        //Task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Task6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Task7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Task8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task9
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }

        //Task10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }
}