public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        for(int i = 0; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        //task 2
        System.out.println("Task 2");

        for(int i = 10; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();


        //task 3
        System.out.println("Task 3");

        for(int i = 0; i<17;){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();


        //task 4
        System.out.println("Task 4");

        for(int i = 10; i>=(-10); i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //task 5
        System.out.println("Task 5");

        for(int i=1904; i<2097; i = i + 4){
            System.out.println(i+" это високосный год");
        }

        //task 6
        System.out.println("Task 6");

        for(int i = 7; i<99; i = i + 7){
            System.out.print(i+" ");
        }
        System.out.println();

        //task 7
        System.out.println("Task 7");

        for(int i = 1; i<513; i = i*2){
            System.out.print(i+" ");
        }
        System.out.println();

        //task 8
        System.out.println("Task 8");

        int salary1 = 29000;
        int total  = 0;

        for (int i = 1; i<=12; i++){
            total += salary1;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+total+" рублей");
        }

        //task 9
        System.out.println("Task 9");

        int salary12 = 29000;
        int totalCount = 0;

        for(int i = 1; i<=12; i++){

            totalCount += salary12;
            totalCount += totalCount/100;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+totalCount+" рублей");
        }



    }
}