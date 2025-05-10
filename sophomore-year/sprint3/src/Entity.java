public abstract class Entity {
    protected String name;

    public Entity(String name) {
      this.name = name;
    }

    // Getter
    public String getName() {
      return name;
    }

    // Setter
    public void setName(String name) {
      this.name = name;
    }

    // Método comum que poderá ser sobrescrito (polimorfismo dinâmico)
    public void showInfo() {
      System.out.println("Entity name: " + name);
    }
  }
