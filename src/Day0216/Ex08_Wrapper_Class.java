package Day0216;

import java.util.ArrayList;

/*
자바가 가지는 8가지 기본 타입(값타입): JAVA API 제공

8가지 기본 타입에 대해서 설계도를 생성 >> 8가지 기본 타입도 객체 형태로 사용 가능 >> wrapper class

값 타입 대신에 객체형태 타입 >> generic (참조형태의 parameter)
1. 매개변수 객체 타입이 요구될 때
2. 기본형 값이 아닌 객체 형태로 저장
3. 객체간 값 비교
4. 타입 변환시 비교

 */
public class Ex08_Wrapper_Class {

    public static void main(String[] args) {
        int i = 100;
        
        Integer n = new Integer(100);// is deprecated 추후 버전에서 사라짐..
        System.out.println(n);//원래 n 주소값 출력 (toString() 재정의)
        System.out.println(n.MAX_VALUE);
        System.out.println(n.MIN_VALUE);
        
        //POINT
        //Integer 함수의 parameter
        //제너릭
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(100);
        //li.add("a");
        for(int value : li) {
            System.out.println(value);
        }
        //char  Character
        //int Integer
        //나머지 앞글자 대문자
    }

}
