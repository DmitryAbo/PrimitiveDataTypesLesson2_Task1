public class Main {
    public static void main(String[] args) {
        int cost = 2175;                        //Стоимость билета в рублях
        int oneMilePrice = 20;                  //Сумма за которую начисляется 1 миля
        int bonusMiles = cost / oneMilePrice;   // Кол-во полученных бонусных миль
        System.out.println("Кол-во полученных бонусных миль: " + bonusMiles);
    }
}
