package com.unified.health.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.unified.health.feature.activity.activityScreen
import com.unified.health.feature.activity.navigateToWorkoutDetail
import com.unified.health.feature.activity.workoutDetailScreen
import com.unified.health.feature.devices.navigation.deviceDetailScreen
import com.unified.health.feature.devices.navigation.devicesScreen
import com.unified.health.feature.devices.navigation.navigateToDeviceDetail
import com.unified.health.feature.home.navigation.HomeDestination
import com.unified.health.feature.home.navigation.homeScreen
import com.unified.health.feature.home.navigation.metricDataScreen
import com.unified.health.feature.home.navigation.metricDetailScreen
import com.unified.health.feature.home.navigation.navigateToMetricData
import com.unified.health.feature.home.navigation.navigateToMetricDetail
import com.unified.health.feature.onboarding.navigation.OnboardingDestination
import com.unified.health.feature.onboarding.navigation.onboardingScreen
import com.unified.health.feature.profile.navigateToNotificationSettings
import com.unified.health.feature.profile.notificationSettingsScreen
import com.unified.health.feature.profile.profileScreen

@Composable
fun UnifiedHealthNavHost(
    navController: NavHostController,
    startWithOnboarding: Boolean,
    onNavigateToTopLevel: (TopLevelDestination) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = if (startWithOnboarding) OnboardingDestination else HomeDestination,
        modifier = modifier,
    ) {
        onboardingScreen(
            onFinished = {
                navController.navigate(HomeDestination) {
                    popUpTo<OnboardingDestination> { inclusive = true }
                }
            },
        )
        homeScreen(
            onMetricClick = navController::navigateToMetricDetail,
            onOpenDevices = { onNavigateToTopLevel(TopLevelDestination.DEVICES) },
            onOpenWorkouts = { onNavigateToTopLevel(TopLevelDestination.ACTIVITY) },
        )
        metricDetailScreen(onBack = navController::popBackStack, onShowAllData = navController::navigateToMetricData)
        metricDataScreen(onBack = navController::popBackStack)
        activityScreen(onWorkoutClick = navController::navigateToWorkoutDetail)
        workoutDetailScreen(onBack = navController::popBackStack)
        devicesScreen(onOpenDevice = navController::navigateToDeviceDetail)
        deviceDetailScreen(onBack = navController::popBackStack)
        profileScreen(onOpenNotifications = navController::navigateToNotificationSettings)
        notificationSettingsScreen(onBack = navController::popBackStack)
    }
}
