package com.unified.health.feature.onboarding

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.PowerManager
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BatterySaver
import androidx.compose.material.icons.outlined.Bluetooth
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.health.connect.client.PermissionController
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.LifecycleResumeEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.permission.RuntimePermissions
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.HealthConnectAvailability

@Composable
internal fun OnboardingRoute(onFinished: () -> Unit, viewModel: OnboardingViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    Surface(Modifier.fillMaxSize()) {
        when (state.step) {
            OnboardingStep.WELCOME -> WelcomeStep(onNext = { viewModel.goTo(OnboardingStep.PERMISSIONS) })
            OnboardingStep.PERMISSIONS -> PermissionsStep(
                state = state,
                healthConnectPermissions = viewModel.healthConnectPermissions,
                onHealthConnectResult = viewModel::refreshHealthConnect,
                onFinish = { viewModel.finish(onFinished) },
            )
        }
    }
}

@Composable
private fun WelcomeStep(onNext: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().safeDrawingPadding().padding(Spacing.xl),
        verticalArrangement = Arrangement.spacedBy(Spacing.lg, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            Icons.Outlined.FavoriteBorder,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(96.dp),
        )
        Text(
            // Brand name, identical in every locale — stays a plain literal (same treatment as
            // DeviceSyncService.kt's notification title), not routed through strings.xml.
            "Unified Health",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.semantics { heading() },
        )
        Text(
            stringResource(R.string.onboarding_tagline),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Spacer(Modifier.height(Spacing.lg))
        Button(onClick = onNext, modifier = Modifier.fillMaxWidth().testTag("get_started")) { Text(stringResource(R.string.action_get_started)) }
    }
}

@Composable
private fun PermissionsStep(
    state: OnboardingUiState,
    healthConnectPermissions: Set<String>,
    onHealthConnectResult: () -> Unit,
    onFinish: () -> Unit,
) {
    val context = LocalContext.current
    // Bumped to force re-evaluation of permission status after returning to the screen.
    var refreshTick by remember { mutableIntStateOf(0) }
    LifecycleResumeEffect(Unit) {
        refreshTick++
        onHealthConnectResult()
        onPauseOrDispose { }
    }

    val bluetoothGranted = remember(refreshTick) { RuntimePermissions.allGranted(context, RuntimePermissions.bluetooth) }
    val notificationsGranted = remember(refreshTick) { RuntimePermissions.allGranted(context, RuntimePermissions.notifications) }
    val batteryUnrestricted = remember(refreshTick) { context.isIgnoringBatteryOptimizations() }

    val runtimeLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
        refreshTick++
    }
    val healthConnectLauncher = rememberLauncherForActivityResult(
        PermissionController.createRequestPermissionResultContract(),
    ) { onHealthConnectResult() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .verticalScroll(rememberScrollState())
            .padding(Spacing.lg),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
    ) {
        Text(stringResource(R.string.onboarding_permissions_title), style = MaterialTheme.typography.headlineMedium, modifier = Modifier.semantics { heading() })
        Text(
            stringResource(R.string.onboarding_permissions_subtitle),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        PermissionItem(
            icon = Icons.Outlined.Bluetooth,
            title = stringResource(R.string.permission_bluetooth_title),
            description = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                stringResource(R.string.permission_bluetooth_desc_modern)
            } else {
                stringResource(R.string.permission_bluetooth_desc_legacy)
            },
            granted = bluetoothGranted,
            tag = "bluetooth",
            onGrant = { runtimeLauncher.launch(RuntimePermissions.bluetooth.toTypedArray()) },
        )
        if (RuntimePermissions.notifications.isNotEmpty()) {
            PermissionItem(
                icon = Icons.Outlined.Notifications,
                title = stringResource(R.string.permission_notifications_title),
                description = stringResource(R.string.permission_notifications_desc),
                granted = notificationsGranted,
                tag = "notifications",
                onGrant = { runtimeLauncher.launch(RuntimePermissions.notifications.toTypedArray()) },
            )
        }
        PermissionItem(
            icon = Icons.Outlined.HealthAndSafety,
            title = stringResource(R.string.permission_health_connect_title),
            description = when (state.healthConnectAvailability) {
                HealthConnectAvailability.AVAILABLE -> stringResource(R.string.permission_health_connect_desc_available)
                HealthConnectAvailability.NOT_INSTALLED -> stringResource(R.string.permission_health_connect_desc_not_installed)
                HealthConnectAvailability.NOT_SUPPORTED -> stringResource(R.string.permission_health_connect_desc_not_supported)
            },
            granted = state.healthConnectGranted,
            tag = "health_connect",
            enabled = state.healthConnectAvailability == HealthConnectAvailability.AVAILABLE,
            onGrant = { healthConnectLauncher.launch(healthConnectPermissions) },
        )
        PermissionItem(
            icon = Icons.Outlined.BatterySaver,
            title = stringResource(R.string.permission_battery_title),
            description = stringResource(R.string.permission_battery_desc),
            granted = batteryUnrestricted,
            tag = "battery",
            grantLabel = stringResource(R.string.action_open_settings),
            onGrant = { context.openBatteryOptimizationSettings() },
        )

        Spacer(Modifier.height(Spacing.lg))
        Button(onClick = onFinish, modifier = Modifier.fillMaxWidth().testTag("onboarding_continue")) { Text(stringResource(R.string.action_continue)) }
        TextButton(onClick = onFinish, modifier = Modifier.fillMaxWidth()) { Text(stringResource(R.string.action_skip_for_now)) }
    }
}

@Composable
private fun PermissionItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    description: String,
    granted: Boolean,
    onGrant: () -> Unit,
    tag: String,
    enabled: Boolean = true,
    grantLabel: String = stringResource(R.string.action_allow),
) {
    Card(Modifier.fillMaxWidth().testTag("permission_$tag")) {
        Row(Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Spacer(Modifier.width(Spacing.md))
            Column(Modifier.weight(1f)) {
                Text(title, style = MaterialTheme.typography.titleSmall)
                Text(description, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Spacer(Modifier.width(Spacing.sm))
            if (granted) {
                Icon(
                    Icons.Outlined.CheckCircle,
                    contentDescription = stringResource(R.string.cd_granted),
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.testTag("granted_$tag"),
                )
            } else {
                FilledTonalButton(onClick = onGrant, enabled = enabled, modifier = Modifier.testTag("grant_$tag")) { Text(grantLabel) }
            }
        }
    }
}

private fun Context.isIgnoringBatteryOptimizations(): Boolean =
    (getSystemService(Context.POWER_SERVICE) as PowerManager).isIgnoringBatteryOptimizations(packageName)

/** Uses the settings list (no REQUEST_IGNORE_BATTERY_OPTIMIZATIONS permission, which Play restricts). */
@SuppressLint("BatteryLife")
private fun Context.openBatteryOptimizationSettings() {
    startActivity(Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
}
