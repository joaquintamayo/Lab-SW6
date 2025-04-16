public class Horse implements Animal {
    private int legs = 4;
    private String sound = "Neigh!";
    private String food = "Oats";
    private String color;

    public Horse(String color) {
        setColor(color);
        System.out.println("Creating a Horse prototype.");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        // Use getter to access the sound
        System.out.println("A Horse says: " + getSound());
    }

    @Override
    public String getType() {
        return "Horse";
    }
}