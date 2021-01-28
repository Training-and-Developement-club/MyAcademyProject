package ua.kolot.myacademyproject.cache

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ActorDao {
    @Query("SELECT * FROM " + Contract.TABLE_NAME_ACTORS)
    fun getAll(): List<ActorEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(actors: List<ActorEntity>)
}