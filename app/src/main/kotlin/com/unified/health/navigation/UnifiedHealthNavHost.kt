package com.unified.health.navigation

import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.unified.health.feature.activity.navigateToWorkoutDetail
import com.unified.health.feature.activity.workoutDetailScreen
import com.unified.health.feature.devices.navigation.deviceDetailScreen
import com.unified.health.feature.devices.navigation.navigateToDeviceDetail
import com.unified.health.feature.home.navigation.allMetricsScreen
import com.unified.health.feature.home.navigation.metricDataScreen
import com.unified.health.feature.home.navigation.metricDetailScreen
import com.unified.health.feature.home.navigation.navigateToAllMetrics
import com.unified.health.feature.home.navigation.navigateToMetricData
import com.unified.health.feature.home.navigation.navigateToMetricDetail
import com.unified.health.feature.onboarding.navigation.OnboardingDestination
import com.unified.health.feature.onboarding.navigation.onboardingScreen
import com.unified.health.feature.profile.navigateToNotificationSettings
import com.unified.health.feature.profile.notificationSettingsScreen
import com.unified.health.feature.races.navigateToRaceDetail
import com.unified.health.feature.races.navigateToRaces
import com.unified.health.feature.races.raceDetailScreen
import com.unified.health.feature.races.racesScreen

/**
 * One flat back stack for the whole app: onboarding, [MainPagerDestination] (the 4 swipeable
 * top-level tabs, D-1052) and every detail screen pushed on top of it (metric detail, device
 * detail, workout detail, notification settings) — unchanged by the D-105x nav rework, since only
 * the top-level tabs moved into the pager.
 */
@Composable
fun UnifiedHealthNavHost(
    navController: NavHostController,
    startWithOnboarding: Boolean,
    pagerState: PagerState,
    onSwitchTab: (TopLevelDestination) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = if (startWithOnboarding) OnboardingDestination else MainPagerDestination,
        modifier = modifier,
    ) {
        onboardingScreen(
            onFinished = {
                navController.navigate(MainPagerDestination) {
                    popUpTo<OnboardingDestination> { inclusive = true }
                }
            },
        )
        mainPagerScreen(
            pagerState = pagerState,
            onMetricClick = navController::navigateToMetricDetail,
            onOpenWorkoutClick = navController::navigateToWorkoutDetail,
            onOpenDeviceClick = navController::navigateToDeviceDetail,
            onOpenNotifications = navController::navigateToNotificationSettings,
            onOpenRaces = navController::navigateToRaces,
            onOpenRaceDetail = navController::navigateToRaceDetail,
            onOpenAllMetrics = navController::navigateToAllMetrics,
            onSwitchTab = onSwitchTab,
        )
        metricDetailScreen(onBack = navController::popBackStack, onShowAllData = navController::navigateToMetricData)
        metricDataScreen(onBack = navController::popBackStack)
        allMetricsScreen(
            onBack = navController::popBackStack,
            onMetricClick = navController::navigateToMetricDetail,
            // Same "tap Workouts -> go to the Activity tab" behavior as Home's own card (onOpenWorkouts
            // there just switches the pager's tab); from this pushed screen that means popping back to
            // reveal MainPagerDestination underneath, then switching it to Activity.
            onOpenWorkouts = { navController.popBackStack(); onSwitchTab(TopLevelDestination.ACTIVITY) },
        )
        workoutDetailScreen(onBack = navController::popBackStack)
        deviceDetailScreen(onBack = navController::popBackStack)
        notificationSettingsScreen(onBack = navController::popBackStack)
        racesScreen(onBack = navController::popBackStack, onOpenRaceDetail = navController::navigateToRaceDetail)
        raceDetailScreen(onBack = navController::popBackStack)
    }
}
