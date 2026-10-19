import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = 15;
        
        System.out.print("Введите количество элементов массива (не более " + maxSize + "): ");
        int size = scanner.nextInt();
        
        // Проверка на максимальное количество элементов
        if (size > maxSize) {
            System.out.println("Ошибка: максимальное количество элементов - " + maxSize);
            return; // Завершаем программу
        }
        if (size <= 0) {
            System.out.println("Ошибка: количество элементов должно быть больше 0.");
            return;
        }

        int[] array = new int[size];
        
        // Ввод элементов
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Вывод элементов
        System.out.println("\nВведенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Перенос строки в конце
        
        scanner.close();
    }
}
