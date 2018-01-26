package com.tutorial.venu;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class Verticle1 extends AbstractVerticle {

	@Override
    public void start(Future<Void> startFuture) {
        System.out.println("Verticle1 started!");
    }
	
	@Override
    public void stop(Future stopFuture) throws Exception {
        System.out.println("Verticle1 stopped!");
    }
	
}
