package com.unified.health.core.model

/**
 * Which local (phone) notifications the user wants. Stored on the device only (DataStore); nothing
 * here is pushed to the watch.
 */
data class NotificationPreferences(
    /** Remind to sync when the watch has not synced for a while. Preference only for now (no scheduler yet). */
    val syncReminders: Boolean = false,
    /** Notify once a day when the daily step goal is reached. */
    val goalAchieved: Boolean = true,
    /** Notify when a paired watch reports a low battery level. */
    val lowWatchBattery: Boolean = true,
)
