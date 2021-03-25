package com.example.knowledgeenhancerquizgame.Models;

public class CatagoryModel
{
    private String imageUrl, title;

    public CatagoryModel(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public CatagoryModel() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
