package com.yc.springcloud81.disprovied.service.impl;

import com.yc.springcloud81.disprovied.bean.Book;
import com.yc.springcloud81.disprovied.dao.BookMapper;
import com.yc.springcloud81.disprovied.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    private BookMapper bookMapper;
    @Override
    public Book getBook(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

}
