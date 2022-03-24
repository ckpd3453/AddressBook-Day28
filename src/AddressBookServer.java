
public class AddressBookServer {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long mobileNumber;
	private String emailId;
	public AddressBookServer(String firstName, String lastName, String address, String city, String state, int zipCode,
			long mobileNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "AddressBookServer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + "]";
	}
	
	
}
