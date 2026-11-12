package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class fs extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20142e;

    static {
        bk bkVar = new bk("session", 18);
        f20142e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("event", 0, 0, 1.0d, 0.0d, "", false, zn.EVENT));
        bkVar.e(new rc("event_type", 1, 0, 1.0d, 0.0d, "", false, zn.EVENT_TYPE));
        bkVar.e(new rc("start_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("start_position_lat", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("start_position_long", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("sport", 5, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 6, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("total_elapsed_time", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("total_timer_time", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("total_distance", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("total_cycles", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "cycles", false, znVar3));
        bkVar.f19753c.get(12).f20460i.add(new pw("total_reps", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "reps"));
        bkVar.f19753c.get(12).f20460i.get(0).b(6, 20L);
        bkVar.f19753c.get(12).f20460i.get(0).b(5, 62L);
        bkVar.f19753c.get(12).f20460i.add(new pw("total_strides", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides"));
        bkVar.f19753c.get(12).f20460i.get(1).b(5, 1L);
        bkVar.f19753c.get(12).f20460i.get(1).b(5, 11L);
        bkVar.f19753c.get(12).f20460i.add(new pw("total_strokes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strokes"));
        bkVar.f19753c.get(12).f20460i.get(2).b(5, 2L);
        bkVar.f19753c.get(12).f20460i.get(2).b(5, 5L);
        bkVar.f19753c.get(12).f20460i.get(2).b(5, 15L);
        bkVar.f19753c.get(12).f20460i.get(2).b(5, 37L);
        bkVar.f19753c.get(12).f20460i.add(new pw("total_pushes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "pushes"));
        bkVar.f19753c.get(12).f20460i.get(3).b(5, 66L);
        bkVar.f19753c.get(12).f20460i.get(3).b(5, 65L);
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, znVar4));
        bkVar.e(new rc("total_fat_calories", 13, 132, 1.0d, 0.0d, "kcal", false, znVar4));
        bkVar.e(new rc("avg_speed", 14, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.f19753c.get(15).f20459h.add(new vc(124, false, 16, 1000.0d, 0.0d));
        bkVar.e(new rc("max_speed", 15, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.f19753c.get(16).f20459h.add(new vc(125, false, 16, 1000.0d, 0.0d));
        zn znVar5 = zn.UINT8;
        bkVar.e(new rc("avg_heart_rate", 16, 2, 1.0d, 0.0d, "bpm", false, znVar5));
        bkVar.e(new rc("max_heart_rate", 17, 2, 1.0d, 0.0d, "bpm", false, znVar5));
        bkVar.e(new rc("avg_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, znVar5));
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bkVar.f19753c.get(19).f20460i.get(0).b(5, 1L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_swimming_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(19).f20460i.get(1).b(5, 5L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_paddlesport_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(19).f20460i.get(2).b(5, 15L);
        bkVar.f19753c.get(19).f20460i.get(2).b(5, 37L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_push_cadence", 2, 1.0d, 0.0d, "pushes/min"));
        bkVar.f19753c.get(19).f20460i.get(3).b(5, 66L);
        bkVar.f19753c.get(19).f20460i.get(3).b(5, 65L);
        bkVar.e(new rc("max_cadence", 19, 2, 1.0d, 0.0d, "rpm", false, znVar5));
        bkVar.f19753c.get(20).f20460i.add(new pw("max_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bkVar.f19753c.get(20).f20460i.get(0).b(5, 1L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_swimming_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(20).f20460i.get(1).b(5, 5L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_paddlesport_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(20).f20460i.get(2).b(5, 15L);
        bkVar.f19753c.get(20).f20460i.get(2).b(5, 37L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_push_cadence", 2, 1.0d, 0.0d, "pushes/min"));
        bkVar.f19753c.get(20).f20460i.get(3).b(5, 66L);
        bkVar.f19753c.get(20).f20460i.get(3).b(5, 65L);
        bkVar.e(new rc("avg_power", 20, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("max_power", 21, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("total_ascent", 22, 132, 1.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("total_descent", 23, 132, 1.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("total_training_effect", 24, 2, 10.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("first_lap_index", 25, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("num_laps", 26, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("event_group", 27, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("trigger", 28, 0, 1.0d, 0.0d, "", false, zn.SESSION_TRIGGER));
        bkVar.e(new rc("nec_lat", 29, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("nec_long", 30, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("swc_lat", 31, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("swc_long", 32, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("num_lengths", 33, 132, 1.0d, 0.0d, "lengths", false, znVar4));
        bkVar.f19753c.get(34).f20460i.add(new pw("num_sets", 132, 1.0d, 0.0d, "sets"));
        bkVar.f19753c.get(34).f20460i.get(0).b(6, 20L);
        bkVar.e(new rc("normalized_power", 34, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("training_stress_score", 35, 132, 10.0d, 0.0d, "tss", false, znVar4));
        bkVar.e(new rc("intensity_factor", 36, 132, 1000.0d, 0.0d, "if", false, znVar4));
        bkVar.e(new rc("left_right_balance", 37, 132, 1.0d, 0.0d, "", false, zn.LEFT_RIGHT_BALANCE_100));
        bkVar.e(new rc("end_position_lat", 38, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("end_position_long", 39, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("avg_stroke_count", 41, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 10.0d, 0.0d, "strokes/lap", false, znVar3));
        bkVar.e(new rc("avg_stroke_distance", 42, 132, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("swim_stroke", 43, 0, 1.0d, 0.0d, "swim_stroke", false, zn.SWIM_STROKE));
        bkVar.e(new rc("pool_length", 44, 132, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("threshold_power", 45, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("pool_length_unit", 46, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_MEASURE));
        bkVar.e(new rc("num_active_lengths", 47, 132, 1.0d, 0.0d, "lengths", false, znVar4));
        bkVar.f19753c.get(47).f20460i.add(new pw("num_active_sets", 132, 1.0d, 0.0d, "sets"));
        bkVar.f19753c.get(47).f20460i.get(0).b(6, 20L);
        bkVar.e(new rc("total_work", 48, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "J", false, znVar3));
        bkVar.e(new rc("avg_altitude", 49, 132, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.f19753c.get(49).f20459h.add(new vc(126, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("max_altitude", 50, 132, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.f19753c.get(50).f20459h.add(new vc(128, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("gps_accuracy", 51, 2, 1.0d, 0.0d, "m", false, znVar5));
        zn znVar6 = zn.SINT16;
        bkVar.e(new rc("avg_grade", 52, 131, 100.0d, 0.0d, "%", false, znVar6));
        bkVar.e(new rc("avg_pos_grade", 53, 131, 100.0d, 0.0d, "%", false, znVar6));
        bkVar.e(new rc("avg_neg_grade", 54, 131, 100.0d, 0.0d, "%", false, znVar6));
        bkVar.e(new rc("max_pos_grade", 55, 131, 100.0d, 0.0d, "%", false, znVar6));
        bkVar.e(new rc("max_neg_grade", 56, 131, 100.0d, 0.0d, "%", false, znVar6));
        zn znVar7 = zn.SINT8;
        bkVar.e(new rc("avg_temperature", 57, 1, 1.0d, 0.0d, "C", false, znVar7));
        bkVar.e(new rc("max_temperature", 58, 1, 1.0d, 0.0d, "C", false, znVar7));
        bkVar.e(new rc("total_moving_time", 59, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("avg_pos_vertical_speed", 60, 131, 1000.0d, 0.0d, "m/s", false, znVar6));
        bkVar.e(new rc("avg_neg_vertical_speed", 61, 131, 1000.0d, 0.0d, "m/s", false, znVar6));
        bkVar.e(new rc("max_pos_vertical_speed", 62, 131, 1000.0d, 0.0d, "m/s", false, znVar6));
        bkVar.e(new rc("max_neg_vertical_speed", 63, 131, 1000.0d, 0.0d, "m/s", false, znVar6));
        bkVar.e(new rc("min_heart_rate", 64, 2, 1.0d, 0.0d, "bpm", false, znVar5));
        bkVar.e(new rc("time_in_hr_zone", 65, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("time_in_speed_zone", 66, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("time_in_cadence_zone", 67, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("time_in_power_zone", 68, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("avg_lap_time", 69, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("best_lap_index", 70, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("min_altitude", 71, 132, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.f19753c.get(71).f20459h.add(new vc(127, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("reserved_1_jira_478", 72, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("reserved_2_jira_478", 73, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("reserved_3_jira_478", 74, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("reserved_4_jira_478", 75, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("reserved_5_jira_478", 76, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("reserved_6_jira_478", 77, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("active_time", 78, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("avg_strokes_per_length", 79, 132, 10.0d, 0.0d, "strokes/length", false, znVar4));
        bkVar.e(new rc("avg_swolf", 80, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sport_event", 81, 0, 1.0d, 0.0d, "", false, zn.SPORT_EVENT));
        bkVar.e(new rc("player_score", 82, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("opponent_score", 83, 132, 1.0d, 0.0d, "", false, znVar4));
        zn znVar8 = zn.STRING;
        bkVar.e(new rc("opponent_name", 84, 7, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("stroke_count", 85, 132, 1.0d, 0.0d, "counts", false, znVar4));
        bkVar.e(new rc("zone_count", 86, 132, 1.0d, 0.0d, "counts", false, znVar4));
        bkVar.e(new rc("max_ball_speed", 87, 132, 100.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("avg_ball_speed", 88, 132, 100.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("avg_vertical_oscillation", 89, 132, 10.0d, 0.0d, "mm", false, znVar4));
        bkVar.e(new rc("avg_stance_time_percent", 90, 132, 100.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("avg_stance_time", 91, 132, 10.0d, 0.0d, "ms", false, znVar4));
        bkVar.e(new rc("avg_fractional_cadence", 92, 2, 128.0d, 0.0d, "rpm", false, znVar5));
        bkVar.e(new rc("max_fractional_cadence", 93, 2, 128.0d, 0.0d, "rpm", false, znVar5));
        bkVar.e(new rc("total_fractional_cycles", 94, 2, 128.0d, 0.0d, "cycles", false, znVar5));
        bkVar.e(new rc("avg_total_hemoglobin_conc", 95, 132, 100.0d, 0.0d, "g/dL", false, znVar4));
        bkVar.e(new rc("min_total_hemoglobin_conc", 96, 132, 100.0d, 0.0d, "g/dL", false, znVar4));
        bkVar.e(new rc("max_total_hemoglobin_conc", 97, 132, 100.0d, 0.0d, "g/dL", false, znVar4));
        bkVar.e(new rc("avg_saturated_hemoglobin_percent", 98, 132, 10.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("min_saturated_hemoglobin_percent", 99, 132, 10.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("max_saturated_hemoglobin_percent", 100, 132, 10.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("avg_left_torque_effectiveness", 101, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_right_torque_effectiveness", 102, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_left_pedal_smoothness", 103, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_right_pedal_smoothness", 104, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_combined_pedal_smoothness", 105, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("num_segment_laps", 106, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("front_gear_shift_count", 107, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("rear_gear_shift_count", 108, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sport_profile_index", 109, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("sport_profile_name", 110, 7, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("sport_index", 111, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("time_standing", 112, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("stand_count", 113, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("avg_left_pco", 114, 1, 1.0d, 0.0d, "mm", false, znVar7));
        bkVar.e(new rc("avg_right_pco", 115, 1, 1.0d, 0.0d, "mm", false, znVar7));
        bkVar.e(new rc("avg_left_power_phase", 116, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("avg_left_power_phase_peak", 117, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("avg_right_power_phase", 118, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("avg_right_power_phase_peak", 119, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("avg_power_position", 120, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("max_power_position", 121, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("avg_cadence_position", 122, 2, 1.0d, 0.0d, "rpm", false, znVar5));
        bkVar.e(new rc("max_cadence_position", 123, 2, 1.0d, 0.0d, "rpm", false, znVar5));
        bkVar.e(new rc("enhanced_avg_speed", 124, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("enhanced_max_speed", 125, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("enhanced_avg_altitude", 126, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("enhanced_min_altitude", 127, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("enhanced_max_altitude", 128, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("avg_lev_motor_power", 129, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("max_lev_motor_power", 130, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("lev_battery_consumption", 131, 2, 2.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_vertical_ratio", 132, 132, 100.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("avg_stance_time_balance", 133, 132, 100.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("avg_step_length", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 132, 10.0d, 0.0d, "mm", false, znVar4));
        zn znVar9 = zn.FLOAT32;
        bkVar.e(new rc("avg_gforce", TsExtractor.TS_STREAM_TYPE_E_AC3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar9));
        bkVar.e(new rc("max_gforce", SyslogConstants.LOG_LOCAL1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar9));
        bkVar.e(new rc("total_anaerobic_training_effect", 137, 2, 10.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("training_effect_indices", TsExtractor.TS_STREAM_TYPE_DTS, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_vam", 139, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("avg_depth", 140, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("max_depth", 141, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("surface_interval", 142, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("start_cns", 143, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("end_cns", SyslogConstants.LOG_LOCAL2, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("start_n2", 145, 132, 1.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("end_n2", 146, 132, 1.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("avg_respiration_rate", 147, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.f19753c.get(147).f20459h.add(new vc(169, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("max_respiration_rate", 148, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.f19753c.get(148).f20459h.add(new vc(170, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("min_respiration_rate", 149, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.f19753c.get(149).f20459h.add(new vc(180, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("min_temperature", 150, 1, 1.0d, 0.0d, "C", false, znVar7));
        bkVar.e(new rc("total_set_cnt", 151, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("total_volume", SyslogConstants.LOG_LOCAL3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "kg", false, znVar3));
        zn znVar10 = zn.BOOL;
        bkVar.e(new rc("outdoor_wdr_calibrated", 153, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("treadmill_calibrated", 154, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("o2_toxicity", ModuleDescriptor.MODULE_VERSION, 132, 1.0d, 0.0d, "OTUs", false, znVar4));
        bkVar.e(new rc("dive_number", 156, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("floors_climbed", 157, 132, 1.0d, 0.0d, "floors", false, znVar4));
        bkVar.e(new rc("floors_descended", 158, 132, 1.0d, 0.0d, "floors", false, znVar4));
        bkVar.e(new rc("min_cda", 159, 132, 1000.0d, 0.0d, "m^2", false, znVar4));
        bkVar.e(new rc("max_cda", SyslogConstants.LOG_LOCAL4, 132, 1000.0d, 0.0d, "m^2", false, znVar4));
        bkVar.e(new rc("avg_cda", 161, 132, 1000.0d, 0.0d, "m^2", false, znVar4));
        bkVar.e(new rc("avg_wind_yaw_angle", 162, 131, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar6));
        bkVar.e(new rc("avg_crr", 163, 132, 100000.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("min_air_speed", 164, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("max_air_speed", 165, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("avg_air_speed", 166, 132, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("avg_watts_per_cda", 167, 132, 1.0d, 0.0d, "Watts/m^2", false, znVar4));
        bkVar.e(new rc("training_load_peak", 168, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("enhanced_avg_respiration_rate", 169, 132, 100.0d, 0.0d, "Breaths/min", false, znVar4));
        bkVar.e(new rc("enhanced_max_respiration_rate", 170, 132, 100.0d, 0.0d, "Breaths/min", false, znVar4));
        bkVar.e(new rc("power_percent_friction", 171, 1, 1.0d, 0.0d, "percent", false, znVar7));
        bkVar.e(new rc("power_percent_grade", TsExtractor.TS_STREAM_TYPE_AC4, 1, 1.0d, 0.0d, "percent", false, znVar7));
        bkVar.e(new rc("power_percent_user", 173, 1, 1.0d, 0.0d, "percent", false, znVar7));
        bkVar.e(new rc("power_percent_wind", 174, 1, 1.0d, 0.0d, "percent", false, znVar7));
        bkVar.e(new rc("avg_power_net", 175, 131, 1.0d, 0.0d, "Watts", false, znVar6));
        bkVar.e(new rc("calories_estimated", SyslogConstants.LOG_LOCAL6, 132, 1.0d, 0.0d, "kCal", false, znVar4));
        bkVar.e(new rc("calories_consumed", 177, 132, 1.0d, 0.0d, "kCal", false, znVar4));
        bkVar.e(new rc("water_estimated", 178, 132, 1.0d, 0.0d, "mL", false, znVar4));
        bkVar.e(new rc("water_consumed", 179, 132, 1.0d, 0.0d, "mL", false, znVar4));
        bkVar.e(new rc("enhanced_min_respiration_rate", 180, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("total_grit", 181, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar9));
        bkVar.e(new rc("total_flow", 182, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar9));
        bkVar.e(new rc("jump_count", 183, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("end_reason", SyslogConstants.LOG_LOCAL7, 0, 1.0d, 0.0d, "", false, zn.END_REASON));
        bkVar.e(new rc("workout_compliance_score", 185, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_grit", 186, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar9));
        bkVar.e(new rc("avg_flow", 187, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar9));
        bkVar.e(new rc("cumulative_training_effect_label", TsExtractor.TS_PACKET_SIZE, 0, 1.0d, 0.0d, "", false, zn.TRAINING_EFFECT_LABEL));
        bkVar.e(new rc("start_stress", PsExtractor.PRIVATE_STREAM_1, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("end_stress", 190, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("num_active_laps", 191, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("workout_feel", 192, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("workout_rpe", 193, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_spo2", 194, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_stress", 195, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("metabolic_calories", 196, 132, 1.0d, 0.0d, "kcal", false, znVar4));
        bkVar.e(new rc("sdrr_hrv", 197, 2, 1.0d, 0.0d, "mS", false, znVar5));
        bkVar.e(new rc("rmssd_hrv", 198, 2, 1.0d, 0.0d, "mS", false, znVar5));
        bkVar.e(new rc("total_fractional_ascent", 199, 2, 100.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("total_fractional_descent", 200, 2, 100.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("max_stress", 201, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("recovery_heart_rate", 202, 2, 1.0d, 0.0d, "bpm", false, znVar5));
        bkVar.e(new rc("total_solar_activity_time_gain_s", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("avg_solar_charge_percent", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 132, 100.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("stamina_potential_start", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 2, 1.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("stamina_potential_end", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 2, 1.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("stamina_available_minimum", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 2, 1.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("avg_core_temperature", 208, 132, 100.0d, 0.0d, "C", false, znVar4));
        bkVar.e(new rc("min_core_temperature", 209, 132, 100.0d, 0.0d, "C", false, znVar4));
        bkVar.e(new rc("max_core_temperature", 210, 132, 100.0d, 0.0d, "C", false, znVar4));
        bkVar.e(new rc("avg_grade_adjusted_speed", 211, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("running_power_wind_data", 212, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("avg_accel_roughness", 213, 132, 1.0d, 0.0d, "roughness", false, znVar4));
        bkVar.e(new rc("max_accel_roughness", 214, 132, 1.0d, 0.0d, "roughness", false, znVar4));
        bkVar.e(new rc("body_battery_start", 215, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("body_battery_end", 216, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("max_lap_avg_cadence", 217, 2, 1.0d, 0.0d, "spm", false, znVar5));
        bkVar.e(new rc("max_lap_cycles", 218, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("surface_type_unpaved_percentage", 219, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("pack_weight", 220, 132, 10.0d, 0.0d, "kg", false, znVar4));
        bkVar.e(new rc("total_equivalent_distance", 221, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("avg_step_speed_loss", 222, 132, 100.0d, 0.0d, "cm/s", false, znVar4));
        bkVar.e(new rc("avg_step_speed_loss_percent", 223, 132, 100.0d, 0.0d, "percent", false, znVar4));
        bkVar.e(new rc("avg_force", 224, 133, 1000.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("max_force", 225, 133, 1000.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("normalized_force", 226, 133, 1000.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("min_spo2", 227, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("max_spo2", 228, 2, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fs() {
        super(wb.b(18));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(27);
    }

    @Override // bs2.jk
    public final ab c() {
        Short shK = k(0);
        if (shK == null) {
            return null;
        }
        return ab.a(shK);
    }

    @Override // bs2.jk
    public final void d(fb fbVar) {
        n(1, Short.valueOf(fbVar.f20128a));
    }

    @Override // bs2.jk
    public final fb getEventType() {
        Short shK = k(1);
        if (shK == null) {
            return null;
        }
        return fb.a(shK);
    }

    @Override // bs2.jk
    public final l6 getTimestamp() {
        return p(j(253, 65535));
    }

    public final js r() {
        Short shK = k(28);
        if (shK == null) {
            return null;
        }
        for (js jsVar : js.values()) {
            if (shK.shortValue() == jsVar.f20242a) {
                return jsVar;
            }
        }
        return js.INVALID;
    }

    public fs(bk bkVar) {
        super(bkVar);
    }
}
