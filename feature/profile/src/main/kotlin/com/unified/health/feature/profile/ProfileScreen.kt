package com.unified.health.feature.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.Checkroom
import androidx.compose.material.icons.outlined.DeleteForever
import androidx.compose.material.icons.outlined.DeleteSweep
import androidx.compose.material.icons.outlined.Science
import androidx.compose.material.icons.outlined.FileDownload
import androidx.compose.material.icons.outlined.Flag
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material.icons.outlined.MonitorHeart
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.Straighten
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.KeyboardType
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.model.MetricThresholds
import com.unified.health.core.domain.model.Vo2MaxCategory
import com.unified.health.core.domain.repository.DemoDataController
import com.unified.health.core.domain.repository.DemoModeController
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import com.unified.health.feature.profile.notifications.NotificationSettingsRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable
import java.util.Optional
import javax.inject.Inject

/** Profile › Notifications. */
@Serializable
data object NotificationSettingsDestination

fun NavController.navigateToNotificationSettings() = navigate(NotificationSettingsDestination)

/**
 * Public entry point for [com.unified.health.navigation.MainPagerDestination]'s `HorizontalPager`
 * (D-1052) — see [com.unified.health.feature.home.navigation.HomeTabContent] for why this wrapper
 * exists (`ProfileRoute` itself stays internal).
 */
@Composable
fun ProfileTabContent(onOpenNotifications: () -> Unit, onOpenGear: () -> Unit) {
    ProfileRoute(onOpenNotifications = onOpenNotifications, onOpenGear = onOpenGear)
}

fun NavGraphBuilder.notificationSettingsScreen(onBack: () -> Unit) {
    composable<NotificationSettingsDestination> { NotificationSettingsRoute(onBack = onBack) }
}

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val preferences: UserPreferencesRepository,
    demoData: Optional<DemoDataController>,
    demoMode: Optional<DemoModeController>,
) : ViewModel() {
    val prefs: StateFlow<UserPreferences> =
        preferences.userPreferences.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), UserPreferences())

    /** Industry-default "what counts as normal" ranges (docs/DECISIONS.md D-1030); not user-adjustable in this round. */
    val thresholds: MetricThresholds = DefaultMetricThresholds.VALUES

    /** Present only in debug/androidTest builds (see `:core:demo`); the Developer section is hidden otherwise. */
    private val demo: DemoDataController? = demoData.orElse(null)
    private val mode: DemoModeController? = demoMode.orElse(null)
    val developerToolsAvailable: Boolean get() = demo != null && mode != null

    /** Default OFF when the controller is absent (release/no Developer section), mirroring its persisted default. */
    val demoModeEnabled: StateFlow<Boolean> = mode?.enabled ?: MutableStateFlow(false).asStateFlow()

    private val _developerStatus = MutableStateFlow<DeveloperStatus>(DeveloperStatus.Idle)
    val developerStatus: StateFlow<DeveloperStatus> = _developerStatus.asStateFlow()

    private val _dialog = MutableStateFlow<DeveloperDialog?>(null)
    val dialog: StateFlow<DeveloperDialog?> = _dialog.asStateFlow()

    /** The switch itself only ever turns demo mode on directly; turning it off always asks first (never silently drops data). */
    fun onDemoModeSwitch(turnOn: Boolean) {
        val controller = mode ?: return
        if (turnOn) {
            viewModelScope.launch { controller.setEnabled(true) }
        } else {
            _dialog.value = DeveloperDialog.ConfirmTurnOffDemoMode
        }
    }

    fun confirmTurnOffDemoMode(alsoClearData: Boolean) {
        val controller = mode ?: return
        _dialog.value = null
        viewModelScope.launch {
            if (alsoClearData) demo?.clearDemoData()
            controller.setEnabled(false)
        }
    }

    fun requestClearDemoData() {
        _dialog.value = DeveloperDialog.ConfirmClearDemoData
    }

    fun confirmClearDemoData() {
        _dialog.value = null
        runDeveloperTask("Clearing…") { it.clearDemoData(); "Demo data cleared" }
    }

    fun dismissDialog() {
        _dialog.value = null
    }

    fun fillDemoData() = runDeveloperTask("Filling…") { "Filled ${it.seed()} records (90 days)" }

    private fun runDeveloperTask(working: String, task: suspend (DemoDataController) -> String) {
        val controller = demo ?: return
        if (_developerStatus.value is DeveloperStatus.Working) return
        viewModelScope.launch {
            _developerStatus.value = DeveloperStatus.Working(working)
            _developerStatus.value = runCatching { task(controller) }
                .fold(onSuccess = { DeveloperStatus.Done(it) }, onFailure = { DeveloperStatus.Done(it.message ?: "Failed") })
        }
    }

    fun setDynamicColor(enabled: Boolean) = viewModelScope.launch { preferences.setUseDynamicColor(enabled) }

    fun toggleUnits() = viewModelScope.launch {
        val next = if (prefs.value.unitSystem == UnitSystem.METRIC) UnitSystem.IMPERIAL else UnitSystem.METRIC
        preferences.setUnitSystem(next)
    }

    fun setStepGoal(steps: Int) = viewModelScope.launch { preferences.setDailyStepGoal(steps) }

    /** Null resets to [MetricThresholds.activeCalorieGoal]'s default. */
    fun setCalorieGoalOverride(kcal: Int?) = viewModelScope.launch { preferences.setActiveCalorieGoalOverride(kcal) }

    /** Null resets to [MetricThresholds.sleepDurationHours]'s default. */
    fun setSleepGoalOverride(hours: Int?) = viewModelScope.launch { preferences.setSleepGoalHoursOverride(hours) }
}

