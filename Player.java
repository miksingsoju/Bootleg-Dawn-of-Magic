import java.math.*;

public class Player {
    private Equipment[] equipments;

    private int exp;
    private int level;

    private String name;
    private String type;
    /**
     * Can be a Warrior - High Def, Mid Atk, Low Wis
     * Can be a Mage - Low Def, Low Atk, Super High Wis
     * Can be a Rogue - Low Def, High Atk, Mid Wis
     */

    private int gold;
    private int atk, con, def, dex, wis, str;

    public Player(String n, String t){
        equipments = new Equipment[6];
        exp = 0;
        level = 0;
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getStat(String stat){
        int s = 0;
        switch(stat){
            case "atk":
            s = atk;
            break;

            case "con":
            s = con;

            break;

            case "def":
            s = def;

            break;

            case "dex":
            s = dex;

            break;

            case "wis":
            s = wis;

            break;

            case "str":
            s = str;
            break;
        }
        return s;
    }

    public void gainExp(int x){
        exp += x;
        
        double levelThreshold = Math.pow(level, 2)* (100 * level); 
        if (exp >= levelThreshold){
            levelUp();
        }
    }

    private void levelUp(){
        level += 1;
        System.out.println("You have leveled up!");
        System.out.println("You are now: Level " + level );
        

    }

    public void equipItem(Equipment e){
        if (level >= e.getLevel()){
        switch(e.getType()){
            case "HEAD":
            equipments[0] = e;
            break;

            case "CHEST":
            equipments[1] = e;

            break;

            case "GLOVES":
            equipments[2] = e;

            break;

            case "LEGGINGS":
            equipments[3] = e;
            break;

            default:
            if (equipments[4] == null)
                equipments[4] = e;
            else
                equipments[5] = e;

            break;
        }
    }
    else {
        System.out.print("Your level is too low for " + e.getName());
        System.out.print("Required level for " + e.getName() + " is Level " + e.getLevel());

    }
    }
}
