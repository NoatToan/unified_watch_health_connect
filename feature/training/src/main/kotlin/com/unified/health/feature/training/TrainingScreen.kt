package com.unified.health.feature.training

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.theme.Spacing

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
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun TrainingScreen(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Chế độ luyện tập") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
            )
        },
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxWidth().padding(padding).testTag("training_list"),
            contentPadding = PaddingValues(vertical = Spacing.lg),
            verticalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            item { IntroSection() }
            TRAINING_DISTANCE_SECTIONS.forEach { section -> distanceSectionItems(section) }
        }
    }
}

/** One general-principles section, shown once at the top before any of the 4 distances — the same
 *  vocabulary (easy/long/tempo/interval/recovery, run-walk-run, taper) that every plan below reuses,
 *  so it's explained once instead of repeated per distance. */
@Composable
private fun IntroSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = Spacing.lg).testTag("training_intro"),
        verticalArrangement = Arrangement.spacedBy(Spacing.sm),
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

/** One distance's heading, its plan cards, then its "Gợi ý chọn" line (when this distance has one). */
private fun LazyListScope.distanceSectionItems(section: DistanceSection) {
    item {
        SectionHeader(section.heading, Modifier.padding(horizontal = Spacing.lg).testTag("training_section_${section.id}"))
    }
    items(section.plans, key = { "${section.id}_${it.id}" }) { plan ->
        PlanCard(plan, modifier = Modifier.fillMaxWidth().padding(horizontal = Spacing.lg))
    }
    section.recommendation?.let { recommendation ->
        item {
            Text(
                recommendation,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = Spacing.lg).testTag("training_recommendation_${section.id}"),
            )
        }
    }
}

/** One named plan ("Couch to 5K", "Hal Higdon Novice 1", …): collapsed to just its name by default,
 *  tap to reveal [TrainingPlan.detail] — the only interactive/stateful bit of this whole screen. */
