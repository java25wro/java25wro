package com.java25wro.model;

import com.java25wro.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


public class MealDTO extends BaseEntity {

    private String name;
    private BigDecimal price;
    private String description;
    private String imgPath;
    private String details;
    private Set<Long> restaurantId;

    private boolean isDeleted;

    public MealDTO() {
    }

    public MealDTO(String name, BigDecimal price, String description, String imgPath, String details,
                   Set<Long> restaurantId, boolean isDeleted) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgPath = imgPath;
        this.details = details;
        this.restaurantId = restaurantId;
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Set<Long> getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Set<Long> restaurantId) {
        this.restaurantId = restaurantId;
    }
}
