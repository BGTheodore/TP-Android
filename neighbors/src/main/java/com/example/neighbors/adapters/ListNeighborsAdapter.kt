package com.example.neighbors.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.neighbors.R
import com.example.neighbors.models.Neighbor

class ListNeighborsAdapter(
    items: List<Neighbor>
) : RecyclerView.Adapter<ListNeighborsAdapter.ViewHolder>() {
    private val mNeighbors: List<Neighbor> = items
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.neighbor_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val neighbor: Neighbor = mNeighbors[position]
        // Display Neighbor Name
        holder.mNeighborName.text = neighbor.name
    }

    override fun getItemCount(): Int {
        return mNeighbors.size
    }

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val mNeighborAvatar: ImageView
        val mNeighborName: TextView
        val mDeleteButton: ImageButton

        init {
            // Enable click on item
            mNeighborAvatar = view.findViewById(R.id.item_list_avatar)
            mNeighborName = view.findViewById(R.id.item_list_name)
            mDeleteButton = view.findViewById(R.id.item_list_delete_button)
        }
    }

}