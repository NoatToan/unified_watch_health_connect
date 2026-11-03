package com.unified.health.feature.devices.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.feature.devices.DevicesRoute
import kotlinx.serialization.Serializable

@Serializable
data object DevicesDestination

fun NavController.navigateToDevices(navOptions: NavOptions? = null) = navigate(DevicesDestination, navOptions)

fun NavGraphBuilder.devicesScreen() {
    composable<DevicesDestination> { DevicesRoute() }
}
