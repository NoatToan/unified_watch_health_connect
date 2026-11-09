package com.unified.health.driver.garmin

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.PairingCodeRequest
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.garmin.codec.fit.FitHealthMapper
import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.enum
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.fit
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GarminDriverTest {

    private val driver = GarminDriver(
        object : PairingCodeRequester {
            override suspend fun requestCode(request: PairingCodeRequest): String? = null
        },
    )

    private fun ad(
        name: String? = null,
        services: Set<java.util.UUID> = emptySet(),
        manufacturer: Map<Int, ByteArray> = emptyMap(),
        serviceData: Map<java.util.UUID, ByteArray> = emptyMap(),
    ) = Advertisement("AA:BB:CC:DD:EE:FF", name, -60, services, manufacturer, serviceData)

    @Test
    fun `manufacturer data under Garmin company id wins`() {
        assertEquals(RecognitionScore.VENDOR_MANUFACTURER_DATA, driver.recognize(ad(manufacturer = mapOf(0x0087 to byteArrayOf(0x0F, 0x96.toByte())))))
        assertEquals(RecognitionScore.VENDOR_MANUFACTURER_DATA, driver.recognize(ad(manufacturer = mapOf(0x8700 to byteArrayOf()))))
    }

    @Test
    fun `Garmin services and service data`() {
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(services = setOf(GarminUuids.MULTI_LINK_SERVICE))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(services = setOf(GarminUuids.garminUuid(0x1234)))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(services = setOf(GarminUuids.GFDI_V1_SERVICE))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(serviceData = mapOf(sigUuid(0xFE1F) to byteArrayOf(0)))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(serviceData = mapOf(sigUuid(0x3E10) to byteArrayOf(0)))))
    }

    @Test
    fun `model names`() {
        listOf("Forerunner 265", "fēnix 7", "Venu 3", "vívoactive 5", "Instinct 2", "Edge 840", "MARQ", "Descent Mk3")
            .forEach { assertEquals(it, RecognitionScore.NAME, driver.recognize(ad(name = it))) }
    }

    @Test
    fun `other devices are not recognised`() {
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(name = "Knowledge Speaker")))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(name = "Amazfit GTR", manufacturer = mapOf(0x0157 to byteArrayOf()))))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(services = setOf(StandardUuids.HEART_RATE_SERVICE))))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad()))
    }

    @Test
    fun `link requirements and credentials`() {
        assertTrue(driver.linkRequirements.bond)
        assertEquals(515, driver.linkRequirements.mtu)
        assertTrue(driver.credentialRequirements.isEmpty())
    }

    @Test
    fun `identifiers reads the product number and raw hex payload from manufacturer data`() {
        val identifiers = driver.identifiers(ad(manufacturer = mapOf(0x0087 to byteArrayOf(0x0F, 0x96.toByte()))))
        assertEquals(
            mapOf(
                com.unified.health.core.model.VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to "3990",
                com.unified.health.core.model.VendorIdentifierKeys.GARMIN_MANUFACTURER_DATA to "0f96",
            ),
            identifiers,
        )
    }

    @Test
    fun `identifiers also reads the byte-swapped company id`() {
        val identifiers = driver.identifiers(ad(manufacturer = mapOf(0x8700 to byteArrayOf(0x00, 0x01))))
        assertEquals(
            mapOf(
                com.unified.health.core.model.VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to "1",
                com.unified.health.core.model.VendorIdentifierKeys.GARMIN_MANUFACTURER_DATA to "0001",
            ),
            identifiers,
        )
    }

    @Test
    fun `identifiers keeps the raw hex payload even when the product number guess fails`() {
        // Too short for productNumberFrom (needs 2+ bytes), but still useful for GarminQrMatcher's
        // offset-agnostic unitId search.
        val identifiers = driver.identifiers(ad(manufacturer = mapOf(0x0087 to byteArrayOf(0x01))))
        assertEquals(mapOf(com.unified.health.core.model.VendorIdentifierKeys.GARMIN_MANUFACTURER_DATA to "01"), identifiers)
    }

    @Test
    fun `identifiers is empty without any Garmin manufacturer data`() {
        assertTrue(driver.identifiers(ad(name = "Forerunner 265")).isEmpty())
    }

    @Test
    fun `reprocess recovers a workout from a stored fit_activity payload`() = runTest {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_SESSION, u32(253), u32(2), enum(5), u32(7), u32(9), u16(11), u8(16), u8(17))
            .record(0, 4000, 0, 2, 1_800_000, 500_000, 300, 140, 170)
            .build()
        val records = driver.reprocess(HealthRecord.RawPayload(WearableVendor.GARMIN, "fit_activity", null, bytes))
        val workout = records.filterIsInstance<HealthRecord.Workout>().single()
        assertEquals("cycling", workout.sport)
        assertEquals(300, workout.activeKcal)
    }

    @Test
    fun `reprocess also recovers laps and samples from a workout synced before D-1093 (D-1176 backfill)`() = runTest {
        // Same shape as a real ACTIVITY file: record(20)/lap(19) appear before the session(18) that
        // closes them. Before D-1176, `reprocess` discarded everything but the Workout; now the
        // backfill relies on the exact same FitHealthMapper output recovering WorkoutLap/WorkoutSample.
        val t0 = fit("2026-03-01T20:00:00Z")
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_RECORD, u32(253), u8(3))
            .record(0, t0 + 10, 150)
            .define(1, FitHealthMapper.MESG_LAP, u32(2), u32(7))
            .record(1, t0, 600_000)
            .define(2, FitHealthMapper.MESG_SESSION, u32(253), u32(2), enum(5), u32(7), u32(9), u16(11), u8(16), u8(17))
            .record(2, t0 + 700, t0, 1, 610_000, 100_000, 80, 140, 160)
            .build()

        val records = driver.reprocess(HealthRecord.RawPayload(WearableVendor.GARMIN, "fit_activity", null, bytes))

        val workout = records.filterIsInstance<HealthRecord.Workout>().single()
        val lap = records.filterIsInstance<HealthRecord.WorkoutLap>().single()
        val sample = records.filterIsInstance<HealthRecord.WorkoutSample>().single()
        assertEquals(workout.start, lap.workoutStart)
        assertEquals(workout.start, sample.workoutStart)
        assertEquals(150, sample.heartRate)
    }

    @Test
    fun `reprocess ignores other kinds and other vendors`() = runTest {
        val bytes = ByteArray(0)
        assertTrue(driver.reprocess(HealthRecord.RawPayload(WearableVendor.GARMIN, "fit_monitoring", null, bytes)).isEmpty())
        assertTrue(driver.reprocess(HealthRecord.RawPayload(WearableVendor.HUAWEI, "fit_activity", null, bytes)).isEmpty())
    }
}
