package com.tutorial.venu;

import io.vertx.core.Vertx;
public class VertxFirstProgram {

	public static void main(String[] args) {
		
		Vertx vertx = Vertx.vertx();
		
		vertx.deployVerticle(new Verticle1());
		
	}
}
