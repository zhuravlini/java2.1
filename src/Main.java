import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15_678; //стоимость билета
        int divider = 20; // кол-во рублей за 1 милю
        int miles = ticketPrice / divider; //расчет количества миль

        System.out.println(" Вам начислено " + miles + " бонусных миль");


    }
}