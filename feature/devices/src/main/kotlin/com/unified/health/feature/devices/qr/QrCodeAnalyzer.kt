package com.unified.health.feature.devices.qr

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.zxing.BarcodeFormat
import com.google.zxing.BinaryBitmap
import com.google.zxing.DecodeHintType
import com.google.zxing.LuminanceSource
import com.google.zxing.MultiFormatReader
import com.google.zxing.PlanarYUVLuminanceSource
import com.google.zxing.ReaderException
import com.google.zxing.common.GlobalHistogramBinarizer
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
 *
 * Watch screens show a small, dense QR and sometimes render it light-on-dark (inverted) — plain
 * ZXing with default hints misses both cases often, which was a likely cause of Garmin finds
 * timing out (`docs/DECISIONS.md` D-1183). On top of [DecodeHintType.TRY_HARDER] /
 * [DecodeHintType.ALSO_INVERTED], each frame is *also* explicitly retried against an inverted
 * [LuminanceSource] — [MultiFormatReader.decodeWithState] does not run the invert-and-retry logic
 * that `ALSO_INVERTED` gets from `MultiFormatReader.decode(image, hints)` in ZXing 3.5.3, so the
 * hint alone is not enough here — and alternates [HybridBinarizer] (good for even lighting) with
 * the cheaper [GlobalHistogramBinarizer] (sometimes recovers low-contrast/glare frames
 * `HybridBinarizer` misses) across frames.
 */
internal class QrCodeAnalyzer(private val onDecoded: (String) -> Unit) : ImageAnalysis.Analyzer {

    private val reader = MultiFormatReader().apply {
        setHints(
            mapOf(
                DecodeHintType.POSSIBLE_FORMATS to listOf(BarcodeFormat.QR_CODE),
                DecodeHintType.TRY_HARDER to true,
                DecodeHintType.ALSO_INVERTED to true,
            ),
        )
    }

    @Volatile
    private var decoded = false

    private var frameCount = 0L

    override fun analyze(image: ImageProxy) {
        try {
            if (decoded) return
            val plane = image.planes.firstOrNull() ?: return
            val buffer = plane.buffer
            buffer.rewind()
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
            // Alternate binarizers frame-to-frame instead of running both every frame (cheap).
            val useHistogramBinarizer = (frameCount++ % 2L) == 1L
            val text = decode(source, useHistogramBinarizer) ?: decode(source.invert(), useHistogramBinarizer)
            if (text != null) {
                decoded = true
                onDecoded(text)
            }
        } catch (_: ReaderException) {
            // No decodable code in this frame (not found / bad checksum / bad format) — expected
            // most of the time, keep scanning.
        } catch (_: Exception) {
            // Defensive: a malformed camera frame (short/misaligned buffer, etc.) must never crash
            // the scanner screen — just skip the frame and keep scanning.
        } finally {
            reader.reset()
            image.close()
        }
    }

    private fun decode(source: LuminanceSource, useHistogramBinarizer: Boolean): String? {
        val binarizer = if (useHistogramBinarizer) GlobalHistogramBinarizer(source) else HybridBinarizer(source)
        return try {
            reader.decodeWithState(BinaryBitmap(binarizer)).text
        } catch (_: ReaderException) {
            null
        }
    }
}
