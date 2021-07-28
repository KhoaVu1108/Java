package pq1;
//Khoa Vu
//30039608
//21/07/2021

import java.util.LinkedList;

public class PQ1 {

    public static void main(String[] args) {
        LinkedList<Country> Countries = new LinkedList();
        Country c1 = new Country("Australia", "Camberra");
        Country c2 = new Country("Japan", "Tokyo");
        Country c3 = new Country("VietNam", "HaNoi");
        Country c4 = new Country("USA", "WashitonDC");
        Country c5 = new Country("Russia", "Moscow");
        Countries.addLast(c1);
        Countries.addLast(c2);
        Countries.addLast(c3);
        Countries.addLast(c4);
        Countries.addLast(c5);

        for (Country c : Countries) {
            System.out.println("Country name: " + c.getName());
            System.out.println("Capital city name: " + c.getCapitalCity());
        }
    }

}
