package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filterByCategory("Dessert")
            FilterType.Drinks -> productsList.filterByCategory("Drinks")
            FilterType.Food -> productsList.filterByCategory("Food")
        }
    }

    private fun List<ProductItem>.filterByCategory(category: String): List<ProductItem> {
        return filter { it.category == category }
    }
}