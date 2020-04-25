package com.example.restservice;

//This is just a Model created to make sure you know what you are planning to respond. Injecting data and controlling
///is done in another class.
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
