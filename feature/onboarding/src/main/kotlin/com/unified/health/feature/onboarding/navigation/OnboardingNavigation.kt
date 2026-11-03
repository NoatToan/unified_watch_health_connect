package com.unified.health.feature.onboarding.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.feature.onboarding.OnboardingRoute
import kotlinx.serialization.Serializable

@Serializable
data object OnboardingDestination

fun NavGraphBuilder.onboardingScreen(onFinished: () -> Unit) {
    composable<OnboardingDestination> { OnboardingRoute(onFinished = onFinished) }
}
