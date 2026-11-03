package com.unified.health.core.ble.pairing

import com.unified.health.core.model.PairingCodeRequest

/** Asks the user for the code shown on the watch while a bond is being created. */
interface PairingCodeRequester {
    /** Suspends until the user answers; returns null if they cancel. Cancelling the caller dismisses the prompt. */
    suspend fun requestCode(request: PairingCodeRequest): String?
}
