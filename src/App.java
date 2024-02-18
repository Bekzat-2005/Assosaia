public class App {
    public static void main(String[] args) {

    Address address = new Address("123 Main St", "Cityville");
    Person person = new Person("John Doe");


        person.setAddress(address);


        System.out.println("Имя: " + person.getName());
        if (person.getAddress() != null) {
        System.out.println("Адрес: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity());
    } else {
        System.out.println("Человеку не присвоен адрес.");
    }
}
    }