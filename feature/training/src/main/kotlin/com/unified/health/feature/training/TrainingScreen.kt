package com.unified.health.feature.training

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Straighten
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.TrainingHeroImage
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.TrainingPlanId
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

/**
 * "Chế độ luyện tập" — a static reference guide, phrased like a short article rather than an
 * adaptive coaching tool: general training-session vocabulary up top, then one section per
 * milestone distance (5K/10K/Half/Marathon) listing the well-known plans runners commonly follow for
 * that distance. Every fact here comes from real, well-known training programs (Couch to 5K, the
 * Galloway run-walk-run method, Hal Higdon's Novice/Intermediate plans, Jack Daniels' VDOT system,
 * Hanson's Marathon Method, Pfitzinger's Advanced Marathoning) — nothing here is derived from, or
 * written back to, the user's own [com.unified.health.core.model.Workout]/`HealthMetrics` data; wiring
 * this guide up to the user's real training history is a deliberate later task.
 *
 * No `@HiltViewModel`: there is nothing to load, refresh or persist, so a single stateless composable
 * (plus the per-card expand/collapse `rememberSaveable` in [PlanCard]) is the whole screen.
 *
 * Each distance section opens with a real hero photo ([TrainingHeroImage]) before its plan cards —
 * every [TrainingPlan]'s facts (duration, frequency, longest session, who it's for) now sit in an
 * always-visible [FactChipsRow] instead of buried in a paragraph, so a card reads at a glance even
 * collapsed; the narrative "why/how" text (unchanged content, just de-emphasized) only shows once
 * expanded.
 */
/**
 * Wires [TrainingPlanViewModel] (D-1190) for the two stateful bits this screen itself owns — the
 * "Đang theo" banner and each [PlanCard]'s "Chọn kế hoạch này" action — same `XRoute` + internal
 * `XScreen` split as [com.unified.health.feature.home.HomeRoute]/`HomeScreen`.
 */
@Composable
internal fun TrainingRoute(
    onBack: () -> Unit,
    onOpenRunningForm: () -> Unit,
    onOpenCalendar: () -> Unit,
    viewModel: TrainingPlanViewModel = hiltViewModel(),
) {
    val activePlan by viewModel.activePlan.collectAsStateWithLifecycle()
    TrainingScreen(
        activePlan = activePlan,
        onBack = onBack,
        onOpenRunningForm = onOpenRunningForm,
        onOpenCalendar = onOpenCalendar,
        onSelectPlan = viewModel::selectPlan,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun TrainingScreen(
    activePlan: ActiveTrainingPlan?,
    onBack: () -> Unit,
    onOpenRunningForm: () -> Unit,
    onOpenCalendar: () -> Unit = {},
    onSelectPlan: (TrainingPlanId, LocalDate) -> Unit = { _, _ -> },
) {
    AppScreen(title = "Chế độ luyện tập", onBack = onBack) { contentPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxWidth().testTag("training_list"),
            // D-1194/D-1204: contentPadding (Scaffold's top-bar height / safe-drawing insets / nav-bar
            // inset, see AppScreen) merged with this screen's own Gaps.screenTop — passed to the
            // LazyColumn itself, never as an outer Modifier.padding, so the hero photos/list scroll
            // fully behind the gesture bar instead of stopping in a dead strip above it.
            contentPadding = PaddingValues(
                top = contentPadding.calculateTopPadding() + Gaps.screenTop,
                bottom = contentPadding.calculateBottomPadding() + Gaps.sectionGap,
            ),
            verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
        ) {
            if (activePlan != null) {
                item { ActivePlanBanner(activePlan, onClick = onOpenCalendar, modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal)) }
            }
            item { RunningFormEntryCard(onClick = onOpenRunningForm, modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal)) }
            item { IntroSection() }
            TRAINING_DISTANCE_SECTIONS.forEach { section -> distanceSectionItems(section, activePlan?.planId, onSelectPlan) }
        }
    }
}

/** "Đang theo: Novice 5K — tuần 3/8" — the entry point into [TrainingCalendarScreen] once a plan is
 *  active, placed above everything else on this screen since it's the single most actionable thing
 *  here for a user already following a plan. */
