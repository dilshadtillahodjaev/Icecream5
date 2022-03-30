package be.intecbrussel.applications;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamApp {

    public static void main(String[] args) {

        Cone cone = new Cone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.MINT})
        Eatable [] eatables =  { new IceRocket(), new Magnum(Magnum.MagnumType.MILKCHOCOLATE), cone};

        for (Eatable eatable : eatables) {
            eatable.eat();

        }
    }
}
