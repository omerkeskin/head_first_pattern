package main;

import behaviour.FlyWithWings;
import behaviour.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
       super.flyBehevior = new FlyWithWings();
       super.quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("This is a Mallard Duck");
	}

}
