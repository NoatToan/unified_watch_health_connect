package com.unified.health.core.domain.repository

import com.unified.health.core.model.NotificationPreferences
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/**
 * Local notification settings (Profile › Notifications) plus the small bookkeeping the alert
 * monitor needs so an alert fires once, not on every re-emission or app restart.
 */
interface NotificationPreferencesRepository {
    val preferences: Flow<NotificationPreferences>

    suspend fun setSyncReminders(enabled: Boolean)
    suspend fun setGoalAchieved(enabled: Boolean)
    suspend fun setLowWatchBattery(enabled: Boolean)

    /** Last day a "goal achieved" notification was posted; null if never. */
    val goalNotifiedOn: Flow<LocalDate?>
    suspend fun setGoalNotifiedOn(date: LocalDate)

    /** Device ids currently "alerted" for low battery (cleared once their battery recovers). */
    val lowBatteryAlertedDevices: Flow<Set<String>>
    suspend fun setLowBatteryAlertedDevices(deviceIds: Set<String>)
}
