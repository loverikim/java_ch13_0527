package com.loverikim.exer02;

import java.util.List;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> boardlist = new Vector<Board>();
		
		boardlist.add(new Board("가입인사드려요1","반갑습니다. 오늘 가입했어요1", "홍길동"));
		boardlist.add(new Board("가입인사드려요2","반갑습니다. 오늘 가입했어요2", "이순신"));
		boardlist.add(new Board("가입인사드려요3","반갑습니다. 오늘 가입했어요3", "김유신"));
		boardlist.add(new Board("가입인사드려요4","반갑습니다. 오늘 가입했어요4", "박서준"));
		boardlist.add(new Board("가입인사드려요5","반갑습니다. 오늘 가입했어요5", "한소희"));
			
		
		for(int i = 0; i < boardlist.size();i++) {
			Board board = boardlist.get(i);
			
		}
	}

}
