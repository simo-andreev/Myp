package bg.o.sim.myp.model

import androidx.annotation.ColorInt

data class Category(
    val name: String,
    @ColorInt val color: Int,
    val group: Group
)