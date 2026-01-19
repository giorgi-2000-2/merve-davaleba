package org.example;
import net.datafaker.Faker;

 class Address {

    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return city + ", " + street;
    }
}

class User {

    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', address=" + address + "}";
    }
}

class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        Address address = new Address(
                faker.address().city(),
                faker.address().streetName()
        );

        User user = new User(
                faker.name().fullName(),
                address
        );

        System.out.println(user);
    }
}
