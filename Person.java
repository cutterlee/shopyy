
public class Person{

	private int id;

	private String name;

	private String sex;

	private Date birthday;

	public void setId(int id){
		this.id=id;
	}

	public int getId(){
		return id;
	}
	@override
	public String toString(){
		return String.valueOf(id);
	}



}

