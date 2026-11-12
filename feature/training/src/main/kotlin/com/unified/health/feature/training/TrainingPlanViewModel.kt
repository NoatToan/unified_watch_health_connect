package com.unified.health.feature.training

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.TrainingPlanRepository
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.TrainingPlanId
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

/**
 * Backs both of `feature/training`'s nested screens ([TrainingScreen]'s plan-selection/banner and
 * [TrainingCalendarScreen]'s day-by-day check-in) — docs/DECISIONS.md D-1190, the first time this
 * module needed a `@HiltViewModel`/`core:domain` dependency at all (D-1185's static reference guide
 * had neither). Each nested destination gets its own instance (same as every other screen in this
 * app); both read the same Room-backed [TrainingPlanRepository] underneath so they stay consistent.
 */
@HiltViewModel
class TrainingPlanViewModel @Inject constructor(
    private val repository: TrainingPlanRepository,
) : ViewModel() {

    /** Null: no plan currently selected — every screen treats that the same as "nothing to show". */
    val activePlan: StateFlow<ActiveTrainingPlan?> =
        repository.activePlan.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    /** Replaces any previously active plan — the UI confirms with the user first when one already
     *  exists (see [ActivePlanBanner]/[PlanCard]'s own call sites), this just performs the swap. */
    fun selectPlan(planId: TrainingPlanId, startDate: LocalDate) {
        viewModelScope.launch { repository.selectPlan(planId, startDate) }
    }

    fun checkIn(dayOffset: Int) {
        viewModelScope.launch { repository.checkIn(dayOffset) }
    }

    fun uncheckIn(dayOffset: Int) {
        viewModelScope.launch { repository.uncheckIn(dayOffset) }
    }
}
