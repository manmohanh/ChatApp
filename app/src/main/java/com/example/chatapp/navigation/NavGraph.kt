package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.bottomNav.BottomNavBar
import com.example.chatapp.screens.DetailScreen
import com.example.chatapp.screens.HomeScreen
import com.example.chatapp.screens.LoginScreen
import com.example.chatapp.screens.RegisterScren
import com.example.chatapp.screens.SplashScreen

@Composable
fun NavGraph(navController:NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Splash.route
    ){
        composable(NavRoutes.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(NavRoutes.Login.route){
            LoginScreen()
        }
        composable(NavRoutes.Register.route){
            RegisterScren()
        }
        composable(NavRoutes.BottomNav.route){
            BottomNavBar(navController = navController)
        }
        composable(NavRoutes.Detail.route){
            DetailScreen(navController = navController)
        }
    }
}