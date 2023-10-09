public class Pesce {
    private String specie;
    private int id;

    public Pesce(String specie, int id){
        this.id = id;
        this.specie = specie;
    }

    public String getSpecie(){
        return this.specie;
    }

    public void setSpecie(String specie){
        this.specie = specie;
    }

    public Pesce clone (){
        return new Pesce(this.specie, this.id);
    }

    public String toString(){
        String rit = "{";
        rit += "specie: "  + this.specie;
        rit += ", id: " + this.id +"}";
        return rit;
    }
}
