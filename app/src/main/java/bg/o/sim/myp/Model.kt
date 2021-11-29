package bg.o.sim.myp

import androidx.annotation.ColorInt
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true) val _id: Int,

    val name: String,
    val category: Category,
    val startTime: Date,
    var endTime: Date
)


@Entity
data class Category(
    @PrimaryKey(autoGenerate = true) val _id: Int,

    val name: String,
    @ColorInt val color: Int,
    val group: Group
)


@Entity
data class Group(
    @PrimaryKey(autoGenerate = true) val _id: Int,

    val name: String,
    @ColorInt val color: Int
)
