package co;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Operation add=new Add();
		Operation sub=new Sub();
		Operation mul=new Mul();
		Operation div=new Div();
		Scanner reader = new Scanner(System.in);
		double result;//计算结果
		double n1, n2; // 两个操作数
		int operator; // 用于随机生成运算符
		int c; // 用于控制是否含有乘除法
		int count; // 用于控制题目数量
		int e; // 用于控制操作数中是否含有负数
		System.out.println("请输入题目的数量");
		count = reader.nextInt();
		int f; // 用于控制操作数范围
		System.out.println("请输入操作数的范围");
		f = reader.nextInt();
		System.out.println("是否含有乘除法，有乘除法请输入1");
		c = reader.nextInt();
		System.out.println("操作数中是否可以有负数，可以的话请输入1,不可以请输入0");
		e = reader.nextInt();
		if (e == 0) {     //不可以有负数
			if (c == 1) { // 有乘除法运行下面的程序

				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 4);
					n1 = (int) (Math.random() * f);
					n2 = (int) (Math.random() * f);
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // 控制加法运算结果在100以内
						} else {
							result=add.getResult(n1, n2);
							System.out.println(n1 + "+" + n2 + "=" + result);			
					    }
						break;
					case 1:
							if ((sub.getResult(n1, n2)) < 1) {
								i--;
								continue;
							} else {
								result=sub.getResult(n1, n2);
								System.out.println(n1 + "-" + n2 + "=" + result);
							}
							break;
					case 2:
								if ((mul.getResult(n1, n2)) > 500) {
									i--;
									continue;
								} else {
									result=mul.getResult(n1, n2);
									System.out.println(n1 + "*" + n2 + "=" + result);
								}
								break;
					case 3:
						if ((div.getResult(n1, n2)) == 0) {
							i--;
							continue;
						} else {
							result=div.getResult(n1, n2);
							System.out.println(n1 + "/" + n2 + "=" + result);
						}
						break;
					}
				}
			}

			else { // 没有乘除法运行下面的程序
				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 2);
					n1 = (int) (Math.random() * f);
					n2 = (int) (Math.random() * f);
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // 控制加法运算结果在100以内
						} else {
							result=add.getResult(n1, n2);
							System.out.println(n1 + "+" + n2 + "=" + result);			
					    }
						break;
					case 1:
							if ((sub.getResult(n1, n2)) < 1) {
								i--;
								continue;
							} else {
								result=sub.getResult(n1, n2);
								System.out.println(n1 + "-" + n2 + "=" + result);
							}
							break;
					}
				}
			}
		} else if(e==1){//可以有负数

			if (c == 1) { // 有乘除法运行下面的程序

				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 4);
					n1 = (int) (f - (Math.random() * f * 2));
					n2 = (int) (f - (Math.random() * f * 2));
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // 控制加法运算结果在100以内
						} else {
							result=add.getResult(n1, n2);
							System.out.println("(" + n1 + ")" + "+" + "(" + n2
									+ ")" + "=" + (result));			
					    }
						break;
					case 1:
							if ((sub.getResult(n1, n2)) < 1) {
								i--;
								continue;
							} else {
								result=sub.getResult(n1, n2);
								System.out.println("(" + n1 + ")" + "-" + "(" + n2
										+ ")" + "=" + (result));
							}
							break;
					case 2:
								if ((mul.getResult(n1, n2)) > 500) {
									i--;
									continue;
								} else {
									result=mul.getResult(n1, n2);
									System.out.println("(" + n1 + ")" + "*" + "(" + n2
											+ ")" + "=" + (result));
								}
								break;
					case 3:
						if ((div.getResult(n1, n2)) == 0) {
							i--;
							continue;
						} else {
							result=div.getResult(n1, n2);
							System.out.println("(" + n1 + ")" + "/" + "(" + n2
									+ ")" + "=" + (result));
						}
						break;
					}
				}
			}

			else { // 没有乘除法运行下面的程序
				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 2);
					n1 = (int) (f - (Math.random() * f * 2));
					n2 = (int) (f - (Math.random() * f * 2));
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // 控制加法运算结果在100以内
						} else {
							result=add.getResult(n1, n2);
							System.out.println("(" + n1 + ")" + "+" + "(" + n2
									+ ")" + "=" + (result));			
					    }
						break;
					case 1:
							if ((sub.getResult(n1, n2)) < 1) {
								i--;
								continue;
							} else {
								result=sub.getResult(n1, n2);
								System.out.println("(" + n1 + ")" + "-" + "(" + n2
										+ ")" + "=" + (result));
							}
							break;
					}
				}
			}

		}
		
		

	}

}
