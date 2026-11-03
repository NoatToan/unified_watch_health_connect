package com.unified.health.driver.zepp.transport

import kotlinx.coroutines.channels.ReceiveChannel

/** Discards everything already buffered, so the next receive sees only answers to a new request. */
internal fun ReceiveChannel<*>.discardBuffered() {
    while (tryReceive().isSuccess) continue
}
