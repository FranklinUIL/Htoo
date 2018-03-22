package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File(new File("htoo.txt").getAbsolutePath()));
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            int[] segment1 = new int[4];
            int[] segment2 = new int[4];
            String s1 = scan.nextLine();
            //  System.out.println(s1);
            // System.out.println(s1.substring(s1.indexOf(',')+1, s1.indexOf(')')));
            segment1[0] = Integer.parseInt(s1.substring(1, s1.indexOf(',')));
            segment1[1] = Integer.parseInt(s1.substring(s1.indexOf(',') + 2, s1.indexOf(')')));
            s1 = s1.substring(s1.indexOf('>') + 1, s1.length());
            segment1[2] = Integer.parseInt(s1.substring(s1.indexOf('(') + 1, s1.indexOf(',')));
            segment1[3] = Integer.parseInt((s1.substring(s1.indexOf(',') + 2, s1.indexOf((')')))));

            String s2 = scan.nextLine();
            //  System.out.println(s1);
            // System.out.println(s1.substring(s1.indexOf(',')+1, s1.indexOf(')')));
            segment2[0] = Integer.parseInt(s2.substring(1, s2.indexOf(',')));
            segment2[1] = Integer.parseInt(s2.substring(s2.indexOf(',') + 2, s2.indexOf(')')));
            s2 = s2.substring(s2.indexOf('>') + 1, s2.length());
            segment2[2] = Integer.parseInt(s2.substring(s2.indexOf('(') + 1, s2.indexOf(',')));
            segment2[3] = Integer.parseInt((s2.substring(s2.indexOf(',') + 2, s2.indexOf((')')))));

        }
    }


}
