package com.example.sayyesdatingapp;


public class ModelClass {
    private int imageView;
    private String textView1;
    private String textView2;
    private String textView3;

    //parameterized constructor
    public ModelClass(int imageView, String textView1, String textView2, String textView3) {
        this.imageView = imageView;
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.textView3 = textView3;
    }

    //getter class
    public int getImageView() {
        return imageView;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }
}
