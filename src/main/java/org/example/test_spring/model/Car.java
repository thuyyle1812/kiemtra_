package org.example.test_spring.model;

public class Car {
    private int id;
    private String Name;
    private String detail;
    private int  price;
    private String date;
    public Car(){

    }

    public Car(int id, String name, String detail, int price, String day) {
        this.id = id;
        Name = name;
        this.detail = detail;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDay() {
        return date;
    }

    public void setDay(String day) {
        this.date = day;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", day='" + date + '\'' +
                '}';
    }
}
