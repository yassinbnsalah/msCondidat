package tn.esprit.condidats.entites;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Condidat implements Serializable {
    private static final long serialVersionUID = 6 ;
    @Id
    @GeneratedValue
    private int id ;
    private String nom , prenom , email ;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Condidat(){
        super() ;
        }

    public Condidat(String nom) {
        this.nom = nom;
    }

    public Condidat(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}
