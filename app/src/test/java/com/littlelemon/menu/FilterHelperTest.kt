package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test

class FilterHelperTest {

    private val sampleProductsList = mutableListOf(
        ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
        ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
        ProductItem(
            title = "Bouillabaisse",
            price = 20.00,
            category = "Food",
            R.drawable.bouillabaisse
        )
    )

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val filter = FilterHelper()
        val filtered = filter.filterProducts(FilterType.Dessert, sampleProductsList)

        assertEquals(1, filtered.size)
        assertEquals("Croissant", filtered[0].title)
    }
}