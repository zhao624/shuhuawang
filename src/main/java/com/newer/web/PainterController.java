package com.newer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PainterController {
    @RequestMapping("painter")
    public String Painter(){
        return "painter";
    }
}
