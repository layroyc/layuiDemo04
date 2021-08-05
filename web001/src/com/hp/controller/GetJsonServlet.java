package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GetJsonServlet",urlPatterns = "/GetJsonServlet")
public class GetJsonServlet extends HttpServlet {
    //service 可以 接受get 也可以 接受 post请求

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        //web ，controller 是提供 json 数据的 ，那么我们需要一个处理json 的lib包
        //这个lib包  叫做 fastjson  ,阿里巴巴出品的  厉害
        //学习  json 和  fastJson

        //使用  fastJson 把对象  转换成  json 数据
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(01);
        s1.setAge(20);
        s1.setName("王源");
        students.add(s1);

        Student s2 = new Student();
        s2.setId(02);
        s2.setAge(22);
        s2.setName("王小源");
        students.add(s2);

        Student s3 = new Student();
        s3.setId(03);
        s3.setAge(27);
        s3.setName("源源");
        students.add(s3);

        String ss = JSON.toJSONString(students);
        System.out.println("ss = " + ss);//把对象转换成了  json格式的字符

        //输出到前端
        //1.解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        //2.开始输出
        PrintWriter writer = resp.getWriter();
        writer.println(ss);
        writer.close();



    }
}
