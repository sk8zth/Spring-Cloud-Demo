package com.scu.springcloud.controller;

import com.scu.springcloud.pojo.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("dept")
public class DeptController {

    @ResponseBody
    @GetMapping("/dept/get")
    public Dept getDept(){
        Dept dept = new Dept();
        dept.setDeptno("1");
        dept.setDname("开发部");
        System.out.println(dept.toString());
        return dept;
    }


}
