public class Sheep implements Animal {
    private int legs = 4;
    private String sound = "Baa!";
    private String food = "Grass";
    private String name;

    public Sheep(String name) {
        setName(name);
        System.out.println("Creating a Sheep prototype.");
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound());
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}