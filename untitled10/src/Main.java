class Main {
public static void main(String[] args) {
        AdultTicket adultTicket = new AdultTicket();
        PensionerTicket pensionerTicket = new PensionerTicket();
        ChildTicket childTicket = new ChildTicket();
        int adults = 9;
        int pensioners = 5;
        int children = 11;
        double total = adults * adultTicket.getPrice() + pensioners * pensionerTicket.getPrice() * 0.7 + children * childTicket.getPrice() * 0.5;
        System.out.println("Общая стоимость билетов: " + total + " монет");
        }
}