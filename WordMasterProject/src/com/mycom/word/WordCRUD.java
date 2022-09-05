package com.mycom.word;
//ICRUD구현하는 

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
//ICRUD에서 만든 함수를 구현 
	
	ArrayList<Word> list;
	Scanner s;
	
	WordCRUD(Scanner s){
		list = new ArrayList<>();
		this.s=s;
	}
	
	@Override
	public Object add() { //사용자에게 입력받는 
		// TODO Auto-generated method stub
		System.out.print("==> 난이도(1,2,3) & 새 단어 입력 : ");
		int level=s.nextInt();
		String word = s.nextLine(); //공백 포함 
		
		System.out.print("뜻 입력 : ");
		String meaning=s.nextLine();
		
		return new Word(0,level,word,meaning); //id대신 0리턴 
	}
	public void addWord() {  //입력받은 리스트 추가 /워드 메니저에서 호출 할 함수 
		Word one=(Word)add();
		list.add(one);
		System.out.println("새 단어가 단어장에 추가되었습니다. ");
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectOne(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public void listAll() {
		System.out.println("--------------------------------");
		for(int i=0; i<list.size(); i++) {//list.size()는 리스트의 갯수 
			System.out.print((i+1)+" "); //출력문 맨 앞 카운트 
			System.out.println(list.get(i).toString());
		}
		System.out.println("--------------------------------");
	}

}
