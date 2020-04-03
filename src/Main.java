public class Main {
    //Отобразить простые числа от 2 до 100
    public static void main(String[] args) {
        for (byte i = 2; i < 101; i++) {
            byte temp = 0;
            for (byte j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    temp++;
                }
            }
            if (temp < 2) {
                System.out.println("Число " + i + " простое");
            }

        //Удалить элементы массива, которые совпали с числом "2"
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 2, 10};
        System.out.println("Данн массив (требуется удалить 2-ки):");
        for (int g=0; g<array.length; g++) {
            System.out.println(array[g]);
        }
        int temp = 2;
        int index = 0;
        // Подсчитаем сколько раз встретилось число "2"
        for (int i = 0; i<array.length; i++) {
            if (array[i]==temp) {
                index++;
            }
        }
        int[] array2 = new int[array.length-index];
       //переставим элементы массима, убрав 2-ки в конец.
        int index2 = 0;
        int temp2 = 0;
                for (int i=0; i<array.length; i++) {
            if (array[i]==temp) {
                index2++;
                for (int j = i; j<(array.length-index2); j++) {
                    temp2=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp2;
                }
            }
        }
        //Скоппируем массив без 2-к
        System.arraycopy(array, 0, array2, 0, array2.length);
        System.out.println("Готовый результат:");
        for (int g=0; g<array2.length; g++) {
                System.out.println(array2[g]);
        }
    }
}
