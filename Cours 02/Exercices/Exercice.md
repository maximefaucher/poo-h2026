# Exercice – Classe `Tracteur`
![Titre du diagramme](tracteur.jpg)

## Classe à réaliser

Vous devez implémenter une classe Java nommée **`Tracteur`**.

![Titre du diagramme](diagramme_classe.png)

---

## Attributs obligatoires

Tous les attributs doivent être **privés**.

| Attribut | Type | Description |
|--------|------|-------------|
| `marque` | `String` | Marque du tracteur |
| `modele` | `String` | Modèle du tracteur |
| `etatMoteur` | `boolean` | État du moteur (démarré ou arrêté|
| `annee` | `int` | Année de fabrication |
| `poidsKg` | `double` | Poids en kilogrammes |
| `horametreHeures` | `double` | Temps d’utilisation total en heures |
| `temperatureMoteurCelsius` | `double` | Température du moteur en degrés Celsius |

---

## Constructeur

- Un constructeur **public** doit être présent
- Il doit recevoir **tous les attributs** en paramètres
- Le constructeur doit obligatoirement **utiliser les setters** pour initialiser les valeurs. La température du moteur doit être initialisée à 0 lors de la création de l'objet et se placer à 25 degrés celcius lors du démarrage et revenir à 0 lors de l'arrêt.

---

## Encapsulation

- Tous les attributs doivent être déclarés `private`
- Chaque attribut doit posséder :
  - un **getter**
  - un **setter** avec validation sauf pour la température du moteur qui est géré par l'objet.

---

## Règles de validation

### Champs texte

- `marque`, `modele`
  - ne doivent pas être `null`
  - ne doivent pas être vides

### Champs numériques

- `annee` ≥ `1950`
- `poidsKg` > `0`
- `horametreHeures` ≥ `0`
- `temperatureMoteurCelsius` ≥ `-273.15`

En cas de valeur invalide, une **`IllegalArgumentException`** doit être levée.


### Méthodes
- Une exception **`IllegalArgumentException`** doit être levée si la méthode demarrer() est lancée lorsque le moteur est déjà en marche et vice versa.
---

## Horamètre

Les méthodes suivantes doivent être implémentées :

- `double getHorametreHeures()`
- `double getHorametreJours()`
- `double getHorametreAnnees()`

**Important**  
Les méthodes `jours` et `années` doivent **réutiliser** `getHorametreHeures()`.

---

## Poids

Les méthodes suivantes doivent être implémentées :

- `double getPoidsKg()`
- `double getPoidsGrammes()`
- `double getPoidsLivres()`

**Important**  
Les conversions doivent **réutiliser** `getPoidsKg()`.

---

## Température du moteur

Les méthodes suivantes doivent être implémentées :

- `double getTemperatureMoteurCelsius()`
- `double getTemperatureMoteurFahrenheit()`
- `double getTemperatureMoteurKelvin()`

**Important**  
Les conversions doivent **réutiliser** `getTemperatureMoteurCelsius()`.

---

## Méthode d’affichage

Une méthode `void toString()` doit afficher :

- la marque
- le modèle
- l’année
- le poids (en kilogrammes)
- l’horamètre (en heures)
- la température moteur (en degrés Celsius)

---

## Interdictions

- Attributs publics
- Duplication de code dans les conversions
- Logique de validation dans la méthode `main`

---