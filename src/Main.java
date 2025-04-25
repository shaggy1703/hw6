public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int needSave = 2459000;
        int startAmount = 0;
        int amountDefferal = 15000;
        int month = 0;

        while (startAmount<needSave){
            month ++;
            startAmount += amountDefferal;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + startAmount + " рублей.");
        }

        System.out.println();

        System.out.println("Task 2");

        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Task 3");

        int population = 12000000;
        int birth = 17;
        int death = 8;

        for (int year = 1; year <= 10; year++){
            population += population * birth / 1000 - population * death / 1000 ;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Task 4");

        month = 0;
        int needSave1 = 1200000;
        int startMoney = 15000;
        double percent = 0.07;
            int finishMoney = startMoney;

        while (finishMoney < needSave1){
            month++;
            finishMoney += finishMoney * percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + finishMoney);
        }

        System.out.println();
        System.out.println("Task 5");

        month = 0;
        finishMoney = startMoney;
        while (finishMoney < needSave1){
            month++;
            finishMoney += finishMoney * percent;
            if (month%6==0){
                System.out.println("Месяц " + month + ", сумма накоплений равна " + finishMoney);
            }
        }

        System.out.println();
        System.out.println("Task 6");

        month = 0;
        finishMoney = startMoney;
        int months = 12 * 9;
        while (month < months) {
            month++;
            finishMoney += finishMoney * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + finishMoney);
            }
        }

        System.out.println();
        System.out.println("Task 7");

        int friday = 5;
        for (int day = friday; day <= 31; day+=7){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Task 8");

        int period = 79;
        int startSee = 0;
        int yearCom = 2025;
        int start = yearCom - 200;
        int end = yearCom + 100;
        for (int year = startSee; year < end; year += period){
            if (year > start){
                System.out.println(year);
            }
        }

    }
}