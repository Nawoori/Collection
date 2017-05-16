package com.nawoori.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<>();

		Student a1 = new Student();
		a1.name = "홍길동";
		a1.age = 500;
		
		Student a2 = new Student();
		a2.name = "이순신";
		a2.age = 1000;
		
		list.add(a1);
		list.add(a2);
		
		for(Student item : list){
		System.out.println("이름 :" + a1.name + "나이 : " + a1.age);
	}

		HashMap <String, Student> map = new HashMap<>();
		map.put("key1", a1);
		map.put("key2", a2);
		System.out.println( map.get("key1").name );
		
		