sealed interface DeveloperStatus {
    data object Idle : DeveloperStatus
    data class Working(val label: String) : DeveloperStatus
    data class Done(val message: String) : DeveloperStatus
}

/** Confirmation dialogs the Developer section can be showing; never act without one for a destructive step. */
sealed interface DeveloperDialog {
    data object ConfirmTurnOffDemoMode : DeveloperDialog
    data object ConfirmClearDemoData : DeveloperDialog
}

/** Placeholder settings list; most rows are not wired yet (see FEATURES.md §Profile & settings). */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ProfileRoute(onOpenNotifications: () -> Unit, onOpenGear: () -> Unit, viewModel: ProfileViewModel = hiltViewModel()) {
    val prefs by viewModel.prefs.collectAsStateWithLifecycle()
    val developer by viewModel.developerStatus.collectAsStateWithLifecycle()
    val demoModeEnabled by viewModel.demoModeEnabled.collectAsStateWithLifecycle()
    val dialog by viewModel.dialog.collectAsStateWithLifecycle()
    var editingGoal by rememberSaveable { mutableStateOf<GoalField?>(null) }
    Scaffold(topBar = { TopAppBar(title = { Text("Profile") }) }) { padding ->
        // D-1144: trailing Spacing.bottomNavClearance (applied *after* verticalScroll, so it extends
        // the scrollable content itself rather than just shrinking the viewport) — the pill nav now
        // floats as a Box overlay over this tab's content instead of reserving Scaffold space, so
        // without this the last row would sit permanently behind it.
        Column(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(bottom = Spacing.bottomNavClearance),
        ) {
            SettingRow(Icons.Outlined.Person, "Personal info", "Height, weight, birthday (coming soon)")
            SettingRow(
                Icons.Outlined.Flag,
                "Daily step goal",
                "${prefs.dailyStepGoal} steps",
                onClick = { editingGoal = GoalField.STEPS },
                modifier = Modifier.testTag("goal_steps_row"),
            )
            SettingRow(
                Icons.Outlined.LocalFireDepartment,
                "Active calorie goal",
                calorieGoalSubtitle(prefs.activeCalorieGoalOverride, viewModel.thresholds),
                onClick = { editingGoal = GoalField.CALORIES },
                modifier = Modifier.testTag("goal_calories_row"),
            )
            SettingRow(
                Icons.Outlined.Bedtime,
                "Sleep goal",
                sleepGoalSubtitle(prefs.sleepGoalHoursOverride, viewModel.thresholds),
                onClick = { editingGoal = GoalField.SLEEP_HOURS },
                modifier = Modifier.testTag("goal_sleep_row"),
            )
            ThresholdsReferenceCard(viewModel.thresholds)
            SettingRow(
                Icons.Outlined.Straighten,
                "Units",
                if (prefs.unitSystem == UnitSystem.METRIC) "Metric (km, kg)" else "Imperial (mi, lb)",
                onClick = { viewModel.toggleUnits() },
            )
            // D-1040: EN/VI toggle for the whole app's UI language — independent of the phone's own
            // system locale (Vietnamese users often leave the phone itself in English). Not tied to
            // `UserPreferences`: `AppCompatDelegate.setApplicationLocales` already persists the choice
            // across restarts via its own per-app locale storage (no AppCompatActivity required since
            // appcompat 1.6+), so reading `getApplicationLocales()` back here is enough — a second
            // copy in `UserPreferences` would just be a redundant source of truth to keep in sync.
            // This row's own copy stays in plain English/Vietnamese literals like the rest of this
            // screen (D-1040 scoped Profile's *content* localization to a follow-up task; only the
            // toggle itself — the thing that makes everything else testable — is in scope here).
            var isVietnamese by remember { mutableStateOf(AppCompatDelegate.getApplicationLocales().toLanguageTags().startsWith("vi")) }
            SettingRow(
                Icons.Outlined.Language,
                "Language",
                if (isVietnamese) "Tiếng Việt" else "English",
                onClick = {
                    isVietnamese = !isVietnamese
                    AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(if (isVietnamese) "vi" else "en"))
                },
                modifier = Modifier.testTag("language_row"),
            )
            ListItem(
                leadingContent = { Icon(Icons.Outlined.Palette, contentDescription = null) },
                headlineContent = { Text("Dynamic color") },
                supportingContent = { Text("Use wallpaper colors (Android 12+)") },
                trailingContent = { Switch(checked = prefs.useDynamicColor, onCheckedChange = { viewModel.setDynamicColor(it) }) },
            )
            // Reference/discovery content (D-1184/D-1185's closing note), kept here rather than on
            // Home like the Training guide — the user asked for it as a Profile row, not a daily-use
            // metric. This row's own label/subtitle stay in plain Vietnamese like the Races/Training
            // entry points (not routed through the EN-baseline strings.xml localization system).
            SettingRow(
                Icons.Outlined.Checkroom,
                "Trang bị tham khảo",
                "Giày, quần áo, phụ kiện chạy bộ từ các hãng — xem và mua tại trang hãng",
                onClick = onOpenGear,
                modifier = Modifier.testTag("gear_row"),
            )
            HorizontalDivider(Modifier.padding(vertical = Spacing.sm))
            SettingRow(
                Icons.Outlined.Notifications,
                "Notifications",
                "Goal achieved, low watch battery, sync reminders",
                onClick = onOpenNotifications,
                modifier = Modifier.testTag("profile_notifications"),
            )
            SettingRow(Icons.Outlined.HealthAndSafety, "Health Connect", "Manage data sharing (coming soon)")
            SettingRow(Icons.Outlined.PrivacyTip, "Privacy", "Coming soon")
            SettingRow(Icons.Outlined.FileDownload, "Export data", "Coming soon")
            SettingRow(Icons.Outlined.DeleteForever, "Delete all data", "Coming soon", destructive = true)
            if (viewModel.developerToolsAvailable) {
                DeveloperSection(
                    demoModeEnabled = demoModeEnabled,
                    status = developer,
                    onToggleDemoMode = viewModel::onDemoModeSwitch,
                    onFill = viewModel::fillDemoData,
                    onRequestClear = viewModel::requestClearDemoData,
                )
            }
        }
    }
    editingGoal?.let { field ->
        GoalEditDialog(
            field = field,
            prefs = prefs,
            thresholds = viewModel.thresholds,
            onDismiss = { editingGoal = null },
            onSave = { value ->
                when (field) {
                    GoalField.STEPS -> viewModel.setStepGoal(value)
                    GoalField.CALORIES -> viewModel.setCalorieGoalOverride(value)
                    GoalField.SLEEP_HOURS -> viewModel.setSleepGoalOverride(value)
                }
                editingGoal = null
            },
            onUseDefault = if (field == GoalField.STEPS) null else {
                {
                    if (field == GoalField.CALORIES) viewModel.setCalorieGoalOverride(null) else viewModel.setSleepGoalOverride(null)
                    editingGoal = null
                }
            },
        )
    }
    dialog?.let { current ->
        DeveloperDialogHost(
            dialog = current,
            onConfirmTurnOff = viewModel::confirmTurnOffDemoMode,
            onConfirmClear = viewModel::confirmClearDemoData,
            onDismiss = viewModel::dismissDialog,
        )
    }
}

