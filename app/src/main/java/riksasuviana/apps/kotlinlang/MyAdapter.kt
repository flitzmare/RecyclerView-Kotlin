package riksasuviana.apps.kotlinlang

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_row.view.*

/**
 * Created by Riksa Suviana on 11/3/2017.
 */
class MyAdapter(val list:List<CardModel>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.main_row, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: CardModel){
            itemView.tv_row_firstname.text = model.firstName
            itemView.tv_row_lastname.text = model.lastName
            itemView.iv_row.setImageResource(model.picture)
        }
    }
}