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
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.automirrored.outlined.BluetoothSearching
import androidx.compose.material.icons.outlined.Keyboard
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.WatchImage
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.permission.RuntimePermissions
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
            title = { Text("Back up ${generated.label}") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    Text(
                        "This key was written to ${generated.deviceName}. Without it the watch must be reset to pair again.",
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    SelectionContainer { Text(generated.hex, style = MaterialTheme.typography.bodyLarge) }
                }
            },
            confirmButton = { TextButton(onClick = onGeneratedKeyShown) { Text("Done") } },
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

    Scaffold(
        topBar = { TopAppBar(title = { Text("Devices") }) },
        snackbarHost = { SnackbarHost(snackbar) },
        floatingActionButton = {
            if (state.isScanning) {
                ExtendedFloatingActionButton(
                    modifier = Modifier.testTag("stop_scan_fab"),
                    onClick = onStopScan,
                    icon = { Icon(Icons.Outlined.Stop, contentDescription = null) },
                    text = { Text("Stop") },
                )
            } else {
                ExtendedFloatingActionButton(
                    modifier = Modifier.testTag("scan_fab"),
                    onClick = requestScan,
                    icon = { Icon(Icons.AutoMirrored.Outlined.BluetoothSearching, contentDescription = null) },
                    text = { Text("Scan") },
                )
            }
        },
    ) { padding ->
        if (state.isLoading) {
            LoadingState(Modifier.padding(padding))
            return@Scaffold
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            // D-1144: Spacing.bottomNavClearance (was a literal 96.dp — same value, now the shared
            // constant) — the pill nav floats as a Box overlay over this tab's content instead of
            // reserving Scaffold space, so without this the last card would sit behind it permanently.
            contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, top = Spacing.sm, bottom = Spacing.bottomNavClearance),
            verticalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            if (permissionDenied) {
                item { PermissionCard(onOpenSettings = { context.openAppSettings() }) }
            }
            item { SectionHeader("My devices") }
            if (state.pairedDevices.isEmpty()) {
                item { NoPairedDeviceCard(onScan = requestScan, onScanQrCode = { showScanner = true }) }
            } else {
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
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    SectionHeader("Nearby devices", Modifier.weight(1f))
                    if (state.isScanning) Text("Scanning…", style = MaterialTheme.typography.labelMedium)
                }
                if (state.isScanning) {
                    LinearProgressIndicator(Modifier.fillMaxWidth().padding(top = Spacing.sm))
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = Spacing.sm),
                    horizontalArrangement = Arrangement.spacedBy(Spacing.sm),
                ) {
                    OutlinedButton(onClick = { showScanner = true }, modifier = Modifier.testTag("qr_scan_button")) {
                        Icon(Icons.Outlined.QrCodeScanner, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(Spacing.xs))
                        Text("Scan QR code")
                    }
                    OutlinedButton(onClick = { showManualMacDialog = true }, modifier = Modifier.testTag("manual_mac_button")) {
                        Icon(Icons.Outlined.Keyboard, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(Spacing.xs))
                        Text("Enter MAC address")
                    }
                }
            }
            if (state.discovered.isEmpty()) {
                item {
                    Text(
                        if (state.isScanning) "Looking for wearables nearby…" else "Tap Scan to look for your watch or band. Keep it close to the phone.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            } else {
                items(state.discovered, key = { it.macAddress }) { device ->
                    DiscoveredDeviceItem(device, onPair = { onPair(device) })
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
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            val menuButton: @Composable () -> Unit = {
                IconButton(onClick = { menuOpen = true }, modifier = Modifier.testTag("more_${device.macAddress}")) {
                    Icon(Icons.Outlined.MoreVert, contentDescription = "More options for ${device.name}")
                }
                DropdownMenu(expanded = menuOpen, onDismissRequest = { menuOpen = false }) {
                    DropdownMenuItem(
                        text = { Text("Device settings") },
                        onClick = { menuOpen = false; onOpenSettings() },
                        modifier = Modifier.testTag("device_settings_menu_item"),
                    )
                    device.credentialRequirements.forEach { requirement ->
                        DropdownMenuItem(text = { Text("Change ${requirement.label}") }, onClick = { menuOpen = false; editing = requirement })
                    }
                    DropdownMenuItem(text = { Text("Unpair") }, onClick = { menuOpen = false; confirmUnpair = true }, modifier = Modifier.testTag("unpair_menu_item"))
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
                Text("Firmware $it", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Text(
                modifier = Modifier.testTag("last_sync_${device.macAddress}"),
                text = "Last sync: " + (device.lastSyncedAt?.let { LAST_SYNC_FORMAT.format(it.atZone(ZoneId.systemDefault())) } ?: "never"),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
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
                        Text("Sync now")
                    }
                    OutlinedButton(onClick = onDisconnect) { Text("Disconnect") }
                } else if (device.missingCredentials.isNotEmpty()) {
                    val requirement = device.missingCredentials.first()
                    Button(onClick = { editing = requirement }) { Text("Enter ${requirement.label}") }
                } else {
                    Button(onClick = onConnect, enabled = !busy, modifier = Modifier.testTag("connect_${device.macAddress}")) { Text(if (busy) "Connecting…" else "Connect") }
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
            title = { Text("Unpair ${device.name}?") },
            text = { Text("The device will be removed from this app. Data already synced is kept.") },
            confirmButton = { TextButton(onClick = { confirmUnpair = false; onUnpair() }, modifier = Modifier.testTag("confirm_unpair")) { Text("Unpair") } },
            dismissButton = { TextButton(onClick = { confirmUnpair = false }) { Text("Cancel") } },
        )
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
                    rssi != null -> "${device.macAddress} · ${signalLabel(rssi)} ($rssi dBm)"
                    else -> "${device.macAddress} · Paired in system"
                }
                Text("${device.vendor.displayName} · $detail")
            },
            trailingContent = { FilledTonalButton(onClick = onPair, modifier = Modifier.testTag("pair_${device.macAddress}")) { Text("Pair") } },
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
                    label = { Text(if (requirement.format == CredentialFormat.HEX_16_BYTES) "32 hex digits" else requirement.label) },
                    visualTransformation = PasswordVisualTransformation(),
                )
                if (requirement.generatable) {
                    TextButton(onClick = onGenerate) { Text("Create a new key and bind this watch") }
                }
            }
        },
        confirmButton = { TextButton(onClick = { onSave(value) }, enabled = value.isNotBlank()) { Text("Save") } },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } },
    )
}

