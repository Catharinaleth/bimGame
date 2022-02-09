// Tæller - øvelse 2+3 den 6/10
package com.company;

class Main {

    public static void main (String [] args) {
        int i = 1; //definere en variabel
        while(i < 31) { // skal tælle fra 1-30

            if (i % 3 == 0 && i % 5 == 0) { // hvis tallet kan deles i 3 og 5 uden en rest, så skal computeren sige bommelom
                System.out.println("bommelom");
            }
            else if(i % 5 == 0) { // kan tallet deles i 5 uden rest siger den bim
                System.out.println("bim");
            }

            else if(i % 3 == 0) {
                System.out.println("bum");
            }

            else {
                System.out.println(i);
            }
            i++;	//hvis ingen af de overstående gør sig gældende skal tælleren tælle op
        }
    }
}


