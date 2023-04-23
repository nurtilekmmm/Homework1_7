public class Main {
    public static void main(String[] args) {
        Hero Magic = new Hero("Magic") {
            @Override
            public void applySuperAbility() {
                health = 100;
                damage = 20;
                superAbilityType = "MAGIC ATTACK";
                super.applySuperAbility();
            }
        };
        Hero Medic = new Hero("Medic") {
            @Override
            public void applySuperAbility() {
                health = 150;
                damage = 0;
                superAbilityType = "HEALING";
                super.applySuperAbility();
            }
        };

        Hero Warrior = new Hero("Warrior") {
            @Override
            public void applySuperAbility() {
                health = 200;
                damage = 15;
                superAbilityType = "CRITICAL DAMAGE";
                super.applySuperAbility();
            }
        };

        Hero[] heroes = {Magic, Medic, Warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}