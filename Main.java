import java.util.ArrayList;
import java.util.List;

class Box<T> {
    T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Printer {

    public <T> void show(T item) {
        System.out.println(item);
    }

    public void printPrices(List<? extends Number> prices) {
        for (Number p : prices) {
            System.out.println("Price: " + p);
        }
    }
}

class PriceAdder {

    public void addPrices(List<? super Number> prices) {
        prices.add(10);
        prices.add(2.5);
    }
}

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        PriceAdder adder = new PriceAdder();

        Box<String> nameBox = new Box<>("Ahmed");
        Box<Integer> ageBox = new Box<>(20);
        printer.show(nameBox.getItem());
        printer.show(ageBox.getItem());

        List<Number> prices = new ArrayList<>();
        adder.addPrices(prices);

        printer.printPrices(prices);
    }
}
