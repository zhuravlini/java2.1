import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int a = 15_678; //стоимость билета
        int b = 20; // кол-во рублей за 1 милю
        int miles = a / b; //расчет количества миль

        System.out.println(" Вам начислено " + miles + " бонусных миль");


    }
}