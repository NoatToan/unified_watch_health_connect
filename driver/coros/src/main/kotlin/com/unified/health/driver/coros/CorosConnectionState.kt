package com.unified.health.driver.coros

import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.concurrent.atomic.AtomicLong

/**
 * Generation of one physical GATT link. A new [GattRef] is issued for every fresh GATT attempt;
 * callbacks that carry an older ref are stale and must be ignored. The name and `token=…` field
 * mirror the surviving vendor strings `GattRef(token=…)`, `GattStateChanged(token=…)`,
 * `oldGattRef=` and `gatt_callback_rejected gattId=` (COROS_CONNECTION_ANALYSIS.md §4.3 [V]).
 */
internal data class GattRef(val token: Long) {
    override fun toString(): String = "GattRef(token=$token)"
}

/**
 * One protocol attempt on a [GattRef]. `connectorInstanceId` is fixed for the lifetime of one
 * [CorosConnectionStateMachine] and `attempt` counts attempts on the same GATT. Mirrors the
 * surviving `ProtocolAttemptToken(connectorInstanceId=…)` / `AttemptProtocol(token=…)` strings
 * (COROS_CONNECTION_ANALYSIS.md §1 [V names], §2 reconnect evidence).
 */
internal data class ProtocolAttemptToken(
    val connectorInstanceId: Long,
    val attempt: Int,
    val gattRef: GattRef,
) {
    override fun toString(): String =
        "ProtocolAttemptToken(connectorInstanceId=$connectorInstanceId, attempt=$attempt, gattRef=$gattRef)"
}

/**
 * Connection states whose names are verified from the vendor app's surviving `toString()` strings
 * (COROS_CONNECTION_ANALYSIS.md §1, lines 445213/432611/433849/435028/446069/445736 [V names]).
 * The order below is the inferred lifecycle from that analysis; only the names are evidence, not
 * the transitions themselves.
 *
 * [Idle] is this driver's own placeholder before a fresh GATT is opened; it is not a vendor string.
 */
internal sealed interface CorosConnectionState {
    val gattRef: GattRef?

    data object Idle : CorosConnectionState {
        override val gattRef: GattRef? get() = null
    }

    data class OpenFreshGatt(override val gattRef: GattRef) : CorosConnectionState

    data class Connecting(override val gattRef: GattRef) : CorosConnectionState

    data class DiscoverServices(override val gattRef: GattRef) : CorosConnectionState

    data class InitializeProtocol(override val gattRef: GattRef) : CorosConnectionState

    data class Ready(override val gattRef: GattRef) : CorosConnectionState

    /** Recovery/teardown state; the current ref is invalidated before it is entered. */
    data class PrepareServiceRediscovery(override val gattRef: GattRef?) : CorosConnectionState
}

private fun CorosConnectionState.isActive(): Boolean = when (this) {
    CorosConnectionState.Idle,
    is CorosConnectionState.PrepareServiceRediscovery,
    -> false
    is CorosConnectionState.OpenFreshGatt,
    is CorosConnectionState.Connecting,
    is CorosConnectionState.DiscoverServices,
    is CorosConnectionState.InitializeProtocol,
    is CorosConnectionState.Ready,
    -> true
}

/**
 * The explicit COROS connection lifecycle: `OpenFreshGatt → Connecting → DiscoverServices →
 * InitializeProtocol → Ready`, with `PrepareServiceRediscovery` for teardown/recovery. It owns the
 * [GattRef] and [ProtocolAttemptToken] generations so a stale callback from a closed GATT cannot
 * act on a newer attempt.
 *
 * One instance is kept by [CorosDriver] for the lifetime of the connector (the vendor's long-lived
 * `YfBtConnector` owns `ProtocolAttemptToken(connectorInstanceId=…)`), so generations keep
 * increasing across reconnects.
 *
 * Deliberately no protocol bytes, command ids or frame layouts are modelled here: none are
 * recoverable from the shelled APK (COROS_DEVICE_PROTOCOL.md §0/§9).
 */
