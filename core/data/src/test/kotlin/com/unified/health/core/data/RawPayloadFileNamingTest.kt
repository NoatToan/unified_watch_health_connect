package com.unified.health.core.data

import com.unified.health.core.data.sync.RawPayloadFileNaming
import com.unified.health.core.model.WearableVendor
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.time.Instant

class RawPayloadFileNamingTest {

    @get:Rule
    val tmp = TemporaryFolder()

    @Test
    fun `round-trips vendor, kind and timestamp through the file name`() {
        val name = RawPayloadFileNaming.fileName(WearableVendor.GARMIN, "fit_activity", 1_700_000_000_000L)
        assertEquals("garmin_fit_activity_1700000000000.bin", name)

        val file = tmp.newFile(name)
        file.writeBytes(byteArrayOf(1, 2, 3))
        val parsed = RawPayloadFileNaming.parse(file)!!
        assertEquals(WearableVendor.GARMIN, parsed.vendor)
        assertEquals("fit_activity", parsed.kind)
        assertEquals(Instant.ofEpochMilli(1_700_000_000_000L), parsed.createdAt)
        assertEquals(listOf(1.toByte(), 2.toByte(), 3.toByte()), parsed.bytes.toList())
    }

    @Test
    fun `unknown vendor or malformed name is ignored, not a crash`() {
        val wrongVendor = tmp.newFile("unknownbrand_fit_activity_1700000000000.bin")
        assertNull(RawPayloadFileNaming.parse(wrongVendor))

        val tooFewParts = tmp.newFile("garmin_1700000000000.bin")
        assertNull(RawPayloadFileNaming.parse(tooFewParts))

        val badStamp = tmp.newFile("garmin_fit_activity_notanumber.bin")
        assertNull(RawPayloadFileNaming.parse(badStamp))
    }
}
