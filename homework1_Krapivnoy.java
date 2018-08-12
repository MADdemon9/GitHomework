/**
 * Java. Level 1. Lesson1. Homework
 * @author Dmitriy Krapivnoy
 * @version aug 12.2018
 */
package ru.gickbrains.JavaLesson_1;


public class homework1_Krapivnoy {

    public static void main(String[] args) {
    	byte w = -7;
    	short e = 345;
    	int r = 35678;
    	long t = 567897656876L;
    	float y = 567.6f;
    	double u = 5800.424;
    	boolean h = true;
    	char o = 'H';
    	String k = "qwre";


	System.out.println(plus(5,12,67,45));

	System.out.println(check(5,8));

	System.out.println(checkZero(8));

	System.out.println(checkMinus(7));

	meeting("Dima");

    }
    static float plus(float a, float b, float c, float d){
    	return a*(b+(c/d));
	}
	static boolean check(int a, int b){
	boolean q;
	if(a+b>=10||a+b<=20){
		q = true;
	}else{
		q =false;
	}
	return q;
	}
static String checkZero(int a){
    	String z;
    	if(a>=0){
    		z = "Число положительное";
		}else{
    		z = "Число отрицательное";
		}
		return z;
}
static boolean checkMinus(int a){
    	boolean x;
    	if(a<0){
    		x = true;
		}else{
			x = false;
		}
		return x;
}

public static void meeting( String name){
    System.out.println("Hello, " + name);

}
}
