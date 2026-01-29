public class Poulet {

    private String nom;
    private Integer age;

    public Poulet(String nom, Integer age) {
        setNom(nom);
        setAge(age);
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

    public void crier() {
        System.out.println("Piou piou !");
    }
}