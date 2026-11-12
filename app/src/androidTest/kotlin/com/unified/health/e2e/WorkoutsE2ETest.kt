package com.unified.health.e2e

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToNode
import com.unified.health.feature.activity.R as ActivityR
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/** Activity tab: empty state → seeded workouts with the weekly activity load → workout detail. */
@HiltAndroidTest
class WorkoutsE2ETest : E2EBase() {

    @Test
    fun workoutListAndDetail() {
        val report = report("WorkoutsE2ETest")

        report.flow(13, "workouts", "Activity: weekly load → workouts → workout detail") {
            step("activity-empty", "Finish onboarding, open the Activity tab", "\"No workouts yet\" empty state") {
                skipOnboarding(grant = false)
                clickTag("nav_ACTIVITY")
                waitForTag("workouts_empty")
                waitForText("No workouts yet")
            }
            step("seeded", "Profile › Developer › \"Fill demo data\"", "90 days of data written, including ~4 workouts a week") {
                clickTag("nav_PROFILE")
                waitForTag("fill_demo_data")
                compose.onNodeWithTag("fill_demo_data").performScrollTo()
                clickTag("fill_demo_data")
                waitFor(hasTestTag("developer_status") and hasText("Filled", substring = true), timeoutMs = 60_000, what = "fill finished")
            }
            step("activity-load", "Open the Activity tab", "Weekly activity load card: value, trend vs. the last 4 weeks, 8-week chart") {
                clickTag("nav_ACTIVITY")
                waitForTag("activity_load_card")
                waitFor(hasTestTag("activity_load_value") and hasContentDescription("Activity load", substring = true), what = "load value")
                compose.onNodeWithTag("activity_load_chart", useUnmergedTree = true).assertIsDisplayed()
            }
            step("workout-list", "Scroll to the workouts", "Workouts grouped by month, newest first, with duration/distance/kcal") {
                compose.onNodeWithTag("activity_list").performScrollToNode(hasTestTag("workout_item_0"))
                compose.onNodeWithTag("workout_item_0").assertIsDisplayed()
            }
            step("workout-detail", "Tap the newest workout", "Detail: workout time, distance, energy, pace, avg/max heart rate") {
                clickTag("workout_item_0")
                waitForTag("workout_detail")
                waitFor(hasContentDescription("Workout time", substring = true), what = "workout time tile")
                waitFor(hasContentDescription("Avg. heart rate", substring = true) and !hasContentDescription("no data", substring = true), what = "avg heart rate")
            }
            step("workout-heart-rate", "Scroll to Heart rate and Source", "Heart rate over the workout and the recording watch") {
                compose.onNodeWithTag("workout_source").performScrollTo()
                waitForTag("workout_hr_chart")
                // D-1206 (workout-detail agent): Source now shows a friendly "Demo watch" label
                // (`WorkoutSourceDisplay.Demo`, `R.string.source_demo_watch`) instead of the raw demo
                // MAC (`DemoDevice.ADDRESS`, only ever shown for `WorkoutSourceDisplay.Unknown`) — read
                // through the real string resource rather than hardcoding "Demo watch" so this stays
                // correct under any locale/string change.
                val demoWatchLabel = context.getString(ActivityR.string.source_demo_watch)
                waitFor(hasText(demoWatchLabel, substring = true) and hasAnyAncestor(hasTestTag("workout_source")), what = "source device")
            }
            step("back-to-list", "Tap Back", "Back on the Activity tab") {
                device.pressBack()
                waitForTag("activity_load_card")
            }
        }
    }
}
