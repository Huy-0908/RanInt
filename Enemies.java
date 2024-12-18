package missionOfHuy;

public class Enemies {
	private int ene_HP;
	private int ene_DEF;
	private int ene_ATT;
	Character person=new Character();
	public Enemies(int ene_HP, int ene_DEF, int ene_ATT) {
		this.ene_HP = ene_HP;
		this.ene_DEF = ene_DEF;
		this.ene_ATT = ene_ATT;
	}
	
	public Enemies(int ene_HP, int ene_DEF) {
		this.ene_HP = ene_HP;
		this.ene_DEF = ene_DEF;
	}
	
	public Enemies(int ene_HP) {
		this.ene_HP = ene_HP;
	}
	public int getEne_HP() {
		return ene_HP;
	}
	public void setEne_HP(int ene_HP) {
		this.ene_HP = ene_HP;
	}
	public int getEne_DEF() {
		return ene_DEF;
	}
	public void setEne_DEF(int ene_DEF) {
		this.ene_DEF = ene_DEF;
	}
	public int getEne_ATT() {
		return ene_ATT;
	}
	public void setEne_ATT(int ene_ATT) {
		this.ene_ATT = ene_ATT;
	}
	public void GetDamage() {
		ene_DEF -= person.getATT();
		if (ene_DEF <0) {
			ene_HP -= (person.getATT()+ene_DEF);
		} else if (ene_DEF ==0) {
			ene_HP -= person.getATT();
		}
		if (ene_HP<=0) {
			System.out.println(" This enemy is dead.Good");
		}
	}
	public void NormalATT() {
		person.setDEF(ene_ATT-person.getDEF());
	}
}
