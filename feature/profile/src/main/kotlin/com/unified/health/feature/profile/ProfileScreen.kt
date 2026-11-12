package com.unified.health.feature.profile

import android.content.res.Resources
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
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
import androidx.compose.material.icons.outlined.GridView
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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
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
import com.unified.health.core.designsystem.R as DesignSystemR
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.theme.Gaps
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

    /** D-1188: Developer-only — Home's Metrics section shows every card, including no-data ones, while on. */
    fun setShowEmptyMetricCards(enabled: Boolean) = viewModelScope.launch { preferences.setShowEmptyMetricCards(enabled) }
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
    // D-1194: top-level tab (inside the main pager) — bottomClearance clears PillBottomNavigation's
    // floating pill, routed through AppScreen instead of this screen adding it manually (D-1144's
    // original intent carries over unchanged, just sourced from AppScreen's contentPadding now).
    AppScreen(title = stringResource(R.string.profile_title), bottomClearance = Spacing.bottomNavClearance) { contentPadding ->
        // D-1194: contentPadding chained AFTER verticalScroll (not as an outer Modifier.padding
        // before it) — the last row scrolls fully behind the gesture bar instead of stopping in a
        // dead strip above it.
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(contentPadding),
        ) {
            SettingRow(Icons.Outlined.Person, stringResource(R.string.setting_personal_info_title), stringResource(R.string.setting_personal_info_subtitle))
            SettingRow(
                Icons.Outlined.Flag,
                stringResource(R.string.setting_step_goal_title),
                stringResource(R.string.step_goal_subtitle, prefs.dailyStepGoal),
                onClick = { editingGoal = GoalField.STEPS },
                modifier = Modifier.testTag("goal_steps_row"),
            )
            SettingRow(
                Icons.Outlined.LocalFireDepartment,
                stringResource(R.string.setting_calorie_goal_title),
                calorieGoalSubtitle(prefs.activeCalorieGoalOverride, viewModel.thresholds),
                onClick = { editingGoal = GoalField.CALORIES },
                modifier = Modifier.testTag("goal_calories_row"),
            )
            SettingRow(
                Icons.Outlined.Bedtime,
                stringResource(R.string.setting_sleep_goal_title),
                sleepGoalSubtitle(prefs.sleepGoalHoursOverride, viewModel.thresholds),
                onClick = { editingGoal = GoalField.SLEEP_HOURS },
                modifier = Modifier.testTag("goal_sleep_row"),
            )
            ThresholdsReferenceCard(viewModel.thresholds)
            SettingRow(
                Icons.Outlined.Straighten,
                stringResource(R.string.setting_units_title),
                if (prefs.unitSystem == UnitSystem.METRIC) stringResource(R.string.units_metric) else stringResource(R.string.units_imperial),
                onClick = { viewModel.toggleUnits() },
            )
            // D-1184 bug fix: tri-state control (System default / English / Tiếng Việt) instead of a
            // binary toggle — see `LanguageChoice`/`currentLanguageChoice()` doc for why the old
            // binary toggle always lied and showed "English" while following the system locale.
            var languageChoice by remember { mutableStateOf(currentLanguageChoice()) }
            var languageDialogOpen by rememberSaveable { mutableStateOf(false) }
            SettingRow(
                Icons.Outlined.Language,
                stringResource(R.string.setting_language_title),
                languageChoice.displayLabel(),
                onClick = { languageDialogOpen = true },
                modifier = Modifier.testTag("language_row"),
            )
            if (languageDialogOpen) {
                LanguageDialog(
                    current = languageChoice,
                    onSelect = { choice ->
                        languageChoice = choice
                        applyLanguageChoice(choice)
                        languageDialogOpen = false
                    },
                    onDismiss = { languageDialogOpen = false },
                )
            }
            ListItem(
                leadingContent = { Icon(Icons.Outlined.Palette, contentDescription = null) },
                headlineContent = { Text(stringResource(R.string.setting_dynamic_color_title)) },
                supportingContent = { Text(stringResource(R.string.setting_dynamic_color_subtitle)) },
                trailingContent = { Switch(checked = prefs.useDynamicColor, onCheckedChange = { viewModel.setDynamicColor(it) }) },
            )
            // Reference/discovery content (D-1184/D-1185's closing note), kept here rather than on
            // Home like the Training guide — the user asked for it as a Profile row, not a daily-use
            // metric.
            SettingRow(
                Icons.Outlined.Checkroom,
                stringResource(R.string.setting_gear_title),
                stringResource(R.string.setting_gear_subtitle),
                onClick = onOpenGear,
                modifier = Modifier.testTag("gear_row"),
            )
            HorizontalDivider(Modifier.padding(vertical = Spacing.sm))
            SettingRow(
                Icons.Outlined.Notifications,
                stringResource(R.string.notifications_title),
                stringResource(R.string.setting_notifications_subtitle),
                onClick = onOpenNotifications,
                modifier = Modifier.testTag("profile_notifications"),
            )
            SettingRow(Icons.Outlined.HealthAndSafety, stringResource(R.string.setting_health_connect_title), stringResource(R.string.setting_health_connect_subtitle))
            SettingRow(Icons.Outlined.PrivacyTip, stringResource(R.string.setting_privacy_title), stringResource(R.string.setting_coming_soon))
            SettingRow(Icons.Outlined.FileDownload, stringResource(R.string.setting_export_data_title), stringResource(R.string.setting_coming_soon))
            SettingRow(Icons.Outlined.DeleteForever, stringResource(R.string.setting_delete_all_data_title), stringResource(R.string.setting_coming_soon), destructive = true)
            if (viewModel.developerToolsAvailable) {
                DeveloperSection(
                    demoModeEnabled = demoModeEnabled,
                    status = developer,
                    onToggleDemoMode = viewModel::onDemoModeSwitch,
                    onFill = viewModel::fillDemoData,
                    onRequestClear = viewModel::requestClearDemoData,
                    showEmptyMetricCards = prefs.showEmptyMetricCards,
                    onToggleShowEmptyMetricCards = viewModel::setShowEmptyMetricCards,
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

@Composable
private fun calorieGoalSubtitle(override: Int?, thresholds: MetricThresholds): String =
    if (override != null) stringResource(R.string.calorie_goal_value, override) else stringResource(R.string.calorie_goal_default, thresholds.activeCalorieGoal(profile = null))

@Composable
private fun sleepGoalSubtitle(override: Int?, thresholds: MetricThresholds): String =
    if (override != null) stringResource(R.string.sleep_goal_value, override) else stringResource(R.string.sleep_goal_default, thresholds.sleepDurationHours.last)

/**
 * D-1184 bug fix: tri-state language control. `SYSTEM` (localeTag null) means "no per-app
 * override — follow the phone's own system language"; `AppCompatDelegate.getApplicationLocales()`
 * returns an *empty* `LocaleListCompat` in that state, whose `.toLanguageTags()` is `""` — the
 * pre-existing bug compared that against `"vi"` with `startsWith`, which is always false, so the
 * row always showed "English" even while correctly following a Vietnamese system locale.
 */
private enum class LanguageChoice(val localeTag: String?) {
    SYSTEM(null),
    ENGLISH("en"),
    VIETNAMESE("vi"),
}

/** Reads the *currently active* choice back from AppCompat's own per-app locale storage (D-1184: no second copy in `UserPreferences`). */
private fun currentLanguageChoice(): LanguageChoice {
    val tags = AppCompatDelegate.getApplicationLocales().toLanguageTags()
    return when {
        tags.isEmpty() -> LanguageChoice.SYSTEM
        tags.startsWith("vi") -> LanguageChoice.VIETNAMESE
        else -> LanguageChoice.ENGLISH
    }
}

/**
 * `LocaleListCompat.getEmptyLocaleList()` is AppCompat's documented way to clear a per-app locale
 * override and revert to following the system locale (the counterpart of `forLanguageTags` for an
 * explicit one) — confirmed against AppCompat's per-app language API, not guessed.
 */
private fun applyLanguageChoice(choice: LanguageChoice) {
    val locales = choice.localeTag?.let { LocaleListCompat.forLanguageTags(it) } ?: LocaleListCompat.getEmptyLocaleList()
    AppCompatDelegate.setApplicationLocales(locales)
}

/**
 * The phone's own system language, read via `Resources.getSystem()` (framework resources, never
 * affected by this app's own per-app locale override) rather than `Locale.getDefault()` — querying
 * the latter here would reintroduce the same class of bug, since `AppCompatDelegate` also updates
 * the process-wide default locale when an override is active.
 */
@Composable
private fun systemLanguageLabel(): String =
    if (Resources.getSystem().configuration.locales[0].language == "vi") {
        stringResource(R.string.language_vietnamese)
    } else {
        stringResource(R.string.language_english)
    }

@Composable
private fun LanguageChoice.displayLabel(): String = when (this) {
    LanguageChoice.SYSTEM -> stringResource(R.string.language_system_option, systemLanguageLabel())
    LanguageChoice.ENGLISH -> stringResource(R.string.language_english)
    LanguageChoice.VIETNAMESE -> stringResource(R.string.language_vietnamese)
}

@Composable
private fun LanguageDialog(current: LanguageChoice, onSelect: (LanguageChoice) -> Unit, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.language_dialog_title)) },
        text = {
            Column(Modifier.selectableGroup()) {
                LanguageChoice.entries.forEach { choice ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectable(selected = choice == current, onClick = { onSelect(choice) }, role = Role.RadioButton)
                            .padding(vertical = Spacing.xs)
                            .testTag("language_option_${choice.name.lowercase()}"),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        RadioButton(selected = choice == current, onClick = null)
                        Spacer(Modifier.width(Spacing.sm))
                        Text(choice.displayLabel())
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss, modifier = Modifier.testTag("language_dialog_done")) {
                Text(stringResource(DesignSystemR.string.action_done))
            }
        },
    )
}

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
        GoalField.STEPS -> stringResource(R.string.setting_step_goal_title) to prefs.dailyStepGoal
        GoalField.CALORIES -> stringResource(R.string.setting_calorie_goal_title) to (prefs.activeCalorieGoalOverride ?: thresholds.activeCalorieGoal(profile = null))
        GoalField.SLEEP_HOURS -> stringResource(R.string.setting_sleep_goal_title) to (prefs.sleepGoalHoursOverride ?: thresholds.sleepDurationHours.last)
    }
    val unit = stringResource(
        if (field == GoalField.SLEEP_HOURS) R.string.goal_unit_hours else if (field == GoalField.CALORIES) R.string.goal_unit_kcal else R.string.goal_unit_steps,
    )
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
                Text(stringResource(DesignSystemR.string.action_save))
            }
        },
        dismissButton = {
            Row {
                if (onUseDefault != null) {
                    TextButton(onClick = onUseDefault, modifier = Modifier.testTag("use_default_goal")) { Text(stringResource(R.string.use_default_goal)) }
                }
                TextButton(onClick = onDismiss) { Text(stringResource(DesignSystemR.string.action_cancel)) }
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
    OutlinedCard(Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal, vertical = Gaps.itemGap).testTag("thresholds_reference_card")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Icon(Icons.Outlined.MonitorHeart, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                Text(stringResource(R.string.thresholds_card_title), style = MaterialTheme.typography.titleSmall)
            }
            Text(
                stringResource(R.string.thresholds_resting_hr, thresholds.restingHeartRate.first, thresholds.restingHeartRate.last),
                style = MaterialTheme.typography.bodyMedium,
            )
            // Zone label/category names stay the plain English words core:domain already returns
            // (MetricThresholds/Vo2MaxCategory are not UI-copy — see strings.xml header note).
            Text(
                stringResource(
                    R.string.thresholds_hr_zones,
                    thresholds.heartRateZones.joinToString(", ") { "Z${it.zone} ${it.label} ${it.percentOfMaxHr.first}-${it.percentOfMaxHr.last}%" },
                ),
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                stringResource(R.string.thresholds_sleep_target, thresholds.sleepDurationHours.first, thresholds.sleepDurationHours.last),
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                stringResource(R.string.thresholds_spo2, thresholds.spo2.normal.first, thresholds.spo2.normal.last, thresholds.spo2.alertBelowPercent),
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                stringResource(R.string.thresholds_vo2max, Vo2MaxCategory.entries.joinToString(", ") { it.name.lowercase().replace('_', ' ') }),
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
    showEmptyMetricCards: Boolean,
    onToggleShowEmptyMetricCards: (Boolean) -> Unit,
) {
    HorizontalDivider(Modifier.padding(vertical = Spacing.sm))
    Text(
        stringResource(R.string.developer_section_title),
        style = MaterialTheme.typography.titleSmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(horizontal = Gaps.screenHorizontal, vertical = Gaps.itemGap),
    )
    val busy = status is DeveloperStatus.Working
    ListItem(
        modifier = Modifier.testTag("demo_mode_row"),
        leadingContent = { Icon(Icons.Outlined.Science, contentDescription = null) },
        headlineContent = { Text(stringResource(R.string.demo_mode_title)) },
        supportingContent = { Text(stringResource(R.string.demo_mode_subtitle)) },
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
            headlineContent = { Text(stringResource(R.string.fill_demo_data_title)) },
            supportingContent = { Text(stringResource(R.string.fill_demo_data_subtitle)) },
        )
        ListItem(
            modifier = Modifier.clickable(enabled = !busy, onClick = onRequestClear).testTag("clear_demo_data"),
            leadingContent = { Icon(Icons.Outlined.DeleteSweep, contentDescription = null, tint = MaterialTheme.colorScheme.error) },
            headlineContent = { Text(stringResource(R.string.clear_demo_data_title), color = MaterialTheme.colorScheme.error) },
            supportingContent = { Text(stringResource(R.string.clear_demo_data_subtitle)) },
        )
    }
    // D-1188: Home's "Xem tất cả" escape hatch (D-1119) was removed for normal use — Home now always
    // filters its Metrics section to cards that have data. This toggle moves that debugging
    // capability here instead: while on, Home shows every metric card, empty ones included, right
    // there on Home itself (no separate screen). Independent of "Demo mode" above — useful with or
    // without virtual watches filling data.
    ListItem(
        modifier = Modifier.testTag("show_empty_metric_cards_row"),
        leadingContent = { Icon(Icons.Outlined.GridView, contentDescription = null) },
        headlineContent = { Text(stringResource(R.string.show_empty_metric_cards_title)) },
        supportingContent = { Text(stringResource(R.string.show_empty_metric_cards_subtitle)) },
        trailingContent = {
            Switch(
                checked = showEmptyMetricCards,
                onCheckedChange = onToggleShowEmptyMetricCards,
                modifier = Modifier.testTag("show_empty_metric_cards_switch"),
            )
        },
    )
    when (status) {
        DeveloperStatus.Idle -> Unit
        is DeveloperStatus.Working -> LinearProgressIndicator(Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal))
        is DeveloperStatus.Done -> Text(
            status.message,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("developer_status"),
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
            title = { Text(stringResource(R.string.turn_off_demo_mode_title)) },
            text = { Text(stringResource(R.string.turn_off_demo_mode_text)) },
            confirmButton = {
                TextButton(onClick = { onConfirmTurnOff(true) }, modifier = Modifier.testTag("confirm_turn_off_and_clear")) {
                    Text(stringResource(R.string.turn_off_and_clear_data))
                }
            },
            dismissButton = {
                TextButton(onClick = { onConfirmTurnOff(false) }, modifier = Modifier.testTag("confirm_turn_off_keep_data")) {
                    Text(stringResource(R.string.turn_off_keep_data))
                }
            },
        )
        DeveloperDialog.ConfirmClearDemoData -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text(stringResource(R.string.clear_demo_data_dialog_title)) },
            text = { Text(stringResource(R.string.clear_demo_data_dialog_text)) },
            confirmButton = {
                TextButton(onClick = onConfirmClear, modifier = Modifier.testTag("confirm_clear_demo_data")) { Text(stringResource(R.string.action_clear)) }
            },
            dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
        )
    }
}
