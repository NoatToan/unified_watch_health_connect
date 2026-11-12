package com.unified.health.privacy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme

/**
 * Shown by Health Connect when the user taps the privacy policy link
 * (ACTION_SHOW_PERMISSIONS_RATIONALE on Android ≤ 13, VIEW_PERMISSION_USAGE alias on 14+).
 * TODO: replace with the final privacy policy text / URL before release.
 */
class PermissionsRationaleActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            UnifiedHealthTheme {
                // D-1194: migrated to AppScreen — contentPadding chained AFTER verticalScroll, so the
                // last policy section scrolls fully behind the gesture bar instead of a dead strip above it.
                AppScreen(title = "Privacy policy", onBack = ::finish) { contentPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding).padding(Gaps.screenHorizontal),
                        verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap),
                    ) {
                        POLICY.forEach { (title, body) ->
                            Text(title, style = MaterialTheme.typography.titleMedium)
                            Text(body, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }

    private companion object {
        val POLICY = listOf(
            "What we read" to "Steps, heart rate, sleep, blood oxygen, exercise, active calories and weight, only to show them in this app.",
            "Where data lives" to "Health data stays on this device. It is not uploaded to any server.",
            "Your control" to "You can revoke Health Connect access at any time in Health Connect settings, and delete all app data from Profile > Delete all data.",
        )
    }
}
