package riksasuviana.apps.kotlinlang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var list = ArrayList<CardModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var model = CardModel()
        model.firstName = "Riksa"
        model.lastName = "Suviana"
        model.picture = R.mipmap.ic_launcher
        list.add(model)

        var adapter = MyAdapter(list)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }

    fun maxOf(a:Int, b:Int) = if (a > b) a else b
}
