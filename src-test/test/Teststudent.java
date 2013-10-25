package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.Assert.*;

import daten.Student;

public class Teststudent {
	
	@Test
	public void testcomp(){
		Student s  = new Student("Onur", "Tuncel", new Date(1994, 03, 07));
		Student s2 = new Student("Onur", "Tuncel", new Date(1994, 03, 07));
		
		assertEquals(s.compareTo(s2),0);
		
		
	}

}
