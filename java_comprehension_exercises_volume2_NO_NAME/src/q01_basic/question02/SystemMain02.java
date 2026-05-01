package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		Member a = new Member();

		a.setName("Miura Manabu");
		a.setAge(30);
		a.setRank(1);

		a.showMember();
		a.rankUp();

		a.getRank();
		System.out.println(">>>RANK UP>>> ");
		System.out.println("---GET RANK---");
		System.out.println("newRank:" + a.getRank());
	}
}
