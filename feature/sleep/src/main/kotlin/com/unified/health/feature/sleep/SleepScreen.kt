package com.unified.health.feature.sleep

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.core.designsystem.component.EmptyState
import kotlinx.serialization.Serializable

@Serializable
data object SleepDestination

fun NavController.navigateToSleep(navOptions: NavOptions? = null) = navigate(SleepDestination, navOptions)

fun NavGraphBuilder.sleepScreen() {
    composable<SleepDestination> { SleepScreen() }
}

/** Placeholder. Target design: hypnogram, stage breakdown, score, weekly trend (see FEATURES.md §Sleep). */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SleepScreen() {
    Scaffold(topBar = { TopAppBar(title = { Text("Sleep") }) }) { padding ->
        EmptyState(
            title = "Sleep analysis",
            message = "Sleep stages, score and trends will appear here after your first night with the watch.",
            icon = Icons.Outlined.Bedtime,
            modifier = Modifier.padding(padding),
        )
    }
}
