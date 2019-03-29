package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverShould {
	
	@Test
	public void checking_initial_position_rover() {

		Rover rover = new Rover(0,0,'N');
		
		assertEquals(rover.getX(), 0);
		assertEquals(rover.getY(), 0);
		assertEquals(rover.getDir(),'N');
	}
	
	
	@Test
	public void rover_moves_given_some_orders() {
		// given
		Rover rover = new Rover(0,0,'N');
		char[] movement = {'f','f','b','l','b','r','f','b','r','r','f','f','f','r','f'};
		// when
		rover.move(movement);
		// then
		assertEquals(rover.getX(), 0);
		assertEquals(rover.getY(), -2);
		assertEquals(rover.getDir(), 'W');
	}
	
	@Test
	public void checking_direction_calculation() {
		Rover rover = new Rover(0,0,'N');
		
		
		int[] vars = rover.calculateDirection();

		assertEquals(vars[0], 0);
		assertEquals(vars[1], 1);
		
	}
	
	
	public void checking_direction_movement() {
		Rover rover = new Rover(0,0,'N');
		
		char[] movement = {'r'};
		rover.move(movement);
		
		assertEquals(rover.getDir(), 'E');
	}
	
	@Test
	public void checking_direction_change() {
		Rover rover = new Rover(0,0,'N');
		
		char dir = rover.changeDirection('l');
		
		assertEquals(dir, 'W');
	}
	
	
}
