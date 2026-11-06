package com.unified.health.feature.devices.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.feature.devices.DevicesRoute
import com.unified.health.feature.devices.detail.DeviceDetailRoute
import kotlinx.serialization.Serializable

@Serializable
data object DevicesDestination

/** Per-device "About this device" / settings page. [deviceId] is `WearableDevice.id`. */
@Serializable
data class DeviceDetailDestination(val deviceId: String)

fun NavController.navigateToDevices(navOptions: NavOptions? = null) = navigate(DevicesDestination, navOptions)

fun NavController.navigateToDeviceDetail(deviceId: String) = navigate(DeviceDetailDestination(deviceId))

fun NavGraphBuilder.devicesScreen(onOpenDevice: (String) -> Unit) {
    composable<DevicesDestination> { DevicesRoute(onOpenDevice = onOpenDevice) }
}

fun NavGraphBuilder.deviceDetailScreen(onBack: () -> Unit) {
    composable<DeviceDetailDestination> { DeviceDetailRoute(onBack = onBack) }
}
