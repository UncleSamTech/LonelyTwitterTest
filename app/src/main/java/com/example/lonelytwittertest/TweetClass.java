package com.example.lonelytwittertest;

import java.util.Date;

public abstract class TweetClass {
    private Date date;
    private String message;

    public TweetClass(String message) {
        this.message = message;
        date = new Date();
    }


    public TweetClass(Date date, String message) {
        this.date = date;
        this.message = message;
    }


    public abstract String deleteTweet();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
