package kr.or.bit.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//날짜의 형식을 제공하는 설계도
//많이 사용 >> 편하게 >> 기능 >> new (x) >> static 함수 >> 하나의 이름 (overloading)

public class Edu_Date {
    public static String DateString(Calendar date) {

        return date.get(Calendar.YEAR) + "년" + 
        (date.get(Calendar.MONTH) + 1) + "월" + 
        date.get(Calendar.DATE) + "일";

    }

    public static String DateString(Calendar date, String opr) {

        return  date.get(Calendar.YEAR) + opr + 
                (date.get(Calendar.MONTH) + 1) + opr + 
                date.get(Calendar.DATE);
    }
    //요구사항
    //2021-2-17
    //1~9월 >> 01, 02
    //10 11 12 >> 그대로
    //
    
    public static String monthFormat_DateString(Calendar date) {
        
        System.out.println((date.get(Calendar.MONTH) + 1));
        String pluszero = "";
        if((date.get(Calendar.MONTH) + 1) < 10) {
            pluszero = "0" + (date.get(Calendar.MONTH) + 1);
        }
        
        return date.get(Calendar.YEAR) + "년" + 
                pluszero + "월" + 
                date.get(Calendar.DATE) + "일";
    }
    
    public static String todaybFormat_DaueString() {
        Date today = new Date();
        SimpleDateFormat todayformat = new SimpleDateFormat("yy년 MM월 dd일");
        
        return todayformat.format(today);
    }

}
