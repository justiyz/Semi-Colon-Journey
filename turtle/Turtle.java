/**
 * 
 */
package com.turtle;

/**
 * @author INYANG ERNEST
 *
 */public class Turtle {
		public static final int LEG_COUNT = 4; 
		
		private int xCoordinate;
		private int yCoordinate;
		private CardinalDirection direction;
		
		private Pen turtlePen;
		
		public Turtle() {
			//this.direction = CardinalDirection.NORTH;
			this(CardinalDirection.NORTH);
		}
		
		public Turtle(CardinalDirection turtleDirection) {
			direction = turtleDirection;
		}

		public int getxCoordinate() {
			return xCoordinate;
		}

		public void setxCoordinate(int xCoordinate) {
			this.xCoordinate = xCoordinate;
		}

		public int getyCoordinate() {
			return yCoordinate;
		}

		public void setyCoordinate(int yCoordinate) {
			this.yCoordinate = yCoordinate;
		}

		public Pen getTurtlePen() {
			return turtlePen;
		}

		public void setTurtlePen(Pen turtlePen) {
			this.turtlePen = turtlePen;
		}

		public CardinalDirection getDirection() {
			return direction;
		}

		public void setDirection(CardinalDirection direction) {
			this.direction = direction;
		}
		
		public void changePenPosition(PenPosition newPosition) {
			turtlePen.setPositionOfThePen(newPosition);
		}
		
		/**
		 * Helps the turtle turn right based on its current orientation
		 */
		public void turnRight() {
			if(direction == CardinalDirection.NORTH) {
				direction = CardinalDirection.EAST;
			}else if(direction == CardinalDirection.EAST) {
				direction = CardinalDirection.SOUTH;
			}else if(direction == CardinalDirection.SOUTH) {
				direction = CardinalDirection.WEST;
			}else if(direction == CardinalDirection.WEST) {
				direction = CardinalDirection.NORTH;
			}
		}
		
		public void draw(int[][] canvas, int numberOfSteps ) {
			this.turtlePen.setPositionOfThePen(PenPosition.DOWN);
			if(this.direction == CardinalDirection.NORTH) {
				for(int i = 0; i < numberOfSteps; i++) {
					canvas[yCoordinate][i] = 1;
				}
				this.xCoordinate = numberOfSteps - 1;
			}else if(this.direction == CardinalDirection.EAST) {
				for(int i = 0; i < numberOfSteps; i++) {
					canvas[i][xCoordinate] = 1;
				}
				this.yCoordinate = numberOfSteps - 1;
			}else if(this.direction == CardinalDirection.SOUTH) {
				for(int i = numberOfSteps-1; i >= 0; i--) {
					canvas[yCoordinate][i] = 1;
				}
				this.xCoordinate = xCoordinate - (numberOfSteps - 1);
			}else if(this.direction == CardinalDirection.WEST) {
				for(int i = numberOfSteps-1; i >= 0; i--) {
					canvas[i][xCoordinate] = 1;
				}
				this.yCoordinate = yCoordinate - --numberOfSteps;
			}
		}
		
		public static void move(int steps) {
			steps = LEG_COUNT;
		}
	}





