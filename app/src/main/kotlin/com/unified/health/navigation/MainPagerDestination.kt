package com.unified.health.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.core.model.HealthMetricType
import com.unified.health.feature.activity.ActivityTabContent
import com.unified.health.feature.devices.navigation.DevicesTabContent
import com.unified.health.feature.home.navigation.HomeTabContent
import com.unified.health.feature.profile.ProfileTabContent
import kotlinx.serialization.Serializable

/**
 * The single NavHost destination backing all 4 top-level tabs (D-1052). Home / Activity / Devices /
 * Profile are pages of one [HorizontalPager] embedded directly here — not 4 separate `composable<>`
 * destinations like before — so a horizontal swipe moves between them and the pill bottom nav
 * (D-1051) can drive/follow the same [PagerState]. Detail screens pushed from a tab (metric detail,
 * device detail, workout detail, notification settings) remain their own destinations, stacked on
 * top of this one as usual.
 */
@Serializable
data object MainPagerDestination

fun NavGraphBuilder.mainPagerScreen(
    pagerState: PagerState,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkoutClick: (String) -> Unit,
    onOpenDeviceClick: (String) -> Unit,
    onOpenNotifications: () -> Unit,
    onOpenRaces: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    onOpenTraining: () -> Unit,
    onOpenGear: () -> Unit,
    onSwitchTab: (TopLevelDestination) -> Unit,
) {
    composable<MainPagerDestination> {
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
            when (TopLevelDestination.entries[page]) {
                TopLevelDestination.HOME -> HomeTabContent(
                    onMetricClick = onMetricClick,
                    onOpenDevices = { onSwitchTab(TopLevelDestination.DEVICES) },
                    onOpenWorkouts = { onSwitchTab(TopLevelDestination.ACTIVITY) },
                    onOpenRaces = onOpenRaces,
                    onOpenRaceDetail = onOpenRaceDetail,
                    onOpenTraining = onOpenTraining,
                )
                TopLevelDestination.ACTIVITY -> ActivityTabContent(onWorkoutClick = onOpenWorkoutClick)
                TopLevelDestination.DEVICES -> DevicesTabContent(onOpenDevice = onOpenDeviceClick)
                TopLevelDestination.PROFILE -> ProfileTabContent(onOpenNotifications = onOpenNotifications, onOpenGear = onOpenGear)
            }
        }
    }
}
