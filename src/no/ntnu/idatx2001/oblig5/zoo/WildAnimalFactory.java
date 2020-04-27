package no.ntnu.idatx2001.oblig5.zoo;

import java.time.LocalDate;

public class WildAnimalFactory {
    private static WildAnimalFactory wildAnimalFactory;


    private WildAnimalFactory() {

    }
    /**
     * Creates an instance of male bear
     *
     * @param arrivalDate date of arrival to the Zoo
     * @param address     the address of the animal
     * @param name        the name of the individual
     * @param dateOfBirth date of birth
     */

    public ScandinavianWildAnimal newMaleBear(LocalDate arrivalDate,
                                              String name,
                                              LocalDate dateOfBirth,
                                              String address) {
        return new MaleIndividual("Bjørn",
                "Ursus arctos",
                "Ursidae",
                arrivalDate,
                name,
                dateOfBirth,
                true,
                address);
    }

    /**
     * Creates an instance of female wolf
     *
     * @param arrivalDate date of arrival to the Zoo
     * @param address     the address of the animal
     * @param name        the name of the individual
     * @param dateOfBirth date of birth
     */
    public ScandinavianWildAnimal newFemaleWolf(LocalDate arrivalDate,
                                                String name,
                                                LocalDate dateOfBirth,
                                                String address,
                                                int noLitters) {
        return new FemaleIndividual("Ulv",
                "Canis lupus ",
                " Canidae",
                arrivalDate,
                name,
                dateOfBirth,
                true,
                address,
                noLitters);
    }

    /**
     * Creates an instance of male wolf
     *
     * @param arrivalDate date of arrival to the Zoo
     * @param address     the address of the animal
     * @param name        the name of the individual
     * @param dateOfBirth date of birth
     */
    public ScandinavianWildAnimal newMaleWolf(LocalDate arrivalDate,
                                              String name,
                                              LocalDate dateOfBirth,
                                              String address) {
        return new MaleIndividual("Ulv",
                "Canis lupus",
                " Canidae",
                arrivalDate,
                name,
                dateOfBirth,
                true,
                address);
    }


    /**
     * Creates a WildAnimalFactory if it does not exist.
     * @return returns  WildAnimalFactory
     */
    public static  WildAnimalFactory getWildAnimalFactory() {
        if(wildAnimalFactory == null) {
            wildAnimalFactory = new WildAnimalFactory();
        }
        return wildAnimalFactory;
    }


}
