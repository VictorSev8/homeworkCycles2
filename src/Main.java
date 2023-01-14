public class Main {
    public static void main(String[] args) {

        // ЗАДАЧА 1
        System.out.println("Task 1");
        int month = 0;
        int total = 0;
        int pay = 15_000;
        while (total < 2_459_000) {
            total = total + pay;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        // ЗАДАЧА 2
        System.out.println("Task 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        int number2 = 10;
        for (; number2 > 0; ) {
            System.out.print(number2 + " ");
            number2--;
        }
        // ЗАДАЧА 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int bornPerYear = population / 1000 * 17;
        int deathsPerYear = population / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + bornPerYear - deathsPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // ЗАДАЧА 4
        System.out.println("Task 4");
        int bank = 15_000;
        int period = 0;
        double percent = 1.07;
        while (bank < 12_000_000) {
            bank = (int) (bank * percent);
            period++;
            System.out.println("Месяц " + period + " сумма накоплений равна " + bank);
        }
        // ЗАДАЧА 5
        System.out.println("Task 5");
        int bank1 = 15_000;
        int period1 = 0;
        double percent1 = 1.07;
        while (bank1 < 12_000_000) {
            bank1 = (int) (bank1 * percent1);
            period1++;
            if (period1 % 6 == 0) {
                System.out.println("Месяц " + period1 + " сумма накоплений равна " + bank1);
            }
        }
        // ЗАДАЧА 6
        System.out.println("Task 6");
        int bank2 = 15_000;
        double percent2 = 1.07;
        int year1 = 9;
        int months = 0;
        while (months < (year1 * 12)) {
            bank2 = (int) (bank2 * percent2);
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " сумма накоплений равна " + bank2);
            }
        }
        // ЗАДАЧА 7
        System.out.println("Task 7");
        int friday = 1;
        int days = 31;
        while (friday <= days) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        // ЗАДАЧА 8
        System.out.println("Task 8");
        int fly = 0;
        int now = 2023;
        int end = now + 100;
        while (fly <= end) {
            fly += 79;
            if (fly >= now - 200 && fly <= end) {
                System.out.println(fly);
            }
        }
    }
}