package com.example.brom.activitiesapp;

public class MountainDetailsActivity {
    private String name;
    private String location;
    private int height;

    public MountainDetailsActivity(String n,String l,int h)
    {
        name="Saknar namn";
        location="Saknar plats";
        height=1;
    }
    public String info()
    {
        String tmp=new String();
        tmp+=name+"is located in mountain range" + location+"and reaches" +height +"m above sea level.";
        return tmp;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
}

