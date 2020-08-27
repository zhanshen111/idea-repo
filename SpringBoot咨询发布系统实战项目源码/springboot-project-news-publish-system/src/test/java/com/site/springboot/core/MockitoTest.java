package com.site.springboot.core;

import com.site.springboot.core.dao.NewsMapper;
import com.site.springboot.core.entity.News;
import com.site.springboot.core.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create By abc on 2020/8/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoTest {

    @Autowired
    NewsService newsService;
    @MockBean
    NewsMapper newsMapper;

    @Test
    public void test(){

        List<News> news = new ArrayList<>();
        News news1 = new News(null,"新闻",2L,null,"今日新闻",new Byte("0"),2L,new Byte("0"),new Date(),new Date());
        news.add(news1);

        Mockito.when(newsMapper.queryAll()).thenReturn(news);

        List<News> newsList = newsService.queryAll();
        System.out.println(newsList);
    }
}
