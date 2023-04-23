abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;
    String name;

    public Hero(String name) {
        this.name = name;
    }

    public void applySuperAbility() {
        System.out.println(name + " применил суперспособность " + superAbilityType);
    }
}

