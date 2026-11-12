package com.unified.health.feature.devices

import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import com.unified.health.core.model.PairingCodeRequest
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.automirrored.outlined.BluetoothSearching
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Memory
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material.icons.outlined.Stop
import androidx.compose.material.icons.outlined.Sync
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.WatchImage
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.permission.RuntimePermissions
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.MacAddressFormat
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WatchModelMatcher
import com.unified.health.core.model.WearableDevice
import com.unified.health.feature.devices.qr.QrScannerScreen
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import com.unified.health.core.designsystem.R as DesignSystemR

@Composable
internal fun DevicesRoute(onOpenDevice: (String) -> Unit, viewModel: DevicesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    DevicesScreen(
        state = state,
        onOpenDevice = onOpenDevice,
        onStartScan = viewModel::startScan,
        onStopScan = viewModel::stopScan,
        onPair = viewModel::pair,
        onConnect = viewModel::connect,
        onDisconnect = viewModel::disconnect,
        onSync = viewModel::syncNow,
        onUnpair = viewModel::unpair,
        onCredential = viewModel::setCredential,
        onGenerateCredential = viewModel::generateCredential,
        onGeneratedKeyShown = viewModel::generatedKeyShown,
        onMessageShown = viewModel::messageShown,
        onPairingCode = viewModel::submitPairingCode,
        onPairingCodeCancel = viewModel::cancelPairingCode,
        onQrCodeScanned = viewModel::onQrCodeScanned,
        onFindByMacAddress = viewModel::findByMacAddress,
        onRetryQrFind = viewModel::retryQrFind,
        onCancelQrFind = viewModel::cancelQrFind,
        onChooseFromListInsteadOfQr = viewModel::chooseFromListInsteadOfQr,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun DevicesScreen(
    state: DevicesUiState,
    onOpenDevice: (String) -> Unit,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit,
    onPair: (DiscoveredDevice) -> Unit,
    onConnect: (WearableDevice) -> Unit,
    onDisconnect: (WearableDevice) -> Unit,
    onSync: (WearableDevice) -> Unit,
    onUnpair: (WearableDevice) -> Unit,
    onCredential: (WearableDevice, String, String) -> Unit,
    onGenerateCredential: (WearableDevice, String) -> Unit,
    onGeneratedKeyShown: () -> Unit,
    onMessageShown: () -> Unit,
    onPairingCode: (String) -> Unit,
    onPairingCodeCancel: () -> Unit,
    onQrCodeScanned: (String) -> Unit,
    onFindByMacAddress: (String) -> Unit,
    onRetryQrFind: () -> Unit,
    onCancelQrFind: () -> Unit,
    onChooseFromListInsteadOfQr: () -> Unit,
) {
    val context = LocalContext.current
    val snackbar = remember { SnackbarHostState() }
    var permissionDenied by rememberSaveable { mutableStateOf(false) }
    var showScanner by rememberSaveable { mutableStateOf(false) }
    var showManualMacDialog by rememberSaveable { mutableStateOf(false) }
    // D-1200: "Nearby devices" only earns its place once a scan has actually happened (running or
    // finished) — not merely because the onboarding/"Add device" entry points exist. Driven off
    // isScanning (set by any path: the FAB, the onboarding block, "Add device", or the QR-find
    // timeout's "Choose from list") rather than threaded through every call site that can start one.
    var scanAttempted by rememberSaveable { mutableStateOf(false) }
    LaunchedEffect(state.isScanning) {
        if (state.isScanning) scanAttempted = true
    }
    val permissionLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { result ->
        permissionDenied = result.values.any { !it }
        if (!permissionDenied) onStartScan()
    }
    val requestScan = {
        if (RuntimePermissions.allGranted(context, RuntimePermissions.bluetooth)) {
            onStartScan()
        } else {
            permissionLauncher.launch(RuntimePermissions.bluetooth.toTypedArray())
        }
    }

    state.generatedKey?.let { generated ->
        AlertDialog(
            onDismissRequest = onGeneratedKeyShown,
            title = { Text(stringResource(R.string.backup_key_title, generated.label)) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    Text(
                        stringResource(R.string.backup_key_message, generated.deviceName),
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    SelectionContainer { Text(generated.hex, style = MaterialTheme.typography.bodyLarge) }
                }
            },
            confirmButton = { TextButton(onClick = onGeneratedKeyShown) { Text(stringResource(DesignSystemR.string.action_done)) } },
        )
    }

    state.pairingCodeRequest?.let { request ->
        PairingCodeDialog(request = request, onSubmit = onPairingCode, onCancel = onPairingCodeCancel)
    }

    if (showScanner) {
        Dialog(onDismissRequest = { showScanner = false }, properties = DialogProperties(usePlatformDefaultWidth = false)) {
            QrScannerScreen(
                onResult = { raw -> showScanner = false; onQrCodeScanned(raw) },
                onCancel = { showScanner = false },
            )
        }
    }

    if (showManualMacDialog) {
        ManualMacDialog(
            onDismiss = { showManualMacDialog = false },
            onSubmit = { mac -> showManualMacDialog = false; onFindByMacAddress(mac) },
        )
    }

    state.qrFind?.let { qrFind ->
        QrFindSheet(
            state = qrFind,
            onCancel = onCancelQrFind,
            onRetry = onRetryQrFind,
            onChooseFromList = onChooseFromListInsteadOfQr,
        )
    }

    LaunchedEffect(state.userMessage) {
        state.userMessage?.let {
            snackbar.showSnackbar(it)
            onMessageShown()
        }
    }

    // D-1194: top-level tab (inside the main pager) — bottomClearance clears PillBottomNavigation's
    // floating pill, routed through AppScreen instead of this screen adding it manually.
    AppScreen(
        title = stringResource(R.string.devices_title),
        snackbarHost = { SnackbarHost(snackbar) },
        floatingActionButton = {
            // Bug fix (on-device review, 2026-11-12, D-1206): with no paired device yet (and not
            // already scanning), `NoPairedDeviceCard`'s own Scan/QR/MAC actions (D-1200) are already
            // the primary "add a device" CTA — this FAB used to render underneath that card too,
            // duplicating "Scan" while sitting hidden behind the floating pill nav (Scaffold only
            // knows about the system navigation-bar inset, not `PillBottomNavigation`'s own extra
            // floating footprint, D-1144). Hidden entirely in that state now; still shown (with the
            // explicit `Spacing.bottomNavClearance` bottom offset below, so it floats above the pill
            // instead of behind it) once there is something a FAB usefully adds: a scan already
            // running (`stop_scan_fab`), or at least one paired device, where `AddDeviceEntry` (D-1200)
            // is the per-row/list entry point but a persistent "scan again" FAB still earns its place.
            if (state.isScanning) {
                ExtendedFloatingActionButton(
                    modifier = Modifier.testTag("stop_scan_fab").padding(bottom = Spacing.bottomNavClearance),
                    onClick = onStopScan,
                    icon = { Icon(Icons.Outlined.Stop, contentDescription = null) },
                    text = { Text(stringResource(R.string.scan_stop)) },
                )
            } else if (state.pairedDevices.isNotEmpty()) {
                ExtendedFloatingActionButton(
                    modifier = Modifier.testTag("scan_fab").padding(bottom = Spacing.bottomNavClearance),
                    onClick = requestScan,
                    icon = { Icon(Icons.AutoMirrored.Outlined.BluetoothSearching, contentDescription = null) },
                    text = { Text(stringResource(R.string.scan_start)) },
                )
            }
        },
        bottomClearance = Spacing.bottomNavClearance,
    ) { contentPadding ->
        if (state.isLoading) {
            LoadingState(Modifier.padding(contentPadding))
            return@AppScreen
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            // D-1194: contentPadding (already including bottomClearance) passed straight to the
            // LazyColumn's own contentPadding, never as an outer Modifier.padding — see AppScreen.
            contentPadding = PaddingValues(
                start = Gaps.screenHorizontal,
                end = Gaps.screenHorizontal,
                top = contentPadding.calculateTopPadding() + Gaps.screenTop,
                bottom = contentPadding.calculateBottomPadding(),
            ),
            verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
        ) {
            if (permissionDenied) {
                item { PermissionCard(onOpenSettings = { context.openAppSettings() }) }
            }
            if (state.pairedDevices.isEmpty()) {
                // D-1200: one onboarding block replaces the old card (QR + Scan) plus the "Nearby
                // devices" section's own QR/MAC row below it — same three actions, no longer duplicated.
                item {
                    NoPairedDeviceCard(
                        onScan = requestScan,
                        onScanQrCode = { showScanner = true },
                        onEnterMacAddress = { showManualMacDialog = true },
                    )
                }
            } else {
                // D-1200: once at least one device is paired, the add-device actions collapse into
                // this single entry point instead of staying permanently on screen.
                item {
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                        AddDeviceEntry(
                            onScan = requestScan,
                            onScanQrCode = { showScanner = true },
                            onEnterMacAddress = { showManualMacDialog = true },
                        )
                    }
                }
                items(state.pairedDevices, key = { it.id }) { device ->
                    PairedDeviceCard(
                        device = device,
                        syncState = state.syncState,
                        onOpenSettings = { onOpenDevice(device.id) },
                        onConnect = { onConnect(device) },
                        onDisconnect = { onDisconnect(device) },
                        onSync = { onSync(device) },
                        onUnpair = { onUnpair(device) },
                        onCredential = { key, value -> onCredential(device, key, value) },
                        onGenerateCredential = { key -> onGenerateCredential(device, key) },
                    )
                }
            }
            // D-1200: "Nearby devices" only appears once a scan is running or has (ever) produced
            // something to show — never as an empty section competing with the onboarding block above.
            val showNearbySection = state.isScanning || state.discovered.isNotEmpty() || scanAttempted
            if (showNearbySection) {
                item {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        SectionHeader(stringResource(R.string.scan_section_nearby), Modifier.weight(1f))
                        if (state.isScanning) Text(stringResource(R.string.scan_scanning), style = MaterialTheme.typography.labelMedium)
                    }
                    if (state.isScanning) {
                        LinearProgressIndicator(Modifier.fillMaxWidth().padding(top = Gaps.itemGap))
                    }
                }
                if (state.discovered.isEmpty()) {
                    item {
                        Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
                            Text(
                                if (state.isScanning) stringResource(R.string.scan_empty_scanning) else stringResource(R.string.scan_empty_no_results),
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            if (!state.isScanning) {
                                OutlinedButton(onClick = requestScan, modifier = Modifier.testTag("scan_retry_button")) {
                                    Text(stringResource(DesignSystemR.string.action_try_again))
                                }
                            }
                        }
                    }
                } else {
                    items(state.discovered, key = { it.macAddress }) { device ->
                        DiscoveredDeviceItem(device, onPair = { onPair(device) })
                    }
                }
            }
        }
    }
}

