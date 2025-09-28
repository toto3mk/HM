class display {

    void Show(int a) {
        System.out.println("The value of a is " + a);
    }

    void Show(String b) {
        System.out.println("The value of b is " + b);
    }

    void Show(double c) {
        System.out.println("The value of c is " + c);
    }
}

public class two {

    public static void main(String[] args) {
        display obj = new display();
        obj.Show(5);
        obj.Show("Hello");
        obj.Show(5.5);

    }

}
