package com.unified.health.feature.devices.qr

import android.Manifest
import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Size as AndroidSize
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraControl
import androidx.camera.core.CameraSelector
import androidx.camera.core.FocusMeteringAction
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.core.resolutionselector.ResolutionSelector
import androidx.camera.core.resolutionselector.ResolutionStrategy
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.FlashOff
import androidx.compose.material.icons.outlined.FlashOn
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.unified.health.core.designsystem.permission.RuntimePermissions
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.feature.devices.openAppSettings
import java.util.concurrent.Executors

/**
 * "Pair with QR code" camera screen: CameraX preview + [ImageAnalysis] decoded with ZXing core
 * ([QrCodeAnalyzer]). Calls [onResult] once with the raw decoded text and does not call it again;
 * the caller is responsible for dismissing this screen (which tears down the camera).
 */
@Composable
internal fun QrScannerScreen(onResult: (String) -> Unit, onCancel: () -> Unit) {
    val context = LocalContext.current
    val haptics = LocalHapticFeedback.current
    var hasPermission by rememberSaveable {
        mutableStateOf(RuntimePermissions.allGranted(context, RuntimePermissions.camera))
    }
    var hasRequestedOnce by rememberSaveable { mutableStateOf(false) }
    val permissionLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        hasPermission = granted
        hasRequestedOnce = true
    }

    Box(Modifier.fillMaxSize().testTag("qr_scanner")) {
        if (hasPermission) {
            QrCameraPreview(
                onResult = { raw ->
                    haptics.performHapticFeedback(HapticFeedbackType.LongPress)
                    onResult(raw)
                },
                onCancel = onCancel,
            )
        } else {
            val activity = context as? Activity
            val permanentlyDenied = hasRequestedOnce &&
                activity != null &&
                !activity.shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)
            QrPermissionRationale(
                permanentlyDenied = permanentlyDenied,
                onRequest = { permissionLauncher.launch(Manifest.permission.CAMERA) },
                onOpenSettings = { context.openAppSettings() },
                onCancel = onCancel,
            )
        }
    }
}

@Composable
private fun QrCameraPreview(onResult: (String) -> Unit, onCancel: () -> Unit) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val previewView = remember { PreviewView(context) }
    val mainHandler = remember { Handler(Looper.getMainLooper()) }
    var cameraControl by remember { mutableStateOf<CameraControl?>(null) }
    var hasTorch by remember { mutableStateOf(false) }
    var torchOn by remember { mutableStateOf(false) }

    DisposableEffect(lifecycleOwner) {
        val analysisExecutor = Executors.newSingleThreadExecutor()
        val providerFuture = ProcessCameraProvider.getInstance(context)
        providerFuture.addListener(
            {
                val provider = providerFuture.get()
                val preview = Preview.Builder().build().also { it.surfaceProvider = previewView.surfaceProvider }
                // Default ImageAnalysis resolution (640x480) is too low to resolve a small, dense
                // QR shown on a watch screen; target ~720p, falling back to the closest size the
                // device actually supports (D-1183).
                val resolutionSelector = ResolutionSelector.Builder()
                    .setResolutionStrategy(
                        ResolutionStrategy(AndroidSize(1280, 720), ResolutionStrategy.FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER),
                    )
                    .build()
                val analysis = ImageAnalysis.Builder()
                    .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                    .setResolutionSelector(resolutionSelector)
                    .build()
                    .also { useCase ->
                        useCase.setAnalyzer(analysisExecutor, QrCodeAnalyzer { raw -> mainHandler.post { onResult(raw) } })
                    }
                runCatching {
                    provider.unbindAll()
                    val camera = provider.bindToLifecycle(lifecycleOwner, CameraSelector.DEFAULT_BACK_CAMERA, preview, analysis)
                    cameraControl = camera.cameraControl
                    hasTorch = camera.cameraInfo.hasFlashUnit()
                    // Nudge continuous AF/AE toward the frame center once bound: a small QR held
                    // close to the lens can sit outside some devices' default metering region
                    // (D-1183). `disableAutoCancel()` keeps it continuous instead of the default
                    // one-shot-then-revert behaviour.
                    val centerPoint = previewView.meteringPointFactory.createPoint(0.5f, 0.5f)
                    camera.cameraControl.startFocusAndMetering(
                        FocusMeteringAction.Builder(centerPoint, FocusMeteringAction.FLAG_AF or FocusMeteringAction.FLAG_AE)
                            .disableAutoCancel()
                            .build(),
                    )
                }
            },
            ContextCompat.getMainExecutor(context),
        )
        onDispose {
            analysisExecutor.shutdown()
            runCatching { ProcessCameraProvider.getInstance(context).get().unbindAll() }
        }
    }

    Box(Modifier.fillMaxSize()) {
        AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize())
        ViewfinderOverlay(Modifier.fillMaxSize())
        Column(Modifier.fillMaxSize().statusBarsPadding().padding(Spacing.md)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                IconButton(onClick = onCancel, modifier = Modifier.testTag("qr_scanner_cancel")) {
                    Icon(Icons.Outlined.Close, contentDescription = "Cancel", tint = Color.White)
                }
                if (hasTorch) {
                    IconButton(
                        onClick = {
                            torchOn = !torchOn
                            cameraControl?.enableTorch(torchOn)
                        },
                        modifier = Modifier.testTag("qr_scanner_torch"),
                    ) {
                        Icon(
                            if (torchOn) Icons.Outlined.FlashOff else Icons.Outlined.FlashOn,
                            contentDescription = if (torchOn) "Turn off torch" else "Turn on torch",
                            tint = Color.White,
                        )
                    }
                }
            }
            Text(
                "Point the camera at the QR code shown on your watch",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = Spacing.xl),
            )
        }
    }
}

@Composable
private fun ViewfinderOverlay(modifier: Modifier = Modifier) {
    val scrim = Color.Black.copy(alpha = 0.55f)
    Canvas(modifier) {
        val boxSize = size.minDimension * 0.65f
        val left = (size.width - boxSize) / 2f
        val top = (size.height - boxSize) / 2f
        drawRect(scrim, topLeft = Offset.Zero, size = Size(size.width, top))
        drawRect(scrim, topLeft = Offset(0f, top + boxSize), size = Size(size.width, size.height - top - boxSize))
        drawRect(scrim, topLeft = Offset(0f, top), size = Size(left, boxSize))
        drawRect(scrim, topLeft = Offset(left + boxSize, top), size = Size(size.width - left - boxSize, boxSize))
        drawRect(
            Color.White,
            topLeft = Offset(left, top),
            size = Size(boxSize, boxSize),
            style = Stroke(width = 3.dp.toPx()),
        )
    }
}

@Composable
private fun QrPermissionRationale(
    permanentlyDenied: Boolean,
    onRequest: () -> Unit,
    onOpenSettings: () -> Unit,
    onCancel: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(Spacing.lg),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Camera permission needed", style = MaterialTheme.typography.titleMedium)
        Text(
            "Unified Health uses the camera only to scan the QR code shown on your watch, to " +
                "find and pair it faster.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = Spacing.sm, bottom = Spacing.lg),
        )
        if (permanentlyDenied) {
            ElevatedButton(onClick = onOpenSettings) { Text("Open settings") }
        } else {
            ElevatedButton(onClick = onRequest) { Text("Grant camera permission") }
        }
        ElevatedButton(onClick = onCancel, modifier = Modifier.padding(top = Spacing.sm)) { Text("Cancel") }
    }
}
