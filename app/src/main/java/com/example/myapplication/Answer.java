package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Answer {

    @SerializedName("endOfWord")
    @Expose
    private Boolean endOfWord;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("text")
    @Expose
    private List<String> text;

    public Boolean getEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(Boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

}