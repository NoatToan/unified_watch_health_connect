package com.unified.health.feature.profile.notifications

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.NotificationPreferencesRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.NotificationPreferences
import com.unified.health.core.model.UserPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NotificationSettingsUiState(
    val preferences: NotificationPreferences = NotificationPreferences(),
    val dailyStepGoal: Int = UserPreferences().dailyStepGoal,
    val isLoading: Boolean = true,
)

@HiltViewModel
class NotificationSettingsViewModel @Inject constructor(
    private val notifications: NotificationPreferencesRepository,
    userPreferences: UserPreferencesRepository,
) : ViewModel() {

    val uiState: StateFlow<NotificationSettingsUiState> =
        combine(notifications.preferences, userPreferences.userPreferences) { prefs, user ->
            NotificationSettingsUiState(prefs, user.dailyStepGoal, isLoading = false)
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), NotificationSettingsUiState())

    fun setGoalAchieved(enabled: Boolean) = viewModelScope.launch { notifications.setGoalAchieved(enabled) }

    fun setLowWatchBattery(enabled: Boolean) = viewModelScope.launch { notifications.setLowWatchBattery(enabled) }

    fun setSyncReminders(enabled: Boolean) = viewModelScope.launch { notifications.setSyncReminders(enabled) }
}
