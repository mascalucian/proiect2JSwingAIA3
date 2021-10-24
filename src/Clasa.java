public class Clasa {
    private String clasa;
    private final String LITERA;
    private final String SPECIALIZARE;
    private String nrelevi;
    private int index;

    public Clasa(String clasa,String LITERA,String SPECIALIZARE,Integer nrelevi){
        this.clasa=clasa;
        this.LITERA=LITERA;
        this.SPECIALIZARE=SPECIALIZARE;
        this.nrelevi=nrelevi.toString();
    }

    public String getClasa(){
        return clasa;
    }
    public String getLitera(){
        return LITERA;
    }
    public String getSpecializare(){
        return SPECIALIZARE;
    }
    public String getNrelevi(){
        return nrelevi;
    }

}
