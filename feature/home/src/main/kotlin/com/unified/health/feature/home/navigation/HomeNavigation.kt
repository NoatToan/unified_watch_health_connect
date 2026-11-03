package com.unified.health.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.core.model.HealthMetricType
import com.unified.health.feature.home.HomeRoute
import com.unified.health.feature.home.detail.MetricDetailRoute
import kotlinx.serialization.Serializable

@Serializable
data object HomeDestination

/** The metric is passed by enum name so the route has no enum serializer to keep under R8. */
@Serializable
data class MetricDetailDestination(val metricName: String) {
    val metric: HealthMetricType get() = HealthMetricType.valueOf(metricName)
}

fun NavController.navigateToHome(navOptions: NavOptions? = null) = navigate(HomeDestination, navOptions)

fun NavController.navigateToMetricDetail(metric: HealthMetricType) = navigate(MetricDetailDestination(metric.name))

fun NavGraphBuilder.homeScreen(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
) {
    composable<HomeDestination> {
        HomeRoute(onMetricClick = onMetricClick, onOpenDevices = onOpenDevices)
    }
}

fun NavGraphBuilder.metricDetailScreen(onBack: () -> Unit) {
    composable<MetricDetailDestination> {
        MetricDetailRoute(onBack = onBack)
    }
}
