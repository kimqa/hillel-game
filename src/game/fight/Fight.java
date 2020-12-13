package game.fight;

import game.units.Knight;
import game.units.Unit;

import java.util.Random;

public class Fight {

    private Unit player;

    private Unit enemy;

//    private List<Unit> teamPlayers;
//
//    private  List<Unit> teamEnemy;

    private Random random = new Random();

//    public void attack() {
//
//        for(Unit unit : teamPlayers) {
//            Stream<Unit> stream = teamPlayers.stream();
//        }
//    }
    Knight knight1 = new Knight(1);
    Knight knight2 = new Knight(1);

    public void fight() {
        System.out.println("Start");

        knight1.hit(knight2);

        System.out.println(knight2.toString());
    }


}
