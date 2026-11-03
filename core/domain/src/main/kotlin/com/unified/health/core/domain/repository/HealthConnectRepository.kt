package com.unified.health.core.domain.repository

import com.unified.health.core.model.HealthConnectAvailability

/** Thin, platform-agnostic view of Health Connect used by onboarding and settings. */
interface HealthConnectRepository {
    /** Permission strings (android.permission.health.*) the app requests. */
    val requiredPermissions: Set<String>
    fun availability(): HealthConnectAvailability
    suspend fun grantedPermissions(): Set<String>
}
