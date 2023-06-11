public class Car {
    String color;
    String brand;
    static int count = 0;

    public String up(){
        return " ускоряется";
    }

    public String low(){
        return " замедляется";
    }

    public static void main(String[] args) {
        Car anna = new Car();
        anna.color = "red";
        anna.brand = "corvet";
        count++;

        Car natalia = new Car();
        natalia.color = "green";
        natalia.brand = "bmw";
        count++;

        Car marina = new Car();
        marina.color = "blue";
        marina.brand = "mini";
        count++;

        System.out.println("В гараже " + count + " автомобилей");
        System.out.println(marina.brand + marina.up());
        System.out.println(natalia.brand + natalia.low());
        System.out.println(anna.brand + anna.up());
    }
}
