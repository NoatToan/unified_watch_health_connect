package com.unified.health.feature.home.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.core.model.HealthMetricType
import com.unified.health.feature.home.AllMetricsRoute
import com.unified.health.feature.home.HomeRoute
import com.unified.health.feature.home.detail.MetricDataRoute
import com.unified.health.feature.home.detail.MetricDetailRoute
import kotlinx.serialization.Serializable

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

/** D-1119: "Xem tất cả" from Home's "Metrics" section — every metric's card, including no-data ones. */
@Serializable
data object AllMetricsDestination

fun NavController.navigateToMetricDetail(metric: HealthMetricType) = navigate(MetricDetailDestination(metric.name))

fun NavController.navigateToMetricData(metric: HealthMetricType) = navigate(MetricDataDestination(metric.name))

fun NavController.navigateToAllMetrics() = navigate(AllMetricsDestination)

/**
 * Summary (Apple Health's first tab), merged with the old flat Health feed per D-1010: device
 * banner, activity rings, pinned metrics, every metric's own card, then highlights.
 *
 * Public entry point for [com.unified.health.navigation.MainPagerDestination]'s `HorizontalPager`
 * (D-1052): Home is one of 4 swipeable pages embedded directly in the pager, not its own NavHost
 * destination, so the app module needs a public composable to call across the module boundary
 * (`HomeRoute` itself stays internal).
 */
@Composable
fun HomeTabContent(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
    onOpenRaces: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    onOpenAllMetrics: () -> Unit,
    onOpenTraining: () -> Unit,
) {
    HomeRoute(
        onMetricClick = onMetricClick,
        onOpenDevices = onOpenDevices,
        onOpenWorkouts = onOpenWorkouts,
        onOpenRaces = onOpenRaces,
        onOpenRaceDetail = onOpenRaceDetail,
        onOpenAllMetrics = onOpenAllMetrics,
        onOpenTraining = onOpenTraining,
    )
}

fun NavGraphBuilder.metricDetailScreen(onBack: () -> Unit, onShowAllData: (HealthMetricType) -> Unit) {
    composable<MetricDetailDestination> {
        MetricDetailRoute(onBack = onBack, onShowAllData = onShowAllData)
    }
}

fun NavGraphBuilder.metricDataScreen(onBack: () -> Unit) {
    composable<MetricDataDestination> { MetricDataRoute(onBack = onBack) }
}

fun NavGraphBuilder.allMetricsScreen(onBack: () -> Unit, onMetricClick: (HealthMetricType) -> Unit, onOpenWorkouts: () -> Unit) {
    composable<AllMetricsDestination> {
        AllMetricsRoute(onBack = onBack, onMetricClick = onMetricClick, onOpenWorkouts = onOpenWorkouts)
    }
}
