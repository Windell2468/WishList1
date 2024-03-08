import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist1.GroceryWishlist
import com.example.wishlist1.R

class MainActivity : AppCompatActivity() {
   lateinit var adapter: GroceryWishlistAdapter
    lateinit var items: MutableList<GroceryWishlist>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView and its adapter
        val emailsRv = findViewById<RecyclerView>(R.id.grocery)
        items = mutableListOf()
        adapter = GroceryWishlistAdapter(items)

        // Set the adapter and layout manager
        emailsRv.adapter = adapter
        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}
