package co;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Operation add=new Add();
		Operation sub=new Sub();
		Operation mul=new Mul();
		Operation div=new Div();
		Scanner reader = new Scanner(System.in);
		double result;//������
		double n1, n2; // ����������
		int operator; // ����������������
		int c; // ���ڿ����Ƿ��г˳���
		int count; // ���ڿ�����Ŀ����
		int e; // ���ڿ��Ʋ��������Ƿ��и���
		System.out.println("��������Ŀ������");
		count = reader.nextInt();
		int f; // ���ڿ��Ʋ�������Χ
		System.out.println("������������ķ�Χ");
		f = reader.nextInt();
		System.out.println("�Ƿ��г˳������г˳���������1");
		c = reader.nextInt();
		System.out.println("���������Ƿ�����и��������ԵĻ�������1,������������0");
		e = reader.nextInt();
		if (e == 0) {     //�������и���
			if (c == 1) { // �г˳�����������ĳ���

				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 4);
					n1 = (int) (Math.random() * f);
					n2 = (int) (Math.random() * f);
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // ���Ƽӷ���������100����
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

			else { // û�г˳�����������ĳ���
				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 2);
					n1 = (int) (Math.random() * f);
					n2 = (int) (Math.random() * f);
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // ���Ƽӷ���������100����
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
		} else if(e==1){//�����и���

			if (c == 1) { // �г˳�����������ĳ���

				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 4);
					n1 = (int) (f - (Math.random() * f * 2));
					n2 = (int) (f - (Math.random() * f * 2));
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // ���Ƽӷ���������100����
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

			else { // û�г˳�����������ĳ���
				for (int i = 1; i < count + 1; i++) {
					operator = (int) (Math.random() * 2);
					n1 = (int) (f - (Math.random() * f * 2));
					n2 = (int) (f - (Math.random() * f * 2));
					switch(operator){
					case 0: 
						if ((add.getResult(n1, n2)) > 101) {
							i--;
							continue; // ���Ƽӷ���������100����
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
