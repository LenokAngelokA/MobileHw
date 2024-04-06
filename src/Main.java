public class Main {
    public static void main(String[] args) {
        int startingScore = 200;
        int replenishment = 700;

        if (replenishment > 500) {
            int endbonus = replenishment / 100;
            int totalAmount = startingScore + endbonus + replenishment;
            System.out.println("Итоговая сумма на счету" + totalAmount);
            System.out.println("Количичество бонусов" + endbonus); }
        if (replenishment < 500 ) {
            int totalAmount = startingScore + replenishment;
                System.out.println("Бонусов нет" );
                System.out.println("Итоговая сумма на счету" + totalAmount);
            }
    }
}
Итоговая сумма на счету907
Количичество бонусов7
