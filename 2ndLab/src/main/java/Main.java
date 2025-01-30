import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Получаем список пользователей
        List<User> users = UserService.getUsers();

        System.out.println("📌 Сортировка по фамилии:");
        UserUtils.sortByLastName(users);

        System.out.println("\n📌 Сортировка по возрасту:");
        UserUtils.sortByAge(users);

        System.out.println("\n📌 Все пользователи старше 7 лет?");
        System.out.println(UserUtils.isAllOlderThan7(users));

        System.out.println("\n📌 Средний возраст пользователей:");
        System.out.println(UserUtils.getAverageAge(users));

        System.out.println("\n📌 Количество уникальных стран:");
        System.out.println(UserUtils.getUniqueCountryCount(users));
    }
}
