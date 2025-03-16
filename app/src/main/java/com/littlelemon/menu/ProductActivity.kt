package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.littlelemon.menu.ui.theme.LittleLemonMenuTheme

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productItem = extractProductItem()
        setContent {
            LittleLemonMenuTheme {
                ProductDetails(productItem)
            }
        }
    }

    private fun extractProductItem(): ProductItem {
        return intent?.extras?.let {
            val title = it.getString(KEY_TITLE, "")
            val price = it.getDouble(KEY_PRICE, 0.0)
            val category = it.getString(KEY_CATEGORY, "")
            val image = it.getInt(KEY_IMAGE, -1)

            ProductItem(title, price, category, image)
        } ?: ProductItem("", 0.0, "", -1)
    }

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_CATEGORY = "category"
        const val KEY_IMAGE = "image"
    }

}