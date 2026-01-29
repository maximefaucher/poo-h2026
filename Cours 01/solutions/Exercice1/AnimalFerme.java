public class AnimalFerme {

    // Attributs
    private String nom;
    private String espece;
    private int age;
    private String cri;

    // Constructeur
    public AnimalFerme(String nom, String espece, int age, String cri) {
        setNom(nom);
        setEspece(espece);
        setAge(age);
        setCri(cri);
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getEspece() {
        return espece;
    }

    public int getAge() {
        return age;
    }

    public String getCri() {
        return cri;
    }

    // Setters avec validation
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne doit pas être vide");
        }
        this.nom = nom;
    }

    public void setEspece(String espece) {
        if (espece == null || espece.trim().isEmpty()) {
            throw new IllegalArgumentException("L'espèce ne doit pas être vide");
        }
        this.espece = espece;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("L'âge doit être compris entre 0 et 100");
        }
        this.age = age;
    }

    public void setCri(String cri) {
        if (cri == null || cri.trim().isEmpty()) {
            throw new IllegalArgumentException("Le cri ne doit pas être vide");
        }
        this.cri = cri;
    }

    // Méthodes 
    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Espèce : " + espece);
        System.out.println("Âge : " + age);
    }

    public void faireDuBruit() {
        System.out.println(cri);
    }
}
