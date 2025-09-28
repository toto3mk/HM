class dealer {
    String item;

    dealer(String Item) {
        this.item = Item;
    }

}

public class three {
    public static void main(String[] args) {

        dealer car = new dealer("BMW");
        dealer bike = new dealer("C200");
        dealer truck = new dealer("Volvo");

        dealer[] vehicles = { car, bike, truck };
        
        for (dealer v : vehicles) {
            System.out.println(v.item);
        }
    }
}
