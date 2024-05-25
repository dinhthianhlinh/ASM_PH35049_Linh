package com.example.asm_linh

enum class Screen(val route: String) {
    HOME("home"),
    LOGIN("login"),
    PRODUCT_DETAIL("product_detail")
}

sealed class NavigationItem(val route: String) {
    object Login : NavigationItem(Screen.LOGIN.route)
    object Home : NavigationItem(Screen.HOME.route)
    object ProductDetail : NavigationItem(Screen.PRODUCT_DETAIL.route)

}
