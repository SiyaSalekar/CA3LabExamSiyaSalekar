package com.dkit.gd2.johnloane;

import java.util.Objects;

public class Student
{
    private int id;
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode()   // has function that used both id and name
    {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }

    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
