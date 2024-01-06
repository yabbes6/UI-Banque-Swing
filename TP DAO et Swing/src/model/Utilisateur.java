package model;

public class Utilisateur {
    protected Long id;
    protected String prenom, nom;
    protected String login, motDePasse, role;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Utilisateur() {}

    public Utilisateur(String login, String pass, String role) {
        this.login = login;
        this.motDePasse = pass;
        this.role = role;
    }

    @Override
    public boolean equals(Object other) {

        if (other instanceof Utilisateur)
            return this.login.equals(((Utilisateur)other).login) && motDePasse.equals(((Utilisateur)other).motDePasse);
        return false;
    }
}
