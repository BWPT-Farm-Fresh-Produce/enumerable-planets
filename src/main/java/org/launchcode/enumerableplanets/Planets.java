package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus",225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITAR("Jupiter", 4333),
    SATRUN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private String name;
    private int yearLength;

    Planets(String aName, int yLength) {
        this.name = aName;
        this.yearLength = yLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
