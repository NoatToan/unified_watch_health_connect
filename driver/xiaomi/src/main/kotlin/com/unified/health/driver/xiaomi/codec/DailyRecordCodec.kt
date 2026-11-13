package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant

/**
 * `dailyType=0, fileType=0` minute records (`DailyRecordParser`, protocol §9.5 [V]). Bit-packed
 * `FourDimenDataInfo` groups ported field-by-field from
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/{daily/DailyRecordParser,
 * base/FourDimenDataParser,base/FitnessDataBaseParser}.java` [V] -- see [GROUPS].
 *
 * Only data-item types 2 (steps) and 8 (hr, protocol §9.5's table) are exposed as [HealthRecord]s.
 * Every other group (activityType/calories/sportType/distance/energy/totalCal family/spo2/stress/
 * hrPreAbnormal/lightValue/bodyMomentum) is still *decoded* here -- its presence and byte width
 * must be known to keep the cursor aligned for the fields that come after it in the same
 * bit-packed minute record -- but its value is discarded. A future milestone can expose more
 * [HealthRecord] kinds from the same records without re-deriving the byte layout.
 *
 * One [HealthRecord.Steps]/[HealthRecord.HeartRate] is emitted per minute that carries a value,
 * not coalesced into runs -- simplest correct mapping; coalescing equal-valued runs is a possible
 * storage optimisation for later, not a correctness requirement.
 *
 * `version == 1` uses a different, unported field table (`v1DataInfoArray` in the evidence, not
 * the [GROUPS] below, which is `v2DataInfoArray` -- reused as-is for version 2/3/4, matching the
 * evidence's `getDataInfoArray(version) = version == 1 ? v1 : v2`). Records with `version == 1`
 * are skipped entirely (steps/HR for a v1-reporting watch are not decoded by this milestone).
 * TODO(xiaomi-protocol): port `v1DataInfoArray` once a v1-reporting real watch is available to
 * verify against; until then this is a deliberate scope cut, not a guess.
 */
internal object DailyRecordCodec {

    private const val TYPE_INCLUDE_AB_HR = 1
    private const val TYPE_STEPS = 2
    private const val TYPE_HR = 8

    /** Vendor's `DateTimeHelper.sDayInMinutes` [Ext]: a calendar day has 1440 minutes; also the hard
     * upper bound on how many minute records one file can contain, so a corrupt/zeroed dataValid
     * header (every group "not exist", record length 0) cannot spin this loop forever. */
    private const val MAX_MINUTES_PER_FILE = 1_440

    /**
     * One `FourDimenType` triple (protocol §9.5's data-item type table: high/middle/low share one
     * raw field). `byteSize` is the field's own width in bytes (1 or 2 in this table); [high]/
     * [middle]/[low] describe how to extract each sub-value from that raw field (`null` = this
     * group has no such sub-value). [supportVersion] gates whether this group's nibble is present
     * in a given record's `dataValid` bitmap at all (protocol §9.5 [V], confirmed against
     * `FitnessDataValidity.getDailyRecordValidityLen`: versions 2/3/4 => 4/5/6 `dataValid` bytes,
     * i.e. 7/9/11 nibble-consuming groups -- matches [GROUPS] below exactly).
     */
    private data class Group(
        val highType: Int? = null,
        val middleType: Int? = null,
        val lowType: Int? = null,
        val byteSize: Int,
        val high: Span? = null,
        val middle: Span? = null,
        val low: Span? = null,
        val supportVersion: Int,
        val dynamic: Dynamic? = null,
    ) {
        /** `true` for every group except the synthetic `hrPreAbnormal` row, which has no type of its own. */
        val hasType: Boolean get() = highType != null || middleType != null || lowType != null
    }

    /**
     * `DataItemLen`: a non-zero [fullByteWidth] (matching the owning [Group.byteSize]) means "the
     * raw field value as-is, no bitmask" (`computeItemValue`'s `byteSize == byteSize` branch);
     * otherwise extract [bitSize] bits starting at [startBit].
     */
    private data class Span(val startBit: Int = 0, val bitSize: Int = 0, val fullByteWidth: Int = 0)

