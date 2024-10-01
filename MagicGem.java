public class MagicGem extends Skill{

    private String element;

    public MagicGem(String s, String e, int l,int d){
        super(d, s,l);

    }

    public String getElement(){
        return element;
    }
}