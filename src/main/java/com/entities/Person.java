/**
 * 
 */
package com.entities;

/**
 * @author Mobile Apps
 *
 */
public class Person implements java.io.Serializable {

	private static long USID = 10292L;

	private String userName;
	private String fName;
	private String lName;
	private String gender;
	private int id;

	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String userName, String fName, String lName, String gender, int id) {
		this.userName = userName;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.id = id;
	}

	public static long getUSID() {
		return USID;
	}

	public static void setUSID(long uSID) {
		USID = uSID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [userName=" + userName + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", id="
				+ id + "]";
	}

}
