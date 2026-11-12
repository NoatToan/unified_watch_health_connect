package hv1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v165 hv1.k[], still in use, count: 1, list:
  (r0v165 hv1.k[]) from 0x0af5: CONSTRUCTOR (r0v165 hv1.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhv1/k;", "", "", "phraseResourceID", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_REST(R.string.lha_workout_phrase_running_history_rest),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_RUNNING_HISTORY(R.string.lha_workout_phrase_poorest_sleep_running_history),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_REST(R.string.lha_workout_phrase_poorest_sleep_running_history),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_RECOVERY(R.string.lha_workout_phrase_poorest_sleep_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_SLEEP_BASE(R.string.lha_workout_phrase_poor_sleep_base),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RECOVERY_TIME_BASE(R.string.lha_workout_phrase_high_recovery_time_base),
    /* JADX INFO: Fake field, exist only in values array */
    OVERREACHING_BASE(R.string.lha_workout_phrase_overreaching_base),
    /* JADX INFO: Fake field, exist only in values array */
    OVERREACHING_REST(R.string.lha_workout_phrase_overreaching_rest),
    /* JADX INFO: Fake field, exist only in values array */
    OVERREACHING_RECOVERY(R.string.lha_workout_phrase_overreaching_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    EASY_WEEK_LOAD_REST(R.string.lha_workout_phrase_easy_week_load_rest),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_WEEK_LOAD_REST(R.string.lha_workout_phrase_easy_week_load_rest),
    /* JADX INFO: Fake field, exist only in values array */
    HARD_WEEK_LOAD_REST(R.string.lha_workout_phrase_hard_week_load_rest),
    /* JADX INFO: Fake field, exist only in values array */
    EASY_WEEK_LOAD_RECOVERY(R.string.lha_workout_phrase_easy_week_load_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_WEEK_LOAD_RECOVERY(R.string.lha_workout_phrase_easy_week_load_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    HARD_WEEK_LOAD_RECOVERY(R.string.lha_workout_phrase_overreaching_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    EASY_WEEK_LOAD_BASE(R.string.lha_workout_phrase_base),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_WEEK_LOAD_BASE(R.string.lha_workout_phrase_base),
    /* JADX INFO: Fake field, exist only in values array */
    HARD_WEEK_LOAD_BASE(R.string.lha_workout_phrase_base),
    /* JADX INFO: Fake field, exist only in values array */
    TODAY_LOAD_REST(R.string.lha_workout_phrase_today_load_rest),
    /* JADX INFO: Fake field, exist only in values array */
    TODAY_LOAD_RECOVERY(R.string.lha_workout_phrase_today_load_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    AEROBIC_HIGH_SHORTAGE(R.string.lha_workout_phrase_aerobic_high_shortage),
    /* JADX INFO: Fake field, exist only in values array */
    ANAEROBIC_CAPACITY(R.string.lha_workout_phrase_anaerobic_capacity),
    /* JADX INFO: Fake field, exist only in values array */
    ANAEROBIC_SPEED(R.string.lha_workout_phrase_anaerobic_speed),
    /* JADX INFO: Fake field, exist only in values array */
    AEROBIC_LOW_SHORTAGE_BASE(R.string.lha_workout_phrase_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_SHORTENED_BASE(R.string.lha_workout_phrase_running_history_shortened_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_REPLACED_BASE(R.string.lha_workout_phrase_running_history_yesterday_base),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINING_HISTORY_REPLACED_BASE(R.string.lha_workout_phrase_running_history_yesterday_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_DOWNGRADED_TEMPO(R.string.lha_workout_phrase_running_history_downgraded_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_DOWNGRADED_ANAEROBIC_CAPACITY(R.string.lha_workout_phrase_running_history_downgraded_anaerobic_capacity),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_WTL_SHORTENED_RUN_BASE(R.string.lha_workout_phrase_low_wtl_shortened_run_base),
    /* JADX INFO: Fake field, exist only in values array */
    LACTATE_THRESHOLD(R.string.lha_workout_phrase_lactate_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    TEMPO(R.string.lha_workout_phrase_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    VO2MAX(R.string.lha_workout_phrase_vo2max),
    /* JADX INFO: Fake field, exist only in values array */
    BASE(R.string.lha_workout_phrase_base),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERY(R.string.lha_workout_phrase_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    REST(R.string.lha_workout_phrase_rest),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_LOAD_REST(R.string.lha_workout_phrase_poorest_sleep_running_history),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_SLEEP_LOAD_BASE(R.string.lha_workout_phrase_poor_sleep_load_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_RECOVERY(R.string.lha_workout_phrase_running_history_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_RUNNING_HISTORY_RECOVERY(R.string.lha_workout_phrase_poorest_sleep_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    POOREST_SLEEP_LOAD_RECOVERY(R.string.lha_workout_phrase_poorest_sleep_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    NO_HISTORY_BASE(R.string.lha_workout_phrase_no_history_base),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_SLEEP_RUNNING_HISTORY_RECOVERY(R.string.lha_workout_phrase_poorest_sleep_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_SLEEP_RUNNING_HISTORY_REST(R.string.lha_workout_phrase_poorest_sleep_running_history),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RECOVERY_TIME_RUNNING_HISTORY_RECOVERY(R.string.lha_workout_phrase_high_recovery_time_running_history_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RECOVERY_TIME_RUNNING_HISTORY_REST(R.string.lha_workout_phrase_high_recovery_time_running_history_rest),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_YESTERDAY_BASE(R.string.lha_workout_phrase_running_history_yesterday_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_EASY_BASE(R.string.lha_workout_phrase_running_history_easy_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_DOWNGRADED_LACTATE_THRESHOLD(R.string.lha_workout_phrase_running_history_downgraded_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_DOWNGRADED_VO2MAX(R.string.lha_workout_phrase_running_history_downgraded_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_DOWNGRADED_SPEED(R.string.lha_workout_phrase_running_history_downgraded_anaerobic_capacity),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_HISTORY_TWO_PREVIOUS_DAYS_RECOVERY(R.string.lha_workout_phrase_overreaching_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    FORCED_REST(R.string.lha_workout_phrase_forced_rest),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_WORKOUT(R.string.lha_workout_phrase_long_workout),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_BASE(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_TEMPO(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_LACTATE_THRESHOLD(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_VO2MAX(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_ANAEROBIC_CAPACITY(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    REST_POSTPONED_SPEED(R.string.lha_workout_phrase_rest_postponed_base),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_EVENT_REST(R.string.lha_workout_phrase_after_event_rest),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_DAY(R.string.lha_workout_phrase_event_day),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_ANAEROBIC_SPEED(R.string.lha_workout_phrase_before_event_anaerobic_speed),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_REST(R.string.lha_workout_phrase_before_event_rest),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_LACTATE_THRESHOLD(R.string.lha_workout_phrase_before_event_lactate_threshold),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_BASE(R.string.lha_workout_phrase_before_event_base),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_RECOVERY(R.string.lha_workout_phrase_before_event_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    TRAVEL_DAY_REST(R.string.lha_workout_phrase_travel_day_rest),
    /* JADX INFO: Fake field, exist only in values array */
    JET_LAG_MODERATE_BASE(R.string.lha_workout_phrase_jet_lag_moderate_base),
    /* JADX INFO: Fake field, exist only in values array */
    JET_LAG_SIGNIFICANT_BASE(R.string.lha_workout_phrase_jet_lag_significant_base),
    /* JADX INFO: Fake field, exist only in values array */
    JET_LAG_SEVERE_BASE(R.string.lha_workout_phrase_jet_lag_severe_base),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINING_READINESS_REST(R.string.lha_workout_phrase_training_readiness_rest),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINING_READINESS_BASE(R.string.lha_workout_phrase_training_readiness_rest),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_EVENT_TEMPO(R.string.lha_workout_phrase_before_event_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_CIRCUIT_1_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_CIRCUIT_2_1_RUNNING_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_CIRCUIT_2_2_CYCLING_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_STABILITY_3_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_stability_3_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_STABILITY_4_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_stability_4_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_STABILITY_5_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_stability_3_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_CORE_STABILITY_6_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_core_stability_6_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RUN_ACTIVATION_7_1_RUNNING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RIDE_ACTIVATION_7_2_CYCLING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RUN_ACTIVATION_8_1_RUNNING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RIDE_ACTIVATION_8_2_CYCLING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RUN_ACTIVATION_9_1_RUNNING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_PRE_RIDE_ACTIVATION_9_2_CYCLING_BODYWEIGHT(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_10_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_11_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_12_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_BASE_BUILDER_13_GENERIC_GYM(R.string.lha_workout_phrase_strength_base_builder_13_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_BASE_BUILDER_14_GENERIC_GYM(R.string.lha_workout_phrase_strength_base_builder_13_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_15_1_RUNNING_GYM(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_15_2_CYCLING_GYM(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_16_GENERIC_GYM(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_17_GENERIC_GYM(R.string.lha_workout_phrase_strength_power_builder_17_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_18_1_RUNNING_GYM(R.string.lha_workout_phrase_strength_power_builder_18_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_18_2_CYCLING_GYM(R.string.lha_workout_phrase_strength_power_builder_18_2_cycling_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_19_1_RUNNING_GYM(R.string.lha_workout_phrase_strength_power_builder_19_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_19_2_CYCLING_GYM(R.string.lha_workout_phrase_strength_power_builder_19_2_cycling_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_20_GENERIC_GYM(R.string.lha_workout_phrase_strength_power_builder_20_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POWER_BUILDER_21_GENERIC_GYM(R.string.lha_workout_phrase_strength_power_builder_21_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POSTURE_BUILDER_22_GENERIC_GYM(R.string.lha_workout_phrase_strength_posture_builder_22_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POST_RUN_POWER_23_1_RUNNING_GYM(R.string.lha_workout_phrase_strength_post_run_power_23_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POST_RIDE_POWER_23_2_CYCLING_GYM(R.string.lha_workout_phrase_strength_post_run_power_23_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POST_RUN_POWER_24_1_RUNNING_GYM(R.string.lha_workout_phrase_strength_post_run_power_24_1_running_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_POST_RIDE_POWER_24_2_CYCLING_GYM(R.string.lha_workout_phrase_strength_post_ride_power_24_2_cycling_gym),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_TRAVEL_DAY_SHORT(R.string.lha_workout_phrase_walk_travel_day_short),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_HIGH_RECOVERY_TIME_SHORT(R.string.lha_workout_phrase_walk_high_recovery_time_short),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_HIGH_RECOVERY_TIME_BRISK(R.string.lha_workout_phrase_walk_high_recovery_time_brisk),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_POOR_SLEEP_SCORE_SHORT(R.string.lha_workout_phrase_walk_poor_sleep_score_short),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_POOR_SLEEP_SCORE_BRISK(R.string.lha_workout_phrase_walk_poor_sleep_score_brisk),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_VERY_LOW_BODY_BATTERY_SHORT(R.string.lha_workout_phrase_walk_very_low_body_battery_short),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_VERY_LOW_BODY_BATTERY_BRISK(R.string.lha_workout_phrase_walk_very_low_body_battery_brisk),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_WEEKLY_IM_TARGET_REACHED_SHORT(R.string.lha_workout_phrase_walk_weekly_im_target_reached_short),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_WEEKLY_IM_TARGET_REACHED_BRISK(R.string.lha_workout_phrase_walk_weekly_im_target_reached_brisk),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SHORT_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_short_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SHORT_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_short_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_SHORT_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_short_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_SHORT_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_short_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_MEDIUM_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_medium_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_MEDIUM_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_medium_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_LONG_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_long_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_LONG_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_long_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_STEADY_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_steady_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_BRISK_STEADY_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_steady_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_SHORT_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_short_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_SHORT_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_short_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_MEDIUM_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_medium_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_MEDIUM_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_medium_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_LONG_INTERVALS_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_long_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_LONG_INTERVALS_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_long_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_STEADY_1(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_steady_1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_SHORTER_WALK_SPEED_STEADY_2(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_steady_2),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_BRISK_SHORT_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_short_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_BRISK_MEDIUM_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_medium_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_BRISK_LONG_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_long_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_BRISK_STEADY(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_steady),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_SPEED_SHORT_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_short_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_SPEED_MEDIUM_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_medium_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_SPEED_LONG_INTERVALS(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_long_intervals),
    /* JADX INFO: Fake field, exist only in values array */
    WALK_GENERIC_LONGER_WALK_SPEED_STEADY(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_steady),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_1_EASY_EFFORT_1(R.string.lha_workout_phrase_swim_1_easy_effort_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_2_EASY_EFFORT_2(R.string.lha_workout_phrase_swim_2_easy_effort_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_3_ENDURANCE_BUILDER_1(R.string.lha_workout_phrase_swim_3_endurance_builder_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_4_ENDURANCE_BUILDER_2(R.string.lha_workout_phrase_swim_4_endurance_builder_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_5_ENDURANCE_BUILDER_3(R.string.lha_workout_phrase_swim_5_endurance_builder_3),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_6_TECHNIQUE_FOCUS_1(R.string.lha_workout_phrase_swim_6_technique_developer_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_7_TECHNIQUE_FOCUS_2(R.string.lha_workout_phrase_swim_7_technique_developer_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_8_TECHNIQUE_FOCUS_3(R.string.lha_workout_phrase_swim_8_technique_developer_3),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_9_TWO_HUNDREDS(R.string.lha_workout_phrase_swim_9_two_hundreds),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_10_SWIM_AND_PULL_1(R.string.lha_workout_phrase_swim_10_swim_and_pull_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_11_SWIM_AND_PULL_2(R.string.lha_workout_phrase_swim_11_swim_and_pull_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_12_MIXED_INTERVALS_1(R.string.lha_workout_phrase_swim_12_mixed_intervals_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_13_MIXED_INTERVALS_2(R.string.lha_workout_phrase_swim_13_mixed_intervals_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_14_CRUISING_1(R.string.lha_workout_phrase_swim_14_cruising_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_15_CRUISING_2(R.string.lha_workout_phrase_swim_15_cruising_2),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_16_PERFORMANCE_BOOSTER_1(R.string.lha_workout_phrase_swim_16_performance_booster_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_17_PERFORMANCE_BOOSTER_2(R.string.lha_workout_phrase_swim_16_performance_booster_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_18_SPEED_PLAY_1(R.string.lha_workout_phrase_swim_18_speed_play_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_19_SPEED_PLAY_2(R.string.lha_workout_phrase_swim_18_speed_play_1),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_BEFORE_EVENT(R.string.lha_workout_phrase_swim_before_event),
    /* JADX INFO: Fake field, exist only in values array */
    BRICK_STEADY_PACE_MEDIUM_BASE(R.string.lha_workout_phrase_brick_steady_pace_medium_base),
    /* JADX INFO: Fake field, exist only in values array */
    BRICK_STEADY_PACE_HARD_BASE(R.string.lha_workout_phrase_brick_steady_pace_hard_base),
    /* JADX INFO: Fake field, exist only in values array */
    BRICK_STEADY_PACE_TEMPO(R.string.lha_workout_phrase_brick_steady_pace_tempo),
    /* JADX INFO: Fake field, exist only in values array */
    BRICK_BEFORE_EVENT_INTERVAL_BASE(R.string.lha_workout_phrase_brick_before_event_interval_base),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_TOLERANCE_HIGH_IMPACT_REST(R.string.lha_workout_phrase_running_tolerance_high_impact_rest),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_TOLERANCE_HIGH_IMPACT_RECOVERY(R.string.lha_workout_phrase_running_tolerance_high_impact_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_TOLERANCE_ABOVE_TOLERANCE_REST(R.string.lha_workout_phrase_running_tolerance_above_tolerance_rest),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING_TOLERANCE_ABOVE_TOLERANCE_RECOVERY(R.string.lha_workout_phrase_running_tolerance_above_tolerance_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_25_GENERIC_GYM(R.string.lha_workout_phrase_strength_builder_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_MUSCLE_BUILDER_26_GENERIC_GYM(R.string.lha_workout_phrase_muscle_builder_generic_gym),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_27_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_28_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_29_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_TOTAL_BODY_CIRCUIT_30_GENERIC_BODYWEIGHT(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_33_GENERIC_GYM(R.string.lha_workout_phrase_strength_builder_generic_gym2),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_STRENGTH_BUILDER_34_GENERIC_GYM(R.string.lha_workout_phrase_strength_builder_generic_gym2),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_STRENGTH_35_GENERIC_DUMBBELL(R.string.lha_workout_phrase_strength_builder_generic_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_STRENGTH_36_GENERIC_DUMBBELL(R.string.lha_workout_phrase_strength_builder_generic_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_CIRCUIT_37_GENERIC_DUMBBELL(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_CIRCUIT_38_GENERIC_DUMBBELL(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_CIRCUIT_39_GENERIC_DUMBBELL(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    STRENGTH_DUMBBELL_POWER_40_GENERIC_DUMBBELL(R.string.lha_workout_phrase_dumbbell_power_generic_dumbbell);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f85893b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w13.c f85895d = new w13.c(new k[]{new k(R.string.lha_workout_phrase_running_history_rest), new k(R.string.lha_workout_phrase_poorest_sleep_running_history), new k(R.string.lha_workout_phrase_poorest_sleep_running_history), new k(R.string.lha_workout_phrase_poorest_sleep_recovery), new k(R.string.lha_workout_phrase_poor_sleep_base), new k(R.string.lha_workout_phrase_high_recovery_time_base), new k(R.string.lha_workout_phrase_overreaching_base), new k(R.string.lha_workout_phrase_overreaching_rest), new k(R.string.lha_workout_phrase_overreaching_recovery), new k(R.string.lha_workout_phrase_easy_week_load_rest), new k(R.string.lha_workout_phrase_easy_week_load_rest), new k(R.string.lha_workout_phrase_hard_week_load_rest), new k(R.string.lha_workout_phrase_easy_week_load_recovery), new k(R.string.lha_workout_phrase_easy_week_load_recovery), new k(R.string.lha_workout_phrase_overreaching_recovery), new k(R.string.lha_workout_phrase_base), new k(R.string.lha_workout_phrase_base), new k(R.string.lha_workout_phrase_base), new k(R.string.lha_workout_phrase_today_load_rest), new k(R.string.lha_workout_phrase_today_load_recovery), new k(R.string.lha_workout_phrase_aerobic_high_shortage), new k(R.string.lha_workout_phrase_anaerobic_capacity), new k(R.string.lha_workout_phrase_anaerobic_speed), new k(R.string.lha_workout_phrase_base), new k(R.string.lha_workout_phrase_running_history_shortened_base), new k(R.string.lha_workout_phrase_running_history_yesterday_base), new k(R.string.lha_workout_phrase_running_history_yesterday_base), new k(R.string.lha_workout_phrase_running_history_downgraded_tempo), new k(R.string.lha_workout_phrase_running_history_downgraded_anaerobic_capacity), new k(R.string.lha_workout_phrase_low_wtl_shortened_run_base), new k(R.string.lha_workout_phrase_lactate_threshold), new k(R.string.lha_workout_phrase_tempo), new k(R.string.lha_workout_phrase_vo2max), new k(R.string.lha_workout_phrase_base), new k(R.string.lha_workout_phrase_recovery), new k(R.string.lha_workout_phrase_rest), new k(R.string.lha_workout_phrase_poorest_sleep_running_history), new k(R.string.lha_workout_phrase_poor_sleep_load_base), new k(R.string.lha_workout_phrase_running_history_recovery), new k(R.string.lha_workout_phrase_poorest_sleep_recovery), new k(R.string.lha_workout_phrase_poorest_sleep_recovery), new k(R.string.lha_workout_phrase_no_history_base), new k(R.string.lha_workout_phrase_poorest_sleep_recovery), new k(R.string.lha_workout_phrase_poorest_sleep_running_history), new k(R.string.lha_workout_phrase_high_recovery_time_running_history_recovery), new k(R.string.lha_workout_phrase_high_recovery_time_running_history_rest), new k(R.string.lha_workout_phrase_running_history_yesterday_base), new k(R.string.lha_workout_phrase_running_history_easy_base), new k(R.string.lha_workout_phrase_running_history_downgraded_tempo), new k(R.string.lha_workout_phrase_running_history_downgraded_tempo), new k(R.string.lha_workout_phrase_running_history_downgraded_anaerobic_capacity), new k(R.string.lha_workout_phrase_overreaching_recovery), new k(R.string.lha_workout_phrase_forced_rest), new k(R.string.lha_workout_phrase_long_workout), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_rest_postponed_base), new k(R.string.lha_workout_phrase_after_event_rest), new k(R.string.lha_workout_phrase_event_day), new k(R.string.lha_workout_phrase_before_event_anaerobic_speed), new k(R.string.lha_workout_phrase_before_event_rest), new k(R.string.lha_workout_phrase_before_event_lactate_threshold), new k(R.string.lha_workout_phrase_before_event_base), new k(R.string.lha_workout_phrase_before_event_recovery), new k(R.string.lha_workout_phrase_travel_day_rest), new k(R.string.lha_workout_phrase_jet_lag_moderate_base), new k(R.string.lha_workout_phrase_jet_lag_significant_base), new k(R.string.lha_workout_phrase_jet_lag_severe_base), new k(R.string.lha_workout_phrase_training_readiness_rest), new k(R.string.lha_workout_phrase_training_readiness_rest), new k(R.string.lha_workout_phrase_before_event_tempo), new k(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_circuit_1_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_stability_3_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_stability_4_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_stability_3_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_core_stability_6_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_run_activation_7_1_running_bodyweight), new k(R.string.lha_workout_phrase_strength_pre_ride_activation_7_2_cycling_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_10_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_base_builder_13_generic_gym), new k(R.string.lha_workout_phrase_strength_base_builder_13_generic_gym), new k(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym), new k(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym), new k(R.string.lha_workout_phrase_strength_strength_builder_15_1_running_gym), new k(R.string.lha_workout_phrase_strength_power_builder_17_generic_gym), new k(R.string.lha_workout_phrase_strength_power_builder_18_1_running_gym), new k(R.string.lha_workout_phrase_strength_power_builder_18_2_cycling_gym), new k(R.string.lha_workout_phrase_strength_power_builder_19_1_running_gym), new k(R.string.lha_workout_phrase_strength_power_builder_19_2_cycling_gym), new k(R.string.lha_workout_phrase_strength_power_builder_20_generic_gym), new k(R.string.lha_workout_phrase_strength_power_builder_21_generic_gym), new k(R.string.lha_workout_phrase_strength_posture_builder_22_generic_gym), new k(R.string.lha_workout_phrase_strength_post_run_power_23_1_running_gym), new k(R.string.lha_workout_phrase_strength_post_run_power_23_1_running_gym), new k(R.string.lha_workout_phrase_strength_post_run_power_24_1_running_gym), new k(R.string.lha_workout_phrase_strength_post_ride_power_24_2_cycling_gym), new k(R.string.lha_workout_phrase_walk_travel_day_short), new k(R.string.lha_workout_phrase_walk_high_recovery_time_short), new k(R.string.lha_workout_phrase_walk_high_recovery_time_brisk), new k(R.string.lha_workout_phrase_walk_poor_sleep_score_short), new k(R.string.lha_workout_phrase_walk_poor_sleep_score_brisk), new k(R.string.lha_workout_phrase_walk_very_low_body_battery_short), new k(R.string.lha_workout_phrase_walk_very_low_body_battery_brisk), new k(R.string.lha_workout_phrase_walk_weekly_im_target_reached_short), new k(R.string.lha_workout_phrase_walk_weekly_im_target_reached_brisk), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_short_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_short_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_short_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_short_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_medium_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_medium_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_long_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_long_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_steady_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_brisk_steady_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_short_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_short_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_medium_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_medium_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_long_intervals_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_long_intervals_2), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_steady_1), new k(R.string.lha_workout_phrase_walk_generic_shorter_walk_speed_steady_2), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_short_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_medium_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_long_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_brisk_steady), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_short_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_medium_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_long_intervals), new k(R.string.lha_workout_phrase_walk_generic_longer_walk_speed_steady), new k(R.string.lha_workout_phrase_swim_1_easy_effort_1), new k(R.string.lha_workout_phrase_swim_2_easy_effort_2), new k(R.string.lha_workout_phrase_swim_3_endurance_builder_1), new k(R.string.lha_workout_phrase_swim_4_endurance_builder_2), new k(R.string.lha_workout_phrase_swim_5_endurance_builder_3), new k(R.string.lha_workout_phrase_swim_6_technique_developer_1), new k(R.string.lha_workout_phrase_swim_7_technique_developer_2), new k(R.string.lha_workout_phrase_swim_8_technique_developer_3), new k(R.string.lha_workout_phrase_swim_9_two_hundreds), new k(R.string.lha_workout_phrase_swim_10_swim_and_pull_1), new k(R.string.lha_workout_phrase_swim_11_swim_and_pull_2), new k(R.string.lha_workout_phrase_swim_12_mixed_intervals_1), new k(R.string.lha_workout_phrase_swim_13_mixed_intervals_2), new k(R.string.lha_workout_phrase_swim_14_cruising_1), new k(R.string.lha_workout_phrase_swim_15_cruising_2), new k(R.string.lha_workout_phrase_swim_16_performance_booster_1), new k(R.string.lha_workout_phrase_swim_16_performance_booster_1), new k(R.string.lha_workout_phrase_swim_18_speed_play_1), new k(R.string.lha_workout_phrase_swim_18_speed_play_1), new k(R.string.lha_workout_phrase_swim_before_event), new k(R.string.lha_workout_phrase_brick_steady_pace_medium_base), new k(R.string.lha_workout_phrase_brick_steady_pace_hard_base), new k(R.string.lha_workout_phrase_brick_steady_pace_tempo), new k(R.string.lha_workout_phrase_brick_before_event_interval_base), new k(R.string.lha_workout_phrase_running_tolerance_high_impact_rest), new k(R.string.lha_workout_phrase_running_tolerance_high_impact_recovery), new k(R.string.lha_workout_phrase_running_tolerance_above_tolerance_rest), new k(R.string.lha_workout_phrase_running_tolerance_above_tolerance_recovery), new k(R.string.lha_workout_phrase_strength_builder_generic_gym), new k(R.string.lha_workout_phrase_muscle_builder_generic_gym), new k(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_total_body_circuit_generic_bodyweight), new k(R.string.lha_workout_phrase_strength_builder_generic_gym2), new k(R.string.lha_workout_phrase_strength_builder_generic_gym2), new k(R.string.lha_workout_phrase_strength_builder_generic_dumbbell), new k(R.string.lha_workout_phrase_strength_builder_generic_dumbbell), new k(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell), new k(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell), new k(R.string.lha_workout_phrase_strength_dumbbell_generic_dumbbell), new k(R.string.lha_workout_phrase_dumbbell_power_generic_dumbbell)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85896a;

    static {
    }

    private k(int i14) {
        super(str, i);
        this.f85896a = i14;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f85894c.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv1/k$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Context context, String str) {
            Object next;
            str.getClass();
            context.getClass();
            w13.c cVar = k.f85895d;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((k) next).name(), str));
            k kVar = (k) next;
            if (kVar != null) {
                return context.getString(kVar.f85896a);
            }
            return null;
        }

        private a() {
        }
    }
}
