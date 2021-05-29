package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/test")
    @ResponseBody
    public List<User> handleTest(){
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setName("Sagar");
        userList.add(user);
        return userList;
    }
}
