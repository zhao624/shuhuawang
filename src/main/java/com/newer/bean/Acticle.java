package com.newer.bean;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Data
public class Acticle implements Serializable{


    private Integer id;
    private String title;
    private String content;
    private Integer cateid;
    private Date createTime;
    private Date updateTime;
    private float status;






}
