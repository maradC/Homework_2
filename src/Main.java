public class Main {
    public static void main( String[] args){

    //Objects
        Car myCar1 = new Car("Honda", 2022, "Blue", 40000.00);
        Car myCar2 = new Car("BMW", 2012, "Black", 70000.00);
        Car myCar3 = new Car("Hyundai", 2019, "Yellow", 38000.00);
        Car myCar4 = new Car("Tesla", 2023, "White", 100000.00);


            //Shallow Copy
            Car myCar5 = myCar1;


    System.out.println(myCar1.make);
    System.out.println(myCar2.year);
    System.out.println();
    System.out.println(myCar3.price);
    System.out.println(myCar4.model);
        System.out.println();
    System.out.println(myCar1.color);
    System.out.println(myCar5.color);

        }





    }

