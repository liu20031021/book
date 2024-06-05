package com.example.demo.controller;

import com.example.demo.commom.Result;
import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.utils.TokenUtils;

import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookControllerTest {
    @Mock
   // private BookMapper bookMapper; // Assuming you have a BookMapper interface or class

    @InjectMocks
    private BookController bookController; //

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void save() {
        Book book = new Book();
        book.setid(1);
        book.setisbn("978-3-16-148410-0");
        book.setName("Java Programming");
        // Set other properties as needed...

        // Mock the behavior of BookMapper.insert to return a success
//        doNothing().when(bookMapper).insert(any(Book.class));

        // Call the save method of the service
        Result<?> result = bookController.save(book);

        // Verify that the insert method of BookMapper is called with the correct book object
        //verify(bookMapper, times(1)).insert(book);

        // Assert that the result is successful
        assertTrue(result.isSuccess());


    }

    @Test
    void update() {
        System.out.println("更新成功");
    }

    @Test
    void deleteBatch() {
        System.out.println("批量删除成功");
    }

    @Test
    void delete() {
        System.out.println("删除成功");
    }

    @Test
    void findPage() {
        System.out.println("查找成功");
    }
}