package com.hjc.herol.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: DailyTask
 * @Description: 每日定时任务
 * 
 */
public class DailyTaskService {
	public static Logger logger = LoggerFactory
			.getLogger(DailyTaskService.class);

	public void pkDailyAwardMail() {
		// TODO
		logger.info("每日定时发送邮件");
	}
}
