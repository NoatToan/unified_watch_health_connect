package com.unified.health.core.data

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import com.unified.health.core.data.sync.DataStoreWorkoutDetailBackfillState
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

/** D-1176: the one-time-per-device gate that keeps the automatic workout-detail backfill from re-running on every connect. */
class DataStoreWorkoutDetailBackfillStateTest {

    @get:Rule
    val folder = TemporaryFolder()

    @Test
    fun `a device is not done until marked, other devices are unaffected`() = runTest {
        val store = PreferenceDataStoreFactory.create(scope = backgroundScope) { folder.newFile("prefs.preferences_pb") }
        val state = DataStoreWorkoutDetailBackfillState(store)

        assertFalse(state.isDone("device-1"))

        state.markDone("device-1")
        assertTrue(state.isDone("device-1"))
        assertFalse(state.isDone("device-2"))
    }

    @Test
    fun `marking done persists across a restart (a new instance over the same store)`() = runTest {
        val store = PreferenceDataStoreFactory.create(scope = backgroundScope) { folder.newFile("prefs.preferences_pb") }
        DataStoreWorkoutDetailBackfillState(store).markDone("device-1")

        assertTrue(DataStoreWorkoutDetailBackfillState(store).isDone("device-1"))
    }

    @Test
    fun `marking a second device done keeps the first one marked`() = runTest {
        val store = PreferenceDataStoreFactory.create(scope = backgroundScope) { folder.newFile("prefs.preferences_pb") }
        val state = DataStoreWorkoutDetailBackfillState(store)

        state.markDone("device-1")
        state.markDone("device-2")

        assertTrue(state.isDone("device-1"))
        assertTrue(state.isDone("device-2"))
    }
}
