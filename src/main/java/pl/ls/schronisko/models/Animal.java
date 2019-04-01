package pl.ls.schronisko.models;

public class Animal {
    private int id;
    private String name;
    private String species;
    private String description;

    public Animal() {
    }

    public Animal(String name, String species, String description) {
        this.name = name;
        this.species = species;
        this.description = description;

        }

    public Animal(int id, String name, String species, String description) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
