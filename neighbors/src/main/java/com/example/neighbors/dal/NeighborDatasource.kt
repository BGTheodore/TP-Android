package com.example.neighbors.dal

import androidx.lifecycle.LiveData
import com.example.neighbors.models.Neighbor

interface NeighborDatasource {
    /**
     * Get all my Neighbors
     * @return [MutableList]
     */
    val neighbors: LiveData<List<Neighbor>>
//    fun getNeighbor(): List<Neighbor>

    /**
     * Deletes a neighbor
     * @param neighbor : Neighbor
     */
    fun deleteNeighbor(neighbor: Neighbor)

    /**
     * Create a neighbor
     * @param neighbor: Neighbor
     */
    fun createNeighbor(neighbor: Neighbor)

    fun getGeneratedId():Long


    /**
     * Update "Favorite status" of an existing Neighbor"
     * @param neighbor: Neighbor
     */
    fun updateFavoriteStatus(neighbor: Neighbor)

    /**
     * Update modified fields of an existing Neighbor"
     * @param neighbor: Neighbor
     */
    fun updateDataNeighbor(neighbor: Neighbor)

}