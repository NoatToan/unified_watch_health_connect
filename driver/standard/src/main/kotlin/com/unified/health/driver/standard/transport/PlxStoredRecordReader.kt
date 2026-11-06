package com.unified.health.driver.standard.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.standard.codec.RecordAccessControlPoint
import com.unified.health.driver.standard.codec.RecordAccessControlPoint.Response
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull

/**
 * Downloads the records a pulse oximeter stored while disconnected, through the Record Access
 * Control Point [Ext: PLXS 1.0 §3.4]. The records themselves are indicated on the Spot-Check
 * characteristic and land in the session's [spotCheckPump]; this class only drives the procedure.
 * Records are never deleted from the device (D-608).
 */
internal class PlxStoredRecordReader(
    private val gatt: GattClient,
    private val controlPoint: GattCharacteristic,
    /** Indications of [controlPoint], subscribed when the session started. */
    private val responses: ReceiveChannel<ByteArray>,
    private val spotCheckPump: NotificationPump,
    private val timeoutMs: Long = PROCEDURE_TIMEOUT_MS,
) {
    /**
     * Runs "Report Stored Records / All records" and waits for its Response Code.
     * @return false when the device has no stored records.
     * @throws WearableProtocolException on a negative response or timeout.
     */
    suspend fun reportAll(): Boolean {
        drainStale()
        writeRequest(RecordAccessControlPoint.reportAllStoredRecords())
        val code = try {
            withTimeoutOrNull(timeoutMs) { awaitResponseCode(RecordAccessControlPoint.OP_REPORT_STORED_RECORDS) }
        } catch (e: CancellationException) {
            abortQuietly()
            throw e
        } ?: run {
            abortQuietly()
            throw WearableProtocolException("Pulse oximeter did not finish sending stored records within ${timeoutMs / 1000} s")
        }
        // Every stored record was indicated before the response: make sure they are all decoded.
        spotCheckPump.flush()
        return when {
            code.isSuccess -> true
            code.isNoRecords -> false
            else -> throw WearableProtocolException("Pulse oximeter refused to report stored records: ${RecordAccessControlPoint.describe(code.value)}")
        }
    }

    private suspend fun awaitResponseCode(requestOpCode: Int): Response.Code {
        while (true) {
            val value = responses.receiveCatching().getOrNull()
                ?: throw WearableProtocolException("Link lost while reading stored pulse oximeter records")
            val response = try {
                RecordAccessControlPoint.parseResponse(value)
            } catch (e: MalformedPayloadException) {
                Log.w(TAG, "Ignoring malformed RACP indication: ${e.message}")
                continue
            }
            if (response is Response.Code && response.requestOpCode == requestOpCode) return response
        }
    }

    private suspend fun writeRequest(value: ByteArray) {
        try {
            gatt.write(controlPoint, value)
        } catch (e: GattException) {
            throw WearableProtocolException("Could not write the Record Access Control Point: ${e.message}", e)
        }
    }

    private fun drainStale() {
        while (true) {
            if (responses.tryReceive().isFailure) return
        }
    }

    private suspend fun abortQuietly() = withContext(NonCancellable) {
        withTimeoutOrNull(ABORT_TIMEOUT_MS) {
            runCatching { gatt.write(controlPoint, RecordAccessControlPoint.abort()) }
                .onFailure { Log.d(TAG, "RACP abort failed: ${it.message}") }
        }
    }

    companion object {
        private const val TAG = "StandardRacp"
        const val PROCEDURE_TIMEOUT_MS = 60_000L
        private const val ABORT_TIMEOUT_MS = 2_000L
    }
}
