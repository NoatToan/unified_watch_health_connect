package com.unified.health.feature.devices.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.LinkOff
import androidx.compose.material.icons.outlined.MonitorHeart
import androidx.compose.material.icons.outlined.Sync
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
internal fun DeviceDetailRoute(onBack: () -> Unit, viewModel: DeviceDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    LaunchedEffect(state) {
        if ((state as? DeviceDetailUiState.Gone)?.unpaired == true) onBack()
    }
    DeviceDetailScreen(
        state = state,
        onBack = onBack,
        onSync = viewModel::syncNow,
        onConnect = viewModel::connect,
        onDisconnect = viewModel::disconnect,
        onUnpair = viewModel::unpair,
        onMessageShown = viewModel::messageShown,
    )
}

/** "About this device": identity, link state, what it supports, per-device sync and unpair. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun DeviceDetailScreen(
    state: DeviceDetailUiState,
    onBack: () -> Unit,
    onSync: () -> Unit,
    onConnect: () -> Unit,
    onDisconnect: () -> Unit,
    onUnpair: () -> Unit,
    onMessageShown: () -> Unit,
) {
    val snackbar = remember { SnackbarHostState() }
    val message = (state as? DeviceDetailUiState.Success)?.message
    LaunchedEffect(message) {
        message?.let {
            snackbar.showSnackbar(it)
            onMessageShown()
        }
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text((state as? DeviceDetailUiState.Success)?.device?.name ?: "Device") },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } },
            )
        },
        snackbarHost = { SnackbarHost(snackbar) },
    ) { padding ->
        when (state) {
            DeviceDetailUiState.Loading -> LoadingState(Modifier.padding(padding))
            is DeviceDetailUiState.Gone -> EmptyState(
                title = "Device not paired",
                message = "This device is no longer paired with the app. Data it synced is kept.",
                icon = Icons.Outlined.LinkOff,
                modifier = Modifier.padding(padding).testTag("device_gone"),
            )
            is DeviceDetailUiState.Success -> DeviceDetailContent(state, Modifier.padding(padding), onSync, onConnect, onDisconnect, onUnpair)
        }
    }
}

@Composable
private fun DeviceDetailContent(
    state: DeviceDetailUiState.Success,
    modifier: Modifier,
    onSync: () -> Unit,
    onConnect: () -> Unit,
    onDisconnect: () -> Unit,
    onUnpair: () -> Unit,
) {
    val device = state.device
    var confirmUnpair by rememberSaveable { mutableStateOf(false) }
    val connected = device.connectionState == ConnectionState.Connected
    val connecting = device.connectionState == ConnectionState.Connecting || device.connectionState == ConnectionState.Authenticating
    val syncing = connected && state.syncState is SyncState.InProgress

    Column(
        modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = Spacing.lg).testTag("device_detail"),
        verticalArrangement = Arrangement.spacedBy(Spacing.lg),
    ) {
        ElevatedCard(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Outlined.Watch, contentDescription = null, modifier = Modifier.size(40.dp))
                    Spacer(Modifier.width(Spacing.md))
                    Column(Modifier.weight(1f)) {
                        Text(device.name, style = MaterialTheme.typography.titleLarge)
                        Text(device.vendor.displayName, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                    ConnectionStatusChip(device.connectionState)
                    device.batteryPercent?.let {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.BatteryStd, contentDescription = null, modifier = Modifier.size(18.dp))
                            Text("$it%", style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
                (device.connectionState as? ConnectionState.Error)?.let {
                    Text(it.reason, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
                }
                if (syncing) {
                    LinearProgressIndicator(progress = { (state.syncState as SyncState.InProgress).progress }, modifier = Modifier.fillMaxWidth())
                }
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    if (connected) {
                        Button(onClick = onSync, enabled = !syncing && !state.busy, modifier = Modifier.testTag("detail_sync")) {
                            Icon(Icons.Outlined.Sync, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(Spacing.xs))
                            Text("Sync now")
                        }
                        OutlinedButton(onClick = onDisconnect, enabled = !state.busy) { Text("Disconnect") }
                    } else {
                        Button(
                            onClick = onConnect,
                            enabled = !connecting && !state.busy && device.missingCredentials.isEmpty(),
                            modifier = Modifier.testTag("detail_connect"),
                        ) { Text(if (connecting) "Connecting…" else "Connect") }
                    }
                }
                if (!connected && device.missingCredentials.isNotEmpty()) {
                    Text(
                        "Enter ${device.missingCredentials.first().label} from the Devices list before connecting.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }

        SectionHeader("About this device")
        ElevatedCard(Modifier.fillMaxWidth()) {
            val zone = ZoneId.systemDefault()
            val rows = listOf(
                Triple("about_name", "Name", device.name),
                Triple("about_brand", "Brand", device.vendor.displayName),
                Triple("about_model", "Model", device.model),
                Triple("about_firmware", "Firmware version", device.firmwareVersion),
                Triple("about_battery", "Battery", device.batteryPercent?.let { "$it%" }),
                Triple("about_address", "Bluetooth address", device.macAddress),
                Triple("about_paired", "Paired", device.pairedAt?.let { DATE_TIME.format(it.atZone(zone)) }),
                Triple("about_last_sync", "Last sync", device.lastSyncedAt?.let { DATE_TIME.format(it.atZone(zone)) } ?: "Never"),
            )
            rows.forEachIndexed { index, (tag, label, value) ->
                InfoRow(label, value ?: "Unknown", Modifier.testTag(tag))
                if (index < rows.lastIndex) HorizontalDivider(Modifier.padding(horizontal = Spacing.lg))
            }
        }

        SectionHeader("Capabilities")
        ElevatedCard(Modifier.fillMaxWidth().testTag("capabilities")) {
            if (!connected) {
                Text(
                    "Connect the device to see what it supports.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(Spacing.lg).testTag("capabilities_unknown"),
                )
            } else {
                DeviceCapability.entries.forEach { capability ->
                    val supported = capability in device.capabilities
                    ListItem(
                        modifier = Modifier.testTag("capability_${capability.name}"),
                        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                        leadingContent = { Icon(capability.icon(), contentDescription = null) },
                        headlineContent = { Text(capability.label()) },
                        trailingContent = {
                            if (supported) {
                                Icon(Icons.Outlined.CheckCircle, contentDescription = "Supported", tint = MaterialTheme.colorScheme.primary)
                            } else {
                                Text("Not supported", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        },
                    )
                }
            }
        }

        if (device.credentialRequirements.isNotEmpty()) {
            SectionHeader("Security")
            ElevatedCard(Modifier.fillMaxWidth()) {
                device.credentialRequirements.forEach { requirement ->
                    ListItem(
                        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                        leadingContent = { Icon(Icons.Outlined.Key, contentDescription = null) },
                        headlineContent = { Text(requirement.label) },
                        supportingContent = { Text(if (requirement.key in device.storedCredentialKeys) "Stored on this phone" else "Missing") },
                    )
                }
            }
        }

        OutlinedButton(
            onClick = { confirmUnpair = true },
            enabled = !state.busy,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error),
            modifier = Modifier.fillMaxWidth().testTag("detail_unpair"),
        ) { Text("Unpair this device") }
        Text(
            "Unpairing removes the device and its stored keys from this app. Health data it already synced is kept.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.testTag("detail_unpair_note"),
        )
        Spacer(Modifier.height(Spacing.xl))
    }

    if (confirmUnpair) {
        AlertDialog(
            onDismissRequest = { confirmUnpair = false },
            title = { Text("Unpair ${device.name}?") },
            text = { Text("The device will be removed from this app. Data already synced is kept.") },
            confirmButton = {
                TextButton(onClick = { confirmUnpair = false; onUnpair() }, modifier = Modifier.testTag("detail_confirm_unpair")) { Text("Unpair") }
            },
            dismissButton = { TextButton(onClick = { confirmUnpair = false }) { Text("Cancel") } },
        )
    }
}

@Composable
private fun InfoRow(label: String, value: String, modifier: Modifier = Modifier) {
    ListItem(
        modifier = modifier,
        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
        headlineContent = { Text(label) },
        trailingContent = { Text(value, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant) },
    )
}

private fun DeviceCapability.label(): String = when (this) {
    DeviceCapability.HISTORY_SYNC -> "History sync"
    DeviceCapability.LIVE_HEART_RATE -> "Live heart rate"
    DeviceCapability.BATTERY_LEVEL -> "Battery level"
}

private fun DeviceCapability.icon(): ImageVector = when (this) {
    DeviceCapability.HISTORY_SYNC -> Icons.Outlined.History
    DeviceCapability.LIVE_HEART_RATE -> Icons.Outlined.MonitorHeart
    DeviceCapability.BATTERY_LEVEL -> Icons.Outlined.BatteryStd
}

private val DATE_TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
