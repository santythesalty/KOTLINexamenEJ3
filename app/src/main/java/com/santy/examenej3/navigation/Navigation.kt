package com.santy.examenej3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.santy.examenej3.screens.Screen1
import com.santy.examenej3.screens.Screen2
import com.santy.examenej3.screens.Screen3

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") {
            Screen1(navController)
        }
        composable("screen2") {
            Screen2(navController)
        }
        composable("screen3/{message}") { backStackEntry ->
            val message = backStackEntry.arguments?.getString("message") ?: "Sin mensaje" //Por si no recibe nada
            Screen3(navController, message)
        }
    }
}
