package com.unified.health.feature.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthConnectRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.HealthConnectAvailability
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class OnboardingUiState(
    val step: OnboardingStep = OnboardingStep.WELCOME,
    val healthConnectAvailability: HealthConnectAvailability = HealthConnectAvailability.NOT_SUPPORTED,
    val healthConnectGranted: Boolean = false,
)

enum class OnboardingStep { WELCOME, PERMISSIONS }

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val preferences: UserPreferencesRepository,
    private val healthConnect: HealthConnectRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(OnboardingUiState())
    val uiState: StateFlow<OnboardingUiState> = _uiState.asStateFlow()

    val healthConnectPermissions: Set<String> get() = healthConnect.requiredPermissions

    init {
        refreshHealthConnect()
    }

    fun goTo(step: OnboardingStep) = _uiState.update { it.copy(step = step) }

    fun refreshHealthConnect() {
        viewModelScope.launch {
            val availability = healthConnect.availability()
            val granted = runCatching { healthConnect.grantedPermissions() }.getOrDefault(emptySet())
            _uiState.update {
                it.copy(
                    healthConnectAvailability = availability,
                    healthConnectGranted = granted.containsAll(healthConnect.requiredPermissions),
                )
            }
        }
    }

    fun finish(onDone: () -> Unit) {
        viewModelScope.launch {
            preferences.setOnboardingCompleted(true)
            onDone()
        }
    }
}
