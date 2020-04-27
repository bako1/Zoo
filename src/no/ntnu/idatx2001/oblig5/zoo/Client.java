package no.ntnu.idatx2001.oblig5.zoo;

import java.time.LocalDate;

public class Client  {

  private static WildAnimalFactory wildAnimalFactory = WildAnimalFactory
          .getWildAnimalFactory();

  public static void main(String[] args)
  {
    ScandinavianWildAnimal femaleWolf = wildAnimalFactory
            .newFemaleWolf(LocalDate.of(2015,4,29), "Ulla",
            LocalDate.of(2015,2,26),
                    "Innhegning 2, Skandinaviske rovdyr", 0);
    ScandinavianWildAnimal maleWolf = wildAnimalFactory
            .newFemaleWolf(LocalDate.of(2015,4,29), "Ulla",
                    LocalDate.of(2005,2,26),
                    "Innhegning 8, Skandinaviske rovdyr", 0);

    ScandinavianWildAnimal maleBear = wildAnimalFactory
            .newMaleBear(LocalDate.of(2015,4,29), "hannBjørn",
                    LocalDate.of(2010,2,26),
                    "Innhegning 12, Skandinaviske rovdyr");

    ScandinavianWildAnimal femaleBear = wildAnimalFactory
            .newMaleBear(LocalDate.of(2008,8,29), "hunnBjørn",
                    LocalDate.of(2010,2,26),
                    "Innhegning 12, Skandinaviske rovdyr");





    System.out.println(femaleWolf.getAddress());
    System.out.println(femaleWolf.getAge());

    System.out.println(maleWolf.getAddress());
    System.out.println(maleWolf.getAge());

    System.out.println(maleBear.getAddress());
    System.out.println(femaleBear.getAge());




  }
}
