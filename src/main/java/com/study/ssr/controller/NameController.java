package com.study.ssr.controller;

import com.study.ssr.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {

    @GetMapping("/name") //url 주소
    public ModelAndView namePage() {
        ModelAndView mav = new ModelAndView(); //ModelAndView 객체 생성
        mav.setViewName("views/name"); // mav 경로 설정
        mav.addObject(Student.builder().name("김동인").age(27).build());
        return mav;
    }

}