@Composable
private fun ActivePlanBanner(plan: ActiveTrainingPlan, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(
        onClick = onClick,
        modifier = modifier.testTag("training_active_plan_banner"),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
    ) {
        Row(
            Modifier.fillMaxWidth().padding(Gaps.cardPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            Icon(
                Icons.Filled.CalendarMonth,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.size(32.dp),
            )
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                Text(
                    "Đang theo: ${plan.planId.displayName}",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                )
                Text(
                    "Tuần ${plan.currentWeek()}/${plan.planId.totalWeeks} — xem lịch tập đầy đủ",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
            )
        }
    }
}

/** Entry point into the second screen (D-1188's "Dáng chạy đúng") — placed above [IntroSection] so
 *  it reads as a companion reference ("muốn biết tư thế chạy đúng? xem ở đây") rather than buried
 *  among the distance plans below it. */
@Composable
private fun RunningFormEntryCard(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(
        onClick = onClick,
        modifier = modifier.testTag("training_running_form_entry"),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
    ) {
        Row(
            Modifier.fillMaxWidth().padding(Gaps.cardPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            Icon(
                Icons.AutoMirrored.Filled.DirectionsRun,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier.size(32.dp),
            )
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                Text(
                    "Dáng chạy đúng",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                )
                Text(
                    "9 khung hình chu kỳ sải chân, xem từng bước hoặc xem dạng vòng lặp",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSecondaryContainer,
            )
        }
    }
}

/** One general-principles section, shown once at the top before any of the 4 distances — the same
 *  vocabulary (easy/long/tempo/interval/recovery, run-walk-run, taper) that every plan below reuses,
 *  so it's explained once instead of repeated per distance. */
@Composable
private fun IntroSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal).testTag("training_intro"),
        verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
    ) {
        SectionHeader("Nguyên tắc chung")
        Text(
            "Một kế hoạch tập chạy thường xoay quanh vài loại buổi tập cơ bản:",
            style = MaterialTheme.typography.bodyMedium,
        )
        BulletText("Easy run", "chạy nhẹ, vẫn nói chuyện được — xây nền thể lực.")
        BulletText("Long run", "buổi chạy dài nhất trong tuần, tăng dần theo thời gian.")
        BulletText("Tempo/Threshold", "chạy \"khó nhưng kiểm soát được\", cải thiện ngưỡng lactate.")
        BulletText("Interval/Tốc độ", "chạy nhanh ngắt quãng, tăng VO2max.")
        BulletText("Nghỉ/Recovery", "ngày nghỉ hoặc cross-training nhẹ.")
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontWeight = FontWeight.Bold)) { append("Run-walk-run (phương pháp Galloway): ") }
                append(
                    "xen kẽ chạy/đi bộ theo tỷ lệ cố định ngay từ đầu (không phải \"đi bộ vì mệt\") — " +
                        "giảm chấn thương, tỷ lệ hoàn thành cao hơn, rất phù hợp người mới hoàn toàn.",
                )
            },
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontWeight = FontWeight.Bold)) { append("Taper (giảm tải): ") }
                append(
                    "những tuần cuối trước ngày thi đấu giảm khối lượng để cơ thể hồi phục, đạt thể lực " +
                        "tốt nhất đúng ngày race — mọi mô hình bên dưới đều có giai đoạn này.",
                )
            },
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            "Nội dung tham khảo tổng hợp từ các mô hình luyện tập phổ biến, không phải lời khuyên y tế — " +
                "nên tham khảo huấn luyện viên hoặc bác sĩ nếu có vấn đề sức khỏe trước khi bắt đầu.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.testTag("training_disclaimer"),
        )
    }
}

/** "• **bold**: rest" — one line of [IntroSection]'s session-type vocabulary. */
@Composable
private fun BulletText(bold: String, rest: String) {
    Text(
        buildAnnotatedString {
            withStyle(SpanStyle(fontWeight = FontWeight.Bold)) { append("• $bold") }
            append(": $rest")
        },
        style = MaterialTheme.typography.bodyMedium,
    )
}

/** One distance's hero photo, heading, its plan cards, then its "Gợi ý chọn" line (when this distance
 *  has one). The hero sits directly above [SectionHeader] so the section reads as one visual block. */