@Composable
private fun PairedDeviceCard(
    device: WearableDevice,
    syncState: SyncState,
    onOpenSettings: () -> Unit,
    onConnect: () -> Unit,
    onDisconnect: () -> Unit,
    onSync: () -> Unit,
    onUnpair: () -> Unit,
    onCredential: (key: String, value: String) -> Unit,
    onGenerateCredential: (key: String) -> Unit,
) {
    var menuOpen by remember { mutableStateOf(false) }
    var editing by remember { mutableStateOf<CredentialRequirement?>(null) }
    var confirmUnpair by remember { mutableStateOf(false) }
    val connected = device.connectionState == ConnectionState.Connected
    val busy = device.connectionState == ConnectionState.Connecting || device.connectionState == ConnectionState.Authenticating
    val watchModel = remember(device.vendor, device.name, device.model) { WatchModelMatcher.match(device) }

    ElevatedCard(Modifier.fillMaxWidth().testTag("paired_${device.macAddress}")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            val menuButton: @Composable () -> Unit = {
                IconButton(onClick = { menuOpen = true }, modifier = Modifier.testTag("more_${device.macAddress}")) {
                    Icon(Icons.Outlined.MoreVert, contentDescription = stringResource(R.string.device_more_options, device.name))
                }
                DropdownMenu(expanded = menuOpen, onDismissRequest = { menuOpen = false }) {
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.device_settings_menu_item)) },
                        onClick = { menuOpen = false; onOpenSettings() },
                        modifier = Modifier.testTag("device_settings_menu_item"),
                    )
                    device.credentialRequirements.forEach { requirement ->
                        DropdownMenuItem(
                            text = { Text(stringResource(R.string.change_credential_menu_item, requirement.label)) },
                            onClick = { menuOpen = false; editing = requirement },
                        )
                    }
                    DropdownMenuItem(
                        text = { Text(stringResource(R.string.unpair_menu_item)) },
                        onClick = { menuOpen = false; confirmUnpair = true },
                        modifier = Modifier.testTag("unpair_menu_item"),
                    )
                }
            }
            val subtitle = listOfNotNull(watchModel?.takeUnless { it.isGeneric }?.displayName, device.vendor.displayName, device.macAddress)
                .joinToString(" · ")
            if (connected) {
                // D-1130: once paired, this is the screen users actually look at regularly — not
                // "About this device" — so it gets the same big, centered watch image treatment
                // (WatchImage(size = 180.dp), DeviceDetailScreen.kt) instead of a small inline one.
                Box(Modifier.fillMaxWidth()) {
                    // D-1148: tappable -> fullscreen viewer, with a subtle pulse hinting it's tappable.
                    TappableWatchImage(
                        model = watchModel,
                        size = 180.dp,
                        revealKey = connected,
                        modifier = Modifier.align(Alignment.Center),
                    )
                    // D-1162: floats symmetrically with menuButton below, instead of sitting in the
                    // status-info block — the big image area reads as the card's "header", so both its
                    // corner badges belong to it.
                    Box(Modifier.align(Alignment.TopStart)) { ConnectionStatusChip(device.connectionState) }
                    Box(Modifier.align(Alignment.TopEnd)) { menuButton() }
                }
                Text(device.name, style = MaterialTheme.typography.titleLarge, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                Text(
                    subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )
                // D-1162: one cohesive icon+text block instead of a chip row plus two stray Text
                // lines — text content/testTag per line kept exactly as before (e2e asserts on them).
                Column(Modifier.padding(top = Gaps.cardContentGap), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                    device.batteryPercent?.let {
                        StatusInfoRow(Icons.Outlined.BatteryStd) { Text("$it%", style = MaterialTheme.typography.bodyMedium) }
                    }
                    device.firmwareVersion?.let {
                        StatusInfoRow(Icons.Outlined.Memory) {
                            Text(stringResource(R.string.firmware_version, it), style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                    }
                    StatusInfoRow(Icons.Outlined.History) {
                        Text(
                            modifier = Modifier.testTag("last_sync_${device.macAddress}"),
                            text = stringResource(
                                R.string.last_sync,
                                device.lastSyncedAt?.let { LAST_SYNC_FORMAT.format(it.atZone(ZoneId.systemDefault())) } ?: stringResource(R.string.last_sync_never),
                            ),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    WatchImage(model = watchModel, size = 56.dp, interactive = false, revealKey = connected)
                    Spacer(Modifier.width(Spacing.md))
                    Column(Modifier.weight(1f)) {
                        Text(device.name, style = MaterialTheme.typography.titleMedium)
                        Text(subtitle, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                    Column { menuButton() }
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
                device.firmwareVersion?.let {
                    Text(stringResource(R.string.firmware_version, it), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Text(
                    modifier = Modifier.testTag("last_sync_${device.macAddress}"),
                    text = stringResource(
                        R.string.last_sync,
                        device.lastSyncedAt?.let { LAST_SYNC_FORMAT.format(it.atZone(ZoneId.systemDefault())) } ?: stringResource(R.string.last_sync_never),
                    ),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            if (connected && syncState is SyncState.InProgress) {
                LinearProgressIndicator(progress = { syncState.progress }, modifier = Modifier.fillMaxWidth())
                syncState.stage?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.testTag("sync_stage_${device.macAddress}"),
                    )
                }
            }
            (device.connectionState as? ConnectionState.Error)?.let {
                Text(it.reason, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                if (connected) {
                    Button(onClick = onSync, enabled = syncState !is SyncState.InProgress, modifier = Modifier.testTag("sync_${device.macAddress}")) {
                        Icon(Icons.Outlined.Sync, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(Spacing.xs))
                        Text(stringResource(R.string.sync_now))
                    }
                    OutlinedButton(onClick = onDisconnect) { Text(stringResource(DesignSystemR.string.action_disconnect)) }
                } else if (device.missingCredentials.isNotEmpty()) {
                    val requirement = device.missingCredentials.first()
                    Button(onClick = { editing = requirement }) { Text(stringResource(R.string.enter_credential_button, requirement.label)) }
                } else {
                    Button(onClick = onConnect, enabled = !busy, modifier = Modifier.testTag("connect_${device.macAddress}")) {
                        Text(if (busy) stringResource(R.string.connect_button_busy) else stringResource(DesignSystemR.string.action_connect))
                    }
                }
            }
        }
    }

    editing?.let { requirement ->
        CredentialDialog(
            requirement = requirement,
            onDismiss = { editing = null },
            onSave = { value -> editing = null; onCredential(requirement.key, value) },
            onGenerate = { editing = null; onGenerateCredential(requirement.key) },
        )
    }

    if (confirmUnpair) {
        AlertDialog(
            onDismissRequest = { confirmUnpair = false },
            title = { Text(stringResource(R.string.unpair_dialog_title, device.name)) },
            text = { Text(stringResource(R.string.unpair_dialog_message)) },
            confirmButton = { TextButton(onClick = { confirmUnpair = false; onUnpair() }, modifier = Modifier.testTag("confirm_unpair")) { Text(stringResource(R.string.unpair_confirm)) } },
            dismissButton = { TextButton(onClick = { confirmUnpair = false }) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
        )
    }
}

/** One line of the connected [PairedDeviceCard]'s status block (D-1162): a leading icon for quick
 * scanning, then whatever text the caller needs verbatim (e2e tests assert on exact text/testTags). */
@Composable
private fun StatusInfoRow(icon: ImageVector, content: @Composable () -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
        Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(18.dp))
        content()
    }
}

@Composable
private fun DiscoveredDeviceItem(device: DiscoveredDevice, onPair: () -> Unit) {
    OutlinedCard(Modifier.fillMaxWidth().testTag("discovered_${device.macAddress}")) {
        ListItem(
            leadingContent = {
                val watchModel = remember(device.vendor, device.name) { WatchModelMatcher.match(device) }
                WatchImage(model = watchModel, size = 48.dp)
            },
            headlineContent = { Text(device.name) },
            supportingContent = {
                val rssi = device.rssi
                val detail = when {
                    rssi != null -> stringResource(R.string.discovered_device_detail, device.macAddress, signalLabel(rssi), rssi)
                    else -> stringResource(R.string.discovered_device_detail_paired_in_system, device.macAddress)
                }
                Text("${device.vendor.displayName} · $detail")
            },
            trailingContent = { FilledTonalButton(onClick = onPair, modifier = Modifier.testTag("pair_${device.macAddress}")) { Text(stringResource(R.string.pair_button)) } },
        )
    }
}

@Composable
private fun CredentialDialog(
    requirement: CredentialRequirement,
    onDismiss: () -> Unit,
    onSave: (String) -> Unit,
    onGenerate: () -> Unit,
) {
    var value by rememberSaveable { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(requirement.label) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(requirement.description, style = MaterialTheme.typography.bodyMedium)
                OutlinedTextField(
                    value = value,
                    onValueChange = { value = it },
                    singleLine = true,
                    label = { Text(if (requirement.format == CredentialFormat.HEX_16_BYTES) stringResource(R.string.credential_hex_label) else requirement.label) },
                    visualTransformation = PasswordVisualTransformation(),
                )
                if (requirement.generatable) {
                    TextButton(onClick = onGenerate) { Text(stringResource(R.string.credential_generate)) }
                }
            }
        },
        confirmButton = { TextButton(onClick = { onSave(value) }, enabled = value.isNotBlank()) { Text(stringResource(DesignSystemR.string.action_save)) } },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
    )
}

@Composable
private fun PairingCodeDialog(request: PairingCodeRequest, onSubmit: (String) -> Unit, onCancel: () -> Unit) {
    var code by rememberSaveable(request) { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onCancel,
        title = { Text(stringResource(R.string.pairing_code_title)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(
                    stringResource(R.string.pairing_code_message, request.maxLength, request.deviceName),
                    style = MaterialTheme.typography.bodyMedium,
                )
                OutlinedTextField(
                    value = code,
                    onValueChange = { input -> code = input.filter(Char::isDigit).take(request.maxLength) },
                    singleLine = true,
                    label = { Text(stringResource(R.string.pairing_code_label)) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                )
            }
        },
        confirmButton = { TextButton(onClick = { onSubmit(code) }, enabled = code.length == request.maxLength) { Text(stringResource(R.string.pairing_code_confirm)) } },
        dismissButton = { TextButton(onClick = onCancel) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
    )
}

/**
 * D-1200: the only add-device entry point while nothing is paired — one card, one clear hierarchy
 * (primary "Scan for devices" finds most watches over BLE; "Scan QR code" and "Enter MAC address"
 * are the advanced/fallback paths), instead of the previous two equal-weight buttons here plus a
 * duplicate QR button in the "Nearby devices" section below.
 */
@Composable
private fun NoPairedDeviceCard(onScan: () -> Unit, onScanQrCode: () -> Unit, onEnterMacAddress: () -> Unit) {
    OutlinedCard(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Text(stringResource(R.string.no_paired_device_title), style = MaterialTheme.typography.titleMedium)
            Text(
                stringResource(R.string.no_paired_device_message),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Button(onClick = onScan, modifier = Modifier.fillMaxWidth().testTag("onboarding_scan_button")) {
                Icon(Icons.AutoMirrored.Outlined.BluetoothSearching, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(Spacing.xs))
                Text(stringResource(R.string.scan_for_devices))
            }
            FilledTonalButton(onClick = onScanQrCode, modifier = Modifier.fillMaxWidth().testTag("onboarding_qr_button")) {
                Icon(Icons.Outlined.QrCodeScanner, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(Spacing.xs))
                Text(stringResource(R.string.scan_qr_code))
            }
            TextButton(onClick = onEnterMacAddress, modifier = Modifier.fillMaxWidth().testTag("onboarding_mac_button")) {
                Text(stringResource(R.string.scan_enter_mac_address))
            }
        }
    }
}

/**
 * D-1200: once at least one device is paired, the three add-device actions (scan / QR / MAC) no
 * longer sit permanently on screen — they collapse behind this one entry point, opening the same
 * flows as [NoPairedDeviceCard].
 */
@Composable
private fun AddDeviceEntry(onScan: () -> Unit, onScanQrCode: () -> Unit, onEnterMacAddress: () -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        TextButton(onClick = { expanded = true }, modifier = Modifier.testTag("add_device_button")) {
            Icon(Icons.Outlined.Add, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(Spacing.xs))
            Text(stringResource(R.string.add_device))
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(
                text = { Text(stringResource(R.string.scan_for_devices)) },
                onClick = { expanded = false; onScan() },
                modifier = Modifier.testTag("add_device_scan"),
            )
            DropdownMenuItem(
                text = { Text(stringResource(R.string.scan_qr_code)) },
                onClick = { expanded = false; onScanQrCode() },
                modifier = Modifier.testTag("add_device_qr"),
            )
            DropdownMenuItem(
                text = { Text(stringResource(R.string.scan_enter_mac_address)) },
                onClick = { expanded = false; onEnterMacAddress() },
                modifier = Modifier.testTag("add_device_mac"),
            )
        }
    }
}

@Composable
private fun ManualMacDialog(onDismiss: () -> Unit, onSubmit: (String) -> Unit) {
    var value by rememberSaveable { mutableStateOf("") }
    val normalized = MacAddressFormat.normalizeOrNull(value)
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.manual_mac_title)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(
                    stringResource(R.string.manual_mac_message),
                    style = MaterialTheme.typography.bodyMedium,
                )
                OutlinedTextField(
                    value = value,
                    onValueChange = { value = it },
                    singleLine = true,
                    isError = value.isNotBlank() && normalized == null,
                    label = { Text(stringResource(R.string.manual_mac_hint)) },
                    modifier = Modifier.testTag("manual_mac_input"),
                )
            }
        },
        confirmButton = {
            TextButton(onClick = { onSubmit(value) }, enabled = normalized != null, modifier = Modifier.testTag("manual_mac_confirm")) {
                Text(stringResource(R.string.manual_mac_find))
            }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun QrFindSheet(state: QrFindUiState, onCancel: () -> Unit, onRetry: () -> Unit, onChooseFromList: () -> Unit) {
    val matchedDevice = state.matchedDevice
    // Best guess from the QR hint until the watch is actually found over BLE, then the real device wins.
    val watchModel = remember(state.vendor, state.hintName, matchedDevice) {
        matchedDevice?.let { WatchModelMatcher.match(it) } ?: state.vendor?.let { WatchModelMatcher.match(it, state.hintName) }
    }
    ModalBottomSheet(onDismissRequest = onCancel, modifier = Modifier.testTag("qr_find_sheet")) {
        Column(
            modifier = Modifier.fillMaxWidth().navigationBarsPadding().padding(Gaps.sheetPadding),
            verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                WatchImage(model = watchModel, size = 64.dp, interactive = true, revealKey = matchedDevice != null)
                Text(
                    watchModel?.takeUnless { it.isGeneric }?.displayName ?: stringResource(R.string.qr_find_looking_for, state.label),
                    style = MaterialTheme.typography.titleMedium,
                )
            }
            when (state.status) {
                QrFindStatus.SCANNING -> {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        CircularProgressIndicator(modifier = Modifier.size(20.dp))
                        Text(stringResource(R.string.qr_find_scanning), style = MaterialTheme.typography.bodyMedium)
                    }
                    state.huaweiPin?.let {
                        Text(stringResource(R.string.qr_find_huawei_pin, it), style = MaterialTheme.typography.bodyMedium)
                    }
                    TextButton(onClick = onCancel, modifier = Modifier.testTag("qr_find_cancel")) { Text(stringResource(DesignSystemR.string.action_cancel)) }
                }
                QrFindStatus.FOUND -> {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        CircularProgressIndicator(modifier = Modifier.size(20.dp))
                        Text(stringResource(R.string.qr_find_found), style = MaterialTheme.typography.bodyMedium)
                    }
                }
                QrFindStatus.TIMED_OUT -> {
                    Text(
                        stringResource(R.string.qr_find_timed_out),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        OutlinedButton(onClick = onChooseFromList, modifier = Modifier.testTag("qr_find_choose_from_list")) {
                            Text(stringResource(R.string.qr_find_choose_from_list))
                        }
                        Button(onClick = onRetry, modifier = Modifier.testTag("qr_find_retry")) { Text(stringResource(DesignSystemR.string.action_try_again)) }
                    }
                }
            }
        }
    }
}

@Composable
private fun PermissionCard(onOpenSettings: () -> Unit) {
    ElevatedCard(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Text(stringResource(R.string.permission_needed_title), style = MaterialTheme.typography.titleMedium)
            Text(
                stringResource(R.string.permission_needed_message),
                style = MaterialTheme.typography.bodyMedium,
            )
            TextButton(onClick = onOpenSettings) { Text(stringResource(R.string.open_settings)) }
        }
    }
}

@Composable
private fun signalLabel(rssi: Int): String = when {
    rssi >= -60 -> stringResource(R.string.signal_strong)
    rssi >= -75 -> stringResource(R.string.signal_good)
    else -> stringResource(R.string.signal_weak)
}

private val LAST_SYNC_FORMAT: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)

internal fun Context.openAppSettings() {
    startActivity(
        Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, android.net.Uri.fromParts("package", packageName, null))
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK),
    )
}
