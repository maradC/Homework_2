// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        Car myCar1 = new Car("Honda", 2022, "Blue", 40000.00);
        Car myCar2 = myCar1;
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println();
        System.out.println(myCar1.color);
        System.out.println(myCar2.color);
    }
