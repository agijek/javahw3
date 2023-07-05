public class Main {
    public static void main(String[] args) {

        System.out.println("Добрый день!");
        int amountTicket = 5000;
        System.out.println("Стоимость билета " + amountTicket + " руб.");

        int amountOneMiles = 20;
        int bonusMiles = amountTicket / amountOneMiles;


        System.out.println("Ваш бонус составляет " + bonusMiles + " миль.");

    }
}