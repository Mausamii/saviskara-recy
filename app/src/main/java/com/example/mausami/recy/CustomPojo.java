package com.example.mausami.recy;

import java.util.ArrayList;

/**
 * Created by mausami on 2/3/18.
 */

public class CustomPojo {

    //POJO class consists of get method and set method
    private String name;
    private String time,content;
    private ArrayList<CustomPojo> customPojo =new ArrayList<>();

    public CustomPojo() {

    }
    //getting content value
    public String getContent(){return content;}
    //setting content value
    public void setContent(String content){this.content=content;}

    public String getTime(){return time;}
    public void setTime(String time){this.time=time;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}