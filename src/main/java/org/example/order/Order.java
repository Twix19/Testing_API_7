package org.example.order;

public class Order {
    private String address;
    private String lastName;
    private String firstName;
    private String metroStation;
    private String phone;
    private String rentTime;
    private String deliveryDate;
    private String comment;
    private String color;

    public Order(String address, String lastName, String firstName, String metroStation, String phone, String rentTime, String deliveryDate, String comment, String color) {
        this.address = address;
        this.lastName = lastName;
        this.firstName = firstName;
        this.metroStation = metroStation;
        this.phone = phone;
        this.rentTime = rentTime;
        this.deliveryDate = deliveryDate;
        this.comment = comment;
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String login) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation;
    }

    public String getMetroStation() {
        return metroStation;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
   public String getColor() {
        return color;
    }

    public void setColor(String color) {
       this.color = color;
    }
}
