package com.infobeans.data;

public class LimitConfiguration {
	
	private int minimum;
	private int maximum;
	public LimitConfiguration(int minimum2, int maximum2) {
		// TODO Auto-generated constructor stub
		this.maximum=maximum2;
		this.minimum=minimum2;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
