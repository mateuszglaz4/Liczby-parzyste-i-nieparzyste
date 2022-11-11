package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a > 0){
            if (a % 2 ==0){
                parzyste++;
            }
            else if (a % 2 != 0){
                nieparzyste++;
            }
            a = a/10;

        }
        System.out.println("Parzyste: " + parzyste +" " + "Nieparzyste: " + nieparzyste );



    }
}
