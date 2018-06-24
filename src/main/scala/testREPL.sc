import java.io.InputStream
import com.google.firebase.FirebaseApp
import com.google.firebase.database._
import com.google.firebase.FirebaseOptions

case class FirebaseException(s: String) extends Exception(s)

object Firebase {
  private val credentials : InputStream = getClass.getResourceAsStream("./serviceAccountKey.json")
  private val options = new FirebaseOptions.Builder()
    .setDatabaseUrl("https://sourcing-stratups.firebaseio.com/")
    .setServiceAccount(credentials)
    .build()
  FirebaseApp.initializeApp(options)
  private val database = FirebaseDatabase.getInstance()
  def ref(path: String): DatabaseReference = database.getReference(path)
}

val ref = Firebase.ref("/entreprises")
