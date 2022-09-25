package javaCoreHW1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5)); // Создаем полосу
        // препятствий
        Team team = new Team("Heroes", new Human("Tony"), new Cat("Conor"), new Dog("Habib"));
        // Создаем команду
        c.doIt(team); // Просим команду пройти полосу

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");// Показываем результаты
        team.showResults();
    }
}
