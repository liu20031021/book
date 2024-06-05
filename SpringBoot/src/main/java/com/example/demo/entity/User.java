package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@TableName("user")
@Data
public class User {
    @TableId (type = IdType.AUTO)
    private Integer id;
    private String username;
    private String nickName;
    private String password;
    private String sex;
    private String address;
    private String phone;
    @TableField(exist = false)  //表中没有token不会报错仍能编译运行
    private String token;
    private Integer role;

    public void setPassword(String password2) {
        this.password=password2;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Integer getRole() {
        return role;
    }

    public void setToken(String token) {
        this.token=token;
    }
}
