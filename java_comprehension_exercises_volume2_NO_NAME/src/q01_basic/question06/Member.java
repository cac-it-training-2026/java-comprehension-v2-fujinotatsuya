package q01_basic.question06;

public class Member extends AbstMember {

	private int id;
	private String password;

	private int age;
	private int rank;

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String Name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = Name;
		this.age = age;
		this.rank = rank;
	}

	@Override
	public void buyItem() {

	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}
