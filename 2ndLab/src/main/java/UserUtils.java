import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class UserUtils {

    // 1. Сортировка по lastName (фамилии)
    public static void sortByLastName(List<User> users) {
        users.stream()
                .sorted(Comparator.comparing(User::getLastName)) // Сортируем по фамилии
                .forEach(System.out::println); // Выводим в консоль
    }

    // 2. Сортировка по возрасту
    public static void sortByAge(List<User> users) {
        users.stream()
                .sorted(Comparator.comparingInt(User::getAge)) // Сортируем по возрасту
                .forEach(System.out::println);
    }

    // 3. Проверяем, что все пользователи старше 7 лет
    public static boolean isAllOlderThan7(List<User> users) {
        return users.stream().allMatch(user -> user.getAge() > 7);
    }

    // 4. Вычисляем средний возраст всех пользователей
    public static double getAverageAge(List<User> users) {
        OptionalDouble average = users.stream()
                .mapToInt(User::getAge) // Преобразуем в int
                .average(); // Вычисляем среднее значение

        return average.orElse(0); // Если нет пользователей, возвращаем 0
    }

    // 5. Подсчёт уникальных стран (country)
    public static long getUniqueCountryCount(List<User> users) {
        Set<String> uniqueCountries = users.stream()
                .map(User::getCountry) // Получаем список стран
                .collect(Collectors.toSet()); // Преобразуем в уникальный Set

        return uniqueCountries.size(); // Возвращаем количество уникальных стран
    }
}
