package com.javaeunjeong.ex;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	
	
//	public Calculation(int firstNum, int secondNum) {
//		super();
//		this.firstNum = firstNum;
//		this.secondNum = secondNum;
//	}

	public void addition() {
		System.out.println("���� ��� ���:");
		int result = firstNum + secondNum;
		System.out.println(firstNum + "+" + secondNum + "=" + result);
		
	}
	
	public void subtraction() {
		System.out.println("���� ��� ���:");
		int result = firstNum - secondNum;
		System.out.println(firstNum + "-" + secondNum + "=" + result);
		
	}
	
	public void multiplication() {
		System.out.println("���� ��� ���:");
		int result = firstNum * secondNum;
		System.out.println(firstNum + "*" + secondNum + "=" + result);
		
	}

	public void division() {
		System.out.println("������ ��� ���:");
		int result = firstNum / secondNum;
		System.out.println(firstNum + "/" + secondNum + "=" + result);
		
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	



}