    /**
     * `DynamicValidDataType`: an extra [byteSize]-byte field (`hrPreAbnormal`, type 16) appended
     * only when the group identified by [dependsOnType] extracted a value equal to [existValue].
     */
    private data class Dynamic(val dependsOnType: Int, val existValue: Int, val byteSize: Int)

    /**
     * `v2DataInfoArray` (`DailyRecordParser.java`, constructor body), in wire order.
     */
    private val GROUPS: List<Group> = listOf(
        // includeSleep(0, unused in v2)/includeAbHr(1)/steps(2), 2 bytes, supportVersion=2.
        Group(middleType = TYPE_INCLUDE_AB_HR, lowType = TYPE_STEPS, byteSize = 2, middle = Span(startBit = 14, bitSize = 1), low = Span(startBit = 0, bitSize = 14), supportVersion = 2),
        // activityType(3)/calories(4), 1 byte, supportVersion=2.
        Group(highType = 3, middleType = 4, byteSize = 1, high = Span(startBit = 6, bitSize = 2), middle = Span(startBit = 0, bitSize = 6), supportVersion = 2),
        // activityHILevel(5)/sportType(6), 1 byte, supportVersion=2.
        Group(highType = 5, middleType = 6, byteSize = 1, high = Span(startBit = 5, bitSize = 3), middle = Span(startBit = 0, bitSize = 5), supportVersion = 2),
        // distance(7), 2 bytes, supportVersion=2.
        Group(highType = 7, byteSize = 2, high = Span(fullByteWidth = 2), supportVersion = 2),
        // hr(8), 1 byte, supportVersion=2.
        Group(highType = TYPE_HR, byteSize = 1, high = Span(fullByteWidth = 1), supportVersion = 2),
        // energy(9), 1 byte, supportVersion=2.
        Group(highType = 9, byteSize = 1, high = Span(fullByteWidth = 1), supportVersion = 2),
        // totalCal(11)/energyState(12)/energyStateValue(13), 2 bytes, supportVersion=2.
        Group(highType = 11, middleType = 12, lowType = 13, byteSize = 2, high = Span(startBit = 10, bitSize = 6), middle = Span(startBit = 8, bitSize = 2), low = Span(startBit = 0, bitSize = 8), supportVersion = 2),
        // spo2(14), 1 byte, supportVersion=3.
        Group(highType = 14, byteSize = 1, high = Span(fullByteWidth = 1), supportVersion = 3),
        // pressure/stress(15), 1 byte, supportVersion=3.
        Group(highType = 15, byteSize = 1, high = Span(fullByteWidth = 1), supportVersion = 3),
        // hrPreAbnormal(16): dynamic, 1 byte, present only when includeAbHr(1) == 1.
        Group(byteSize = 0, supportVersion = 2, dynamic = Dynamic(dependsOnType = TYPE_INCLUDE_AB_HR, existValue = 1, byteSize = 1)),
        // lightValue(17), 2 bytes, supportVersion=4.
        Group(highType = 17, byteSize = 2, high = Span(fullByteWidth = 2), supportVersion = 4),
        // bodyMomentum(18), 2 bytes, supportVersion=4.
        Group(highType = 18, byteSize = 2, high = Span(fullByteWidth = 2), supportVersion = 4),
    )

    private data class GroupValid(val exist: Boolean, val high: Boolean, val middle: Boolean, val low: Boolean) {
        companion object {
            val ABSENT = GroupValid(exist = false, high = false, middle = false, low = false)
        }
    }

    /** `getDailyRecordValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`). */
    private fun dataValidLen(version: Int): Int? = when (version) {
        1, 2 -> 4
        3 -> 5
        4 -> 6
        else -> null
    }

