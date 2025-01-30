import java.util.Arrays;
import java.util.List;

public class UserService {
    public static List<User> getUsers() {
        return Arrays.asList(
                new User(1, "Иван", "Петров", 25, "Россия"),
                new User(2, "Анна", "Иванова", 30, "США"),
                new User(3, "Сергей", "Сидоров", 20, "Германия"),
                new User(4, "Мария", "Кузнецова", 35, "Россия"),
                new User(5, "Павел", "Смирнов", 40, "Франция")
        );
    }
}
