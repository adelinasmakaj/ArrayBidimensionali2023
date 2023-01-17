import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*

        trim    I         II        III
                a1        a2        a3
                b0  1         5          7
                b1  8         9         10
     */
        // METODO 1 dichiarazione Array bidisimensionale
        int[][] dati = new int[][]{
                new int[]{1, 5, 7}, // <--- inserisco  la virgola
                new int[]{8, 9, 10}
        };
        // METODO 2 dichiarazione Array bidisimensionale
        int[][] arrayDati = {
                {1, 5, 7},
                {8, 9, 10}
        };
        // METODO 3 dichiarazione Array bidisimensionale
        int[][] arrayDatis = new int[][]{

                //trim    I   II   III
                new int[]{120, 125, 180, 140}, // 2022 incassi
                {178, 180, 141, 135}, // 2021 incassi
                {149, 178, 134, 130}  // 2020 incassi
        };

        // ciclo for esterno per iterare un array bidimensionale
        //bisogna usare un secondo for: uno interno e uno esterno
        //esterno righe
        //interno colone
        for (int i = 0; i < arrayDatis.length; i++) {
            for (int j = 0; j < arrayDatis[i].length; j++) {
                System.out.print(arrayDatis[i][j] + "\t ");
            }
            System.out.println();
        }
        System.out.println("********* itero con for-each ***************");
        for (int[] righe : arrayDatis) {
            System.out.println();
            for (int colonne : righe) {
             //   System.out.print(colonne + "\t ");

            }


            //usando l'array ArrayDati per sommare i valori
            System.out.println();
            System.out.println("Stampa valore incassato per anno: ");
            int anno = 2020;
            int somma = 0;

            for (int riga = 0; riga < arrayDatis.length; riga++) {
                for (int colonna = 0; colonna < arrayDatis[riga].length; colonna++) {
                    //calcolo totale per ogni riga
                    somma = somma + arrayDatis[riga][colonna];

                }

            System.out.println("Anno" + anno + "] = " + somma);
            somma = 0; // rimetto a zero variabile per riutilizzarla nei cicli successivi
            anno++;
        }
            //somma per trimestri (sommo i valori delle colonne)
            System.out.println("totale trimestri: €");
            for (int riga = 0; riga < arrayDatis[0].length; riga++){
                for (int colonna = 0; colonna < arrayDatis[riga].length; colonna--) {
                    somma = somma + arrayDatis[riga][colonna];
                }
        } System.out.println("Anno" + anno + "] = " + somma);
            somma = 0; // rimetto a zero variabile per riutilizzarla nei cicli successivi
            anno++;
    }
}}
