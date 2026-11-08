package com.unified.health.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.core.model.HealthMetricType
import com.unified.health.feature.home.HomeRoute
import com.unified.health.feature.home.detail.MetricDataRoute
import com.unified.health.feature.home.detail.MetricDetailRoute
import kotlinx.serialization.Serializable

/**
 * Summary (Apple Health's first tab), merged with the old flat Health feed per D-1010: device
 * banner, activity rings, pinned metrics, every metric's own card, then highlights.
 */
@Serializable
data object HomeDestination

/** The metric is passed by enum name so the route has no enum serializer to keep under R8. */
@Serializable
data class MetricDetailDestination(val metricName: String) {
    val metric: HealthMetricType get() = HealthMetricType.valueOf(metricName)
}

/** "Show All Data" for one metric. */
@Serializable
data class MetricDataDestination(val metricName: String) {
    val metric: HealthMetricType get() = HealthMetricType.valueOf(metricName)
}

fun NavController.navigateToHome(navOptions: NavOptions? = null) = navigate(HomeDestination, navOptions)

fun NavController.navigateToMetricDetail(metric: HealthMetricType) = navigate(MetricDetailDestination(metric.name))

fun NavController.navigateToMetricData(metric: HealthMetricType) = navigate(MetricDataDestination(metric.name))

fun NavGraphBuilder.homeScreen(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
) {
    composable<HomeDestination> {
        HomeRoute(onMetricClick = onMetricClick, onOpenDevices = onOpenDevices, onOpenWorkouts = onOpenWorkouts)
    }
}

fun NavGraphBuilder.metricDetailScreen(onBack: () -> Unit, onShowAllData: (HealthMetricType) -> Unit) {
    composable<MetricDetailDestination> {
        MetricDetailRoute(onBack = onBack, onShowAllData = onShowAllData)
    }
}

fun NavGraphBuilder.metricDataScreen(onBack: () -> Unit) {
    composable<MetricDataDestination> { MetricDataRoute(onBack = onBack) }
}
