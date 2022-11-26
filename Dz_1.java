import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthScrollPaneUI;

/**
 * program
 */
public class Dz_1 {
    // 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
    public static void main(String[] args){
        int i;
        Random numRan = new Random();
        i = numRan.nextInt(-1000, 1000);
        System.out.println(i);   
    
    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        String binar = Integer.toBinaryString((int) i);
        System.out.println(binar);
        int n = binar.length();                  
        System.out.println(n);

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int sizeM1 = 0;
        int numI = i;
        int numI2 = i;
        int i2 = i;
        for(; numI != Short.MAX_VALUE ;numI++){ // узнали длинну массива
            if (numI %n == 0) 
                sizeM1++;
        }
        
        System.out.println(sizeM1);
        int index = 0;
        int[] m1 = new int[sizeM1];
        for(; i != Short.MAX_VALUE ;i++){
            if (i %n == 0){ 
                m1[index] = i;
                //System.out.print(m1[index]);
                index++;
            }
        }
        
    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        
        int sizeM2 = 0;
        for(; numI2 != Short.MIN_VALUE ;numI2--){
            if (numI2 %n != 0) 
                sizeM2++;
        }
        index = 0;
        int[] m2 = new int[sizeM2];
        for(; i2 != Short.MIN_VALUE ;i2--){
            if (i2 %n != 0){ 
                m2[index] = i2;
                //System.out.print(m2[index]);
                index++;
            }
        }
    }
}