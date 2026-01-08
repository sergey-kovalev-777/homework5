//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nHomework 5");

        System.out.println("\nЗадача 1");

        int clientOS = 1;

        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадача 2");

        clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию версию приложения для iOS по ссылке");}
        }
        else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию версию приложения для Android по ссылке");
            }
        }

        System.out.println("\nЗадача 3");

        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("\nЗадача 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryDays + 2));
        }

        System.out.println("\nЗадача 5");

        int monthNumber = 12;

        if (monthNumber > 12) {
            System.out.println("Номер месяца должен быть не больше 12");
        }
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
            System.out.println("Месяц с номером " +monthNumber+ " принадлежит к сезону зима.");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("Месяц с номером " +monthNumber+ " принадлежит к сезону весна.");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("Месяц с номером " +monthNumber+ " принадлежит к сезону лето.");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("Месяц с номером " +monthNumber+ " принадлежит к сезону осень.");
            break;
        }
    }
}