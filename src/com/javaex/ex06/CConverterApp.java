package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1341.30); // 환율 세팅
        
        //100만원을 달러로 출력하기
        dollar = CConverter.toDoller(1_000_000);
        System.out.println("백만원은 " + dollar + "달러입니다.");
        
        //100달려를 원으로 출력하기
        won = CConverter.toKWR(100);
        System.out.println("백달러는 " + won + "원입니다.");
        
        // 스태틱으로 객체화 된 코드들은 어디서든지 불러올 수 있다.
    }

}
