public class Planet {
    private String name;
    private int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String explode(){
        //return "Boom! "+name+ " has exploded!";
        return String.format("Boom! %s has Exploded!", this.name);
    }
}

