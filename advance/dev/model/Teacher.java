package advance.dev.model;

import advance.dev.dao.IPeople;

public class Teacher extends People implements IPeople{
	private String TeacherID;

	public Teacher(String name, int age, String teacherID) {
		super(name, age);
		TeacherID = teacherID;
	}
	//getter, setter
	public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String teacherID) {
        this.TeacherID = teacherID;
    }
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printPeople() {
		// TODO Auto-generated method stub
		
	}
	
	
}
