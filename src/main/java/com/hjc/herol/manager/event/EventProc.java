package com.hjc.herol.manager.event;

/**
 * 事件处理器。
 * 
 *
 */
public abstract class EventProc {
	public boolean disable;

	public EventProc() {
		doReg();
	}

	public abstract void proc(Event param);

	protected abstract void doReg();
}
