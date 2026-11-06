package com.unified.health.notifications

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.NotificationPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.WatchAlertRules
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.time.Duration
import java.time.LocalDate
import java.time.ZonedDateTime
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Turns synced data into local alerts, following Profile › Notifications. Runs inside
 * [com.unified.health.sync.DeviceSyncService], i.e. exactly while a watch can deliver new data.
 *
 * - **Low watch battery**: the battery level the driver reads on every (re)connect.
 * - **Goal achieved**: today's step count (written by each sync) reaching the daily goal, once a day.
 * - **Sync reminders**: TODO(notifications) — needs a periodic scheduler (WorkManager is not a
 *   dependency yet); the preference is stored and shown, nothing is posted (D-807).
 */
@Singleton
class HealthAlertsMonitor @Inject constructor(
    private val devices: WearableDeviceRepository,
    private val healthData: HealthDataRepository,
    private val preferences: NotificationPreferencesRepository,
    private val notifier: HealthAlertNotifier,
) {

    /** Suspends until cancelled. */
    suspend fun run() = coroutineScope {
        launch { watchBattery() }
        launch { watchStepGoal() }
    }

    private suspend fun watchBattery() {
        combine(devices.pairedDevices, preferences.preferences.map { it.lowWatchBattery }.distinctUntilChanged()) { list, enabled -> list to enabled }
            .collect { (list, enabled) ->
                val alerted = preferences.lowBatteryAlertedDevices.first()
                val decision = WatchAlertRules.lowBattery(list, alerted)
                // While disabled the state still advances, so turning the switch on does not replay old alerts.
                if (enabled) decision.notify.forEach { notifier.lowBattery(it.id, it.name, it.batteryPercent ?: 0) }
                if (decision.alerted != alerted) preferences.setLowBatteryAlertedDevices(decision.alerted)
            }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private suspend fun watchStepGoal() {
        today().flatMapLatest { date -> healthData.observeDailySummary(date).map { date to it.steps } }
            .combine(preferences.preferences.map { it.goalAchieved }.distinctUntilChanged()) { (date, steps), enabled -> Triple(date, steps, enabled) }
            .collect { (date, steps, enabled) ->
                if (!enabled) return@collect
                if (WatchAlertRules.goalReached(steps.count, steps.goal, date, preferences.goalNotifiedOn.first())) {
                    notifier.goalAchieved(steps.count, steps.goal)
                    preferences.setGoalNotifiedOn(date)
                }
            }
    }

    /** Emits today's date now and again just after every local midnight. */
    private fun today(): Flow<LocalDate> = flow {
        while (true) {
            val now = ZonedDateTime.now()
            emit(now.toLocalDate())
            val nextMidnight = now.toLocalDate().plusDays(1).atStartOfDay(now.zone)
            delay(Duration.between(now, nextMidnight).toMillis() + 1_000)
        }
    }
}
