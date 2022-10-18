public class lesson3 {
    public static void main(String[] args) {
//one task
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

//two task
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

//three task
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

//four task
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

//five task
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

//six task
        var oneFighter = 78.2;
        var twoFighter = 82.7;
        var weightAthletes = oneFighter + twoFighter;
        System.out.println("Вес спортсменов " + weightAthletes + " kg");

// seven task
        var differenceWeight= (twoFighter - oneFighter);
        System.out.println("Разница " + differenceWeight + " кг");
        var differenceWeight1 = (twoFighter % oneFighter);
        System.out.println(differenceWeight1);

 // eight task
        var time = 640;
        var numbersWorkers = (time / 8);
        System.out.println("Число рабочих "  + numbersWorkers + " человек");

        var workers = (numbersWorkers+94);
        var workTime = (time/workers);
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workTime + " часа работы может быть проделано между сотрудниками");
    }
}