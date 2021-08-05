package com.hp.bean;

import java.util.Date;

public class Student {
    private Integer id;
    private Integer age;
    private String name;
    //增加一个出生日期
    private Date birthday;
    private boolean shenxian;
    //前端中属性不能以isXXX开头当做布尔值


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", shenxian=" + shenxian +
                '}';
    }

    public boolean isShenxian() {
        return shenxian;
    }

    public void setShenxian(boolean shenxian) {
        this.shenxian = shenxian;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
