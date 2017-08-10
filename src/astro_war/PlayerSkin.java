package astro_war;

import javafx.scene.image.Image;

public class PlayerSkin {
	/* ��Ų �ɷ�ġ */
	private final int[] price = new int[] {0, 10000, 25000, 50000, 100000};
	private final String[] info = new String[] {" �߰��ɷ� ����", "�̵��ӵ� +2", "�߰� ���� +20%", "���� �ӵ� +50%", "������ ���� ������ȿ�� +100%\n������ �ִ� �� +2 / ���� ���ݷ� +10"};
	private final Image[] list = new Image[5];
	private final int[] width = new int[] {50, 50, 50, 50, 70};
	private final int[] move_speed = new int[] {7, 9, 7, 7, 7};
	private final int[] shoot_speed = new int[] {25, 25, 25, 20, 25};
	private final int[] damage = new int[] {10, 10, 10, 10, 20};
	/*---------*/
	
	
	public PlayerSkin() {
		list[0] = new Image("images/default_player.png"); // �⺻
		list[1] = new Image("images/lightning_player.png"); // �̵��ӵ� +2
		list[2] = new Image("images/money_player.png"); // �߰� ���� +20%
 		list[3] = new Image("images/rapid_player.png"); // ���ݼӵ� +50%
		list[4] = new Image("images/shadow_player.png"); // ���������� ������ ȿ�� +100% + ������ �ִ밹��+2
	}
	
	public String getInfo(int n) {
		return info[n];
	}
	
	public int getPrice(int n) {
		return price[n];
	}
	
	public Image getSkin(int n) {
		return list[n];
	}
	
	public int getWidth(int n) {
		return width[n];
	}	
	
	public int getMoveSpeed(int n) {
		return move_speed[n];
	}
	
	public int getShootSpeed(int n) {
		return shoot_speed[n];
	}
	
	public int getDamage(int n) {
		return damage[n];
	}
}
