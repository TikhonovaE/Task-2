public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int sumAdded = 1500;
        boolean compare = sumAdded > 1000;
        int bonus = compare ? 1 : 0;
        int bonusRub = sumAdded * bonus / 100;
        int finalBalance = balance + sumAdded + bonusRub;
        System.out.println("Итоговый счёт " + finalBalance);
        System.out.println("Количество бонусных рублей " + bonusRub);


    }
}