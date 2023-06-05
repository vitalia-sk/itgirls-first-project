import static java.lang.Math.sqrt;

public class HelloItGirls {
    public static void main(String[] args) {
        System.out.println("Hello It Girls!");

//        lesson 02
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 12325436245265L;
        float f = 2.17F;
        double d = 2.14;
        char ch = 'a';
        boolean bool = true;
        System.out.println("bool = " + bool);

        char symbol1 = 1099; //По индексу символа в таблице UTF-8
        char symbol2 = 'ы'; //По значению символа
        char symbol3 = '\u044B'; //Через шестнадцатеричную форму Unicode
        //Печатаем результат переменных на экран
        System.out.println("symbol1 = " + symbol1);
        System.out.println("symbol2 = " + symbol2);
        System.out.println("symbol3 = " + symbol3);

        int o = 5;
        int k = 8;
        System.out.println("Площадь = " + (o*k)/2);
        System.out.println("Периметр = " + (sqrt(o*o+k*k)+o+k));

        b = 50;
        int c = 20;
        b++;
        c--;
        if (b >= 51 && c < 20){
            System.out.println("b >= 50 and c < 20");
        }

        String str = "Training Java";
        System.out.println(str + " 2023/06/04");

    }
}