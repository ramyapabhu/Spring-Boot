package com.example.day4post.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;

    // Additional fields related to car rental
    private String carRentStatus;
    private double amount;
    private String bookingHistory;
    private String drivingLicenseNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructors
    public User() {
    }


    // Additional constructor for car rental related fields
    public User(int id, String name, String email, String password, String carRentStatus, double amount, String bookingHistory, String drivingLicenseNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.carRentStatus = carRentStatus;
        this.amount = amount;
        this.bookingHistory = bookingHistory;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    // Getters and setters for car rental related fields
    public String getCarRentStatus() {
        return carRentStatus;
    }

    public void setCarRentStatus(String carRentStatus) {
        this.carRentStatus = carRentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(String bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
}
