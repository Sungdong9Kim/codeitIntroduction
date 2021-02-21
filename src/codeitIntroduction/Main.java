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
				System.out.print("�ȳ��� ������.");
				System.exit(0);
				
			}
			else if (inputICE.equals("I") || inputICE.equals("i")){
				System.out.print("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.\n�Բ� �����սô�!\n");
			}
			else if (inputICE.equals("C") || inputICE.equals("c")) {
				while(true) {
					System.out.print("�ڵ��� ������ �Ұ��մϴ�.\n(P)ython (J)ava (i)OS (B)ack\n");
					String inputPJiB = scanner.next();
					if (inputPJiB.equals("B") || inputPJiB.equals("b")) {
						break;
					}
					else if (inputPJiB.equals("J") || inputPJiB.equals("j")) {
						System.out.print("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.\r\n"
								+ "����: �����\r\n"
								+ "��õ ��������: Python\n");
					}
					else if (inputPJiB.equals("P") || inputPJiB.equals("p")) {
						System.out.print("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\r\n"
								+ "����: ������\r\n"
								+ "��õ ��������: ����\n");
					}
					else if (inputPJiB.equals("I") || inputPJiB.equals("i")) {
						System.out.print("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\r\n"
								+ "����: ����ȣ\r\n"
								+ "��õ ��������: Python, Java\n");
					}
				}
			}
			else {
				System.out.println("�ٽ� �Է����ּ���.");
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
					System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.\\n�Բ� �����սô�!");
					break;
				case"C":
				case"c":
					boolean inCourceMenu = true;
					while(inCourceMenu) {
						System.out.print("�ڵ��� ������ �Ұ��մϴ�.\n(P)ython (J)ava (i)OS (B)ack\n");
						switch(scanner.next()) {
							case "p":
							case "P":
								System.out.print("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\r\n"
										+ "����: ������\r\n"
										+ "��õ ��������: ����\n");
								break;
							case "j":
							case "J":
								System.out.print("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.\r\n"
										+ "����: �����\r\n"
										+ "��õ ��������: Python\n");
								break;
							case "i":
							case "I":
								System.out.print("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\r\n"
										+ "����: ����ȣ\r\n"
										+ "��õ ��������: Python, Java\n");
								break;
							case "b":
							case "B":
								inCourceMenu = false;
								break;
							default:
								System.out.print("�ٽ� �Է����ּ���.");
								break;
						}
					}
					break;
				case"e":
				case"E":
					System.out.print("�ȳ��� ������.");
					inMainMenu = false;
					break;
				default:
					System.out.print("�ٽ� �Է����ּ���.");
					break;
			}
		}
	}

}
