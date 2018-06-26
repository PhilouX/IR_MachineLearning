class Zero {
  var pseudo = "Anonyme"
  var age = 0
  var citation = "Aucune citation"
  def afficher = println("Nom: " + pseudo + " Age: " + age + " Citation:" + citation)
  def avancerAge = age += 1
  var msg = "Aucun Message"
  def afficherMessage = println(msg)
  def envoyerMessage(nouveauMsg: String, z: Zero) = {z.msg = nouveauMsg}
}

object Createur {
  def creerZero(nom: String, age: Int, citation: String = "Aucune citation") = { // l'argument citation est facultatif, on lui donne donc une valeur par défaut
    val resultat = new Zero
    resultat.pseudo = nom
    resultat.age = age
    resultat.citation = citation
    resultat // ou return resultat
  }
}

val einstein = Createur.creerZero("Einstein++", 21, "J'adore Scala <3")
val mateo = Createur.creerZero("M@teo21", 30)
val entreprise = Createur.creerZero("International", age=34)