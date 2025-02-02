package com.mk1morebugs.finapp.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "categories",
    indices = [
        Index("name", unique = true)
    ]
)
data class Category(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "is_income") val isIncome: Boolean,
    @ColumnInfo(name = "color") val color: Long,
    @ColumnInfo(name = "icon_id") val iconId: Int
)

data class CategoryWithoutIsIncome(
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "icon_color") val iconColor: Long,
    @ColumnInfo(name = "icon_id") val iconId: Int
)
