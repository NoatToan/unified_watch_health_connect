package com.unified.health.driver.coros

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class CorosConnectionStateMachineTest {

    @Test
    fun `lifecycle matches the verified state strings and issues generations`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 7)
        assertEquals(CorosConnectionState.Idle, machine.state.value)

        val ref = machine.openFreshGatt()
        assertEquals(1L, ref.token)
        assertEquals("OpenFreshGatt(gattRef=GattRef(token=1))", machine.state.value.toString())

        machine.connecting(ref)
        assertEquals("Connecting(gattRef=GattRef(token=1))", machine.state.value.toString())

        machine.discoverServices(ref)
        assertEquals("DiscoverServices(gattRef=GattRef(token=1))", machine.state.value.toString())

        val token = machine.beginAttempt()
        assertEquals(7L, token.connectorInstanceId)
        assertEquals(1, token.attempt)
        assertEquals(ref, token.gattRef)
        assertEquals("InitializeProtocol(gattRef=GattRef(token=1))", machine.state.value.toString())

        machine.ready(token)
        assertEquals("Ready(gattRef=GattRef(token=1))", machine.state.value.toString())
        assertTrue(machine.isCurrent(token))
        assertEquals(token, machine.lastAttempt)
    }

    @Test
    fun `refuses a second fresh gatt while one is active`() {
        // [V] "OpenFreshGatt while another GATT is active" (COROS_CONNECTION_ANALYSIS.md §4.4).
        val machine = CorosConnectionStateMachine(connectorInstanceId = 1)
        machine.openFreshGatt()

        val failure = assertThrows(IllegalStateException::class.java) { machine.openFreshGatt() }
        assertTrue(failure.message!!.contains("OpenFreshGatt while another GATT is active"))
    }

    @Test
    fun `service rediscovery invalidates the old gatt generation`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 1)
        val oldRef = machine.openFreshGatt()
        machine.connecting(oldRef)
        machine.discoverServices(oldRef)
        machine.beginAttempt()

        machine.prepareServiceRediscovery("link lost")
        assertFalse(machine.isCurrent(oldRef))
        assertTrue(machine.state.value is CorosConnectionState.PrepareServiceRediscovery)

        val newRef = machine.openFreshGatt()
        assertEquals(2L, newRef.token)
        assertFalse(machine.isCurrent(oldRef))
        assertTrue(machine.isCurrent(newRef))
        assertEquals(1L, newRef.token - oldRef.token)
    }

    @Test
    fun `a new protocol attempt rejects the previous token but keeps the gatt ref`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 3)
        val ref = machine.openFreshGatt()
        machine.connecting(ref)
        machine.discoverServices(ref)

        val first = machine.beginAttempt()
        val second = machine.beginAttempt()

        assertEquals(1, first.attempt)
        assertEquals(2, second.attempt)
        assertEquals(first.gattRef, second.gattRef)
        assertFalse(machine.isCurrent(first))
        assertTrue(machine.isCurrent(second))
        assertEquals(second, machine.lastAttempt)
    }

    @Test
    fun `a fresh gatt resets the protocol attempt counter`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 1)
        val firstRef = machine.openFreshGatt()
        machine.connecting(firstRef)
        machine.discoverServices(firstRef)
        machine.beginAttempt()
        machine.prepareServiceRediscovery()

        val secondRef = machine.openFreshGatt()
        machine.connecting(secondRef)
        machine.discoverServices(secondRef)
        val token = machine.beginAttempt()

        assertEquals(2L, secondRef.token)
        assertEquals(1, token.attempt)
    }

    @Test
    fun `out-of-order transitions are rejected`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 1)
        val ref = machine.openFreshGatt()

        assertThrows(IllegalStateException::class.java) { machine.discoverServices(ref) }
        machine.connecting(ref)
        assertThrows(IllegalStateException::class.java) {
            machine.ready(ProtocolAttemptToken(connectorInstanceId = 1, attempt = 1, gattRef = ref))
        }
    }

    @Test
    fun `only discover services has an evidence-backed deadline`() {
        val machine = CorosConnectionStateMachine(connectorInstanceId = 1)
        val ref = machine.openFreshGatt()

        assertNull(machine.timeoutMsFor(CorosConnectionState.OpenFreshGatt(ref)))
        assertNull(machine.timeoutMsFor(CorosConnectionState.Connecting(ref)))
        assertNotNull(machine.timeoutMsFor(CorosConnectionState.DiscoverServices(ref)))
        assertNull(machine.timeoutMsFor(CorosConnectionState.InitializeProtocol(ref)))
        assertNull(machine.timeoutMsFor(CorosConnectionState.Ready(ref)))
    }
}
