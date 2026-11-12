package uq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luq/i;", "", "", "titleResId", "", "weight", "<init>", "(Ljava/lang/String;IIF)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum i {
    LAP(R.string.lbl_lap, 0.7f),
    SPLIT(R.string.lbl_split, 0.7f),
    SPLIT_INDEX_OR_REST(R.string.lbl_split, 0.7f),
    SPLIT_OBSTACLE_RUN(R.string.lbl_split, 1.4f),
    SPLIT_ASCENT_DESCENT(R.string.lbl_split, 0.9f),
    RUN_ASCENT_DESCENT(R.string.lbl_runs, 0.9f),
    ROUTE(R.string.lbl_route, 0.7f),
    WAVE(R.string.activities_wave_label, 0.7f),
    WAKESPORTS_RUN(R.string.lbl_wakesports_run, 0.7f),
    RUNS(R.string.lbl_runs, 0.7f),
    RUN(R.string.lbl_windsurf_run, 0.7f),
    SKI_RUN(R.string.activities_ski_run, 0.7f),
    INTERVALS(R.string.lbl_intervals, 1.4f),
    POOL_APNEA_DISCIPLINE(R.string.lbl_discipline, 1.4f),
    DIVE_NUMBER(R.string.lbl_dive_lap, 0.8f),
    DURATION(R.string.lbl_time, 1.0f),
    SURF_DURATION(R.string.activity_details_surf_time, 1.4f),
    WAKESPORTS_ACTIVE_TIME(R.string.lbl_wakesports_active_time, 1.4f),
    DISTANCE(R.string.lbl_distance, 1.0f),
    POOL_APNEA_DISTANCE(R.string.lbl_distance, 1.0f),
    DISTANCE_SHORT(R.string.distance_short, 1.0f),
    TOTAL_TIME(R.string.activity_stats_details_total_time_label, 1.0f),
    CUMULATIVE_TIME(R.string.LapList_cumulative_time_label, 1.3f),
    START_TIME(R.string.lbl_start_time, 1.3f),
    STOP_TIME(R.string.lbl_split_stop_time, 1.3f),
    MOVING_TIME(R.string.activity_details_moving_time, 1.0f),
    RUN_MOVING_TIME(R.string.activities_total_ski_run_moving_time, 1.3f),
    IDLE_TIME(R.string.activities_idle_time, 1.3f),
    TIME(R.string.lbl_time, 1.3f),
    BOTTOM_TIME(R.string.activity_details_bottom_time, 1.2f),
    SURFACE_INTERVAL(R.string.activity_details_session_surface_time, 1.5f),
    AVG_COMPARISON_PACE(R.string.lbl_avg_pace, 1.2f),
    GOAL_PACE(R.string.lbl_course_goal_pace, 1.2f),
    AVG_PACE(R.string.lbl_avg_pace, 1.2f),
    AVG_GAP(R.string.lbl_avg_gap, 1.2f),
    AVG_MOVING_PACE(R.string.activity_details_average_moving_pace, 1.3f),
    BEST_PACE(R.string.activity_details_best_pace, 1.2f),
    MIN_HR(R.string.activity_details_min_heart_rate, 1.7f),
    AVG_HR(R.string.activity_details_average_heart_rate, 1.6f),
    MAX_HR(R.string.activity_details_max_heart_rate, 1.7f),
    AVG_HR_SHORT(R.string.activities_average_hr_lbl_short, 1.2f),
    MAX_HR_SHORT(R.string.lbl_max_hr, 1.2f),
    AVG_SPEED(R.string.lbl_avg_speed, 1.5f),
    MAX_SPEED(R.string.activity_details_max_speed, 1.5f),
    AVG_SPEED_NAUTICAL(R.string.lbl_avg_speed, 1.5f),
    MAX_SPEED_NAUTICAL(R.string.activity_details_max_speed, 1.5f),
    AVG_SPEED_USER_UNIT(R.string.lbl_avg_speed, 1.5f),
    MAX_SPEED_USER_UNIT(R.string.activity_details_max_speed, 1.5f),
    AVG_MOVING_SPEED(R.string.activity_details_average_moving_speed, 1.5f),
    AVG_NAUT_SOG(R.string.activity_details_average_nautical_sog, 1.5f),
    MAX_NAUT_SOG(R.string.activity_details_max_nautical_sog, 1.5f),
    AVG_POOL_VELOCITY(R.string.lbl_avg_velocity, 1.5f),
    AVG_DESCENT_SPEED(R.string.lbl_avg_descent_speed, 1.5f),
    ELEVATION_GAIN(R.string.lbl_total_ascent, 1.5f),
    ELEVATION_LOSS(R.string.lbl_total_descent, 1.5f),
    ASCENT_ELEVATION_GAIN(R.string.activities_ascent_label, 1.0f),
    DESCENT_ELEVATION_LOSS(R.string.activities_descent_label, 1.0f),
    MAX_DEPTH(R.string.lbl_max_depth, 1.1f),
    NORMALIZED_POWER(R.string.activity_details_normalized_power, 1.6f),
    LR_BALANCE(R.string.lbl_lr_balance, 1.7f),
    AVG_POWER(R.string.activity_details_average_power, 1.0f),
    MAX_POWER(R.string.activity_details_max_power, 1.0f),
    WEIGHT_AVG_POWER(R.string.activity_details_average_power_by_weight, 1.0f),
    WEIGHT_MAX_POWER(R.string.activity_details_max_power_by_weight, 1.0f),
    CYCLING_AVG_POWER(R.string.activity_details_average_power, 1.0f),
    CYCLING_GOAL_POWER(R.string.lbl_goal, 0.8f),
    AVG_BIKE_FORCE(R.string.lbl_avg_force, 1.0f),
    MAX_BIKE_FORCE(R.string.lbl_max_force, 1.0f),
    NORMALIZED_FORCE(R.string.lbl_normalized_force, 1.6f),
    AVG_RUN_CADENCE(R.string.activity_details_average_run_cadence, 1.7f),
    MAX_RUN_CADENCE(R.string.activity_details_max_run_cadence, 1.5f),
    AVG_BIKE_CADENCE(R.string.activity_details_average_cadence, 1.0f),
    MAX_BIKE_CADENCE(R.string.activity_details_max_cadence, 1.0f),
    AVG_STEP_SPEED_LOSS(R.string.lbl_avg_step_speed_loss, 2.1f),
    AVG_STEP_SPEED_LOSS_PERCENT(R.string.lbl_avg_step_speed_loss_percent, 2.3f),
    AVG_STRIDE_LENGTH(R.string.activity_details_average_stride_length, 1.6f),
    DIFFICULTY(R.string.common_difficulty, 1.3f),
    MAX_PISTE_DIFFICULTY(R.string.lbl_max_difficulty, 1.5f),
    FALLS(R.string.lbl_falls, 0.9f),
    STATUS(R.string.lbl_status, 1.3f),
    MIN_TEMPERATURE(R.string.activity_details_min_temperature, 1.5f),
    MAX_TEMPERATURE(R.string.activity_details_max_temperature, 1.5f),
    AVG_TEMPERATURE(R.string.activity_details_avg_temperature, 1.5f),
    MIN_WATER_TEMPERATURE(R.string.activity_details_min_water_temperature, 1.8f),
    ENTRY_LOCATION(R.string.activity_details_dive_entry_location, 2.0f),
    CALORIES(R.string.lbl_calories, 0.9f),
    SPEED_10S_NAUTICAL(R.string.lbl_10_second_speed, 1.5f),
    MAX_SPEED_10S_NAUTICAL(R.string.lbl_10_second_max_speed, 1.5f),
    MAX_SPEED_2S_NAUTICAL(R.string.lbl_2_second_max_speed, 1.5f),
    MAX_SPEED_10S(R.string.lbl_10_second_max_speed, 1.5f),
    MAX_SPEED_2S(R.string.lbl_2_second_max_speed, 1.5f),
    MATCH(R.string.activities_gaming_type_match, 1.5f),
    OUTCOME(R.string.lbl_outcome, 1.5f),
    PLACEMENT(R.string.activities_gaming_type_placement, 1.5f),
    AVG_STRESS(R.string.lbl_stress_avg_short, 1.5f),
    MAX_STRESS(R.string.lbl_max_stress, 1.5f),
    AVG_GCT(R.string.activities_avg_gct, 1.0f),
    AVG_GCT_BAL(R.string.activities_gct_balance, 1.5f),
    AVG_VERT_OSC(R.string.activities_avg_vertical_oscillation, 2.2f),
    AVG_VERT_OSC_RATIO(R.string.activities_avg_vertical_ratio, 1.7f),
    CIQ_COLUMN(0, 1.3f),
    PACK_WEIGHT(R.string.lbl_pack_weight, 1.3f),
    FLOW(R.string.lbl_flow_chart_title, 1.0f),
    GRIT(R.string.lbl_grit_chart_title, 1.0f),
    JUMP_COUNT(R.string.mtb_jump_metrics_title, 1.0f);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f172257b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172258a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.AVG_COMPARISON_PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.AVG_PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.AVG_GAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.AVG_MOVING_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.AVG_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.AVG_HR_SHORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.AVG_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.AVG_SPEED_NAUTICAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.AVG_SPEED_USER_UNIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.AVG_MOVING_SPEED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[i.AVG_NAUT_SOG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[i.AVG_POOL_VELOCITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[i.AVG_DESCENT_SPEED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[i.AVG_POWER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[i.WEIGHT_AVG_POWER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[i.CYCLING_AVG_POWER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[i.AVG_BIKE_FORCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[i.AVG_RUN_CADENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[i.AVG_BIKE_CADENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[i.AVG_STEP_SPEED_LOSS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[i.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[i.AVG_STRIDE_LENGTH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[i.AVG_TEMPERATURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[i.AVG_STRESS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[i.AVG_GCT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[i.AVG_GCT_BAL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[i.AVG_VERT_OSC.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[i.AVG_VERT_OSC_RATIO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[i.MIN_HR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[i.MIN_TEMPERATURE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[i.MIN_WATER_TEMPERATURE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[i.MAX_HR.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[i.MAX_HR_SHORT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[i.MAX_SPEED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[i.MAX_SPEED_NAUTICAL.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[i.MAX_SPEED_USER_UNIT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[i.MAX_NAUT_SOG.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[i.MAX_POWER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[i.WEIGHT_MAX_POWER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[i.MAX_BIKE_FORCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[i.MAX_RUN_CADENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[i.MAX_BIKE_CADENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[i.MAX_PISTE_DIFFICULTY.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[i.MAX_TEMPERATURE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[i.MAX_STRESS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[i.MAX_DEPTH.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[i.MAX_SPEED_10S_NAUTICAL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[i.MAX_SPEED_2S_NAUTICAL.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[i.MAX_SPEED_10S.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[i.MAX_SPEED_2S.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            f172258a = iArr;
        }
    }

    i(int i14, float f14) {
        this.f172256a = i14;
        this.f172257b = f14;
        ordinal();
    }

    public final String a(Context context) {
        context.getClass();
        String string = context.getString(this.f172256a);
        string.getClass();
        return string;
    }
}
