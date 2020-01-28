package member;

public class Level {
	private Order order;
	// check member more than 4 orders
	// and spend more than 1000 bath
	
	//targetOrders , order , member id 
	
	// and within 6 mounts
	
	// and sequence in between 1 - 199 candidates
	
	public Level(Order order) {
		this.order = order;
	}

	public Member up(Member member) {
		if (order.getTargetOrder(member.getId() )>= 4) {
			return new Member(member.getId(), "Gold", member.getSpecialPoint() + 200);
		}
		return null;
	}

}