internal class CorosConnectionStateMachine(
    val connectorInstanceId: Long = NEXT_CONNECTOR_INSTANCE_ID.getAndIncrement(),
) {

    private val lock = Any()
    private val _state = MutableStateFlow<CorosConnectionState>(CorosConnectionState.Idle)
    val state: StateFlow<CorosConnectionState> = _state.asStateFlow()

    private var gattGeneration = 0L
    private var attemptGeneration = 0
    private var currentAttempt: ProtocolAttemptToken? = null

    /** Last token handed out, for diagnostics/tests; null before any attempt or after a fresh GATT. */
    val lastAttempt: ProtocolAttemptToken? get() = synchronized(lock) { currentAttempt }

    /**
     * Opens a new GATT generation. Mirrors the vendor guard `OpenFreshGatt while another GATT is
     * active` (COROS_CONNECTION_ANALYSIS.md §4.4 [V]): a second fresh GATT is refused while one is
     * still active. Only allowed from [CorosConnectionState.Idle] or after
     * [prepareServiceRediscovery], where the old generation is no longer current.
     */
    fun openFreshGatt(): GattRef = synchronized(lock) {
        val previous = _state.value
        if (previous.isActive()) {
            val message = "OpenFreshGatt while another GATT is active: $previous"
            Log.w(TAG, message)
            throw IllegalStateException(message)
        }
        val ref = GattRef(++gattGeneration)
        attemptGeneration = 0
        currentAttempt = null
        transition(CorosConnectionState.OpenFreshGatt(ref), oldGattRef = previous.gattRef)
        ref
    }

    fun connecting(gattRef: GattRef) = synchronized(lock) {
        requireState(CorosConnectionState.OpenFreshGatt(gattRef))
        transition(CorosConnectionState.Connecting(gattRef))
    }

    fun discoverServices(gattRef: GattRef) = synchronized(lock) {
        requireState(CorosConnectionState.Connecting(gattRef))
        transition(CorosConnectionState.DiscoverServices(gattRef))
    }

    /**
     * Starts one protocol attempt (first try or the single retry) and moves to
     * [CorosConnectionState.InitializeProtocol]. Logs the verified `AttemptProtocol(token=…)` form.
     */
    fun beginAttempt(): ProtocolAttemptToken = synchronized(lock) {
        val current = _state.value
        check(current is CorosConnectionState.DiscoverServices || current is CorosConnectionState.InitializeProtocol) {
            "Cannot start a protocol attempt from $current"
        }
        val gattRef = current.gattRef ?: error("No GATT generation for $current")
        val token = ProtocolAttemptToken(connectorInstanceId, ++attemptGeneration, gattRef)
        currentAttempt = token
        transition(CorosConnectionState.InitializeProtocol(gattRef))
        Log.d(TAG, "AttemptProtocol(token=$token)")
        token
    }

    fun ready(token: ProtocolAttemptToken) = synchronized(lock) {
        check(isCurrentLocked(token)) { "Stale ProtocolAttemptToken: $token" }
        requireState(CorosConnectionState.InitializeProtocol(token.gattRef))
        transition(CorosConnectionState.Ready(token.gattRef))
    }

    /**
     * Invalidates the current [GattRef] and [ProtocolAttemptToken] and enters
     * [CorosConnectionState.PrepareServiceRediscovery]. Every callback holding the old generation is
     * rejected from this point on.
     *
     * TODO(coros-protocol): the vendor calls hidden `BluetoothGatt.refresh()` here
     * (`refresh GATT before close token=`, COROS_CONNECTION_ANALYSIS.md §4.4 [V]). [com.unified.health.core.ble.gatt.GattClient]
     * does not expose `refresh()`, so nothing is called; add it only when the core GATT API does.
     */
    fun prepareServiceRediscovery(reason: String = "teardown"): GattRef? = synchronized(lock) {
        val previous = _state.value
        val ref = previous.gattRef
        if (previous is CorosConnectionState.PrepareServiceRediscovery) {
            ref
        } else {
            _state.value = CorosConnectionState.PrepareServiceRediscovery(ref)
            Log.i(TAG, "PrepareServiceRediscovery(gattRef=$ref) reason=$reason")
            ref
        }
    }

    /**
     * True when [gattRef] is the generation of the currently active attempt. A false result is
     * logged as `gatt_callback_rejected gattId=…` (verified vendor string).
     */
    fun isCurrent(gattRef: GattRef): Boolean = synchronized(lock) {
        val current = _state.value
        val accepted = current.isActive() && current.gattRef == gattRef
        if (!accepted) Log.d(TAG, "gatt_callback_rejected gattId=${gattRef.token}")
        accepted
    }

    /** True when both the GATT generation and the protocol attempt token are still current. */
    fun isCurrent(token: ProtocolAttemptToken): Boolean = synchronized(lock) {
        val current = _state.value
        val accepted = current.isActive() &&
            current.gattRef == token.gattRef &&
            currentAttempt == token
        if (!accepted) Log.d(TAG, "gatt_callback_rejected gattId=${token.gattRef.token}")
        accepted
    }

    /**
     * Per-state deadline, or null when the recoverable strings give no evidence of a timeout.
     *
     * Only [CorosConnectionState.DiscoverServices] gets one: the vendor APK still contains
     * `device discovery timeout: targetType=` (COROS_CONNECTION_ANALYSIS.md §1.1 [V]), proving a
     * discovery deadline exists. Its numeric value is **not** recoverable.
     * TODO(coros-protocol): replace [SERVICE_DISCOVERY_TIMEOUT_MS] with the real value once an HCI
     * snoop log or a non-shelled APK provides it. No timeout strings exist for Connecting,
     * InitializeProtocol, Ready or PrepareServiceRediscovery, so they return null rather than
     * inventing a value. (The core GATT client still bounds every ATT operation independently.)
     */
    fun timeoutMsFor(state: CorosConnectionState): Long? = when (state) {
        is CorosConnectionState.DiscoverServices -> SERVICE_DISCOVERY_TIMEOUT_MS
        else -> null
    }

    /** Deadline for whichever state is current; null when the evidence gives none. */
    fun currentTimeoutMs(): Long? = synchronized(lock) { timeoutMsFor(_state.value) }

    private fun requireState(expected: CorosConnectionState) {
        val current = _state.value
        check(current == expected) {
            "Unexpected transition: expected $expected, was $current (stale or out-of-order GattRef)"
        }
    }

    private fun isCurrentLocked(token: ProtocolAttemptToken): Boolean {
        val current = _state.value
        return current.isActive() && current.gattRef == token.gattRef && currentAttempt == token
    }

    private fun transition(next: CorosConnectionState, oldGattRef: GattRef? = _state.value.gattRef) {
        _state.value = next
        Log.d(TAG, "GattStateChanged(token=${next.gattRef?.token}) $next")
        if (oldGattRef != null && oldGattRef != next.gattRef) {
            Log.d(TAG, "oldGattRef=$oldGattRef currentGattHash=${next.gattRef}")
        }
    }

    private companion object {
        const val TAG = "CorosConnection"

        /**
         * Operational safety bound, deliberately not presented as a recovered value. It matches the
         * core GATT client's discovery bound so the driver cannot hang longer than the link layer.
         */
        const val SERVICE_DISCOVERY_TIMEOUT_MS = 20_000L

        val NEXT_CONNECTOR_INSTANCE_ID = AtomicLong(1)
    }
}