@Composable
private fun PairingCodeDialog(request: PairingCodeRequest, onSubmit: (String) -> Unit, onCancel: () -> Unit) {
    var code by rememberSaveable(request) { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onCancel,
        title = { Text("Pairing code") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(
                    "Enter the ${request.maxLength}-digit code shown on ${request.deviceName}.",
                    style = MaterialTheme.typography.bodyMedium,
                )
                OutlinedTextField(
                    value = code,
                    onValueChange = { input -> code = input.filter(Char::isDigit).take(request.maxLength) },
                    singleLine = true,
                    label = { Text("Code") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                )
            }
        },
        confirmButton = { TextButton(onClick = { onSubmit(code) }, enabled = code.length == request.maxLength) { Text("Pair") } },
        dismissButton = { TextButton(onClick = onCancel) { Text("Cancel") } },
    )
}

@Composable
private fun NoPairedDeviceCard(onScan: () -> Unit, onScanQrCode: () -> Unit) {
    OutlinedCard(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Text("No device paired yet", style = MaterialTheme.typography.titleMedium)
            Text(
                "Pair your watch or band to sync steps, heart rate, sleep and more.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                FilledTonalButton(onClick = onScanQrCode, modifier = Modifier.testTag("qr_scan_button_empty")) {
                    Icon(Icons.Outlined.QrCodeScanner, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(Spacing.xs))
                    Text("Scan QR code")
                }
                OutlinedButton(onClick = onScan) { Text("Scan for devices") }
            }
        }
    }
}

@Composable
private fun ManualMacDialog(onDismiss: () -> Unit, onSubmit: (String) -> Unit) {
    var value by rememberSaveable { mutableStateOf("") }
    val normalized = MacAddressFormat.normalizeOrNull(value)
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Enter MAC address") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(
                    "Find your watch directly by its Bluetooth address, e.g. from the box or the vendor app.",
                    style = MaterialTheme.typography.bodyMedium,
                )
                OutlinedTextField(
                    value = value,
                    onValueChange = { value = it },
                    singleLine = true,
                    isError = value.isNotBlank() && normalized == null,
                    label = { Text("AA:BB:CC:DD:EE:FF") },
                    modifier = Modifier.testTag("manual_mac_input"),
                )
            }
        },
        confirmButton = {
            TextButton(onClick = { onSubmit(value) }, enabled = normalized != null, modifier = Modifier.testTag("manual_mac_confirm")) {
                Text("Find")
            }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } },
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
            modifier = Modifier.fillMaxWidth().navigationBarsPadding().padding(Spacing.lg),
            verticalArrangement = Arrangement.spacedBy(Spacing.sm),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                WatchImage(model = watchModel, size = 64.dp, interactive = true, revealKey = matchedDevice != null)
                Text(
                    watchModel?.takeUnless { it.isGeneric }?.displayName ?: "Looking for ${state.label}",
                    style = MaterialTheme.typography.titleMedium,
                )
            }
            when (state.status) {
                QrFindStatus.SCANNING -> {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        CircularProgressIndicator(modifier = Modifier.size(20.dp))
                        Text("Keep the watch close to your phone…", style = MaterialTheme.typography.bodyMedium)
                    }
                    state.huaweiPin?.let {
                        Text("Code on the watch: $it", style = MaterialTheme.typography.bodyMedium)
                    }
                    TextButton(onClick = onCancel, modifier = Modifier.testTag("qr_find_cancel")) { Text("Cancel") }
                }
                QrFindStatus.FOUND -> {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        CircularProgressIndicator(modifier = Modifier.size(20.dp))
                        Text("Found it — pairing…", style = MaterialTheme.typography.bodyMedium)
                    }
                }
                QrFindStatus.TIMED_OUT -> {
                    Text(
                        "Couldn't find it. Make sure the watch is powered on, close to your phone and not " +
                            "already connected to another app.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        OutlinedButton(onClick = onChooseFromList, modifier = Modifier.testTag("qr_find_choose_from_list")) {
                            Text("Choose from list")
                        }
                        Button(onClick = onRetry, modifier = Modifier.testTag("qr_find_retry")) { Text("Try again") }
                    }
                }
            }
        }
    }
}

@Composable
private fun PermissionCard(onOpenSettings: () -> Unit) {
    ElevatedCard(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Text("Nearby devices permission needed", style = MaterialTheme.typography.titleMedium)
            Text(
                "Bluetooth permission is required to find and connect to your wearable.",
                style = MaterialTheme.typography.bodyMedium,
            )
            TextButton(onClick = onOpenSettings) { Text("Open settings") }
        }
    }
}

private fun signalLabel(rssi: Int): String = when {
    rssi >= -60 -> "Strong"
    rssi >= -75 -> "Good"
    else -> "Weak"
}

private val LAST_SYNC_FORMAT: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)

internal fun Context.openAppSettings() {
    startActivity(
        Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, android.net.Uri.fromParts("package", packageName, null))
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK),
    )
}
