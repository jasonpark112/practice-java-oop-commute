package dev.syntax.oop.step0301practice;

public class RunApplication {

	public static void main(String[] args) {
		BusCompany buscompany = new BusCompany("721", 30, 50000);
		SubwayCompany subwaycompany = new SubwayCompany("7", 50, 70000);
		Students student = new Students("박지호", 20000);
		Application application = new Application(subwaycompany, buscompany, student);
		
		application.useBus();
		application.useSubway();
		
		
		System.out.println("버스회사");
		System.out.println(buscompany.line);
		System.out.println(buscompany.num);
		System.out.println(buscompany.money);
		System.out.println();
		
		System.out.println("지하철회사");
		System.out.println(subwaycompany.line);
		System.out.println(subwaycompany.num);
		System.out.println(subwaycompany.money);
		System.out.println();
		
		System.out.println(student.name);
		System.out.println(student.money);
		
		System.out.println();
		
		application.takeoffSubway();
		application.takeoffuseBus();
		
		
	    System.out.println("버스 인원 수");
		System.out.println(buscompany.num);
		System.out.println("지하철 인원 수");
		System.out.println(subwaycompany.num);

		
	} 

}

/**
 *문제점 
 *1. 사용자가 버스와 지하철의 정보를 알고 있어야 한다.
 *2.  필드 자체에 영향을 주는 것 보단, setter getter 
 */


