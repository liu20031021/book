package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@TableName("lend_record")
@Data
public class LendRecord {
    @TableId(value = "reader_Id",type = IdType.AUTO)
    private Integer readerId;
    private String isbn;
    private String bookname;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date lendTime;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date returnTime;
    private String status;
    private Integer borrownum;

    public Object getIsbn() {
        return isbn;
    }

    public Object getBorrownum() {
        return borrownum;
    }

    public Object getBookname() {
        return bookname;
    }

    public Object getReaderId() {
        return readerId;
    }

    public Date getLendTime() {
        return lendTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public String getStatus() {
        return status;
    }

    public void setLendTime(Date lendTime) {
        this.lendTime=lendTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime=returnTime;
    }

    public void setStatus(String status) {
        this.status=status;
    }
}
