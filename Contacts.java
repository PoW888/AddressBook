
public class Contacts {

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phone;
	private String etc;
	
	//constructor
	Contacts(String firstname, String lastname, String address, String city,
			String state,  String zipcode,String phone,String etc) {
		this.firstname = firstname;
		this.lastname=lastname; 
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.etc = etc;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return "Contacts [firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + ", phone=" + phone
				+ ", etc=" + etc + "]";
	}

	
	
}
