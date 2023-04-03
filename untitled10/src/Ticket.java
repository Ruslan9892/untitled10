public class Ticket {
    private String type; // тип билета: взрослый, пенсионер или ребенок
    private double price; // цена билета

    public Ticket(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
