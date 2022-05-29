import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();

        Cat cat1 = new Cat("にゃにゃ", "ハチワレ", 19);
        Cat cat2 = new Cat("くろ", "ハチワレ", 10);
        Cat cat3 = new Cat("みかん", "キジトラ", 25);
        Cat cat4 = new Cat("みけさん", "ミケ", 15);

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);

        for (Cat cat : catList) {
            if (cat.getBreed().equals("ハチワレ")) {
                System.out.println("猫の名前は" + cat.getName() + "です。");
                System.out.println("模様: " + cat.getBreed());
                System.out.println("年齢: " + cat.getAge());
            }
        }


        cat3.setAge(30);

        System.out.println(cat3.getName() + "は本当は " + cat3.getAge() + "歳でした。");

    }

}
