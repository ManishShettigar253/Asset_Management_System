package com.boostmytool.beststore;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;


public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message ="The name is required")
    private String brand;

    @NotEmpty(message ="Then name is required")
    private String employee;

    @Min(0)
    private String contact;

    @Size(min = 10, message ="The description should be at least 10 characters")
    @Size(max = 2000, message ="The description cannot exceed 2000 characters")
    private String description;

    private MultipartFile imageFile ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }


    
}
