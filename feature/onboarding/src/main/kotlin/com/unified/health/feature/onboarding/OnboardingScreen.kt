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
            "Unified Health",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.semantics { heading() },
        )
        Text(
            "All your health data from your wearable in one place: steps, heart rate, sleep, SpO2 and stress.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Spacer(Modifier.height(Spacing.lg))
        Button(onClick = onNext, modifier = Modifier.fillMaxWidth()) { Text("Get started") }
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
        Text("Permissions", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.semantics { heading() })
        Text(
            "Grant what you need now; you can change these later in Settings.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        PermissionItem(
            icon = Icons.Outlined.Bluetooth,
            title = "Nearby devices (Bluetooth)",
            description = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                "Find and connect to your watch or band. Your location is not used."
            } else {
                "Android 11 and below require location access to scan for Bluetooth devices."
            },
            granted = bluetoothGranted,
            onGrant = { runtimeLauncher.launch(RuntimePermissions.bluetooth.toTypedArray()) },
        )
        if (RuntimePermissions.notifications.isNotEmpty()) {
            PermissionItem(
                icon = Icons.Outlined.Notifications,
                title = "Notifications",
                description = "Sync status, goal reminders and health alerts.",
                granted = notificationsGranted,
                onGrant = { runtimeLauncher.launch(RuntimePermissions.notifications.toTypedArray()) },
            )
        }
        PermissionItem(
            icon = Icons.Outlined.HealthAndSafety,
            title = "Health Connect",
            description = when (state.healthConnectAvailability) {
                HealthConnectAvailability.AVAILABLE -> "Share health data with other apps through Health Connect."
                HealthConnectAvailability.NOT_INSTALLED -> "Health Connect needs to be installed or updated."
                HealthConnectAvailability.NOT_SUPPORTED -> "Health Connect is not supported on this device."
            },
            granted = state.healthConnectGranted,
            enabled = state.healthConnectAvailability == HealthConnectAvailability.AVAILABLE,
            onGrant = { healthConnectLauncher.launch(healthConnectPermissions) },
        )
        PermissionItem(
            icon = Icons.Outlined.BatterySaver,
            title = "Background activity",
            description = "Allow unrestricted battery use so the watch keeps syncing in the background.",
            granted = batteryUnrestricted,
            grantLabel = "Open settings",
            onGrant = { context.openBatteryOptimizationSettings() },
        )

        Spacer(Modifier.height(Spacing.lg))
        Button(onClick = onFinish, modifier = Modifier.fillMaxWidth()) { Text("Continue") }
        TextButton(onClick = onFinish, modifier = Modifier.fillMaxWidth()) { Text("Skip for now") }
    }
}

@Composable
private fun PermissionItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    description: String,
    granted: Boolean,
    onGrant: () -> Unit,
    enabled: Boolean = true,
    grantLabel: String = "Allow",
) {
    Card(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Spacer(Modifier.width(Spacing.md))
            Column(Modifier.weight(1f)) {
                Text(title, style = MaterialTheme.typography.titleSmall)
                Text(description, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Spacer(Modifier.width(Spacing.sm))
            if (granted) {
                Icon(Icons.Outlined.CheckCircle, contentDescription = "Granted", tint = MaterialTheme.colorScheme.primary)
            } else {
                FilledTonalButton(onClick = onGrant, enabled = enabled) { Text(grantLabel) }
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
