package com.example.panholze15.userlist;

import java.io.Serializable;

/**
 * Created by panholze15 on 18.11.2016.
 */
public class Cats implements Serializable {

    private String name;
    private String owner;
    private String age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cats() {
    }

    public Cats(String name, String owner, String age, String color) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cats cats = (Cats) o;

        if (name != null ? !name.equals(cats.name) : cats.name != null) return false;
        if (owner != null ? !owner.equals(cats.owner) : cats.owner != null) return false;
        if (age != null ? !age.equals(cats.age) : cats.age != null) return false;
        return color != null ? color.equals(cats.color) : cats.color == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name).append(" ")
                .append(color)
                .append('\n')
                .append(owner).append('\n')
                .append(age);
        return sb.toString();
    }
}