@Composable
private fun PlanCard(plan: TrainingPlan, modifier: Modifier = Modifier) {
    var expanded by rememberSaveable(plan.id) { mutableStateOf(false) }
    ElevatedCard(onClick = { expanded = !expanded }, modifier = modifier.testTag("training_plan_${plan.id}")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(plan.name, style = MaterialTheme.typography.titleSmall, modifier = Modifier.weight(1f))
                Icon(
                    if (expanded) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown,
                    contentDescription = if (expanded) "Thu gọn" else "Xem chi tiết",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            if (expanded) {
                Text(plan.detail, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}

/** One named training plan within a [DistanceSection] — [id] is stable/unique within its section only
 *  (used together with [DistanceSection.id] as the LazyColumn item key). */
private data class TrainingPlan(val id: String, val name: String, val detail: String)

/** One milestone distance's whole section: heading, its plans, and an optional closing "which one do
 *  I pick" line (not every distance has one — 10K doesn't, per the source material). */
private data class DistanceSection(val id: String, val heading: String, val plans: List<TrainingPlan>, val recommendation: String? = null)

private val TRAINING_DISTANCE_SECTIONS: List<DistanceSection> = listOf(
    DistanceSection(
        id = "5k",
        heading = "Mốc 5K",
        plans = listOf(
            TrainingPlan(
                id = "c25k",
                name = "Couch to 5K (C25K)",
                detail = "9 tuần, 3 buổi/tuần, tăng dần thời gian chạy liên tục xen đi bộ (tuần 1: chạy 1 " +
                    "phút/đi bộ 1.5 phút, lặp lại; tuần 9: chạy liên tục ~30 phút). Phù hợp người chưa từng chạy.",
            ),
            TrainingPlan(
                id = "galloway",
                name = "Phương pháp Galloway",
                detail = "Giữ nhịp đi bộ xen kẽ suốt cả chương trình (không ép chạy liên tục dần như C25K) — " +
                    "phù hợp người ưu tiên giảm chấn thương, hoàn thành bền hơn là tốc độ.",
            ),
            TrainingPlan(
                id = "higdon_novice",
                name = "Hal Higdon Novice 5K",
                detail = "8 tuần, 3 ngày chạy + 3 ngày đi bộ + 1 ngày nghỉ/tuần, buổi dài nhất ~4.8km. Phù " +
                    "hợp người đã quen vận động nhẹ, muốn khung có kỷ luật hơn.",
            ),
        ),
        recommendation = "Gợi ý chọn: chưa từng chạy/lo chấn thương → Galloway; đã đi bộ nhanh ổn → C25K hoặc Higdon Novice.",
    ),
    DistanceSection(
        id = "10k",
        heading = "Mốc 10K",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice",
                name = "Hal Higdon Novice 10K",
                detail = "8 tuần, phối hợp chạy + cross-training, tuần cuối có sẵn race 10K thật trong lịch tập.",
            ),
            TrainingPlan(
                id = "higdon_intermediate",
                name = "Hal Higdon Intermediate 10K",
                detail = "Thêm interval/tempo, cho người đã chạy được 10K và muốn cải thiện tốc độ.",
            ),
            TrainingPlan(
                id = "daniels_vdot",
                name = "Jack Daniels (VDOT)",
                detail = "Tính pace tập theo \"VDOT\" suy ra từ 1 kết quả race gần nhất, chia 5 vùng pace " +
                    "(Easy/Marathon/Threshold/Interval/Repetition) — phù hợp người muốn pace khoa học hơn là theo cảm giác.",
            ),
        ),
    ),
    DistanceSection(
        id = "half",
        heading = "Mốc Half Marathon (21km)",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice1",
                name = "Hal Higdon Novice 1",
                detail = "12 tuần, 4 ngày chạy + 2 cross-training + 1 strength + 2 ngày nghỉ/tuần, buổi dài " +
                    "nhất 16km. Yêu cầu đầu vào: đã chạy được ~4.8km, 3-4 lần/tuần.",
            ),
            TrainingPlan(
                id = "higdon_novice2",
                name = "Hal Higdon Novice 2",
                detail = "Cho người đã hoàn thành ít nhất 1 half marathon, muốn tăng nhẹ khối lượng.",
            ),
            TrainingPlan(
                id = "daniels_half",
                name = "Jack Daniels Half",
                detail = "Thêm các buổi tempo/threshold theo pace VDOT.",
            ),
        ),
        recommendation = "Gợi ý: lần đầu chạy 21km → Novice 1; đã có kinh nghiệm, muốn PR → Novice 2 hoặc Daniels.",
    ),
    DistanceSection(
        id = "marathon",
        heading = "Mốc Marathon (42km)",
        plans = listOf(
            TrainingPlan(
                id = "higdon_novice1",
                name = "Hal Higdon Novice 1",
                detail = "18 tuần, 4 ngày chạy + 1 cross-training + 2 ngày nghỉ/tuần, buổi dài nhất 32km. " +
                    "Dành cho người chạy full marathon lần đầu.",
            ),
            TrainingPlan(
                id = "higdon_novice2",
                name = "Hal Higdon Novice 2",
                detail = "Cho người đã chạy marathon ít nhất 1 lần, quen chạy 24-40km/tuần.",
            ),
            TrainingPlan(
                id = "daniels_2q",
                name = "Jack Daniels 2Q Marathon Plan",
                detail = "2 buổi chất lượng/tuần (1 long run + 1 buổi nhanh), còn lại chạy easy, theo pace " +
                    "VDOT, chia giai đoạn 6-8 tuần/phase.",
            ),
            TrainingPlan(
                id = "hansons",
                name = "Hanson's Marathon Method",
                detail = "6 ngày/tuần, long run chỉ tối đa ~26km — triết lý \"mệt tích lũy\" từ tần suất " +
                    "chạy cao thay vì 1 buổi dài kiệt sức; chạy nhiều ở pace marathon mục tiêu. Phù hợp " +
                    "người tập được 6 ngày/tuần nhưng ngại buổi long run quá dài.",
            ),
            TrainingPlan(
                id = "pfitzinger",
                name = "Pfitzinger (Advanced Marathoning)",
                detail = "7 ngày/tuần (có buổi tập 2 lần/ngày), long run tới 37km, tempo chạy ở ngưỡng " +
                    "lactate threshold. Cho người đã có nền khối lượng cao, mục tiêu performance/sub-3h.",
            ),
        ),
        recommendation = "Gợi ý: lần đầu full marathon → Higdon Novice 1; đã chạy rồi và muốn khoa học hơn/PR → " +
            "chọn theo mức chịu được khối lượng (ít ngày hơn nhưng long run dài hơn = Pfitzinger; nhiều " +
            "ngày hơn nhưng long run ngắn hơn = Hanson's); muốn pace tính theo khoa học = Daniels.",
    ),
)