private fun LazyListScope.distanceSectionItems(
    section: DistanceSection,
    activePlanId: TrainingPlanId?,
    onSelectPlan: (TrainingPlanId, LocalDate) -> Unit,
) {
    item {
        Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
            TrainingHeroImage(
                imageUrl = section.heroImageUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(HeroAspectRatio)
                    .testTag("training_hero_${section.id}"),
            )
            SectionHeader(section.heading, Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("training_section_${section.id}"))
        }
    }
    items(section.plans, key = { "${section.id}_${it.id}" }) { plan ->
        PlanCard(plan, activePlanId, onSelectPlan, modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal))
    }
    section.recommendation?.let { recommendation ->
        item {
            Text(
                recommendation,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("training_recommendation_${section.id}"),
            )
        }
    }
}

/** Fixed 16:9 hero band — wide enough to read as a real photo, short enough that 4 of them plus a
 *  full plan list still scrolls reasonably on one screen. */
private const val HeroAspectRatio = 16f / 9f

/** One named plan ("Couch to 5K", "Hal Higdon Novice 1", …): its scannable facts ([FactChipsRow])
 *  always show; tap reveals [TrainingPlan.narrative], the longer "why/how" text — the only
 *  interactive/stateful bit of this whole screen besides [RunningFormEntryCard]. D-1190: the 4 Hal
 *  Higdon Novice plans (and only those — [TrainingPlan.selectablePlanId] is null for every other plan
 *  on this screen) also get a "Chọn kế hoạch này" action once expanded. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PlanCard(
    plan: TrainingPlan,
    activePlanId: TrainingPlanId?,
    onSelectPlan: (TrainingPlanId, LocalDate) -> Unit,
    modifier: Modifier = Modifier,
) {
    var expanded by rememberSaveable(plan.id) { mutableStateOf(false) }
    ElevatedCard(onClick = { expanded = !expanded }, modifier = modifier.testTag("training_plan_${plan.id}")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(plan.name, style = MaterialTheme.typography.titleSmall, modifier = Modifier.weight(1f))
                Icon(
                    if (expanded) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown,
                    contentDescription = if (expanded) "Thu gọn" else "Xem chi tiết",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            FactChipsRow(plan)
            if (expanded) {
                Text(
                    plan.narrative,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                plan.selectablePlanId?.let { planId ->
                    SelectPlanAction(
                        planId = planId,
                        isActive = activePlanId == planId,
                        anotherPlanAlreadyActive = activePlanId != null,
                        onSelectPlan = onSelectPlan,
                    )
                }
            }
        }
    }
}

/** The "Chọn kế hoạch này" button + its 2 dialogs (replace-confirmation, then the start-date picker) —
 *  D-1190. A different plan already active shows a confirmation first, since replacing it discards its
 *  check-in progress ([TrainingPlanRepository.selectPlan]'s own doc); re-selecting the *same* plan
 *  that's already active still confirms too (its start date — and so its whole day-by-day schedule —
 *  may change), rather than special-casing "same id" as silently safe. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SelectPlanAction(
    planId: TrainingPlanId,
    isActive: Boolean,
    anotherPlanAlreadyActive: Boolean,
    onSelectPlan: (TrainingPlanId, LocalDate) -> Unit,
) {
    var showReplaceConfirm by rememberSaveable { mutableStateOf(false) }
    var showDatePicker by rememberSaveable { mutableStateOf(false) }

    if (isActive) {
        Text(
            "Đang theo kế hoạch này",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.testTag("training_plan_active_label_${planId.name}"),
        )
    } else {
        Button(
            onClick = { if (anotherPlanAlreadyActive) showReplaceConfirm = true else showDatePicker = true },
            modifier = Modifier.testTag("training_select_plan_${planId.name}"),
        ) { Text("Chọn kế hoạch này") }
    }

    if (showReplaceConfirm) {
        AlertDialog(
            onDismissRequest = { showReplaceConfirm = false },
            title = { Text("Thay kế hoạch đang theo?") },
            text = { Text("Bạn đang theo một kế hoạch khác. Chọn kế hoạch mới sẽ xoá tiến độ check-in hiện tại.") },
            confirmButton = {
                TextButton(onClick = { showReplaceConfirm = false; showDatePicker = true }, modifier = Modifier.testTag("training_replace_confirm")) {
                    Text("Tiếp tục")
                }
            },
            dismissButton = { TextButton(onClick = { showReplaceConfirm = false }) { Text("Huỷ") } },
        )
    }

    if (showDatePicker) {
        val today = LocalDate.now()
        val datePickerState = rememberDatePickerState(initialSelectedDateMillis = today.toUtcMillis())
        DatePickerDialog(
            onDismissRequest = { showDatePicker = false },
            confirmButton = {
                TextButton(
                    onClick = {
                        val startDate = datePickerState.selectedDateMillis?.toLocalDateUtc() ?: today
                        onSelectPlan(planId, startDate)
                        showDatePicker = false
                    },
                    modifier = Modifier.testTag("training_date_picker_confirm"),
                ) { Text("Bắt đầu") }
            },
            dismissButton = { TextButton(onClick = { showDatePicker = false }) { Text("Huỷ") } },
        ) {
            DatePicker(state = datePickerState)
        }
    }
}

private fun LocalDate.toUtcMillis(): Long = atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli()

private fun Long.toLocalDateUtc(): LocalDate = Instant.ofEpochMilli(this).atZone(ZoneOffset.UTC).toLocalDate()

/** The scannable "stat grid" this screen's redesign is about: one small pill per known fact
 *  ([TrainingPlan.weeks]/[TrainingPlan.perWeek]/[TrainingPlan.longest]/[TrainingPlan.audience]) —
 *  only the facts a given plan's source material actually states show up (several plans, e.g.
 *  Galloway or Daniels' VDOT, are described as methods rather than fixed week-by-week programs, so
 *  they simply have fewer chips rather than invented numbers). Wraps instead of scrolling since 10K+
 *  screens show up to 4 chips and this reads better as 2 short rows than a horizontal scroller. */
