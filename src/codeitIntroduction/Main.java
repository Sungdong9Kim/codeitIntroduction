package codeitIntroduction;

import java.util.Scanner;

public class Main {
	/*
	// code for implementing my self
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			
			Scanner scanner = new Scanner(System.in);
					
			String inputICE = scanner.next();
			if(inputICE.equals("E") || inputICE.equals("e")) {
				System.out.print("안녕히 가세요.");
				System.exit(0);
				
			}
			else if (inputICE.equals("I") || inputICE.equals("i")){
				System.out.print("안녕하세요! 우리는 코드잇입니다.\n함께 공부합시다!\n");
			}
			else if (inputICE.equals("C") || inputICE.equals("c")) {
				while(true) {
					System.out.print("코드잇 수업을 소개합니다.\n(P)ython (J)ava (i)OS (B)ack\n");
					String inputPJiB = scanner.next();
					if (inputPJiB.equals("B") || inputPJiB.equals("b")) {
						break;
					}
					else if (inputPJiB.equals("J") || inputPJiB.equals("j")) {
						System.out.print("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\r\n"
								+ "강사: 김신의\r\n"
								+ "추천 선수과목: Python\n");
					}
					else if (inputPJiB.equals("P") || inputPJiB.equals("p")) {
						System.out.print("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\r\n"
								+ "강사: 강영훈\r\n"
								+ "추천 선수과목: 없음\n");
					}
					else if (inputPJiB.equals("I") || inputPJiB.equals("i")) {
						System.out.print("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\r\n"
								+ "강사: 성태호\r\n"
								+ "추천 선수과목: Python, Java\n");
					}
				}
			}
			else {
				System.out.println("다시 입력해주세요.");
			}
			
		}			
		
	}*/
	
	//code for introducing codeit in lecture video.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean inMainMenu = true;
		while(inMainMenu) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			
			switch(scanner.next()) {
				case"I":
				case"i":
					System.out.println("안녕하세요! 우리는 코드잇입니다.\\n함께 공부합시다!");
					break;
				case"C":
				case"c":
					boolean inCourceMenu = true;
					while(inCourceMenu) {
						System.out.print("코드잇 수업을 소개합니다.\n(P)ython (J)ava (i)OS (B)ack\n");
						switch(scanner.next()) {
							case "p":
							case "P":
								System.out.print("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\r\n"
										+ "강사: 강영훈\r\n"
										+ "추천 선수과목: 없음\n");
								break;
							case "j":
							case "J":
								System.out.print("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\r\n"
										+ "강사: 김신의\r\n"
										+ "추천 선수과목: Python\n");
								break;
							case "i":
							case "I":
								System.out.print("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\r\n"
										+ "강사: 성태호\r\n"
										+ "추천 선수과목: Python, Java\n");
								break;
							case "b":
							case "B":
								inCourceMenu = false;
								break;
							default:
								System.out.print("다시 입력해주세요.");
								break;
						}
					}
					break;
				case"e":
				case"E":
					System.out.print("안녕히 가세요.");
					inMainMenu = false;
					break;
				default:
					System.out.print("다시 입력해주세요.");
					break;
			}
		}
	}

}
