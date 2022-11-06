import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            // todo: обрабатываем пункт меню 2
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.useDelimiter("\n").next();
        System.out.println(taskName);
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.useDelimiter("\n").next();
        System.out.println(taskDescription);
        System.out.print("Выберите тип задачи : \n" +
                "1. Личная задача \n" +
                "2. Рабочая задача \n" +
                "Выберите тип задачи : ");
        String typeTask = scanner.useDelimiter("\n").next();
        System.out.println(typeTask);
        System.out.print("Выберите периодичность задачи: \n" +
                "1. Однократная \n" +
                "2. Ежедневная \n" +
                "3. Еженедельная \n" +
                "4. Ежемесячная \n" +
                "5. Ежегодная \n" +
                "Выберите периодичность задачи: ");
        String repetitionTask = scanner.useDelimiter("\n").next();
        System.out.println(repetitionTask);
    }

    private static void printMenu() {
        System.out.print(
                " 1. Добавить задачу \n" +
                        " 2. Удалить задачу \n" +
                        " 3. Получить задачу на указанный день \n" +
                        " 0. Выход \n"

        );
    }

}