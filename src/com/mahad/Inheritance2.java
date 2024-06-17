package com.mahad;

/**
 * This program demonstrates a hero-villain game scenario using inheritance and enums.
 * It defines classes for Character, Hero, and Villain, each with specific attributes
 * and methods to introduce themselves, use their powers, and perform heroic or villainous actions.
 * Power enum defines various superpowers characters can possess.
 *
 * @author Mahad Khan
 * @version 1.0
 * @since 25/03/2024
 */

// Enum for different superpowers a character can have
enum Power {
    FLIGHT, STRENGTH, SPEED, TELEPORTATION, ONE_PUNCH
}

/**
 * Represents a generic character with a name, age, and power.
 */
class Character {
    private String name;
    private int age;
    private Power power;

    /**
     * Constructor to initialize Character attributes.
     *
     * @param name  The name of the character.
     * @param age   The age of the character.
     * @param power The superpower of the character.
     */
    public Character(String name, int age, Power power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    /**
     * Returns the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the superpower of the character.
     *
     * @return The superpower of the character.
     */
    public Power getPower() {
        return power;
    }

    /**
     * Introduces the character with their name, age, and superpower.
     *
     * @return A string introducing the character.
     */
    public String introduce() {
        return "Hi, my name is " + name + ". I am " + age + " years old and my super power is " + power + ".";
    }

    /**
     * Uses the character's superpower.
     *
     * @return A string indicating the use of the superpower.
     */
    public String usePower() {
        return "I use " + power + " on you!";
    }
}

/**
 * Represents a hero character, extending Character with additional attributes and methods.
 */
class Hero extends Character {
    private String secretIdentity;
    private int powerLevel;

    /**
     * Constructor to initialize Hero attributes.
     *
     * @param name           The name of the hero.
     * @param age            The age of the hero.
     * @param power          The superpower of the hero.
     * @param secretIdentity The secret identity of the hero.
     * @param powerLevel     The power level of the hero.
     */
    public Hero(String name, int age, Power power, String secretIdentity, int powerLevel) {
        super(name, age, power);
        this.secretIdentity = secretIdentity;
        this.powerLevel = powerLevel;
    }

    /**
     * Saves the day using the hero's superpower.
     *
     * @return A string indicating the hero saving the day.
     */
    public String saveTheDay() {
        return getName() + " as " + secretIdentity + " has saved the day, using " + getPower() + "!";
    }
}

/**
 * Represents a villain character, extending Character with additional attributes and methods.
 */
class Villain extends Character {
    private String evilPlan;
    private String weakness;

    /**
     * Constructor to initialize Villain attributes.
     *
     * @param name      The name of the villain.
     * @param age       The age of the villain.
     * @param power     The superpower of the villain.
     * @param evilPlan  The evil plan of the villain.
     * @param weakness  The weakness of the villain.
     */
    public Villain(String name, int age, Power power, String evilPlan, String weakness) {
        super(name, age, power);
        this.evilPlan = evilPlan;
        this.weakness = weakness;
    }

    /**
     * Executes the villain's evil plan using their superpower and exploiting their weakness.
     *
     * @return A string indicating the execution of the evil plan.
     */
    public String executeEvilPlan() {
        return getName() + " executes evil plan: " + evilPlan + " using " + getPower() +
                ", knowing his weakness is " + weakness + "!";
    }
}

/**
 * Main class to demonstrate the hero-villain scenario.
 */
public class Inheritance2 {

    /**
     * Main method to create instances of Hero and Villain, and demonstrate their actions.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a hero instance
        Hero hero = new Hero("Captain Courage", 30, Power.FLIGHT, "Adam Armstrong", 50);

        // Create a villain instance
        Villain villain = new Villain("Dr. Dread", 45, Power.TELEPORTATION, "Conquer the world", "Fire");

        // Display hero's introduction, power usage, and saving the day
        System.out.println(hero.introduce());
        System.out.println(hero.usePower());
        System.out.println(hero.saveTheDay());

        // Display villain's introduction, power usage, and executing evil plan
        System.out.println(villain.introduce());
        System.out.println(villain.usePower());
        System.out.println(villain.executeEvilPlan());
    }
}
