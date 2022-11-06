package com.freaky.gamification.model;

import java.util.List;

public class Book {
    String name;
    List<Chapter> chapters;

    public Book() {
    }

    public Book(String name, List<Chapter> chapters) {
        this.name = name;
        this.chapters = chapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
