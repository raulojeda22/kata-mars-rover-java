package example;

public class Rover {

	int x = 0;
	int y = 0;
	char dir = 'N';

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public char getDir() {
		return dir;
	}
	
	public Rover(int x,int y, char dir) {
		this.x=x;
		this.y=y;
		this.dir=dir;
	}
	
	public int[] calculateDirection() {
		int varX = 0;
		int varY = 0;
		int dir = this.dir;
		switch (dir) {
	        case 'N':
	    		varY=1;
	         	break;
	        case 'S': 
	    		varY=-1;
	         	break;
	        case 'W':  
	        	varX=-1;
				break;
	        case 'E':  
	        	varX=1;
	        	break;
	        default:
	        	break;
		}
		int [] vars = {varX,varY};
		return vars;
	}
	
	public void move(char[] movement) {
		int[] position = {this.getX(),this.getY()};
		int x = position[0];
		int y = position[1];
		int[] vars;
		char dir = this.getDir();
		for (char move : movement) {
			vars = this.calculateDirection();
			switch (move) {
	            case 'f':
            		x+=vars[0];
            		y+=vars[1];
                 	break;
	            case 'b': 
	            	x-=vars[0];
            		y-=vars[1];
        			break;
	            default:
	            	dir = changeDirection(move);
	            	break;
			}
			this.x=x;
			this.y=y;
			this.dir=dir;
		}
	}
	
	public char changeDirection(char move) {
		char dir = 'N';
		switch(this.getDir()) {
			case 'N':
				if (move=='l') {
					dir = 'W';
				} else if (move=='r') {
					dir = 'E';
				}
				break;
			case 'S':
				if (move=='l') {
					dir = 'E';
				} else if (move=='r') {
					dir = 'W';
				}
				break;
			case 'W':
				if (move=='l') {
					dir = 'S';
				} else if (move=='r') {
					dir = 'N';
				}
				break;
			case 'E':
				if (move=='l') {
					dir = 'N';
				} else if (move=='r') {
					dir = 'S';
				}
				break;
			default:
				break;
		}
		return dir;
	}
}
