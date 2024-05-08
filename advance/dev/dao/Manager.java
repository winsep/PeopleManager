package advance.dev.dao;

import advance.dev.model.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Manager {
	private List<Teacher> teacherList = new ArrayList<>();

	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
	}

	public void printTeacherList() {
		for (Teacher teacher : teacherList) {
			System.out.println("Thong tin giao vien: " + teacher.getName() + ", Tuoi: " + teacher.getAge());
		}
	}

	public int getTeacherCount() {
		return teacherList.size();
	}

	public String getOldestTeacherName() {
		Teacher oldestTeacher = teacherList.stream()
				.max(Comparator.comparingInt(Teacher::getAge))
				.orElse(null);
		if(oldestTeacher != null) {
			return oldestTeacher.getName();
		}else {
			return "khong tim thay giao vien";
		}
    }
}
