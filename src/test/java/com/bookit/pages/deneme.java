package com.bookit.pages;

public class deneme {

    public static void main(String[] args) {





            int[] A = {2, 3, 2, 4, 3, 5, 1, 5, 1, 8, 8, 7, 22, 7, 22};

            int sonuc = -1;


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    if (A[i] == A[j]) {

                        break;
                    } else {
                        sonuc = A[i];
                        System.out.println(sonuc);
                    }
                }
                break;
            }    }

        }


    }






