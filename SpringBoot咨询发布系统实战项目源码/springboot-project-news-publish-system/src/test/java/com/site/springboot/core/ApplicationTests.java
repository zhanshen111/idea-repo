package com.site.springboot.core;
/**
 * Create By abc on 2020/8/24
 * SF1916045 zhanjunwei
 */

import com.site.springboot.core.dao.AdminMapper;
import com.site.springboot.core.dao.NewsMapper;
import com.site.springboot.core.entity.Admin;
import com.site.springboot.core.entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	NewsMapper newsMapper;
	@Autowired
	AdminMapper adminMapper;

	@Test
	public void testQuery(){
		//测试根据关键字查询新闻
		News news = newsMapper.selectByPrimaryKey(4L);
		//测试根据关键字查询用户
		Admin admin = adminMapper.selectByPrimaryKey(2L);
		System.out.println(news);
		System.out.println(admin);
	}

	@Test
	public void testInsert(){
		Admin user = new Admin(null, "xiaoming", "abc", "aa", new Byte("0"));
		int i = adminMapper.insert(user);
		if (i != 0){
			System.out.println("插入成功");
		}
	}



}
