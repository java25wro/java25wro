package com.java25wro.model;

import com.java25wro.common.BaseEntity;

import javax.persistence.*;

@Entity
public class Survey extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long id;

    @Column(name = "descripiton")
    private String description;

    @Column(name = "rating")
    private int rating;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "orderid")
//    private Order order;


    public Survey(String description,int rating) {
        this.description = description;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
}
