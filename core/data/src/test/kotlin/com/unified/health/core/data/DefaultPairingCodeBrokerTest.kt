package com.unified.health.core.data

import com.unified.health.core.data.pairing.DefaultPairingCodeBroker
import com.unified.health.core.model.PairingCodeRequest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DefaultPairingCodeBrokerTest {
    private val watch = PairingCodeRequest("Watch", "AA:BB:CC:DD:EE:FF", maxLength = 6)

    @Test
    fun `submit returns the code and clears the prompt`() = runTest {
        val broker = DefaultPairingCodeBroker()
        var result: String? = "unset"
        launch { result = broker.requestCode(watch) }
        advanceUntilIdle()
        assertEquals(watch, broker.request.value)

        broker.submit("123456")
        advanceUntilIdle()

        assertEquals("123456", result)
        assertNull(broker.request.value)
    }

    @Test
    fun `cancel returns null`() = runTest {
        val broker = DefaultPairingCodeBroker()
        var result: String? = "unset"
        launch { result = broker.requestCode(watch) }
        advanceUntilIdle()

        broker.cancel()
        advanceUntilIdle()

        assertNull(result)
        assertNull(broker.request.value)
    }

    @Test
    fun `cancelling the caller dismisses the prompt`() = runTest {
        val broker = DefaultPairingCodeBroker()
        val job = launch { broker.requestCode(watch) }
        advanceUntilIdle()
        assertEquals(watch, broker.request.value)

        job.cancel()
        advanceUntilIdle()

        assertNull(broker.request.value)
    }
}
