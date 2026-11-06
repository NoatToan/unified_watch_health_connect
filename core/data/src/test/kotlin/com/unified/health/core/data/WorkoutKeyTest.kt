package com.unified.health.core.data

import com.unified.health.core.data.repository.LocalHealthDataRepository.WorkoutKey
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class WorkoutKeyTest {

    @Test
    fun `round trips a MAC address device id`() {
        val key = WorkoutKey("02:DE:30:00:00:01", 1_762_412_400_000)
        assertEquals("02:DE:30:00:00:01@1762412400000", key.id)
        assertEquals(key, WorkoutKey.parse(key.id))
    }

    @Test
    fun `rejects malformed ids`() {
        assertNull(WorkoutKey.parse("no-separator"))
        assertNull(WorkoutKey.parse("@123"))
        assertNull(WorkoutKey.parse("device@notanumber"))
    }
}
