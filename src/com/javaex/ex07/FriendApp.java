package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
// 배열을 나열했다고 해서 생성된 것은 아니고 아래 참조할 수 있는 부분을 만들어줬을 뿐이다.
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
            for(int i =0; i < 3; i++) {
            	// 데이터 입력
            	String name, hp, school ;
            	
            	System.out.print("이름: ");
            	name = sc.next(); // 이름 정보입력
            	System.out.print("핸드폰: ");
            	hp = sc.next(); // 핸드폰 정보입력
            	System.out.print("학교: ");
            	school = sc.next(); // 학교 정보입력
            	
            	Friend newFriend = new Friend();
            	newFriend.setName(name);
            	newFriend.setHp(hp);
            	newFriend.setSchool(school);
            	
            	// 배열에 참조주소 할당
            	friendArray[i] = newFriend;
            	System.out.println("--------------------------------");
            }
      
        //for문 끝
        
        
        // 친구정보 출력 (위에서 입력했던 정보들을 정리해서 출력하는 작업)
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
