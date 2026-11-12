package com.unified.health.feature.profile.notifications

import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.BatteryAlert
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.NotificationsOff
import androidx.compose.material.icons.outlined.Sync
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.core.app.NotificationManagerCompat
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.LifecycleResumeEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.permission.RuntimePermissions
import com.unified.health.core.designsystem.theme.ChromeRipple
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.feature.profile.R
import com.unified.health.core.designsystem.R as DesignSystemR
import java.text.NumberFormat

@Composable
internal fun NotificationSettingsRoute(onBack: () -> Unit, viewModel: NotificationSettingsViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val context = LocalContext.current
    var enabled by remember { mutableStateOf(context.notificationsAllowed()) }
    LifecycleResumeEffect(Unit) {
        enabled = context.notificationsAllowed()
        onPauseOrDispose { }
    }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { enabled = context.notificationsAllowed() }
    NotificationSettingsScreen(
        state = state,
        systemNotificationsEnabled = enabled,
        onBack = onBack,
        onAllow = {
            val permission = RuntimePermissions.notifications.firstOrNull()
            if (permission != null && !RuntimePermissions.allGranted(context, RuntimePermissions.notifications)) launcher.launch(permission) else context.openNotificationSettings()
        },
        onOpenSystemSettings = { context.openNotificationSettings() },
        onGoalAchieved = viewModel::setGoalAchieved,
        onLowWatchBattery = viewModel::setLowWatchBattery,
        onSyncReminders = viewModel::setSyncReminders,
    )
}

/** Profile › Notifications: which local alerts this phone may post. Nothing is pushed to the watch. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun NotificationSettingsScreen(
    state: NotificationSettingsUiState,
    systemNotificationsEnabled: Boolean,
    onBack: () -> Unit,
    onAllow: () -> Unit,
    onOpenSystemSettings: () -> Unit,
    onGoalAchieved: (Boolean) -> Unit,
    onLowWatchBattery: (Boolean) -> Unit,
    onSyncReminders: (Boolean) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.notifications_title)) },
                // D-1189: app chrome, not this screen's own content — restores the normal ripple.
                navigationIcon = {
                    ChromeRipple {
                        IconButton(onClick = onBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(DesignSystemR.string.nav_back))
                        }
                    }
                },
            )
        },
    ) { padding ->
        if (state.isLoading) {
            LoadingState(Modifier.padding(padding))
            return@Scaffold
        }
        val prefs = state.preferences
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState()).padding(horizontal = Spacing.lg).testTag("notification_settings"),
            verticalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            if (!systemNotificationsEnabled) {
                ElevatedCard(Modifier.fillMaxWidth().testTag("notifications_blocked")) {
                    Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.NotificationsOff, contentDescription = null, tint = MaterialTheme.colorScheme.error)
                            Spacer(Modifier.width(Spacing.sm))
                            Text(stringResource(R.string.notifications_blocked_title), style = MaterialTheme.typography.titleMedium)
                        }
                        Text(
                            stringResource(R.string.notifications_blocked_text),
                            style = MaterialTheme.typography.bodyMedium,
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                            FilledTonalButton(onClick = onAllow, modifier = Modifier.testTag("notifications_allow")) { Text(stringResource(R.string.action_allow)) }
                            TextButton(onClick = onOpenSystemSettings) { Text(stringResource(R.string.action_system_settings)) }
                        }
                    }
                }
            }
            SectionHeader(stringResource(R.string.notif_section_alerts))
            ElevatedCard(Modifier.fillMaxWidth()) {
                ToggleRow(
                    tag = "notif_goal",
                    icon = Icons.Outlined.EmojiEvents,
                    title = stringResource(R.string.notif_goal_title),
                    subtitle = stringResource(R.string.notif_goal_subtitle, NumberFormat.getIntegerInstance().format(state.dailyStepGoal)),
                    checked = prefs.goalAchieved,
                    onChange = onGoalAchieved,
                )
                HorizontalDivider(Modifier.padding(horizontal = Spacing.lg))
                ToggleRow(
                    tag = "notif_battery",
                    icon = Icons.Outlined.BatteryAlert,
                    title = stringResource(R.string.notif_battery_title),
                    subtitle = stringResource(R.string.notif_battery_subtitle, DefaultMetricThresholds.VALUES.lowBatteryPercent),
                    checked = prefs.lowWatchBattery,
                    onChange = onLowWatchBattery,
                )
                HorizontalDivider(Modifier.padding(horizontal = Spacing.lg))
                ToggleRow(
                    tag = "notif_sync",
                    icon = Icons.Outlined.Sync,
                    title = stringResource(R.string.notif_sync_title),
                    subtitle = stringResource(R.string.notif_sync_subtitle),
                    checked = prefs.syncReminders,
                    onChange = onSyncReminders,
                )
            }
            Text(
                stringResource(R.string.notif_footer),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

@Composable
private fun ToggleRow(tag: String, icon: ImageVector, title: String, subtitle: String, checked: Boolean, onChange: (Boolean) -> Unit) {
    ListItem(
        modifier = Modifier.toggleable(value = checked, role = Role.Switch, onValueChange = onChange).testTag(tag),
        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
        leadingContent = { Icon(icon, contentDescription = null) },
        headlineContent = { Text(title) },
        supportingContent = { Text(subtitle) },
        trailingContent = { Switch(checked = checked, onCheckedChange = null) },
    )
}

private fun Context.notificationsAllowed(): Boolean =
    NotificationManagerCompat.from(this).areNotificationsEnabled() && RuntimePermissions.allGranted(this, RuntimePermissions.notifications)

private fun Context.openNotificationSettings() {
    val intent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).putExtra(Settings.EXTRA_APP_PACKAGE, packageName)
    } else {
        Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, android.net.Uri.fromParts("package", packageName, null))
    }
    startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
}
