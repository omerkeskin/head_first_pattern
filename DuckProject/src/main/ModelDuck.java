package main;

import behaviour.FlyNoWay;
import behaviour.Quack;

public class ModelDuck extends Duck{
	
	

	public ModelDuck() {
      flyBehevior = new FlyNoWay();
      quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("This is Model Duck.");
	}

}
