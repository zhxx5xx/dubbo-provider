package com.zhxx.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zhxx.pojo.Student;
import com.zhxx.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public List<Student> selAll() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "张三"));
		list.add(new Student(2, "李四"));
		return list;
	}

}
