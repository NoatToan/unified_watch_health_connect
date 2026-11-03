package com.unified.health.feature.activity

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object ActivityDestination

fun NavController.navigateToActivity(navOptions: NavOptions? = null) = navigate(ActivityDestination, navOptions)

fun NavGraphBuilder.activityScreen() {
    composable<ActivityDestination> { ActivityRoute() }
}
