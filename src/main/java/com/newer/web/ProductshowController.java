package com.newer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductshowController {
    @RequestMapping("productshow")
    public String Productshow(){
        return  "productshow";
    }
}
