//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
package Task_2;

import java.util.Random;

public class Task {
 public static void main(String[] args) {
 getFilledArray(10);
 getFilledArray(9);
    }

 public static int[] divArrays(int[] firstArray, int[] secondArray) {
 if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!!!");
 int[] resultArr = new int[firstArray.length];
 for (int i = 0; i < resultArr.length; i++) {
 resultArr[i] = firstArray[i] - secondArray[i];
        }
 return resultArr;
    }

 public static int[] getFilledArray(int length){
 int[] array = new int[length];
 Random rnd = new Random();
 for (int i = 0; i < length; i++) {
 array[i] = rnd.nextInt(20);
        }
 return array;
    }
}
