package com.spikes2212.oi;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboXUID extends Joystick {

	public XboXUID(int port) {
		super(port);
	}

	public Button getGreenButton() {
		return new JoystickButton(this, 2);
	}

	public Button getBlueButton() {
		return new JoystickButton(this, 1);
	}

	public Button getRedButton() {
		return new JoystickButton(this, 3);
	}

	public Button getYellowButton() {
		return new JoystickButton(this, 4);
	}

	public boolean getRawYellowButton() {
		return this.getRawButton(4);
	}

	public boolean getRawBlueButton() {
		return this.getRawButton(1);
	}

	public boolean getRawRedButton() {
		return this.getRawButton(3);
	}

	public boolean getRawGreenButton() {
		return this.getRawButton(2);
	}

	public Button getRtButton() {
		return new JoystickButton(this, 8);
	}

	public Button getRbButton() {
		return new JoystickButton(this, 6);
	}

	public Button getLtButton() {
		return new JoystickButton(this, 7);
	}

	public Button getLbButton() {
		return new JoystickButton(this, 5);
	}

	public boolean getRawRtButton() {
		return this.getRawButton(8);
	}

	public boolean getRawRbButton() {
		return this.getRawButton(6);
	}

	public boolean getRawLtButton() {
		return this.getRawButton(7);
	}

	public boolean getRawLbButton() {
		return this.getRawButton(5);
	}

	public Button getxButton() {
		return new JoystickButton(this, 0);
	}

}
