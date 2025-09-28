import java.util.Scanner;

class car {
    car(String Model) {
        this.model = Model;
    }

    Scanner t = new Scanner(System.in);
    String model;
    int Speed;

    void GetMaximumSpeed() {

        System.out.println("Enter the model of the car");
        model = t.nextLine();
        System.out.println("Enter the maximum speed of the car");
        Speed = t.nextInt();
    }

}

public class one {
    public static void main(String[] args) {
        car german = new car("BMW");
        car japan = new car("Toyota");
        car american = new car("Ford");

        german.GetMaximumSpeed();
        System.out.println("The model of the german car is " + german.model);
        System.out.println("The maximum speed of the german car is " + german.Speed);

    }
}
