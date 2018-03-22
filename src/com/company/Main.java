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

    public static boolean intersects(int line1[], int line2[]) {
        float slope1 = ((float) (line1[3] - line1[1])) / (float) ((line1[2] - line1[0]));
        float slope2 = ((float) (line2[3] - line2[1])) / (float) ((line2[2] - line2[0]));
        if (slope1 == slope2)
            return false;
        else {
            float intersectionPoint = (line2[1] - line1[1] + (slope1 * line1[0]) - (slope2 * line2[0])) / (slope1 - slope2);
            int domain1[] = new int[2];
            domain1[0] = (line1[0] < line1[2]) ? line1[0] : line1[2];
            domain1[1] = (line1[0] > line1[2]) ? line1[0] : line1[2];
            int domain2[] = new int[2];
            domain2[0] = (line2[0] < line2[2]) ? line2[0] : line2[2];
            domain2[1] = (line2[0] > line2[2]) ? line2[0] : line2[2];
            return (intersectionPoint >= domain1[0] && intersectionPoint >= domain2[0] && intersectionPoint <= domain1[1] && intersectionPoint <= domain2[1]);
        }
    }

}
