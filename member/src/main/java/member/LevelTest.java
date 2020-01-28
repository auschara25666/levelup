package member;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LevelTest {
	@Test
	public void memberShoudUpLevelToGoldMemberWhenSequenceIs150() {
		Member member = new Member(10000, "Silver", 50);

		Order order = new Order();
		Level level = new Level(order);
		
		Member newMember = level.up(member);
		
		assertEquals(newMember.getLevel(), "Gold");
		assertEquals(newMember.getSpecialPoint(), 250);
	}
}
