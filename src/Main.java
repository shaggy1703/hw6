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
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + startAmount + " рублей.");

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






    }
}