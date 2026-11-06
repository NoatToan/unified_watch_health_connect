package com.unified.health.driver.huawei.wearengine.sdk

import com.huawei.hmf.tasks.Task
import com.huawei.wearengine.WearEngineException
import com.unified.health.driver.huawei.wearengine.WearEngineCallException
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * Awaits a WearEngine `Task`. Failures become [WearEngineCallException] carrying the SDK error
 * code. The SDK has no cancellation for tasks, so cancelling only stops waiting.
 */
internal suspend fun <T> Task<T>.await(operation: String): T = suspendCancellableCoroutine { cont ->
    addOnSuccessListener { result -> if (cont.isActive) cont.resume(result) }
    addOnFailureListener { error ->
        if (!cont.isActive) return@addOnFailureListener
        val code = (error as? WearEngineException)?.errorCode
        cont.resumeWithException(
            WearEngineCallException(code, "$operation failed" + (code?.let { " (WearEngine error $it)" } ?: ": ${error.message}"), error),
        )
    }
}
