package bg.o.sim.myp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import bg.o.sim.myp.Category
import bg.o.sim.myp.Group
import bg.o.sim.myp.Item

@Dao
interface ItemDao {

    @Insert
    fun insertAll(vararg items: Item)

    @Delete
    fun delete(item: Item)

    @Query("SELECT * FROM Item")
    fun getAll(): List<Item>
}

@Dao
interface CategoryDao {
    @Insert
    fun insertAll(vararg categories: Category)

    @Delete
    fun delete(category: Category)

    @Query("SELECT * FROM Category")
    fun getAll(): List<Category>

}

@Dao
interface GroupDao {
    @Insert
    fun insertAll(vararg groups: Group)

    @Delete
    fun delete(group: Group)

    @Query("SELECT * FROM `Group`")
    fun getAll(): List<Group>

}