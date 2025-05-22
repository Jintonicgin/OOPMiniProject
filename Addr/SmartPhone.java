package addr;
import java.util.Scanner;

public class SmartPhone {
	
	Addr[] people = new Addr[10];
	
	
	public Addr inputAddrData() {
		Scanner in = new Scanner(System.in);
			System.out.print("이름을 입력하세요: ");
			String name = in.nextLine();
			System.out.print("전화번호를 입력하세요: ");
			String phoneNum = in.nextLine();
			System.out.print("이메일을 입력하세요: ");
			String email = in.nextLine();
			System.out.print("주소를 입력하세요: ");
			String address = in.nextLine();
			System.out.print("그룹을 입력하세요(친구/가족): ");
			String group = in.nextLine();
			
			Addr addr = new Addr(name, phoneNum, email, address, group);
		return addr;
		}
	
	
	
	public void addAddr(Addr addr) {
		for(int i = 0; i < people.length; i++) {
			if(people[i]==null) {
				people[i] = addr;
				System.out.printf(">>>데이터가 저장되었습니다. (%d)\n", (i+1));
				return;
			}
				
			}System.out.println("주소록이 가득 찼습니다.");
		}
	
	
	public void printAddr(Addr addr){
		System.out.printf("이름: %s\n전화번호: %s\n이메일: %s\n주소: %s\n그룹(친구/가족): %s\n", addr.getName(), addr.getPhoneNum(), addr.getEmail(), addr.getAddress(), addr.getGroup());
	}
	
	
	public void printAllAddr(){
		for(int i = 0; i<people.length; i++) {
			if(people[i]!=null) {
			System.out.printf("이름: %s\n전화번호: %s\n이메일: %s\n주소: %s\n그룹(친구/가족): %s\n--------------------------\n", people[i].getName(), people[i].getPhoneNum(),people[i].getEmail(), people[i].getAddress(), people[i].getGroup());
			}
		}
	}
	
	
	public void searchAddr(String name) {
		for(int i = 0; i<people.length; i++) {
			if(name.equals(people[i].getName())) {
				System.out.printf("이름: %s\n전화번호: %s\n이메일: %s\n주소: %s\n그룹(친구/가족): %s\n", people[i].getName(), people[i].getPhoneNum(),people[i].getEmail(), people[i].getAddress(), people[i].getGroup());
				return;
			}		
		}	
	}
	
	
	public void deleteAddr(String name) {
		for(int i = 0; i<people.length; i++) {
			if(name.equals(people[i].getName())) {
				people[i] = null;
				System.out.printf(name + "의 연락처가 삭제되었습니다.\n");
				return;
			}		
		}
	}
	
	
	public void editAddr(String name, Addr newAddr ) {
		for(int i = 0; i<people.length; i++) {
			if(name.equals(people[i].getName())) {
				people[i] = newAddr;
				System.out.printf(people[i].getName() + "의 연락처가 수정되었습니다.\n");
				return;
			}		
		}
	}
	
	
}	
	

