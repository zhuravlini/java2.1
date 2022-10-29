public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000; //стоимость билета
        int divider = 20; // кол-во рублей за 1 милю
        int miles = price / divider; //расчет количества миль
        return miles;
    }

}
