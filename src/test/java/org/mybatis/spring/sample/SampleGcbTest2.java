package org.mybatis.spring.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.sample.mapper.AccountService;
import org.mybatis.spring.sample.mapper.BookMapper;
import org.mybatis.spring.sample.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Author guchenbo
 * @Date 2019/3/31.
 */
@ContextConfiguration(locations = { "classpath:org/mybatis/spring/sample/config/applicationContext-mapper2.xml" })
@MapperScan(value = "org.mybatis.spring.sample")
public class SampleGcbTest2 extends AbstractSampleTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private AccountService accountService;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test(){
        System.out.println(accountService);
        System.out.println(userMapper);
        System.out.println(bookMapper);
        System.out.println(sqlSessionFactory);
        System.out.println(sqlSessionFactory.openSession());
    }
}
