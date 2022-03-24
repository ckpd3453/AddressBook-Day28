
public class AddressBookServer {

	/**
	 * private variables can only be accessed within the same class (an outside
	 * class has no access to it) private = restricted access However, it is
	 * possible to access them if we provide public get and set methods.
	 */
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long mobileNumber;
	private String emailId;

	public AddressBookServer() {

	}

	/**
	 * creating a parameterized constructor of ContactDetails by passing parameters
	 * with no return type
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param mobileNumber
	 * @param emailId
	 */
	public AddressBookServer(String firstName, String lastName, String address, String city, String state, int zipCode,
			long mobileNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

/*
 * sttter and getters
 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ContactDetails{" + "firstName='"   + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
				+ address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode
				+ ", mobileNo=" + mobileNumber + ", emailId='" + emailId + '\'' + '}';

	}
	
}
