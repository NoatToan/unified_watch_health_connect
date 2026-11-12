package com.unified.health.feature.training

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.scheduledDayDescription
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.ScheduledDay
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

/** Wires [TrainingPlanViewModel] for the calendar screen itself (D-1190) — same `XRoute` split as
 *  [TrainingRoute]. Reached from [TrainingScreen]'s banner, only ever while a plan is active, but
 *  this still renders a plain empty message instead of crashing if [TrainingPlanViewModel.activePlan]
 *  somehow emits null right as this screen opens (e.g. the plan got cleared from another screen). */
@Composable
internal fun TrainingCalendarRoute(onBack: () -> Unit, viewModel: TrainingPlanViewModel = hiltViewModel()) {
    val activePlan by viewModel.activePlan.collectAsStateWithLifecycle()
    TrainingCalendarScreen(
        plan = activePlan,
        onBack = onBack,
        onToggleCheckIn = { dayOffset, completed -> if (completed) viewModel.checkIn(dayOffset) else viewModel.uncheckIn(dayOffset) },
    )
}

/**
 * The active plan's full day-by-day schedule (D-1190), grouped by week — a plain list, not a literal
 * calendar-grid widget (judged not worth the extra effort for v1, per the task brief). Each day is one
 * row: date + weekday, [scheduledDayDescription], and a checkbox that checks/un-checks it in directly
 * from here. Today's row gets a tinted background so it stands out while scrolling.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun TrainingCalendarScreen(
    plan: ActiveTrainingPlan?,
    onBack: () -> Unit,
    onToggleCheckIn: (dayOffset: Int, completed: Boolean) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(plan?.planId?.displayName ?: "Lịch tập") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
            )
        },
    ) { padding ->
        if (plan == null) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = Alignment.Center) {
                Text(
                    "Chưa có kế hoạch nào đang theo.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.testTag("training_calendar_empty"),
                )
            }
            return@Scaffold
        }
        val today = LocalDate.now()
        LazyColumn(
            modifier = Modifier.fillMaxWidth().padding(padding).testTag("training_calendar_list"),
            contentPadding = PaddingValues(vertical = Spacing.lg),
            verticalArrangement = Arrangement.spacedBy(Spacing.xs),
        ) {
            plan.schedule.chunked(DAYS_PER_WEEK).forEachIndexed { weekIndex, week ->
                item {
                    SectionHeader(
                        "Tuần ${weekIndex + 1}",
                        Modifier.padding(horizontal = Spacing.lg, vertical = Spacing.sm).testTag("training_calendar_week_${weekIndex + 1}"),
                    )
                }
                items(week, key = { it.dayOffset }) { day ->
                    ScheduledDayRow(
                        day = day,
                        isToday = day.date == today,
                        onToggleCheckIn = onToggleCheckIn,
                        modifier = Modifier.fillMaxWidth().padding(horizontal = Spacing.lg),
                    )
                }
            }
        }
    }
}

@Composable
private fun ScheduledDayRow(
    day: ScheduledDay,
    isToday: Boolean,
    onToggleCheckIn: (dayOffset: Int, completed: Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier
            .background(
                if (isToday) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface,
                RoundedCornerShape(12.dp),
            )
            .padding(horizontal = Spacing.sm, vertical = Spacing.xs)
            .testTag("training_calendar_day_${day.dayOffset}"),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Checkbox(
            checked = day.completed,
            onCheckedChange = { checked -> onToggleCheckIn(day.dayOffset, checked) },
            modifier = Modifier.testTag("training_calendar_checkbox_${day.dayOffset}"),
        )
        Column(Modifier.width(72.dp)) {
            Text(
                DAY_OF_WEEK_FORMAT.format(day.date),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = if (isToday) FontWeight.Bold else FontWeight.Normal,
                color = if (isToday) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Text(
                DATE_FORMAT.format(day.date),
                style = MaterialTheme.typography.bodySmall,
                color = if (isToday) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        Spacer(Modifier.width(Spacing.md))
        Text(
            scheduledDayDescription(day),
            style = MaterialTheme.typography.bodyMedium,
            color = if (isToday) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.weight(1f),
        )
    }
}

private const val DAYS_PER_WEEK = 7

private val DAY_OF_WEEK_FORMAT: DateTimeFormatter = DateTimeFormatter.ofPattern("EEE", Locale("vi"))
private val DATE_FORMAT: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
