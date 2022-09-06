package com.example.lonelytwittertest;

import java.util.Date;

public class ImportantTweet  extends TweetClass{
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public String deleteTweet() {
        return "I dont delete important tweets please";
    }
}
