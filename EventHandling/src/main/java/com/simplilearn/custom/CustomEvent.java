package com.simplilearn.custom;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1052069373468942691L;

	public CustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "This is myCustom Event";
	}

}
