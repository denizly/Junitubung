package daten;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Course {

	private String name;

	private final Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			int result=0;
			
			if((result=o1.getLastName().compareTo(o2.getLastName())) == 0) {
				if ((result = o1.getFirstName().compareTo(o2.getFirstName())) == 0) {
					result = o1.getBirthDate().compareTo(o2.getBirthDate());
				}}
					
			return result;
		}});
	

	public void addStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException(
					"student to add must not be null!");
		}
		if (students.contains(student)) {
			return;
		}
		students.add(student);
	}

	public boolean removeStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException(
					"student to remove must not be null!");
		}
		return students.remove(student);
	}
}
	
