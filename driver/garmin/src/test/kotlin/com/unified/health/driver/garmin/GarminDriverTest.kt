package com.unified.health.driver.garmin

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.PairingCodeRequest
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
    fun `identifiers reads the product number from manufacturer data`() {
        val identifiers = driver.identifiers(ad(manufacturer = mapOf(0x0087 to byteArrayOf(0x0F, 0x96.toByte()))))
        assertEquals(mapOf(com.unified.health.core.model.VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to "3990"), identifiers)
    }

    @Test
    fun `identifiers also reads the byte-swapped company id`() {
        val identifiers = driver.identifiers(ad(manufacturer = mapOf(0x8700 to byteArrayOf(0x00, 0x01))))
        assertEquals(mapOf(com.unified.health.core.model.VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to "1"), identifiers)
    }

    @Test
    fun `identifiers is empty without Garmin manufacturer data`() {
        assertTrue(driver.identifiers(ad(name = "Forerunner 265")).isEmpty())
        assertTrue(driver.identifiers(ad(manufacturer = mapOf(0x0087 to byteArrayOf(0x01)))).isEmpty())
    }
}
