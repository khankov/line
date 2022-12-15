public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String fullname = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullname.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задание 3");
        String fullname = "Иванов Семён Семёнович";
        fullname = fullname.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullname);

    }
}