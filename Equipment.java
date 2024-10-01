public class Equipment {
    private String name;
    private String type; 
    /**
     * HEADGEAR
     * CHEST
     * GLOVES
     * LEGGINGS
     * OTHER
     * OTHER
     */
    private int level;

    public Equipment(String n, String t, int l ){
        name = n;
        type = t;
        level = l;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getLevel(){
        return level;
    }
}
