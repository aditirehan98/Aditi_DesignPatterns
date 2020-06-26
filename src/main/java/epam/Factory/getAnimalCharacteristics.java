package epam.Factory;
import java.io.IOException;
import java.util.*;
public class getAnimalCharacteristics {
    public static void main(String args[])throws IOException {
        getAnimalCharacteristicsFactory animalFactory = new getAnimalCharacteristicsFactory();
        Scanner sc=new Scanner(System.in);
        System.out.print("out of elephant , dog and cat choose one\nEnter the name of animal whose characteristics you want:");
        String animalName=sc.next();
        Animal p = animalFactory.getAnimal(animalName);
        System.out.println(animalName+" is a "+p.getFoodType()+" ,it is "+p.getSize()+" in size and it "+p.getSound());
    }
}
