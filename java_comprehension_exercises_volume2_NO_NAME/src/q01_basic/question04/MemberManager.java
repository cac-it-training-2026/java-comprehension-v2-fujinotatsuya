package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(Member[] members) {
		for (Member menber : members) {
			members[0].showMember();
			members[1].showMember();
		}
	}
}
