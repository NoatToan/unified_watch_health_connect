package com.unified.health.feature.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsBike
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsWalk
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.Pool
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material.icons.outlined.SportsScore
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import javax.inject.Inject

@HiltViewModel
class ActivityViewModel @Inject constructor(repository: HealthDataRepository) : ViewModel() {
    val workouts: StateFlow<List<Workout>?> = repository.observeWorkouts()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)
}

/** Placeholder: workout history from fake data. Live workout + detail screens are TODO (see FEATURES.md). */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ActivityRoute(viewModel: ActivityViewModel = hiltViewModel()) {
    val workouts by viewModel.workouts.collectAsStateWithLifecycle()
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    Scaffold(
        topBar = { TopAppBar(title = { Text("Activity") }) },
        snackbarHost = { SnackbarHost(snackbar) },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { scope.launch { snackbar.showSnackbar("Live workout is coming soon") } },
                icon = { Icon(Icons.Outlined.SportsScore, contentDescription = null) },
                text = { Text("Start workout") },
            )
        },
    ) { padding ->
        val list = workouts
        if (list.isNullOrEmpty()) {
            EmptyState(
                title = "No workouts yet",
                message = "Workouts recorded on your watch will appear here.",
                modifier = Modifier.padding(padding),
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding),
                contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, bottom = 96.dp),
                verticalArrangement = Arrangement.spacedBy(Spacing.sm),
            ) {
                items(list, key = { it.id }) { WorkoutItem(it) }
            }
        }
    }
}

@Composable
private fun WorkoutItem(workout: Workout) {
    val date = DATE_FORMAT.format(workout.start.atZone(ZoneId.systemDefault()))
    val km = workout.distanceMeters?.let { "%.1f km".format(it / 1000) }
    ElevatedCard(Modifier.fillMaxWidth()) {
        ListItem(
            leadingContent = { Icon(workout.type.icon(), contentDescription = null) },
            headlineContent = { Text(workout.type.name.lowercase().replaceFirstChar { it.uppercase() }) },
            supportingContent = {
                Text(listOfNotNull(date, "${workout.duration.toMinutes()} min", km, workout.activeKcal?.let { "$it kcal" }).joinToString(" · "))
            },
            trailingContent = { workout.avgHeartRate?.let { Text("$it bpm") } },
        )
    }
}

private fun WorkoutType.icon(): ImageVector = when (this) {
    WorkoutType.WALKING -> Icons.AutoMirrored.Outlined.DirectionsWalk
    WorkoutType.RUNNING -> Icons.AutoMirrored.Outlined.DirectionsRun
    WorkoutType.CYCLING -> Icons.AutoMirrored.Outlined.DirectionsBike
    WorkoutType.SWIMMING -> Icons.Outlined.Pool
    WorkoutType.STRENGTH -> Icons.Outlined.FitnessCenter
    WorkoutType.YOGA -> Icons.Outlined.SelfImprovement
    WorkoutType.OTHER -> Icons.Outlined.SportsScore
}

private val DATE_FORMAT: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
