public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task5");
        for (int i = 1904; i <= 2096; i += 4) {
            int x = i % 4;
            int y = i % 400;
            int z = i % 100;
            boolean leapYear = x == 0 && (y == 0 || z != 0);
            if (leapYear){
            System.out.println(i + " год является високосным");
            }
        }
        System.out.println("______________________________");
        System.out.println("task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task7");
        for (int i = 1; i <= 256; i *= 2) {
            System.out.println(i);
        }
        System.out.println("______________________________");

        System.out.println("task8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("______________________________");

        System.out.println("task9");
        float salaryOne = 29000f;
        float totalOne = 0;
        for (int i = 1; i < 13; i++) {
            totalOne = totalOne + salaryOne;
            totalOne = totalOne * 101 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalOne + " рублей");
        }
        System.out.println("______________________________");

        System.out.println("task10");
        int numTwo = 2;
        for (int i = 1; i < 11; i++) {
            int result;
            result = numTwo * i;
            System.out.println(result);
        }
    }
}