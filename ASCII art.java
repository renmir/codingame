import java.util.*;

import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine().toUpperCase();
        String [][] word = new String[27][H];
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for (int j = 0; j < 27; j++){
                word[j][i] = ROW.substring(j * L, (j+1) * L);
            }
        }

        char alph[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '?'};

        for (int i = 0; i < H; i++){
            int x = 26;
            for (char c : T.toCharArray()){
                for (int j = 0; j < 26; j++){
                    if (alph[j] == c) {
                        x = j;
                    }
                }
                System.out.print(word[x][i]);
                x = 26;  // resets to not found character
            }
            System.out.println();
        }
    }
}
