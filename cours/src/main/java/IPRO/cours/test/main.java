package IPRO.cours.test;

import IPRO.cours.client.Client;
import IPRO.cours.bills.Bill;
import IPRO.cours.stock.Couleur;
import IPRO.cours.stock.Lot;
import IPRO.cours.stock.Ream;
import IPRO.cours.stock.Stylo;

public class main {
    public static void main(String[] args) {

        Stylo styloJade = new Stylo("s1", "Stylo Jade", "Watertruc", "N/A", 50.0f, Couleur.Blue);
        Ream ream = new Ream("r1", "Ramette haute qualité", "Flouefontaine", "N/A", 9.5f, "N/A");
        Lot lotStyloOr = new Lot("l1", new Stylo("s2", "Stylo or", "N/A", "N/A", 100f, Couleur.Rouge), 2, 20f);
        Client c1 = new Client("Omar", "omar.talibi@gmail.com");

        Bill bill  = new Bill(c1);
        bill.add(10, styloJade);
        bill.add(15, ream);
        bill.add(2, lotStyloOr);


        // TODO : Formatage + Affichage
    }
}
