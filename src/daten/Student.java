package daten;
import java.security.acl.LastOwnerException;
import java.util.Date;

public class Student extends Person implements Comparable<Student> {

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isSelfEntitled() {
		return selfEntitled;
	}

	public void setSelfEntitled(boolean selfEntitled) {
		this.selfEntitled = selfEntitled;
	}

	public Student(String firstName,String lastName, Date birthdate) {
		this(firstName, lastName, birthdate , false);
	}

	public Student(String firstName, String lastName,Date birtDate, boolean selfEntitled) {
		super(firstName, lastName);
		setSelfEntitled(selfEntitled);
		setBirthDate(birtDate);
	}

	private boolean selfEntitled;
	private Date birthDate;
	
	// TODO add getter,setter,Constructors +

	
	@Override
	public int compareTo(Student o) {
		int result = 0;

		// TODO implement meaningful unit test
		
		if ((result = getLastName().compareTo(o.getLastName())) == 0) {
			if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
				result = getBirthDate().compareTo(o.getBirthDate()); // TODO change to
															// getter after
															// implementation
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "Student [selfEntitled=" + selfEntitled + ", birthDate="
				+ birthDate + "]";
	}
}
