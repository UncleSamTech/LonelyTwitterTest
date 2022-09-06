package com.example.lonelytwittertest;

public class LonelyTweet extends TweetClass {


    public LonelyTweet(String message) {
        super(message);
    }

    @Override
    public String deleteTweet() {
        return "I am lonnely so I will delete my tweet";
    }
}
