package game.fight;

import game.units.Unit;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Fight {

    private Unit player;

    private Unit enemy;

    private List<Unit> teamPlayers;

    private  List<Unit> teamEnemy;

    private Random random = new Random();

    public void attack() {

        for(Unit unit : teamPlayers) {
            Stream<Unit> stream = teamPlayers.stream();
        }
    }

}
