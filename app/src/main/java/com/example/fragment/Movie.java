package com.example.fragment;

public class Movie {
    public String id;
    public String title;
    public String genra;
    public String rate;
    public String desc;
    public String artist;
    public String pic;

    public Movie() {
        this.id = id;
        this.title = title;
        this.genra = genra;
        this.rate = rate;
        this.desc = desc;
        this.artist = artist;
        this.pic = pic;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenra() {
        return genra;
    }

    public String getRate() {
        return rate;
    }

    public String getDesc() {
        return desc;
    }

    public String getArtist() {
        return artist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenra(String genra) {
        this.genra = genra;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }
}
