package com.mycom.word;

import java.util.Scanner;

//crud기능 관리 
public class WordManager {
	Scanner s = new Scanner(System.in);
	WordCRUD WordCRUD;
	
	WordManager(){
		WordCRUD = new WordCRUD(s);
	}
	
	public int selectMenu() {
		
		System.out.print("*** 영단어 마스터 ***\n"
				+"******************\n"
				+"1. 모든 단어 보기 \n"
				+"2. 수준별 단어 보기 \n"
				+"3. 단어 검색 \n"
				+"4. 단어 추가 \n"
				+"5. 단어 수정 \n"
				+"6. 단어 삭제 \n"
				+"7. 파일 저장 \n"
				+"0. 나가기 \n"
				+"******************\n"
				+"=> 원하는 메뉴는? "
				);
		
		return s.nextInt();
	}
	public void start() {
		
		while(true) {
			int menu= selectMenu();
			if(menu==0) break;
			if(menu==4) {
				//create
				//wordCRUD에서 데이타추가되는 함수 실행 
				WordCRUD.addWord();
			}
			else if(menu==1) {
				//list 출력
				WordCRUD.listAll();
				
			}
		}
		
		//System.out.println(menu);
	}
	
	
}