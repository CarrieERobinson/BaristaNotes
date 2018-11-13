package edu.ilstu.cerobi1.baristanotesv2;

public class Item {
    private String name;
    private String[] instructions;

    public Item(String name, String[] instructions) {
        this.name = name;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }
}
