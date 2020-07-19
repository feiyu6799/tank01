package com.feiyu.tank;

import java.awt.Graphics;

public class Explode {

	public static int WIDTH = ResourceMgr.explodes[0].getWidth();
	public static int HEIGHT = ResourceMgr.explodes[0].getHeight();
	
	private int x, y;//位置
	
	private boolean living = true;//是否存活
	TankFrame tf = null;//主窗口
	
	private int step = 0;//记录1-16张图片加载到哪一张
	
	public Explode(int x, int y, TankFrame tf) {
		this.x = x;
		this.y = y;
		this.tf = tf;
		
//		new Audio("audio/explode.wav").run();//加载爆炸声音
	}
	
	

	public void paint(Graphics g) {
		
		g.drawImage(ResourceMgr.explodes[step++], x, y, null);
		
		if(step >= ResourceMgr.explodes.length) 
			step = 0;
	}

}
