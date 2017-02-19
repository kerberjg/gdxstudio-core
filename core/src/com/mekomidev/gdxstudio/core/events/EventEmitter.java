package com.mekomidev.gdxstudio.core.events;

public interface EventEmitter {
	public void addListener(EventListener o);
	public void removeListener(EventListener o);
	public void triggerEvent(String event, Object... args);
}
