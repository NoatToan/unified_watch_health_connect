package com.unified.health.core.data.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import com.unified.health.core.domain.repository.NotificationPreferencesRepository
import com.unified.health.core.model.NotificationPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import java.time.LocalDate
import javax.inject.Inject

/** Lives in the same `user_preferences` DataStore file as [DataStoreUserPreferencesRepository], under `notif_*` keys. */
class DataStoreNotificationPreferencesRepository @Inject constructor(
    private val dataStore: DataStore<Preferences>,
) : NotificationPreferencesRepository {

    private object Keys {
        val syncReminders = booleanPreferencesKey("notif_sync_reminders")
        val goalAchieved = booleanPreferencesKey("notif_goal_achieved")
        val lowWatchBattery = booleanPreferencesKey("notif_low_watch_battery")

        /** [LocalDate.toEpochDay] of the last "goal achieved" notification. */
        val goalNotifiedEpochDay = longPreferencesKey("notif_goal_notified_epoch_day")
        val lowBatteryAlerted = stringSetPreferencesKey("notif_low_battery_alerted")
    }

    override val preferences: Flow<NotificationPreferences> = dataStore.data.map { p ->
        val defaults = NotificationPreferences()
        NotificationPreferences(
            syncReminders = p[Keys.syncReminders] ?: defaults.syncReminders,
            goalAchieved = p[Keys.goalAchieved] ?: defaults.goalAchieved,
            lowWatchBattery = p[Keys.lowWatchBattery] ?: defaults.lowWatchBattery,
        )
    }.distinctUntilChanged()

    override suspend fun setSyncReminders(enabled: Boolean) {
        dataStore.edit { it[Keys.syncReminders] = enabled }
    }

    override suspend fun setGoalAchieved(enabled: Boolean) {
        dataStore.edit { it[Keys.goalAchieved] = enabled }
    }

    override suspend fun setLowWatchBattery(enabled: Boolean) {
        dataStore.edit { it[Keys.lowWatchBattery] = enabled }
    }

    override val goalNotifiedOn: Flow<LocalDate?> =
        dataStore.data.map { p -> p[Keys.goalNotifiedEpochDay]?.let(LocalDate::ofEpochDay) }.distinctUntilChanged()

    override suspend fun setGoalNotifiedOn(date: LocalDate) {
        dataStore.edit { it[Keys.goalNotifiedEpochDay] = date.toEpochDay() }
    }

    override val lowBatteryAlertedDevices: Flow<Set<String>> =
        dataStore.data.map { p -> p[Keys.lowBatteryAlerted].orEmpty() }.distinctUntilChanged()

    override suspend fun setLowBatteryAlertedDevices(deviceIds: Set<String>) {
        dataStore.edit { it[Keys.lowBatteryAlerted] = deviceIds }
    }
}
