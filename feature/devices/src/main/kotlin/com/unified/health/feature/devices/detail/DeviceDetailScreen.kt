package com.unified.health.feature.devices.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.feature.devices.R
import com.unified.health.feature.devices.TappableWatchImage
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WatchModelMatcher
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import com.unified.health.core.designsystem.R as DesignSystemR

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
        onReprocess = viewModel::reprocessRawPayloads,
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
    onReprocess: () -> Unit,
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
    AppScreen(
        title = (state as? DeviceDetailUiState.Success)?.device?.name ?: stringResource(R.string.device_fallback_title),
        onBack = onBack,
        snackbarHost = { SnackbarHost(snackbar) },
    ) { contentPadding ->
        when (state) {
            DeviceDetailUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            is DeviceDetailUiState.Gone -> EmptyState(
                title = stringResource(R.string.device_not_paired_title),
                message = stringResource(R.string.device_not_paired_message),
                icon = Icons.Outlined.LinkOff,
                modifier = Modifier.padding(contentPadding).testTag("device_gone"),
            )
            is DeviceDetailUiState.Success ->
                DeviceDetailContent(state, contentPadding, onSync, onConnect, onDisconnect, onUnpair, onReprocess)
        }
    }
}

@Composable
private fun DeviceDetailContent(
    state: DeviceDetailUiState.Success,
    contentPadding: PaddingValues,
    onSync: () -> Unit,
    onConnect: () -> Unit,
    onDisconnect: () -> Unit,
    onUnpair: () -> Unit,
    onReprocess: () -> Unit,
) {
    val device = state.device
    var confirmUnpair by rememberSaveable { mutableStateOf(false) }
    val connected = device.connectionState == ConnectionState.Connected
    val connecting = device.connectionState == ConnectionState.Connecting || device.connectionState == ConnectionState.Authenticating
    val syncing = connected && state.syncState is SyncState.InProgress

    // D-1194: contentPadding chained AFTER verticalScroll — the unpair button/note at the end of the
    // scrollable content scrolls fully behind the gesture bar instead of a dead strip above it.
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding).padding(horizontal = Gaps.screenHorizontal).testTag("device_detail"),
        verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap),
    ) {
        ElevatedCard(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                val watchModel = remember(device.vendor, device.name, device.model) { WatchModelMatcher.match(device) }
                // D-1148: tappable -> fullscreen viewer, with a subtle pulse hinting it's tappable.
                TappableWatchImage(
                    model = watchModel,
                    size = 180.dp,
                    revealKey = connected,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Column(Modifier.weight(1f)) {
                        Text(device.name, style = MaterialTheme.typography.titleLarge)
                        Text(
                            listOfNotNull(watchModel?.takeUnless { it.isGeneric }?.displayName, device.vendor.displayName).joinToString(" · "),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
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
                    val inProgress = state.syncState as SyncState.InProgress
                    LinearProgressIndicator(progress = { inProgress.progress }, modifier = Modifier.fillMaxWidth())
                    inProgress.stage?.let {
                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.testTag("detail_sync_stage"),
                        )
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    if (connected) {
                        Button(onClick = onSync, enabled = !syncing && !state.busy, modifier = Modifier.testTag("detail_sync")) {
                            Icon(Icons.Outlined.Sync, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(Spacing.xs))
                            Text(stringResource(R.string.sync_now))
                        }
                        OutlinedButton(onClick = onDisconnect, enabled = !state.busy) { Text(stringResource(DesignSystemR.string.action_disconnect)) }
                    } else {
                        Button(
                            onClick = onConnect,
                            enabled = !connecting && !state.busy && device.missingCredentials.isEmpty(),
                            modifier = Modifier.testTag("detail_connect"),
                        ) { Text(if (connecting) stringResource(R.string.connect_button_busy) else stringResource(DesignSystemR.string.action_connect)) }
                    }
                }
                if (!connected && device.missingCredentials.isNotEmpty()) {
                    Text(
                        stringResource(R.string.enter_credential_before_connecting, device.missingCredentials.first().label),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }

        SectionHeader(stringResource(R.string.about_this_device))
        ElevatedCard(Modifier.fillMaxWidth()) {
            val zone = ZoneId.systemDefault()
            val rows = listOf(
                Triple("about_name", stringResource(R.string.about_name), device.name),
                Triple("about_brand", stringResource(R.string.about_brand), device.vendor.displayName),
                Triple("about_model", stringResource(R.string.about_model), device.model),
                Triple("about_firmware", stringResource(R.string.about_firmware), device.firmwareVersion),
                Triple("about_battery", stringResource(R.string.about_battery), device.batteryPercent?.let { "$it%" }),
                Triple("about_address", stringResource(R.string.about_address), device.macAddress),
                Triple("about_paired", stringResource(R.string.about_paired), device.pairedAt?.let { DATE_TIME.format(it.atZone(zone)) }),
                Triple(
                    "about_last_sync",
                    stringResource(R.string.about_last_sync),
                    device.lastSyncedAt?.let { DATE_TIME.format(it.atZone(zone)) } ?: stringResource(R.string.last_sync_never),
                ),
            )
            val unknown = stringResource(R.string.about_unknown)
            rows.forEachIndexed { index, (tag, label, value) ->
                InfoRow(label, value ?: unknown, Modifier.testTag(tag))
                if (index < rows.lastIndex) HorizontalDivider(Modifier.padding(horizontal = Gaps.screenHorizontal))
            }
        }

        SectionHeader(stringResource(R.string.capabilities_title))
        ElevatedCard(Modifier.fillMaxWidth().testTag("capabilities")) {
            if (!connected) {
                Text(
                    stringResource(R.string.capabilities_unknown),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(Gaps.cardPadding).testTag("capabilities_unknown"),
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
                                Icon(Icons.Outlined.CheckCircle, contentDescription = stringResource(R.string.capability_supported), tint = MaterialTheme.colorScheme.primary)
                            } else {
                                Text(stringResource(R.string.capability_not_supported), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        },
                    )
                }
            }
        }

        if (device.credentialRequirements.isNotEmpty()) {
            SectionHeader(stringResource(R.string.security_title))
            ElevatedCard(Modifier.fillMaxWidth()) {
                device.credentialRequirements.forEach { requirement ->
                    ListItem(
                        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                        leadingContent = { Icon(Icons.Outlined.Key, contentDescription = null) },
                        headlineContent = { Text(requirement.label) },
                        supportingContent = {
                            Text(
                                if (requirement.key in device.storedCredentialKeys) stringResource(R.string.security_stored_on_phone) else stringResource(R.string.security_missing),
                            )
                        },
                    )
                }
            }
        }

        if (device.vendor == WearableVendor.GARMIN) {
            SectionHeader(stringResource(R.string.data_recovery_title))
            ElevatedCard(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                    Text(
                        stringResource(R.string.data_recovery_message),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    OutlinedButton(
                        onClick = onReprocess,
                        enabled = !state.busy,
                        modifier = Modifier.testTag("detail_reprocess"),
                    ) { Text(stringResource(R.string.data_recovery_action)) }
                }
            }
        }

        OutlinedButton(
            onClick = { confirmUnpair = true },
            enabled = !state.busy,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error),
            modifier = Modifier.fillMaxWidth().testTag("detail_unpair"),
        ) { Text(stringResource(R.string.unpair_this_device)) }
        Text(
            stringResource(R.string.unpair_this_device_note),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.testTag("detail_unpair_note"),
        )
        Spacer(Modifier.height(Spacing.xl))
    }

    if (confirmUnpair) {
        AlertDialog(
            onDismissRequest = { confirmUnpair = false },
            title = { Text(stringResource(R.string.unpair_dialog_title, device.name)) },
            text = { Text(stringResource(R.string.unpair_dialog_message)) },
            confirmButton = {
                TextButton(onClick = { confirmUnpair = false; onUnpair() }, modifier = Modifier.testTag("detail_confirm_unpair")) { Text(stringResource(R.string.unpair_confirm)) }
            },
            dismissButton = { TextButton(onClick = { confirmUnpair = false }) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
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

@Composable
private fun DeviceCapability.label(): String = when (this) {
    DeviceCapability.HISTORY_SYNC -> stringResource(R.string.capability_history_sync)
    DeviceCapability.LIVE_HEART_RATE -> stringResource(R.string.capability_live_heart_rate)
    DeviceCapability.BATTERY_LEVEL -> stringResource(R.string.capability_battery_level)
}

private fun DeviceCapability.icon(): ImageVector = when (this) {
    DeviceCapability.HISTORY_SYNC -> Icons.Outlined.History
    DeviceCapability.LIVE_HEART_RATE -> Icons.Outlined.MonitorHeart
    DeviceCapability.BATTERY_LEVEL -> Icons.Outlined.BatteryStd
}

private val DATE_TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
