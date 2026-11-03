package com.unified.health.feature.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DeleteForever
import androidx.compose.material.icons.outlined.FileDownload
import androidx.compose.material.icons.outlined.Flag
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.Straighten
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable
import javax.inject.Inject

@Serializable
data object ProfileDestination

fun NavController.navigateToProfile(navOptions: NavOptions? = null) = navigate(ProfileDestination, navOptions)

fun NavGraphBuilder.profileScreen() {
    composable<ProfileDestination> { ProfileRoute() }
}

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val preferences: UserPreferencesRepository,
) : ViewModel() {
    val prefs: StateFlow<UserPreferences> =
        preferences.userPreferences.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), UserPreferences())

    fun setDynamicColor(enabled: Boolean) = viewModelScope.launch { preferences.setUseDynamicColor(enabled) }

    fun toggleUnits() = viewModelScope.launch {
        val next = if (prefs.value.unitSystem == UnitSystem.METRIC) UnitSystem.IMPERIAL else UnitSystem.METRIC
        preferences.setUnitSystem(next)
    }
}

/** Placeholder settings list; most rows are not wired yet (see FEATURES.md §Profile & settings). */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ProfileRoute(viewModel: ProfileViewModel = hiltViewModel()) {
    val prefs by viewModel.prefs.collectAsStateWithLifecycle()
    Scaffold(topBar = { TopAppBar(title = { Text("Profile") }) }) { padding ->
        Column(Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState())) {
            SettingRow(Icons.Outlined.Person, "Personal info", "Height, weight, birthday (coming soon)")
            SettingRow(Icons.Outlined.Flag, "Goals & reminders", "Daily step goal: ${prefs.dailyStepGoal}")
            SettingRow(
                Icons.Outlined.Straighten,
                "Units",
                if (prefs.unitSystem == UnitSystem.METRIC) "Metric (km, kg)" else "Imperial (mi, lb)",
                onClick = { viewModel.toggleUnits() },
            )
            ListItem(
                leadingContent = { Icon(Icons.Outlined.Palette, contentDescription = null) },
                headlineContent = { Text("Dynamic color") },
                supportingContent = { Text("Use wallpaper colors (Android 12+)") },
                trailingContent = { Switch(checked = prefs.useDynamicColor, onCheckedChange = { viewModel.setDynamicColor(it) }) },
            )
            HorizontalDivider(Modifier.padding(vertical = Spacing.sm))
            SettingRow(Icons.Outlined.Notifications, "Notifications", "Coming soon")
            SettingRow(Icons.Outlined.HealthAndSafety, "Health Connect", "Manage data sharing (coming soon)")
            SettingRow(Icons.Outlined.PrivacyTip, "Privacy", "Coming soon")
            SettingRow(Icons.Outlined.FileDownload, "Export data", "Coming soon")
            SettingRow(Icons.Outlined.DeleteForever, "Delete all data", "Coming soon", destructive = true)
        }
    }
}

@Composable
private fun SettingRow(
    icon: ImageVector,
    title: String,
    subtitle: String,
    destructive: Boolean = false,
    onClick: (() -> Unit)? = null,
) {
    val color = if (destructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
    ListItem(
        modifier = if (onClick != null) Modifier.clickableRow(onClick) else Modifier,
        leadingContent = { Icon(icon, contentDescription = null, tint = color) },
        headlineContent = { Text(title, color = color) },
        supportingContent = { Text(subtitle) },
    )
}

private fun Modifier.clickableRow(onClick: () -> Unit): Modifier = clickable(onClick = onClick)
