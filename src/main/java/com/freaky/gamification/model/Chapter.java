package com.freaky.gamification.model;

import java.util.List;

public class Chapter {
    String name;
    int wordCount;

    public Chapter() {
    }

    public Chapter(String name, int wordCount) {
        this.name = name;
        this.wordCount = wordCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", wordCount=" + wordCount +
                '}';
    }
}
