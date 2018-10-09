package com.example.shubratodev.onlineshoppinghelper;

import android.provider.MediaStore;

public class News {
    private String Title;
    private String Catagory;
    private String Description;
    private int Thumbnail;

    public News() {
    }

    public News(String title, String catagory, String description, int thumbnail) {
        Title = title;
        Catagory = catagory;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCatagory() {
        return Catagory;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
