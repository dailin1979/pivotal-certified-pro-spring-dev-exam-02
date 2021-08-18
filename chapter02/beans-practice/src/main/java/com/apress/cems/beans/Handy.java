package com.apress.cems.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("handy")
public class Handy implements Item{

    private String title;

    @Autowired
    public Handy(@Value("title") String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