    /**
     * Decodes every minute record in [payload] (the bytes after [FitnessFilePayload.decode]
     * stripped the raw 7-byte id and the CRC32 trailer): `[0] = padding, [1..1+len) = dataValid,
     * [1+len..] = minute records back-to-back` (protocol §9.5 [V], mirroring how the vendor's own
     * `FitnessDataHeader`/`generateCompleteData` re-derive the same split -- see this codec's KDoc
     * for the byte-math that establishes this layout).
     *
     * @return steps/heart-rate records, newest-last; empty (not an error) for an unsupported
     * version or a payload too short to contain a header.
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        val validLen = dataValidLen(id.version) ?: return emptyList()
        if (payload.size < 1 + validLen) return emptyList()
        val dataValid = payload.copyOfRange(1, 1 + validLen)
        val validity = decodeValidity(id.version, dataValid)
        val recordLen = GROUPS.filterIndexed { i, g -> g.hasType && validity[i]?.exist == true }.sumOf { it.byteSize }
        if (recordLen <= 0) return emptyList()

        val reader = ByteReader(payload, 1 + validLen, payload.size)
        val minuteStartEpoch = (id.timestampSeconds / 60) * 60
        val records = mutableListOf<HealthRecord>()
        var minuteIndex = 0
        while (minuteIndex < MAX_MINUTES_PER_FILE && reader.remaining >= recordLen) {
            val minute = parseMinute(reader, validity)
            val minuteStart = Instant.ofEpochSecond(minuteStartEpoch + minuteIndex * 60L)
            minute.steps?.let { records += HealthRecord.Steps(minuteStart, minuteStart.plusSeconds(60), it) }
            minute.heartRate?.let { records += HealthRecord.HeartRate(minuteStart, it) }
            minuteIndex++
        }
        return records
    }

    private data class MinuteValues(val steps: Int?, val heartRate: Int?)

    private fun parseMinute(reader: ByteReader, validity: List<GroupValid?>): MinuteValues {
        var steps: Int? = null
        var heartRate: Int? = null
        var includeAbHr: Int? = null
        GROUPS.forEachIndexed { index, group ->
            val dynamic = group.dynamic
            if (dynamic != null) {
                if (includeAbHr == dynamic.existValue && reader.remaining >= dynamic.byteSize) {
                    rawField(reader, dynamic.byteSize) // hrPreAbnormal; not exposed by this milestone.
                }
                return@forEachIndexed
            }
            val valid = validity[index] ?: return@forEachIndexed
            if (!valid.exist || reader.remaining < group.byteSize) return@forEachIndexed
            val raw = rawField(reader, group.byteSize)
            if (group.high != null && valid.high) {
                val value = extract(group.high, raw)
                if (group.highType == TYPE_HR) heartRate = value
            }
            if (group.middle != null && valid.middle) {
                val value = extract(group.middle, raw)
                if (group.middleType == TYPE_INCLUDE_AB_HR) includeAbHr = value
            }
            if (group.low != null && valid.low) {
                val value = extract(group.low, raw)
                if (group.lowType == TYPE_STEPS) steps = value
            }
        }
        return MinuteValues(steps, heartRate)
    }

    /** `computeItemValue`: the raw value as-is for a full-width span, else a masked bit extraction. */
    private fun extract(span: Span, raw: Int): Int =
        if (span.fullByteWidth > 0) raw else (raw and (((1 shl span.bitSize) - 1) shl span.startBit)) ushr span.startBit

    private fun rawField(reader: ByteReader, byteSize: Int): Int = when (byteSize) {
        1 -> reader.u8()
        2 -> reader.u16le()
        else -> throw MalformedPayloadException("Unsupported daily record field byteSize $byteSize")
    }

    /**
     * `parseDataValid`: one nibble per [GROUPS] entry that [Group.hasType] (high nibble first,
     * protocol §9.5 [V]), only for entries whose [Group.supportVersion] does not exceed [version]
     * (a field introduced in a later firmware generation has no nibble in an older record at all).
     */
    private fun decodeValidity(version: Int, dataValid: ByteArray): List<GroupValid?> {
        var nibbleIndex = 0
        return GROUPS.map { group ->
            if (!group.hasType) return@map null
            if (group.supportVersion > version) return@map GroupValid.ABSENT
            val byteIndex = nibbleIndex / 2
            if (byteIndex >= dataValid.size) return@map GroupValid.ABSENT
            val byte = dataValid[byteIndex].toInt() and 0xFF
            val nibble = if (nibbleIndex % 2 == 0) (byte ushr 4) and 0xF else byte and 0xF
            nibbleIndex++
            GroupValid(exist = nibble and 0x8 != 0, high = nibble and 0x4 != 0, middle = nibble and 0x2 != 0, low = nibble and 0x1 != 0)
        }
    }
}
