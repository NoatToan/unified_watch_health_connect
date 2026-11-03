package com.unified.health

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.getValue
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.unified.health.sync.DeviceSyncService
import kotlinx.coroutines.launch
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.ThemeMode
import com.unified.health.ui.UnifiedHealthApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        // Each time the app becomes visible with a paired watch, make sure the link service is running.
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.hasPairedDevices.collect { paired -> if (paired) DeviceSyncService.start(this@MainActivity) }
            }
        }
        setContent {
            val state by viewModel.uiState.collectAsStateWithLifecycle()
            val ready = state as? MainUiState.Ready ?: return@setContent // window background shows meanwhile
            val prefs = ready.preferences
            val dark = when (prefs.themeMode) {
                ThemeMode.SYSTEM -> isSystemInDarkTheme()
                ThemeMode.LIGHT -> false
                ThemeMode.DARK -> true
            }
            UnifiedHealthTheme(darkTheme = dark, dynamicColor = prefs.useDynamicColor) {
                UnifiedHealthApp(onboardingCompleted = prefs.onboardingCompleted)
            }
        }
    }
}
