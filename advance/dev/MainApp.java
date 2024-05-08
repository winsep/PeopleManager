package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.Teacher;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		
		//them giao vien
		Teacher teacher1 = new Teacher("Thanh", 35, "GV001");
		Teacher teacher2 = new Teacher("Thang", 36, "GV002");
		manager.addTeacher(teacher1);
		manager.addTeacher(teacher2);
		
		//in danh sach giao vien
		manager.printTeacherList();
		
		//so luong giao vien
		int TeacherCount = manager.getTeacherCount();
		System.out.println("so luong giao vien: " + TeacherCount);
		
		//in gv co tuoi cao nhat
		String oldestTecherName = manager.getOldestTeacherName();
		System.out.println("Giao vien tuoi cao nhat: " + oldestTecherName);
	}

}
