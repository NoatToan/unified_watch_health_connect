package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Record Access Control Point (0x2A52) [Ext: GSS §3.180; PLXS 1.0 §3.4 — the Pulse Oximeter
 * profile supports the "All records" operator only, it has no sequence-number filter].
 *
 * Request: Op Code, Operator, [Operand]. Responses arrive as indications: Response Code
 * (0x06, 0x00, request op code, response value) or Number of Stored Records (0x05, 0x00, uint16).
 */
internal object RecordAccessControlPoint {
    const val OP_REPORT_STORED_RECORDS = 0x01
    const val OP_ABORT = 0x03
    const val OP_REPORT_NUMBER_OF_RECORDS = 0x04
    const val OP_NUMBER_OF_RECORDS_RESPONSE = 0x05
    const val OP_RESPONSE_CODE = 0x06

    const val OPERATOR_NULL = 0x00
    const val OPERATOR_ALL_RECORDS = 0x01

    const val RESPONSE_SUCCESS = 0x01
    const val RESPONSE_NO_RECORDS_FOUND = 0x06

    fun reportAllStoredRecords(): ByteArray = byteArrayOf(OP_REPORT_STORED_RECORDS.toByte(), OPERATOR_ALL_RECORDS.toByte())

    fun reportNumberOfAllRecords(): ByteArray = byteArrayOf(OP_REPORT_NUMBER_OF_RECORDS.toByte(), OPERATOR_ALL_RECORDS.toByte())

    fun abort(): ByteArray = byteArrayOf(OP_ABORT.toByte(), OPERATOR_NULL.toByte())

    sealed interface Response {
        data class Code(val requestOpCode: Int, val value: Int) : Response {
            val isSuccess: Boolean get() = value == RESPONSE_SUCCESS
            val isNoRecords: Boolean get() = value == RESPONSE_NO_RECORDS_FOUND
        }

        data class NumberOfRecords(val count: Int) : Response
    }

    /** @throws MalformedPayloadException for an unknown op code or a short value. */
    fun parseResponse(value: ByteArray): Response {
        val r = ByteReader(value)
        return when (val op = r.u8()) {
            OP_RESPONSE_CODE -> {
                r.u8() // operator: always Null in a response
                Response.Code(requestOpCode = r.u8(), value = r.u8())
            }
            OP_NUMBER_OF_RECORDS_RESPONSE -> {
                r.u8()
                Response.NumberOfRecords(r.u16le())
            }
            else -> throw MalformedPayloadException("Unexpected RACP op code 0x%02x".format(op))
        }
    }

    /** Human-readable response value for error messages. */
    fun describe(value: Int): String = when (value) {
        0x01 -> "success"
        0x02 -> "op code not supported"
        0x03 -> "invalid operator"
        0x04 -> "operator not supported"
        0x05 -> "invalid operand"
        0x06 -> "no records found"
        0x07 -> "abort unsuccessful"
        0x08 -> "procedure not completed"
        0x09 -> "operand not supported"
        else -> "response 0x%02x".format(value)
    }
}
