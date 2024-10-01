public abstract class Skill {
    protected int dmg;
    protected String name;
    protected int level;
    protected int cost;
    
    public Skill(int d, String n, int l){
        dmg = d;
        name = n;
        level = l;
    }

    public int getDMG(){
        return dmg;
    }
    
    public String getName(){
        return name;
    }

    public int getLvl(){
        return level;
    }

    public int getCost(){
        return level * 20;
    }
}
