package com.example.chatapp.navigation

sealed class NavRoutes(val route:String){
    data object Home:NavRoutes("home")
    data object Detail:NavRoutes("detail")
    data object Account:NavRoutes("account")
    data object Login:NavRoutes("login")
    data object Register:NavRoutes("register")
    data object Splash:NavRoutes("splash")
    data object BottomNav:NavRoutes("bottomNav")
}