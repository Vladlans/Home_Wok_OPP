package Home_Wok_OPP.Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    protected int arrowQty;

    public Shooter(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, float health, int arrowQty) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
        this.arrowQty = arrowQty;
    }
}