@Composable
private fun SettingRow(
    icon: ImageVector,
    title: String,
    subtitle: String,
    destructive: Boolean = false,
    onClick: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
) {
    val color = if (destructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
    ListItem(
        modifier = if (onClick != null) modifier.clickableRow(onClick) else modifier,
        leadingContent = { Icon(icon, contentDescription = null, tint = color) },
        headlineContent = { Text(title, color = color) },
        supportingContent = { Text(subtitle) },
    )
}

private fun Modifier.clickableRow(onClick: () -> Unit): Modifier = clickable(onClick = onClick)

/** Which goal [GoalEditDialog] is editing. */
private enum class GoalField { STEPS, CALORIES, SLEEP_HOURS }

private fun calorieGoalSubtitle(override: Int?, thresholds: MetricThresholds): String =
    if (override != null) "$override kcal" else "${thresholds.activeCalorieGoal(profile = null)} kcal (default)"

private fun sleepGoalSubtitle(override: Int?, thresholds: MetricThresholds): String =
    if (override != null) "$override h" else "${thresholds.sleepDurationHours.last} h (default)"

/**
 * Everything this dialog edits is a positive integer goal (steps/kcal/hours); only step goal has no
 * "use default" option since it has no separate [MetricThresholds] fallback to reset to.
 */
@Composable
private fun GoalEditDialog(
    field: GoalField,
    prefs: UserPreferences,
    thresholds: MetricThresholds,
    onSave: (Int) -> Unit,
    onUseDefault: (() -> Unit)?,
    onDismiss: () -> Unit,
) {
    val (title, initial) = when (field) {
        GoalField.STEPS -> "Daily step goal" to prefs.dailyStepGoal
        GoalField.CALORIES -> "Active calorie goal" to (prefs.activeCalorieGoalOverride ?: thresholds.activeCalorieGoal(profile = null))
        GoalField.SLEEP_HOURS -> "Sleep goal" to (prefs.sleepGoalHoursOverride ?: thresholds.sleepDurationHours.last)
    }
    val unit = if (field == GoalField.SLEEP_HOURS) "hours" else if (field == GoalField.CALORIES) "kcal" else "steps"
    var value by rememberSaveable(field) { mutableStateOf(initial.toString()) }
    val parsed = value.toIntOrNull()
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = {
            OutlinedTextField(
                value = value,
                onValueChange = { input -> value = input.filter(Char::isDigit) },
                singleLine = true,
                label = { Text(unit) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.testTag("goal_value_field"),
            )
        },
        confirmButton = {
            TextButton(onClick = { parsed?.let(onSave) }, enabled = parsed != null && parsed > 0, modifier = Modifier.testTag("save_goal")) {
                Text("Save")
            }
        },
        dismissButton = {
            Row {
                if (onUseDefault != null) {
                    TextButton(onClick = onUseDefault, modifier = Modifier.testTag("use_default_goal")) { Text("Use default") }
                }
                TextButton(onClick = onDismiss) { Text("Cancel") }
            }
        },
    )
}

/**
 * Read-only reference ranges (docs/DECISIONS.md D-1030): HR zones, SpO2, sleep target and VO2max
 * bands are not editable in this first round.
 */
@Composable
private fun ThresholdsReferenceCard(thresholds: MetricThresholds) {
    OutlinedCard(Modifier.fillMaxWidth().padding(horizontal = Spacing.lg, vertical = Spacing.sm).testTag("thresholds_reference_card")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Icon(Icons.Outlined.MonitorHeart, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                Text("Health reference ranges", style = MaterialTheme.typography.titleSmall)
            }
            Text(
                "Resting heart rate: ${thresholds.restingHeartRate.first}-${thresholds.restingHeartRate.last} bpm",
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                "Heart rate zones (% of max HR): " +
                    thresholds.heartRateZones.joinToString(", ") { "Z${it.zone} ${it.label} ${it.percentOfMaxHr.first}-${it.percentOfMaxHr.last}%" },
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                "Sleep target: ${thresholds.sleepDurationHours.first}-${thresholds.sleepDurationHours.last} h/night",
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                "SpO2: normal ${thresholds.spo2.normal.first}-${thresholds.spo2.normal.last}%, alert below ${thresholds.spo2.alertBelowPercent}%",
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                "VO2max bands (by age & sex): " + Vo2MaxCategory.entries.joinToString(", ") { it.name.lowercase().replace('_', ' ') },
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}

/**
 * Debug builds only: "Demo mode" (default off, persisted) controls whether virtual watches show up
 * in scan; while it is on, "Fill demo data" / "Clear demo data" fill or wipe only demo-tagged rows
 * so every chart can be inspected without ever touching real watch data.
 */
@Composable
private fun DeveloperSection(
    demoModeEnabled: Boolean,
    status: DeveloperStatus,
    onToggleDemoMode: (Boolean) -> Unit,
    onFill: () -> Unit,
    onRequestClear: () -> Unit,
) {
    HorizontalDivider(Modifier.padding(vertical = Spacing.sm))
    Text(
        "Developer (debug build)",
        style = MaterialTheme.typography.titleSmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(horizontal = Spacing.lg, vertical = Spacing.sm),
    )
    val busy = status is DeveloperStatus.Working
    ListItem(
        modifier = Modifier.testTag("demo_mode_row"),
        leadingContent = { Icon(Icons.Outlined.Science, contentDescription = null) },
        headlineContent = { Text("Demo mode") },
        supportingContent = { Text("Show virtual watches (Garmin, Zepp, Huawei, SIG band, generic) in scan") },
        trailingContent = {
            Switch(
                checked = demoModeEnabled,
                onCheckedChange = onToggleDemoMode,
                modifier = Modifier.testTag("demo_mode_switch"),
            )
        },
    )
    if (demoModeEnabled) {
        ListItem(
            modifier = Modifier.clickable(enabled = !busy, onClick = onFill).testTag("fill_demo_data"),
            leadingContent = { Icon(Icons.Outlined.Science, contentDescription = null) },
            headlineContent = { Text("Fill demo data") },
            supportingContent = { Text("Write ~90 days of every metric into local storage") },
        )
        ListItem(
            modifier = Modifier.clickable(enabled = !busy, onClick = onRequestClear).testTag("clear_demo_data"),
            leadingContent = { Icon(Icons.Outlined.DeleteSweep, contentDescription = null, tint = MaterialTheme.colorScheme.error) },
            headlineContent = { Text("Clear demo data", color = MaterialTheme.colorScheme.error) },
            supportingContent = { Text("Delete only demo-seeded data; real watch data is kept") },
        )
    }
    when (status) {
        DeveloperStatus.Idle -> Unit
        is DeveloperStatus.Working -> LinearProgressIndicator(Modifier.fillMaxWidth().padding(horizontal = Spacing.lg))
        is DeveloperStatus.Done -> Text(
            status.message,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(horizontal = Spacing.lg).testTag("developer_status"),
        )
    }
}

@Composable
private fun DeveloperDialogHost(
    dialog: DeveloperDialog,
    onConfirmTurnOff: (alsoClearData: Boolean) -> Unit,
    onConfirmClear: () -> Unit,
    onDismiss: () -> Unit,
) {
    when (dialog) {
        DeveloperDialog.ConfirmTurnOffDemoMode -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("Turn off demo mode?") },
            text = { Text("Virtual watches will stop appearing in scan. You can also clear the demo data they filled.") },
            confirmButton = {
                TextButton(onClick = { onConfirmTurnOff(true) }, modifier = Modifier.testTag("confirm_turn_off_and_clear")) {
                    Text("Turn off and clear data")
                }
            },
            dismissButton = {
                TextButton(onClick = { onConfirmTurnOff(false) }, modifier = Modifier.testTag("confirm_turn_off_keep_data")) {
                    Text("Turn off, keep data")
                }
            },
        )
        DeveloperDialog.ConfirmClearDemoData -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("Clear demo data?") },
            text = { Text("This removes only demo-seeded data; any real watch data is kept.") },
            confirmButton = {
                TextButton(onClick = onConfirmClear, modifier = Modifier.testTag("confirm_clear_demo_data")) { Text("Clear") }
            },
            dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } },
        )
    }
}
