package com.fan.keproject.kg_surport_system;

import java.io.Serializable;

public class Movie implements Serializable {


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director.replace(" ", "").length() == 0)
            director = new String("暂无此数据");
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        if (starring.replace(" ", "").length() == 0)
            starring = new String("暂无此数据");
        this.starring = starring;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
    

    private String type;
    private String title;
    private String director;
    private String description;
    private String starring;
    private String homepage;

}
