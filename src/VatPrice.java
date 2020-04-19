public class VatPrice {
    public static void main(String[] args) {
        Product product1 = new Product("Milka", "Coś słodkiego", 8, "Słodkie");
        Product product2 = new Product("Ser", "Coś do kanapki", 4, "Nabiał");

        double vatPrice;

        switch (product1.getCategory()) {
            case "Słodkie":
                vatPrice = 0.18;
                break;
            default:
                vatPrice = 0.00;
        }
        switch (product2.getCategory()) {
            case "Nabiał":
                vatPrice = 0.24;
                break;
            default:
                vatPrice = 0.00;
        }

        double Totalprice1 = ((product1.getPrice() * vatPrice) + product1.getPrice());
        double Totalprice2 = ((product2.getPrice() * vatPrice) + product2.getPrice());


        System.out.println("Nazwa: " + product1.getName()+"\n" + "Opis produktu: " + product1.getDescription() +"\n" + "Kategoria produktu: " + product1.getCategory() +"\n" + "Cena Vat: " + Totalprice1);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Nazwa: " + product2.getName()+"\n" + "Opis produktu: " + product2.getDescription() +"\n" + "Kategoria produktu: " + product2.getCategory() +"\n" + "Cena Vat: " + Totalprice2);
    }

}
