package mq;

import android.content.Context;
import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmq/a;", "Lmq/l;", "", "Lc22/c3;", "headerTitleHandle", "", "lapColumnWeight", "<init>", "(Ljava/lang/String;ILc22/c3;F)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a implements l {
    INTERVAL(c22.i.b(R.string.activity_lap_interval_label), 0.8f),
    INTERVAL_SHORT(c22.i.b(R.string.interval_extra_short), 0.7f),
    SPLIT(c22.i.b(R.string.lbl_split), 0.7f),
    LAP(c22.i.b(R.string.laplist_lap_number_label), 0.6f),
    INTERVAL_LENGTH(c22.i.b(R.string.activity_lap_interval_label), 0.8f),
    RUN(c22.i.b(R.string.lbl_run), 0.7f),
    SKI_RUN(c22.i.b(R.string.activities_ski_run), 0.8f),
    ROUTE(c22.i.b(R.string.lbl_routes), 0.7f),
    ROUND(c22.i.b(R.string.lbl_jump_rope_round), 0.7f),
    /* JADX INFO: Fake field, exist only in values array */
    DIVE_INTERVAL(c22.i.b(R.string.activity_lap_interval_label), 0.8f),
    SPLIT_TYPE(c22.i.b(R.string.default_image_view_content_description), 0.5f),
    SPLIT_TYPE_LANDSCAPE(c22.i.b(R.string.lbl_split), 0.7f),
    INTERVAL_SPLIT_TYPE(c22.i.b(R.string.common_type), 1.0f),
    INTERVAL_SPLIT_TYPE_LANDSCAPE(c22.i.b(R.string.common_type), 1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    DIVE_DISCIPLINE_TYPE(c22.i.b(R.string.lbl_discipline), 1.0f),
    TIME(c22.i.b(R.string.lbl_time), 1.0f),
    TOTAL_TIME(c22.i.b(R.string.activity_stats_details_total_time_label), 1.0f),
    CUMULATIVE_TIME(c22.i.b(R.string.LapList_cumulative_time_label), 1.7f),
    MOVING_TIME(c22.i.b(R.string.activity_details_moving_time), 1.3f),
    LAP_TIME(c22.i.b(R.string.run_options_time_lap), 1.5f),
    JUMP_TIME(c22.i.b(R.string.lbl_jump_time), 1.0f),
    DANCE_TIME(c22.i.b(R.string.lbl_dance_time), 2.3f),
    RUN_MOVING_TIME(c22.i.b(R.string.activities_total_ski_run_moving_time), 1.3f),
    IDLE_TIME(c22.i.b(R.string.activities_idle_time), 1.3f),
    DISTANCE(c22.i.b(R.string.lbl_distance), 1.1f),
    DISTANCE_SHORT(c22.i.b(R.string.distance_short), 0.9f),
    SWIM_DISTANCE(c22.i.b(R.string.lbl_distance), 1.1f),
    LAP_DISTANCE(c22.i.b(R.string.run_options_distance_lap), 1.1f),
    ELEV_GAIN(c22.i.b(R.string.lbl_total_ascent), 1.5f),
    ELEV_LOSS(c22.i.b(R.string.lbl_total_descent), 1.5f),
    ASCENT_ELEV_GAIN(c22.i.b(R.string.activities_ascent_label), 1.0f),
    DESCENT_ELEV_LOSS(c22.i.b(R.string.activities_descent_label), 1.0f),
    FLYING_ELEV_GAIN(c22.i.b(R.string.lbl_altitude_gain), 1.0f),
    FLYING_ELEV_LOSS(c22.i.b(R.string.activity_details_altitude_loss), 1.0f),
    AVG_SPEED(c22.i.b(R.string.lbl_avg_speed), 1.3f),
    AVG_MOVING_SPEED(c22.i.b(R.string.activity_details_average_moving_speed), 1.7f),
    AVG_SPEED_IN_USER_UNIT(c22.i.b(R.string.lbl_avg_speed), 1.3f),
    MAX_SPEED(c22.i.b(R.string.activity_details_max_speed), 1.7f),
    MAX_SPEED_IN_USER_UNIT(c22.i.b(R.string.activity_details_max_speed), 1.7f),
    AVG_VERTICAL_SPEED(c22.i.b(R.string.activities_lbl_avg_vertical_speed_abr), 1.3f),
    AVG_PACE(c22.i.b(R.string.lbl_avg_pace), 1.2f),
    AVG_GAP(c22.i.b(R.string.lbl_avg_gap), 1.2f),
    AVG_MOVING_PACE(c22.i.b(R.string.activity_details_average_moving_pace), 1.7f),
    BEST_PACE(c22.i.b(R.string.activity_details_best_pace), 1.2f),
    AVG_SWIM_PACE(c22.i.b(R.string.lbl_avg_pace), 1.2f),
    AVG_SWIM_MOVING_PACE(c22.i.b(R.string.activity_details_average_moving_pace), 1.7f),
    BEST_SWIM_PACE(c22.i.b(R.string.activity_details_best_pace), 1.2f),
    FLOOR_SPEED(c22.i.b(R.string.lbl_avg_speed), 1.7f),
    AVG_NAUT_SOG(c22.i.b(R.string.activity_details_average_nautical_sog), 1.5f),
    MAX_NAUT_SOG(c22.i.b(R.string.activity_details_max_nautical_sog), 1.5f),
    MAX_NAUT_SOG_SHORT(c22.i.b(R.string.lbl_grinding_max_nautical_sog), 1.5f),
    AVG_HR(c22.i.b(R.string.activity_details_average_heart_rate), 1.6f),
    MAX_HR(c22.i.b(R.string.activity_details_max_heart_rate), 1.7f),
    AVG_HR_SHORT(c22.i.b(R.string.activities_average_hr_lbl_short), 1.6f),
    MAX_HR_SHORT(c22.i.b(R.string.lbl_max_hr), 1.7f),
    AVG_CADENCE(c22.i.b(R.string.activity_details_average_cadence), 1.7f),
    MAX_CADENCE(c22.i.b(R.string.activity_details_max_cadence), 1.7f),
    AVG_RUN_CADENCE(c22.i.b(R.string.activity_details_average_run_cadence), 1.7f),
    MAX_RUN_CADENCE(c22.i.b(R.string.activity_details_max_run_cadence), 1.7f),
    AVG_SKI_CADENCE(c22.i.b(R.string.winter_sports_avg_ski_cadence), 1.7f),
    MAX_SKI_CADENCE(c22.i.b(R.string.winter_sports_max_ski_cadence), 1.5f),
    AVG_BIKE_CADENCE(c22.i.b(R.string.activity_details_average_bike_cadence), 1.7f),
    MAX_BIKE_CADENCE(c22.i.b(R.string.activity_details_max_bike_cadence), 1.7f),
    AVG_BIKE_CADENCE_DEFAULT_LABEL(c22.i.b(R.string.activity_details_average_cadence), 1.7f),
    MAX_BIKE_CADENCE_DEFAULT_LABEL(c22.i.b(R.string.activity_details_max_cadence), 1.7f),
    AVG_WHEELCHAIR_CADENCE(c22.i.b(R.string.activity_details_average_push_cadence), 1.7f),
    MAX_WHEELCHAIR_CADENCE(c22.i.b(R.string.activity_details_max_push_cadence), 1.7f),
    NORMALIZED_POWER(c22.i.b(R.string.activity_details_normalized_power), 2.2f),
    LR_BALANCE(c22.i.b(R.string.lbl_lr_balance), 1.7f),
    LR_TORQUE_EFFECTIVENESS(c22.i.b(R.string.lbl_lr_torque_effectiveness), 2.6f),
    LR_PEDAL_SMOOTHNESS(c22.i.b(R.string.lbl_lr_pedal_smoothness), 2.4f),
    ATA(g2.b(x0.f23409f9), 1.7f),
    AATA(g2.b(x0.f23342b9), 2.2f),
    ALTA(g2.b(x0.f23376d9), 2.3f),
    AUTA(g2.b(x0.f23442h9), 2.3f),
    ASTA(g2.b(x0.f23392e9), 2.3f),
    SEATED_TIME(c22.i.b(R.string.activity_position_seated_time), 1.5f),
    AT(g2.b(x0.Z8), 1.3f),
    LT(g2.b(x0.f23474j9), 1.5f),
    UT(g2.b(x0.f23641t9), 1.5f),
    STANDING_TIME(c22.i.b(R.string.activity_position_standing_time), 1.5f),
    AVG_POWER(c22.i.b(R.string.activity_details_average_power), 1.3f),
    MAX_POWER(c22.i.b(R.string.activity_details_max_power), 1.5f),
    WEIGHT_AVG_POWER(c22.i.b(R.string.activity_details_average_power_by_weight), 1.3f),
    WEIGHT_MAX_POWER(c22.i.b(R.string.activity_details_max_power_by_weight), 1.5f),
    AVG_SEATED_POWER(c22.i.b(R.string.activity_details_seated_average_power), 2.2f),
    MAX_SEATED_POWER(c22.i.b(R.string.activity_details_seated_max_power), 2.3f),
    AAP(g2.b(x0.f23324a9), 1.7f),
    MAP(g2.b(x0.f23491k9), 1.7f),
    ALP(g2.b(x0.f23359c9), 2.2f),
    MLP(g2.b(x0.f23508l9), 2.2f),
    AUP(g2.b(x0.f23426g9), 2.2f),
    MUP(g2.b(x0.f23525m9), 2.2f),
    AVG_STANDING_POWER(c22.i.b(R.string.activity_details_standing_average_power), 2.3f),
    MAX_STANDING_POWER(c22.i.b(R.string.activity_details_standing_max_power), 2.3f),
    AVG_BIKE_FORCE(c22.i.b(R.string.lbl_avg_force), 1.3f),
    MAX_BIKE_FORCE(c22.i.b(R.string.lbl_max_force), 1.5f),
    NORMALIZED_FORCE(c22.i.b(R.string.lbl_normalized_force), 2.2f),
    AVG_SWIM_CADENCE(c22.i.b(R.string.activity_details_avg_stroke_rate), 1.7f),
    MAX_SWIM_CADENCE(c22.i.b(R.string.activity_details_max_stroke_rate), 1.9f),
    AVG_STEP_SPEED_LOSS(c22.i.b(R.string.lbl_avg_step_speed_loss), 2.1f),
    AVG_STEP_SPEED_LOSS_PERCENT(c22.i.b(R.string.lbl_avg_step_speed_loss_percent), 2.3f),
    AVG_STRIDE_LENGTH(c22.i.b(R.string.activity_details_average_stride_length), 1.6f),
    AVG_SWOLF(c22.i.b(R.string.activity_details_avg_swolf), 1.5f),
    BEST_SWOLF(c22.i.b(R.string.activity_details_best_swolf), 1.2f),
    SWIM_STROKE(c22.i.b(R.string.activity_details_swim_stroke), 1.1f),
    DRILL_TYPE(c22.i.b(R.string.activity_details_drill_type), 1.1f),
    MIN_STROKES(c22.i.b(R.string.activity_details_min_strokes), 1.4f),
    AVG_STROKES(c22.i.b(R.string.activity_details_avg_strokes_label), 1.7f),
    TOTAL_STROKES(c22.i.b(R.string.activity_details_total_strokes), 1.5f),
    LENGTHS(c22.i.b(R.string.lbl_lengths), 0.9f),
    MIN_TEMPERATURE(c22.i.b(R.string.activity_details_min_temperature), 1.5f),
    MAX_TEMPERATURE(c22.i.b(R.string.activity_details_max_temperature), 1.5f),
    AVG_TEMPERATURE(c22.i.b(R.string.activity_details_avg_temperature), 1.5f),
    CALORIES(c22.i.b(R.string.lbl_calories), 0.9f),
    AVG_STROKE_RATE(c22.i.b(R.string.activity_details_avg_stroke_rate), 1.5f),
    MAX_STROKE_RATE(c22.i.b(R.string.activity_details_max_stroke_rate), 1.7f),
    AVG_DISTANCE_STROKE(c22.i.b(R.string.activity_details_avg_distance_per_stroke), 1.9f),
    FLOORS(c22.i.b(R.string.floors_title), 1.0f),
    AVG_NAUTICAL_STROKE_RATE(c22.i.b(R.string.activity_details_avg_stroke_rate), 1.5f),
    MAX_NAUTICAL_STROKE_RATE(c22.i.b(R.string.activity_details_max_stroke_rate), 1.7f),
    DIVE_NUMBER(c22.i.b(R.string.lbl_dive_lap), 0.8f),
    DIVE_NUMBER_LANDSCAPE(c22.i.b(R.string.lbl_dive_lap), 1.0f),
    BOTTOM_TIME(c22.i.b(R.string.activity_details_bottom_time), 1.2f),
    MAX_DEPTH(c22.i.b(R.string.lbl_max_depth), 1.1f),
    SURFACE_INTERVAL(c22.i.b(R.string.activity_details_session_surface_time), 1.5f),
    MIN_WATER_TEMP(c22.i.b(R.string.activity_details_min_water_temperature), 1.8f),
    ENTRY_LOCATION(c22.i.b(R.string.activity_details_dive_entry_location), 2.0f),
    FLOW(c22.i.b(R.string.lbl_flow_chart_title), 1.0f),
    GRIT(c22.i.b(R.string.lbl_grit_chart_title), 1.0f),
    JUMP_COUNT(c22.i.b(R.string.mtb_jump_metrics_title), 1.0f),
    TARGET_TYPE(c22.i.b(R.string.common_type), 1.3f),
    AVG_GCT(c22.i.b(R.string.activities_avg_gct), 1.0f),
    AVG_GCT_BAL(c22.i.b(R.string.activities_gct_balance), 1.5f),
    AVG_VERT_OSC(c22.i.b(R.string.activities_avg_vertical_oscillation), 2.2f),
    AVG_VERT_OSC_RATIO(c22.i.b(R.string.activities_avg_vertical_ratio), 1.7f),
    DIFFICULTY(c22.i.b(R.string.common_difficulty), 1.0f),
    FALLS(c22.i.b(R.string.lbl_falls), 0.7f),
    STATUS(c22.i.b(R.string.lbl_status), 1.5f),
    SONG(c22.i.b(R.string.song_singular), 1.0f),
    AVG_TEMPO(c22.i.b(R.string.avg_tempo), 1.7f),
    REPS(c22.i.b(R.string.workout_step_reps), 1.0f),
    JUMP_ROPE_SPEED(c22.i.b(R.string.lbl_jump_rope_speed), 1.0f),
    SURFACE_TYPE_UNPAVED_PERCENTAGE(c22.i.b(R.string.unpaved), 1.1f),
    SURFACE_TYPE_PAVED_PERCENTAGE(c22.i.b(R.string.paved), 1.0f);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f120142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f120143b;

    static {
        x0.f23314a.getClass();
    }

    a(c3 c3Var, float f14) {
        this.f120142a = c3Var;
        this.f120143b = f14;
    }

    @Override // mq.l
    public final String a(Context context) {
        return dh.b.A(context, this.f120142a);
    }

    @Override // mq.l
    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF120143b() {
        return this.f120143b;
    }

    @Override // mq.l
    public final int c() {
        return ordinal();
    }

    @Override // mq.l
    public final String d(Context context, sr.b bVar) {
        ls.e eVarA = b.a(this);
        return eVarA != null ? bVar.j(eVarA) : dh.b.A(context, this.f120142a);
    }
}
