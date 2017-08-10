package astro_war;

import java.util.HashMap;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class FXSound {
	private HashMap<String, AudioClip> effect_map = new HashMap<>();
	private HashMap<String, MediaPlayer> bgm_map = new HashMap<>();
	private Media main;
	private Media game;
	
	/* ù ������ ���� ���ҽ� �ε� */
	public FXSound() {
		System.out.println("[Init Game Resource]");
		try {
			System.out.print("Sound Loading.. ");
			main = new Media(AstroWar.class.getResource("main.mp3").toString());
			game = new Media(AstroWar.class.getResource("game_bgm.mp3").toString());
			bgm_map.put("main", new MediaPlayer(main));
			bgm_map.put("game", new MediaPlayer(game));
			effect_map.put("item", new AudioClip(AstroWar.class.getResource("item.mp3").toString()));
			effect_map.put("explosion", new AudioClip(AstroWar.class.getResource("explosion.mp3").toString()));
			effect_map.put("shoot", new AudioClip(AstroWar.class.getResource("shoot.mp3").toString()));
			effect_map.put("hit", new AudioClip(AstroWar.class.getResource("hit_player.mp3").toString()));
			effect_map.put("crash", new AudioClip(AstroWar.class.getResource("crash.mp3").toString()));
			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
	
	/* 1.25�� �ӵ��� ������� */
	public void BGMPlay(String key) {
		MediaPlayer temp = bgm_map.get(key);
		temp.setOnEndOfMedia(()->{ 
			temp.seek(Duration.ZERO); //���ѹݺ�
		});
		temp.play();
		temp.setRate(1.25);
	}
	
	/* ���� ���� */
	public void BGMstop(String key) {
		try {
			MediaPlayer temp = bgm_map.get(key);
			temp.stop();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* �ش��ϴ� Ű ���� ���带 ��� */
	public void EffectPlay(String key) {
		effect_map.get(key).play();
	}
}
