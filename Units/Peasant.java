package Home_Wok_OPP.Units;

import java.util.ArrayList;

public class Peasant extends Infantry {

    public Peasant(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 1, 1, new int[] { 1, 1 }, 1, 3, x, y, 1, gangSize, 1);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> homeTeam) {
        return;
    }
}