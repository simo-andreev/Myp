package bg.o.sim.myp.model

import java.util.*

data class Item(
    val name: String,
    val category: Category,
    val startTime: Date,
    var endTime: Date
)