@Composable
private fun FactChipsRow(plan: TrainingPlan) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(Spacing.xs),
        verticalArrangement = Arrangement.spacedBy(Spacing.xs),
    ) {
        plan.weeks?.let { FactChip(Icons.Filled.CalendarMonth, it) }
        plan.perWeek?.let { FactChip(Icons.Filled.Repeat, it) }
        plan.longest?.let { FactChip(Icons.Filled.Straighten, it) }
        plan.audience?.let { FactChip(Icons.Filled.Groups, it) }
    }
}

/** One icon+label fact pill, e.g. 📅 "8 tuần". Plain `Row`, not `AssistChip`/`SuggestionChip` — those
 *  both carry click/selection affordance this is purely informational (the whole [PlanCard] is
 *  already the click target), so a lighter custom pill avoids a misleading extra ripple target. */
@Composable
private fun FactChip(icon: ImageVector, text: String) {
    Row(
        Modifier
            .background(MaterialTheme.colorScheme.surfaceVariant, RoundedCornerShape(50))
            .padding(horizontal = Spacing.sm, vertical = Spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Spacing.xs),
    ) {
        Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(14.dp))
        Text(text, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

/** One named training plan within a [DistanceSection] — [id] is stable/unique within its section only
 *  (used together with [DistanceSection.id] as the LazyColumn item key). [weeks]/[perWeek]/[longest]/
 *  [audience] are the structured facts [FactChipsRow] shows (null when the source material doesn't
 *  state that particular fact for this plan); [narrative] is the longer "why/how" prose, unchanged in
 *  substance from before this redesign, just moved behind the expand toggle. */
private data class TrainingPlan(
    val id: String,
    val name: String,
    val weeks: String? = null,
    val perWeek: String? = null,
    val longest: String? = null,
    val audience: String? = null,
    val narrative: String,
    /** D-1190: non-null only for the 4 Hal Higdon Novice plans — the ones a user can actually select
     *  and follow a generated calendar for, out of every plan this screen describes. */
    val selectablePlanId: TrainingPlanId? = null,
)

/** One milestone distance's whole section: hero photo, heading, its plans, and an optional closing
 *  "which one do I pick" line (not every distance has one — 10K doesn't, per the source material). */
private data class DistanceSection(
    val id: String,
    val heading: String,
    val heroImageUrl: String,
    val plans: List<TrainingPlan>,
    val recommendation: String? = null,
)

/**
 * Hero photo URLs: free-to-use Unsplash photos (no attribution required), one per distance,
 * `w=1600&q=60&fm=jpg&auto=format&fit=crop` — matches this project's only other remote-photo
 * precedent ([com.unified.health.feature.races]'s crawled race photos / `feature/gear`'s product
 * photos), trimmed down from Unsplash's default multi-megabyte originals to a sane mobile-hero size.
 */
private val TRAINING_DISTANCE_SECTIONS: List<DistanceSection> = listOf(
    DistanceSection(
        id = "5k",
        heading = "Mốc 5K",
        heroImageUrl = "https://images.unsplash.com/photo-1513378628213-b8f36d8c2878?fm=jpg&q=60&w=1600&auto=format&fit=crop",
        plans = listOf(
            TrainingPlan(
                id = "c25k",
                name = "Couch to 5K (C25K)",
                weeks = "9 tuần",
                perWeek = "3 buổi/tuần",
                longest = "~30 phút liên tục",
                audience = "Chưa từng chạy",
                narrative = "Tăng dần thời gian chạy liên tục xen đi bộ — tuần 1 bắt đầu với chạy 1 phút/đi bộ 1.5 " +
                    "phút lặp lại, đến tuần 9 đã chạy liên tục được quãng trên.",
            ),
            TrainingPlan(
                id = "galloway",
                name = "Phương pháp Galloway",
                audience = "Ưu tiên giảm chấn thương",
                narrative = "Giữ nhịp đi bộ xen kẽ suốt cả chương trình thay vì ép chạy liên tục dần như C25K — phù " +
                    "hợp người ưu tiên hoàn thành bền, ít chấn thương hơn là tốc độ.",
            ),
            TrainingPlan(
                id = "higdon_novice",
                name = "Hal Higdon Novice 5K",
                weeks = "8 tuần",
                perWeek = "3 chạy + 3 đi bộ + 1 nghỉ/tuần",
                longest = "~4.8km",
                audience = "Quen vận động nhẹ",
                narrative = "Khung có kỷ luật hơn Galloway/C25K, phù hợp người đã quen vận động nhẹ muốn một lịch " +
                    "tập rõ ràng theo tuần.",
                selectablePlanId = TrainingPlanId.NOVICE_5K,
            ),
        ),
        recommendation = "Gợi ý chọn: chưa từng chạy/lo chấn thương → Galloway; đã đi bộ nhanh ổn → C25K hoặc Higdon Novice.",
    ),
    DistanceSection(
        id = "10k",
        heading = "Mốc 10K",
        heroImageUrl = "https://images.unsplash.com/photo-1750089440025-61f7b7cacbed?fm=jpg&q=60&w=1600&auto=format&fit=crop",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice",
                name = "Hal Higdon Novice 10K",
                weeks = "8 tuần",
                perWeek = "Chạy + cross-training",
                longest = "Race 10K thật ở tuần cuối",
                narrative = "Phối hợp chạy và cross-training, tuần cuối lồng sẵn một race 10K thật ngay trong lịch tập.",
                selectablePlanId = TrainingPlanId.NOVICE_10K,
            ),
            TrainingPlan(
                id = "higdon_intermediate",
                name = "Hal Higdon Intermediate 10K",
                audience = "Đã chạy được 10K, muốn nhanh hơn",
                narrative = "Thêm các buổi interval/tempo vào nền tảng chạy sẵn có để cải thiện tốc độ.",
            ),
            TrainingPlan(
                id = "daniels_vdot",
                name = "Jack Daniels (VDOT)",
                audience = "Muốn pace khoa học hơn cảm giác",
                narrative = "Tính pace tập theo chỉ số \"VDOT\" suy ra từ 1 kết quả race gần nhất, chia 5 vùng pace: " +
                    "Easy, Marathon, Threshold, Interval, Repetition.",
            ),
        ),
    ),
    DistanceSection(
        id = "half",
        heading = "Mốc Half Marathon (21km)",
        heroImageUrl = "https://images.unsplash.com/photo-1682367905664-e36b30f15b19?fm=jpg&q=60&w=1600&auto=format&fit=crop",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice1",
                name = "Hal Higdon Novice 1",
                weeks = "12 tuần",
                perWeek = "4 ngày chạy + 2 cross-training + 1 strength/tuần",
                longest = "16km",
                audience = "Đã chạy ~4.8km, 3-4 lần/tuần",
                narrative = "Gồm 2 ngày nghỉ/tuần xen giữa các buổi chạy, cross-training và strength — đây là yêu " +
                    "cầu đầu vào tối thiểu trước khi bắt đầu, không phải mục tiêu của chương trình.",
                selectablePlanId = TrainingPlanId.NOVICE_HALF,
            ),
            TrainingPlan(
                id = "higdon_novice2",
                name = "Hal Higdon Novice 2",
                audience = "Đã hoàn thành ≥1 half marathon",
                narrative = "Tăng nhẹ khối lượng so với Novice 1, dành cho người đã có ít nhất 1 lần hoàn thành cự ly 21km.",
            ),
            TrainingPlan(
                id = "daniels_half",
                name = "Jack Daniels Half",
                audience = "Muốn pace khoa học hơn",
                narrative = "Thêm các buổi tempo/threshold vào kế hoạch, chạy đúng theo pace VDOT tính từ race gần nhất.",
            ),
        ),
        recommendation = "Gợi ý: lần đầu chạy 21km → Novice 1; đã có kinh nghiệm, muốn PR → Novice 2 hoặc Daniels.",
    ),
    DistanceSection(
        id = "marathon",
        heading = "Mốc Marathon (42km)",
        heroImageUrl = "https://images.unsplash.com/photo-1714963145999-f35277765fe6?fm=jpg&q=60&w=1600&auto=format&fit=crop",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice1",
                name = "Hal Higdon Novice 1",
                weeks = "18 tuần",
                perWeek = "4 ngày chạy + 1 cross-training/tuần",
                longest = "32km",
                audience = "Lần đầu full marathon",
                narrative = "Gồm 2 ngày nghỉ/tuần xen giữa — chương trình kinh điển cho người chạy marathon lần đầu.",
                selectablePlanId = TrainingPlanId.NOVICE_MARATHON,
            ),
            TrainingPlan(
                id = "higdon_novice2",
                name = "Hal Higdon Novice 2",
                perWeek = "24-40km/tuần",
                audience = "Đã chạy marathon ≥1 lần",
                narrative = "Cho người đã chạy marathon ít nhất 1 lần, đã quen khối lượng chạy 24-40km mỗi tuần.",
            ),
            TrainingPlan(
                id = "daniels_2q",
                name = "Jack Daniels 2Q Marathon Plan",
                weeks = "6-8 tuần/giai đoạn",
                perWeek = "2 buổi chất lượng/tuần",
                audience = "Muốn pace khoa học hơn",
                narrative = "2 buổi chất lượng mỗi tuần (1 long run + 1 buổi nhanh), còn lại chạy easy theo đúng pace " +
                    "VDOT; chia thành các giai đoạn (phase) nối tiếp nhau.",
            ),
            TrainingPlan(
                id = "hansons",
                name = "Hanson's Marathon Method",
                perWeek = "6 ngày/tuần",
                longest = "Tối đa ~26km",
                audience = "Tập được 6 ngày/tuần, ngại long run quá dài",
                narrative = "Triết lý \"mệt tích lũy\" từ tần suất chạy cao thay vì 1 buổi dài kiệt sức — chạy nhiều " +
                    "ở pace marathon mục tiêu, long run không quá dài.",
            ),
            TrainingPlan(
                id = "pfitzinger",
                name = "Pfitzinger (Advanced Marathoning)",
                perWeek = "7 ngày/tuần (có buổi tập 2 lần/ngày)",
                longest = "Tới 37km",
                audience = "Nền khối lượng cao, mục tiêu sub-3h",
                narrative = "Tempo chạy ở ngưỡng lactate threshold — cho người đã có nền khối lượng cao, hướng tới " +
                    "mục tiêu performance/sub-3h.",
            ),
        ),
        recommendation = "Gợi ý: lần đầu full marathon → Higdon Novice 1; đã chạy rồi và muốn khoa học hơn/PR → " +
            "chọn theo mức chịu được khối lượng (ít ngày hơn nhưng long run dài hơn = Pfitzinger; nhiều " +
            "ngày hơn nhưng long run ngắn hơn = Hanson's); muốn pace tính theo khoa học = Daniels.",
    ),
)
