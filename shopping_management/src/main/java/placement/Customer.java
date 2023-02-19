package placement;

public class Customer 
{
private Integer c_id;
private String c_name;
private int c_phno;
private String c_addr;
private String c_email;



public Customer() 
{
	super();
}
public Customer(Integer c_id, String c_name, int c_phno, String c_addr, String c_email) {
	super();
	this.c_id = c_id;
	this.c_name = c_name;
	this.c_phno = c_phno;
	this.c_addr = c_addr;
	this.c_email = c_email;
}
public Integer getC_id() {
	return c_id;
}
public void setC_id(Integer c_id) {
	this.c_id = c_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public int getC_phno() {
	return c_phno;
}
public void setC_phno(int c_phno) {
	this.c_phno = c_phno;
}
public String getC_addr() {
	return c_addr;
}
public void setC_addr(String c_addr) {
	this.c_addr = c_addr;
}
public String getC_email() {
	return c_email;
}
public void setC_email(String c_email) {
	this.c_email = c_email;
}
@Override
public String toString() {
	return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_phno=" + c_phno + ", c_addr=" + c_addr + ", c_email="
			+ c_email + "]";
}


}
