package com.unified.health.driver.standard.codec

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Instant

class DerivedMetricsTest {

    private val t0: Instant = Instant.parse("2026-11-06T10:00:00Z")

    @Test
    fun `rmssd of alternating intervals after a full window`() {
        val window = RmssdWindow()
        var result: Int? = null
        for (i in 0..60) {
            val rr = if (i % 2 == 0) 800 else 820
            result = window.add(t0.plusSeconds(i.toLong()), listOf(rr)) ?: result
        }
        assertEquals(20, result)
        assertNull("window restarted", window.flush())
    }

    @Test
    fun `rmssd skips ectopic beats and out of range values`() {
        val window = RmssdWindow()
        val rr = MutableList(30) { if (it % 2 == 0) 1000 else 1010 }
        rr[10] = 1500 // +50 %: both differences around it are skipped
        rr[20] = 200 // below the physiological range
        window.add(t0, rr)
        assertEquals(10, window.flush())
    }

    @Test
    fun `rmssd flush needs enough differences`() {
        val window = RmssdWindow()
        window.add(t0, List(10) { 800 })
        assertNull(window.flush())
    }

    @Test
    fun `cadence integrates into minute buckets`() {
        val counter = CadenceStepCounter()
        val closed = mutableListOf<CadenceStepCounter.Bucket>()
        // 120 steps/min, one sample per second from 10:00:00 to 10:01:30.
        for (s in 0..90) counter.add(t0.plusSeconds(s.toLong()), 120)?.let(closed::add)
        assertEquals(1, closed.size)
        assertEquals(CadenceStepCounter.Bucket(t0, t0.plusSeconds(60), 120), closed.single())
        val partial = checkNotNull(counter.partial(t0.plusSeconds(90)))
        assertEquals(t0.plusSeconds(60), partial.start)
        assertEquals(60, partial.steps)
    }

    @Test
    fun `cadence gaps longer than five seconds are not integrated`() {
        val counter = CadenceStepCounter()
        counter.add(t0, 120)
        counter.add(t0.plusSeconds(30), 120)
        assertNull(counter.partial(t0.plusSeconds(30)))
    }
}
