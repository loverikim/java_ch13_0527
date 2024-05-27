package com.loverikim.exer01;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> memberList = new ArrayList<Member>(); //ArrayList<>로 선언해도 됨.
			// 자동 완성으로 불러오는 것이 좋음.
			// 다른 패키지에 있다면 import를 해야 하기 때문에
		
		//초기화 2가지 방법 
		//1번째 getter, setter 이용하기
		Member member1 = new Member();//빈 member1 생성		
		member1.setId("tiger"); // setter로 값 넣기 private로 숨겨져 있기 때문에 id로는 못가져옴.
		member1.setPw("12345");
		member1.setAge(33);
		member1.setName("홍길동");
		member1.setPhone("010-1234-5678");
		
		Member member2 = new Member();//빈 member2 생성		
		member2.setId("lion"); // setter로 값 넣기 private로 숨겨져 있기 때문에 id로는 못가져옴.
		member2.setPw("12345");
		member2.setAge(34);
		member2.setName("이순신");
		member2.setPhone("010-7777-5555");		
		
		//2번째방법 생성자를 이용한 방법		
		Member member3 = new Member("cat", "23567", 36, "김유신", "010-2334-5643");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
	
	}

}
