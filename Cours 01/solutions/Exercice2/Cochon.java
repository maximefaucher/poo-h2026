public class Cochon {

    private String nom;
    private Integer age;
    private float poids;

    public Cochon(String nom, Integer age, float poids) {
        setNom(nom);
        setAge(age);
        setPoids(poids);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne doit pas être vide");
        }
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age < 0 || age > 100) {
            throw new IllegalArgumentException("L'âge doit être entre 0 et 100");
        }
        this.age = age;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        if (poids <= 0) {
            throw new IllegalArgumentException("Le poids doit être supérieur à 0");
        }
        this.poids = poids;
    }

    public void crier() {
        System.out.println("Groin groin !");
    }
}