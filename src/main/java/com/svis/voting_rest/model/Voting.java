package com.svis.voting_rest.model;

import java.time.LocalDate;

public class Voting extends AbstractBaseEntity{

    private LocalDate date;

    private User user;

    private Restaurant restaurant;

    public Voting() {
    }

    public Voting(LocalDate date, User user, Restaurant restaurant) {
        this(null, date, user, restaurant);
    }

    public Voting(Integer id, LocalDate date, User user, Restaurant restaurant) {
        super(id);
        this.date = date;
        this.user = user;
        this.restaurant = restaurant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + (user != null ? user.getId() : "") +
                ", restaurant=" + (restaurant != null ? restaurant.getId() : "") +
                '}';
    }
}

