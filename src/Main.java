import java.util.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Барсик", 3);
        Animal anotherAnimal = new Animal("Яшка", 2);

        if (animal.compareTo(anotherAnimal) > 0) {
            System.out.println(animal + " моложе");
        }

//        ArrayList<Animal> myList = new ArrayList<>();
//        myList.add(animal);
//        myList.add(anotherAnimal);
//        System.out.println(myList);
//        Collections.sort(myList, new AnimalAgeComparator());
//        System.out.println(myList);


//        Cat zeroCat = new Cat("Бобик", 7);
//
//        Animal firstCat = new Cat("Пушок", 3);
//        Animal secondCat = new Cat("Васька", 5);
//
//        Item firstItem = new Item("Мыло");
//        Item secondItem = new Item("Вода");

//        Set<Animal> mySet = new HashSet<>();
//        mySet.add(animal);
//        mySet.add(zeroCat);
//        mySet.add(firstCat);
//
//        Iterator<Animal> iterator = mySet.iterator();
//        while (iterator.hasNext()) {
//            Animal next = iterator.next();
//            System.out.println(next);
//        }


    }
}
