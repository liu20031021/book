package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;

@TableName("book")
@Data

public class Book {

    @TableId (type = IdType.AUTO)
    private Integer id;
    private String isbn;
    private String name;
    private BigDecimal price;
    private String author;
    private Integer borrownum;
    private String publisher;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date createTime;
    private String status;


    public Object getIsbn() {
        return isbn;
    }

    public Object getName() {
        return name;
    }

    public Object getAuthor() {
        return author;
    }

    public void setName(String nametemp)
    {
        this.name=nametemp;
    }
    public void setid(int idtemp)
    {
        this.id=idtemp;
    }
    public void setisbn(String isbtemp)
    {
        this.isbn=isbtemp;
    }
}
