package demo.demoenum;

/**
 * demo of how to use Enum, define Enum with values and apply abstract method
 * and also 
 * 
 * 
 * @author johns
 *
 */
public enum NPC {

	KING("King", 10, 10, 10) {
		@Override
		public double tryAttack() {
			return 0;
		}
	},
	WIZARD("Wizard", 50, 10, 50) {
		@Override
		public double tryAttack() {
			return 0;
		}
	},
	CHILD("Child", 2, 2, 2) {
		@Override
		public double tryAttack() {
			return 0;
		}
	};
	
	private final String type;
	private final int attack;
	private final int defend;
	private final int wisdom;
	
	NPC(String type, int attack, int defend, int wisdom) {
		this.type = type;
		this.attack = attack;
		this.defend = defend;
		this.wisdom = wisdom;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefend() {
		return this.defend;
	}
	
	public int getWisdom() {
		return this.wisdom;
	}
	
	public abstract double tryAttack();
	
	public static NPC npcType(String type) {
		
		for(NPC npc : NPC.values()) {
			if(npc.getType().equals(type)) {
				return npc;
			}
		}
		
		throw new IllegalArgumentException(type);
	}
	
}
