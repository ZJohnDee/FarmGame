package de.cg.fg.enums;

public enum ItemType {

    NONE(0), WHEAT(5), CORN(10), FLOUR(15);

    private int baseValue = 0;

    ItemType(int baseValue) {
        this.baseValue = baseValue;
    }

    public int getBaseValue() {
        return baseValue;
    }
}
