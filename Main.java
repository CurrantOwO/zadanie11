import java.util.Random;

class Main {
  public static void main(String[] args) {
    int z = 0, d =1;
    int[][] mas = new int[8][8];
    System.out.println("\nЗадание №1. Заполнить матрицу 8х8 числами 0 и 1 ввиде шахматной доски:\n");
    for (int i = 0; i < 8; i++){ //Вывод матрицы 8x8
      for (int l = 0; l < 8; l++){
        if(l % 2 != 0){mas[i][l] = z;}
        else{ mas[i][l] = d; }
        System.out.print(mas[i][l] + "\t");
      }
      if(i % 2 != 0){z = 0; d = 1;}
      else{z = 1; d =0;}
        System.out.println();
    }

    int[][] mas2 = new int[10][10];
    Random ran = new Random();
    System.out.println("\nЗадание №2. Присвоению массиву случайных чисел:\n");
    for(int i = 0; i < 10; i++){
      for(int l = 0; l < 10; l++){
        mas2[i][l] = ran.nextInt(99) + 1;
        System.out.print(mas2[i][l] + "\t");
      }
      System.out.println();
    }

    System.out.println("\nЗадание №3. Вычисление суммы каждой строки:\n");
    z = 1;
    for(int i = 0; i < 10; i++){
      int sum = 0;
      for (int l = 0; l < 10; l++){ sum += mas2[i][l]; }
        System.out.println("Сумма " + z + " строки равна - " + sum);
        z++;
    }

    System.out.println("\nЗадание №4. Найти в массиве простые числа и вывести их:\n");
    for(int i = 0; i < 10; i++){
      int t = i + 1;
      System.out.print("В строке "+ t + " были найдены такие простые числа:  ");
      for(int l = 0; l < 10; l++){
        d = 1;
        int k = mas2[i][l];
        for(int y = 1; y < k; y++){if(k % y == 0){d++;}}
        if(d == 2){ System.out.print( k + " "); }
      }
      System.out.println();
    }

  }
}