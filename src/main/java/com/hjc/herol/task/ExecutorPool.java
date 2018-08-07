package com.hjc.herol.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: ExecutorPool
 * @Description: 线程池管理
 * 
 */
public class ExecutorPool {
	public static ExecutorService channelHandleThreadPool = null;

	public Logger logger = LoggerFactory.getLogger(ExecutorPool.class);

	public static void initThreadsExecutor() {
		channelHandleThreadPool = Executors.newCachedThreadPool();
	}

	public static void execute(Runnable runnable) {
		channelHandleThreadPool.execute(runnable);
	}

	public static void shutdown() {
		if (!channelHandleThreadPool.isShutdown()) {
			channelHandleThreadPool.shutdown();
		}
	}
}