package game.units;

import game.market.Characteristics;
import game.market.Inventory;

import java.util.List;

public abstract class Unit {

    int level;

    double healthLevel;

    double attack;

    double armor;

    double creatProbability;

    private List<Inventory> inventoryList;

    public abstract void fight(Unit unit);

    public abstract void physicalAttack(Unit unit);

    public abstract void magicalAttack(Unit unit);

    public abstract void freezeAttack(Unit unit);

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