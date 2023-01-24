public class Main {
    public static void main(String[] args) {
        //task 1.1, 1.2
        int age = 5;
        if (age>=18) {
            System.out.println("Ты совершеннолетний!" + "\n");
        }
        else System.out.println("Ты не совершеннолетний!" + "\n");

        //task 2.1, 2.2
        int ageChildren = 20;
        if (ageChildren >= 7 && ageChildren < 18) {
            System.out.println("Ребенок ходит в школу" + "\n");
        } else if (ageChildren >= 18 && ageChildren < 24) {
            System.out.println("Ребенок ходит в университет" + "\n");
        } else if (ageChildren >= 24) {
            System.out.println("Ребенок eже работает" + "\n");
        }

        //task 3.1, 3.2
        int allPeople = 102;
        int sits = 60;
        int people = 105;
        if (people<allPeople && people<=sits) {
            System.out.println("Занято " + people + " сидячих мест" + "\n");
        } else if (people<allPeople && people > sits) {
            System.out.println("Все сидячие места заняты, осталось " + (allPeople - people) + " стоячих мест" + "\n");
        } else if (people>=allPeople) {
            System.out.println("Автобус полностью заполнен! " + (people - allPeople) + " нужно подождать следующий автобус" + "\n");
        }

        //task 1.3
        int agePeople = 6;
        if (agePeople>=2 && agePeople<=6) {
            System.out.println("Нужно ходить в детский сад");
        } else if (agePeople >= 7 && agePeople <= 18) {
            System.out.println("Нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Нужно ходить в универ");
        } else if (agePeople > 24) {
            System.out.println("Пора идти работать!");
        }

        //task 2.3
        if (agePeople<5) {
            System.out.println("Не может кататься на аттракционе");
        } else if (agePeople >=5 && agePeople<14) {
            System.out.println("Может кататься на аттракционе в сопровождении взрослых");
        } else if (agePeople >=14) {
            System.out.println("Может кататься на аттракционе сам");
        }


        //task 3.3
        int one = 0;
        int two = 0;
        int three = 0;
        if (one >= two && one >= three) {
            System.out.println("one");
        }
        else if (two >= one && two >= three) {
            System.out.println("two");
        } else if (three >= one && three >= two) {
            System.out.println("three");
        }

    }
}