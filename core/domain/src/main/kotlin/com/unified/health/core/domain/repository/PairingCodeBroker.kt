package com.unified.health.core.domain.repository

import com.unified.health.core.model.PairingCodeRequest
import kotlinx.coroutines.flow.StateFlow

/** UI side of the pairing-code prompt: show [request] when non-null, then answer with [submit] or [cancel]. */
interface PairingCodeBroker {
    val request: StateFlow<PairingCodeRequest?>
    fun submit(code: String)
    fun cancel()
}
