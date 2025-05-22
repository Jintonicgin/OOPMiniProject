package addr;
import java.util.Scanner;
public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		Addr addr = new Addr();
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			addr = smartphone.inputAddrData();
			smartphone.addAddr(addr);
		}
		
		while(true) {
			System.out.println("주소 관리 메뉴----------------");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 모든 연락처 출력");
			System.out.println("3. 연락처 검색");
			System.out.println("4. 연락처 삭제");
			System.out.println("5. 연락처 수정");
			System.out.println("6. 프로그램 종료");
			System.out.println("---------------------------");
			
			System.out.print("원하시는 메뉴를 선택해주세요: ");
			int user = in.nextInt();
			in.nextLine();
			switch(user) {
			
			case 1:
				addr = smartphone.inputAddrData();
				smartphone.addAddr(addr);
				break;
				
			case 2:
				smartphone.printAllAddr();
				break;
				
			case 3:
				System.out.print("찾으시는 이름을 입력하세요: ");
				String searchName = in.nextLine();
				smartphone.searchAddr(searchName);
				break;
				
				
			case 4:
				System.out.print("삭제하실 이름을 입력하세요: ");
				String delName = in.nextLine();
				smartphone.deleteAddr(delName);
				break;
				
			case 5:
				System.out.print("수정하실 이름을 입력하세요: ");
				String editName = in.nextLine();
				addr = smartphone.inputAddrData();
				smartphone.editAddr(editName, addr);
				break;
			}
				
			if(user==6) {
				break;
			}
		}in.close();

	}

}
