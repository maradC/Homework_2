
public class Car {

    String make = "Honda";
    String model= "Accord";
    int year = 2022;
    String color=  "Blue";
    double price = 40000.00;

    public Car(String make,int year, String color, double price) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;

    }
    public Car (Car a){
        this.make = a.make;
        this.year = a.year;
        this.color = a.color;
        this.price = a.price;
    }

        void drive() {
            System.out.println("You drive the car");
        }
        void brake(){
          System.out.println("You stepped on the break");
        }

        }


