package main;

import behaviour.FlyRockedPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
        
        
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehevior(new FlyRockedPowered());
        modelDuck.performFly();
	}

}
