package com.example.chatapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.R
import com.example.chatapp.navigation.NavRoutes

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController:NavHostController) {

    Scaffold(
        topBar = { TopAppBar(
            title = { Text(
                text = "ChatApp",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            ) },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
        ) },
    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .verticalScroll(rememberScrollState())) {

            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)

            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }
            UserCard(){
                navController.navigate(NavRoutes.Detail.route)
            }

        }

    }
}

@Composable
fun UserCard(onClick:() -> Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            onClick()
        }
        .padding(
            start = 16.dp,
            top = 8.dp,
            bottom = 8.dp,
            end = 16.dp
        )) {
        Image(
            painter = painterResource(id = R.drawable.c),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(54.dp)
                .clip(CircleShape)
        )
        Column(modifier = Modifier
            .wrapContentWidth()
            .padding(
                start = 12.dp,
                top = 10.dp
            )) {
            Text(
                text = "Abc",

            )
            Text(text = "fdsf greg bfdb", style = TextStyle(fontSize = 13.sp, color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)))
        }
    }
}