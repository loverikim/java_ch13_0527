package com.loverikim.exer01;


import java.util.List;
import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();//arraylist 선언
		//인터페이스 , 추상클래스는 new 연산자 사용못함.
		
		// add 추가
		list1.add("홍길동");// 리스트에 원소(객체) 추가
		list1.add("이순신");
		list1.add("김유신");
		
		int list1Size = list1.size(); //리스트의 크기 -> 원소의 갯수
		
		// get 가져오기
		String memberName = list1.get(1); //index 1 -> 이순신 가져옴.
		
//		System.out.println(memberName);
		
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));//list[i] x
		}
		list1.remove(1); // 인덱스1 원소 삭제 -> 이순신 삭제
		list1.remove("홍길동"); //값으로 삭제 가능.
		
		System.out.println("----------------------------");
				
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));//list[i] x
		}
	}
}