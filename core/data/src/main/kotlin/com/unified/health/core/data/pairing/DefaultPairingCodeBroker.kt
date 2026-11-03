package com.unified.health.core.data.pairing

import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.domain.repository.PairingCodeBroker
import com.unified.health.core.model.PairingCodeRequest
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class DefaultPairingCodeBroker @Inject constructor() : PairingCodeBroker, PairingCodeRequester {

    private val current = MutableStateFlow<PairingCodeRequest?>(null)
    private val prompts = Mutex()
    @Volatile private var answer: CompletableDeferred<String?>? = null

    override val request: StateFlow<PairingCodeRequest?> = current.asStateFlow()

    override suspend fun requestCode(request: PairingCodeRequest): String? = prompts.withLock {
        val deferred = CompletableDeferred<String?>()
        answer = deferred
        current.value = request
        try {
            deferred.await()
        } finally {
            current.value = null
            answer = null
        }
    }

    override fun submit(code: String) {
        answer?.complete(code)
    }

    override fun cancel() {
        answer?.complete(null)
    }
}
