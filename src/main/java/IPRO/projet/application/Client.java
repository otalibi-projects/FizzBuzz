package IPRO.projet.application;

import IPRO.projet.typage.*;

import java.util.ArrayList;
import java.util.List;
import static IPRO.projet.typage.Prix.*;

public class Client extends Personne{

    private static int nextIdentifer = 0;

    private Id id;

    private Username username;
    private Password password;
    private Email email;
    private FirstName firstName;
    private LastName lastName;

    private List<Commande> commandeList = new ArrayList<>();
    private Prix prixTotal;

    public Client(Username username, Password password, Email email, FirstName firstName, LastName lastName) {
        this.id = new Id(nextIdentifer++);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

        this.prixTotal = getPrixTotal();
    }

    public Commande createCommande(ISellable...sellables){
        Commande commande = new Commande(sellables);
        affectCommande(commande);
        return commande;
    }

    public List<Commande> getCommandes(){

        return commandeList;
    }

    public Prix getPrixTotal(){
        Double result = 0.0;
        for(Commande commande : commandeList){
            result = result + commande.getPrixFinalCommande().getPrixValue();
        }

        return Prix(result);
    }

    public Id getIdObject() {

        return id;
    }

    private void affectCommande(Commande commande){

        this.commandeList.add(commande);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", username=" + username +
                ", password=" + password +
                ", email=" + email +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", commandeList=" + commandeList +
                ", prixTotal=" + prixTotal +
                '}';
    }
}
