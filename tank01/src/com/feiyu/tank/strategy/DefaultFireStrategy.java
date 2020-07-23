package com.feiyu.tank.strategy;

import com.feiyu.tank.Audio;
import com.feiyu.tank.Bullet;
import com.feiyu.tank.Group;
import com.feiyu.tank.Tank;

/**
 * 发射子弹的方式2
 * 单发
 * @author feiyu
 *
 */
public class DefaultFireStrategy implements FireStrategy{

	@Override
	public void fire(Tank t) {

		int bX = t.x + Tank.WIDTH/2 - Bullet.WIDTH/2;
		int bY = t.y + Tank.HEIGHT/2 - Bullet.HEIGHT/2;
		
		new Bullet(bX, bY, t.dir, t.group, t.gm);
		
		if(t.group == Group.GOOD) new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
		
	}

}