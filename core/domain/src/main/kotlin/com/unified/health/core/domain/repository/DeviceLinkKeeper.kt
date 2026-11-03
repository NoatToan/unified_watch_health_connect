package com.unified.health.core.domain.repository

import kotlinx.coroutines.flow.StateFlow

/**
 * Keeps the watch connected: connects, reconnects with exponential back-off after link loss, and
 * runs an incremental sync after each (re)connect. Stops itself when the user disconnects.
 */
interface DeviceLinkKeeper {
    val active: StateFlow<Boolean>

    /** Idempotent. */
    fun start()

    fun stop()
}
