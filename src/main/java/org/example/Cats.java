package org.example;

import java.util.Objects;

public class Cats {
    private String name;
    private Integer age;
    private String color;
    private String temper;

   public Cats (String name, Integer age, String color, String temper){
             this.name = name;
             this.age = age;
             this.color = color;
             this.temper = temper;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", temper='" + temper + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cats cats)) return false;
        return getName().equals(cats.getName()) && getAge().equals(cats.getAge()) && getColor().equals(cats.getColor())
                && getTemper().equals(cats.getTemper());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColor(), getTemper());
    }
}
