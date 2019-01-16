package main;

import behaviour.FlyBehevior;
import behaviour.QuackBehaviour;

public abstract class  Duck {

	FlyBehevior flyBehevior;
	QuackBehaviour quackBehaviour;


	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehevior.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float , even decoys");
	}

	public void setFlyBehevior(FlyBehevior flyBehevior) {
		this.flyBehevior = flyBehevior;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	

}
