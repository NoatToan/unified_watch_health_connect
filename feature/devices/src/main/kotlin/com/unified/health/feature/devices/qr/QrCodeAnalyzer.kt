package com.unified.health.feature.devices.qr

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.zxing.BarcodeFormat
import com.google.zxing.BinaryBitmap
import com.google.zxing.DecodeHintType
import com.google.zxing.MultiFormatReader
import com.google.zxing.NotFoundException
import com.google.zxing.PlanarYUVLuminanceSource
import com.google.zxing.common.HybridBinarizer

/**
 * CameraX [ImageAnalysis.Analyzer] that decodes a QR code with ZXing core (no Google Play
 * Services / ML Kit dependency — important so Huawei phones without GMS can still scan,
 * `docs/DECISIONS.md` D-900).
 *
 * Reads the analysis image's luminance (Y) plane directly, which ZXing's
 * [PlanarYUVLuminanceSource] is designed for — no YUV→RGB conversion needed. Calls [onDecoded] at
 * most once per analyzer instance (after the first hit, further frames are ignored); the caller
 * is responsible for unbinding the use case once it has what it needs.
 */
internal class QrCodeAnalyzer(private val onDecoded: (String) -> Unit) : ImageAnalysis.Analyzer {

    private val reader = MultiFormatReader().apply {
        setHints(mapOf(DecodeHintType.POSSIBLE_FORMATS to listOf(BarcodeFormat.QR_CODE)))
    }

    @Volatile
    private var decoded = false

    override fun analyze(image: ImageProxy) {
        try {
            if (decoded) return
            val plane = image.planes.firstOrNull() ?: return
            val buffer = plane.buffer
            val bytes = ByteArray(buffer.remaining())
            buffer.get(bytes)
            // planes[0].rowStride can exceed the image width (sensor padding); PlanarYUVLuminanceSource
            // only needs the Y plane and crops to the reported width/height itself.
            val source = PlanarYUVLuminanceSource(
                bytes,
                plane.rowStride,
                image.height,
                0,
                0,
                image.width,
                image.height,
                false,
            )
            val bitmap = BinaryBitmap(HybridBinarizer(source))
            val result = reader.decodeWithState(bitmap)
            decoded = true
            onDecoded(result.text)
        } catch (_: NotFoundException) {
            // No code in this frame — expected most of the time, keep scanning.
        } finally {
            reader.reset()
            image.close()
        }
    }
}
