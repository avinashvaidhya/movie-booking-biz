package dataModel;

public class UserDetails {
	
	private int userId;

	private String userName;

	private String password;

	private String emailId;

	private String phoneNumber;
	
	private int roleId;

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User id : " + this.userId + "User Name : " + this.userName + " ,Password : " + 
				this.password + ", Email : " + this.emailId + ", Phone Number : " + this.phoneNumber
				+ ", Role ID : " + this.roleId ;
	}


}
