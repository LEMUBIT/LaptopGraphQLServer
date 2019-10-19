package lemubit.adacemy.LaptopGraphQLServer.model;

public class Laptop {
    public int id;
    public String name;
    public int price;
    public int ram;

    public Laptop(int id, String name, int price, int ram) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ram = ram;
    }
}
