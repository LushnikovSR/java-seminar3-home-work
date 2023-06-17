import java.util.*;


public class Main {
    public static void main(String[] args) {
//        Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

        int sizeArray = 15;
        int upperBound = 10;

        ArrayList<Integer> list = new ArrayList<>(sizeArray);
        Random random = new Random();

        for (int i = 0; i < sizeArray; i++) {
            list.add(random.nextInt(upperBound));
        }
        System.out.println(list);

//        Удаляем чётные числа и вычисляем сумму оставшихся
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i % 2 == 0) iterator.remove();
            else sum += i;
        }
        System.out.println("Без чётных чисел: " + list);

//        Сортируем массив
        Collections.sort(list);
        System.out.println("Отсортированный:  " + list);

//        Выводим значения в консоль
        System.out.println("Минимальное значение: " + list.get(0));
        System.out.println("Максимальное значение: " + list.get(list.size()-1));
        System.out.println("Среднее значение: " + (float) sum/list.size());
    }
}
