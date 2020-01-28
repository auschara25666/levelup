package member;

public class Member {
	private final int id;
	private final String level;
	private final int specialpoint;
	
	public Member(int id, String level, int specialpoint) {
		this.level = level;
		this.specialpoint = specialpoint;
		this.id = id;
		
	}

	public String getLevel() {
		return this.level;
	}

	public int getSpecialPoint() {
		return this.specialpoint;
	}

	public int getId() {
		return id;
	}

}
