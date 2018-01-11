package com.newer.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Category {
    private Integer id;
    private String cateName;
    private Date cateTime;
    private float status;


}
