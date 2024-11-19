public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int accumulate = 2459000;
        int sum = 0;
        int amount = 15000;
        int month = 0;
        while (sum < accumulate) {
            sum+=amount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 2");
        int num = 0;
        while (num<10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (;num >=1;num--) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        int currentYear = 2024;
        for (int year = currentYear; year<currentYear+10; year++) {
            people+=people* birthRatePer1000/1000 - people* mortalityPer1000/1000;
            System.out.println("Год "+ year + " численность населения составляет " + people);
        }
        System.out.println("Задача 4");
        double percent = 7D/100;
        int desiredSum = 12_000_000;
        sum= amount;
        while (sum< desiredSum) {
            sum+=amount;
            sum = (int) (sum *(1+percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 5");
        sum= amount;
        month=0;
        while (sum< desiredSum) {
            sum+=amount;
            sum = (int) (sum *(1+percent));
            month++;
            if (month % 6 ==0 ) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 6");
        sum= amount;
        month=0;
        int months = 12*9;
        while (month< months) {
            sum = (int) (sum *(1+percent));
            month++;
            if (month % 6 ==0 ) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day+=7){
            System.out.println("Сегодня пятница, "+day+" -е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 0;
        int start = currentYear-200;
        int end = currentYear+ 100;
        for (int year = startSeeing; year<end; year += period){
            if (year>start) {
                System.out.println(year);
            }
        }
    }
}