/**
 * 
 */
package com.turtle;

/**
 * @author INYANG ERNEST
 *
 */

public class Pen {

	private PenPosition positionOfThePen;
	
	public Pen() {
		this.positionOfThePen = PenPosition.UP;
	}
	
	public void setPositionOfThePen(PenPosition newPosition) {
		positionOfThePen = newPosition;
	}
	
	public PenPosition getPositionOfThePen() {
		return positionOfThePen;
	}
}





	

