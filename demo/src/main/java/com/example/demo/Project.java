package com.example.demo; // <--- ВОТ ТУТ ИЗМЕНЕНИЕ

public class Project {
    private String name;
    private String desc;
    private int year;

    public Project(String name, String desc, int year) {
        this.name = name;
        this.desc = desc;
        this.year = year;
    }

    public String getName() { return name; }
    public String getDesc() { return desc; }
    public int getYear() { return year; }
}