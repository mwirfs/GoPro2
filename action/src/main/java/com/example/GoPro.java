package com.example;

public class GoPro
{

    public String setName (String name)
    {
        return name;
    }

    public GoPro(String name)
    {
            System.out.println("You should use the " + name );
    }

    public static void main(String []args)
    {
        GoPro cliffdiving = new GoPro ("Hero5 Black when cliffdiving");
        cliffdiving.setName("Hero5 Black");

        GoPro parachuting = new GoPro ("Hero5 Session when parachuting");
        parachuting.setName("Hero5 Session");

        GoPro waterskiing = new GoPro ("Hero Session when waterskiing");
        waterskiing.setName("Hero Session");

    }

}