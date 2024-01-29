package com.example.chatapp.bottomNav

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.navigation.NavRoutes
import com.example.chatapp.screens.AccountScreen
import com.example.chatapp.screens.HomeScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavBar(navController: NavHostController) {
    val bottomNavController = rememberNavController()

    Scaffold(
        bottomBar = { MyBottomBar(bottomNavController) }
    ) {
        NavHost(
            navController = bottomNavController,
            startDestination = NavRoutes.Home.route
        ){
            composable(NavRoutes.Home.route){
                HomeScreen(navController)
            }
            composable(NavRoutes.Account.route){
                AccountScreen()
            }
        }
    }
}

@Composable
fun MyBottomBar(navController: NavHostController) {

    val navBackStackEntry = navController.currentBackStackEntryAsState()

    val navItems = listOf(
        BottomNavItem(
            "Home",
            NavRoutes.Home.route,
            Icons.Default.Home
        ),
        BottomNavItem(
            "Account",
            NavRoutes.Account.route,
            Icons.Default.Person
        ),
    )

    val destination = navBackStackEntry.value?.destination?.route

    BottomAppBar() {
        navItems.forEach {
            val selected = it.route == destination

            NavigationBarItem(
                selected = selected,
                onClick = { navController.navigate(it.route){
                    launchSingleTop = true
                } },
                icon = { Icon(
                    imageVector = it.icon,
                    contentDescription = null
                ) }
            )
        }
    }



}
