package com.unified.health.feature.devices.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.feature.devices.DevicesRoute
import com.unified.health.feature.devices.detail.DeviceDetailRoute
import kotlinx.serialization.Serializable

/** Per-device "About this device" / settings page. [deviceId] is `WearableDevice.id`. */
@Serializable
data class DeviceDetailDestination(val deviceId: String)

fun NavController.navigateToDeviceDetail(deviceId: String) = navigate(DeviceDetailDestination(deviceId))

/**
 * Public entry point for [com.unified.health.navigation.MainPagerDestination]'s `HorizontalPager`
 * (D-1052) — see [com.unified.health.feature.home.navigation.HomeTabContent] for why this wrapper
 * exists (`DevicesRoute` itself stays internal).
 */
@Composable
fun DevicesTabContent(onOpenDevice: (String) -> Unit) {
    DevicesRoute(onOpenDevice = onOpenDevice)
}

fun NavGraphBuilder.deviceDetailScreen(onBack: () -> Unit) {
    composable<DeviceDetailDestination> { DeviceDetailRoute(onBack = onBack) }
}
