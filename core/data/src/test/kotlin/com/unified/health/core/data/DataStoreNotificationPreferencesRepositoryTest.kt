package com.unified.health.core.data

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import com.unified.health.core.data.datastore.DataStoreNotificationPreferencesRepository
import com.unified.health.core.model.NotificationPreferences
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.time.LocalDate

class DataStoreNotificationPreferencesRepositoryTest {

    @get:Rule
    val folder = TemporaryFolder()

    @Test
    fun `defaults, toggles and alert bookkeeping persist`() = runTest {
        val store = PreferenceDataStoreFactory.create(scope = backgroundScope) { folder.newFile("prefs.preferences_pb") }
        val repository = DataStoreNotificationPreferencesRepository(store)

        assertEquals(NotificationPreferences(), repository.preferences.first())
        assertNull(repository.goalNotifiedOn.first())

        repository.setGoalAchieved(false)
        repository.setSyncReminders(true)
        repository.setLowWatchBattery(false)
        assertEquals(NotificationPreferences(syncReminders = true, goalAchieved = false, lowWatchBattery = false), repository.preferences.first())

        repository.setGoalNotifiedOn(LocalDate.of(2026, 11, 6))
        repository.setLowBatteryAlertedDevices(setOf("A", "B"))
        assertEquals(LocalDate.of(2026, 11, 6), repository.goalNotifiedOn.first())
        assertEquals(setOf("A", "B"), repository.lowBatteryAlertedDevices.first())

        // A second repository over the same store (e.g. after a restart) reads the same values.
        assertEquals(repository.preferences.first(), DataStoreNotificationPreferencesRepository(store).preferences.first())
    }
}
