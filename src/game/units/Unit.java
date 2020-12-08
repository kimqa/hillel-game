package game.units;

import game.market.Characteristics;
import game.market.Inventory;

import java.util.List;
import java.util.Random;

public abstract class Unit {

    int level;

    double healthLevel;

    double attack;

    double armor;

    double creatProbability;

    double creatAttackCoefficient;

    private List<Inventory> inventoryList;


    public double hit(Unit enemy) {

        double baseAttackDamage = (1- enemy.armor) *attack;
        double c = (new Random().nextInt(100) <=creatProbability) ? creatAttackCoefficient : 1;

        return (baseAttackDamage * c);
    }

    public void addInventory(Inventory inventory) {
        inventoryList.add(inventory);
    }

    public double getHealthLevel() {
        double healthChange = 0;

        for(Inventory inventory : inventoryList) {
            if(inventory.getCharacteristics() == Characteristics.HEALTH_LEVEL_INCREASE) {
                healthChange += inventory.getValue();
            }
        }
        return healthLevel + healthChange;
    }
}