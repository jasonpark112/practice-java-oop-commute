package dev.syntax.oop.step0301practice;

public class Application {
	SubwayCompany subwaycompany;
	BusCompany buscompany;
	Students students;
	
	public Application(SubwayCompany subwaycompany, BusCompany buscompany,Students students) {
		this.subwaycompany = subwaycompany;
		this.buscompany = buscompany;
		this.students = students;
	}
	
	void useSubway() {
		subwaycompany.num += 1;
		subwaycompany.money += 1100;
		students.money -= 1100;
	}
	
	void takeoffSubway() {
		subwaycompany.num -= 1;
	}
	
	void useBus() {
		buscompany.num += 1;
		buscompany.money += 1400;
		students.money -= 1400;
	}
	
	void takeoffuseBus() {
		buscompany.num -= 1;
	}

	
}
