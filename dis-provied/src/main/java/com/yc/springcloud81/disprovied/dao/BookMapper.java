package com.yc.springcloud81.disprovied.dao;

import com.yc.springcloud81.disprovied.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface BookMapper extends  MisBaseMapper<Book>{
}
