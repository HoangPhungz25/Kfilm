package com.kingphung.kfilm;

import android.widget.ImageView;

public class Movie {
    private String id;
    private String name;
    private String product_year;
    private String img_url;
    private String IMDB;
    private String statusSub;
    private String description;
    private String director;
    private String id_drive;

    public Movie(String id, String name, String product_year, String img_url, String IMDB, String statusSub, String description, String director, String id_drive) {
        this.id = id;
        this.name = name;
        this.product_year = product_year;
        this.img_url = img_url;
        this.IMDB = IMDB;
        this.statusSub = statusSub;
        this.description = description;
        this.director = director;
        this.id_drive = id_drive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_year() {
        return product_year;
    }

    public void setProduct_year(String product_year) {
        this.product_year = product_year;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getIMDB() {
        return IMDB;
    }

    public void setIMDB(String IMDB) {
        this.IMDB = IMDB;
    }

    public String getStatusSub() {
        return statusSub;
    }

    public void setStatusSub(String statusSub) {
        this.statusSub = statusSub;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getId_drive() {
        return id_drive;
    }

    public void setId_drive(String id_drive) {
        this.id_drive = id_drive;
    }
}