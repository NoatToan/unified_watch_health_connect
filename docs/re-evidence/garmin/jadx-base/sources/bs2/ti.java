package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class ti extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20577e;

    static {
        bk bkVar = new bk("lap", 19);
        f20577e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("event", 0, 0, 1.0d, 0.0d, "", false, zn.EVENT));
        bkVar.e(new rc("event_type", 1, 0, 1.0d, 0.0d, "", false, zn.EVENT_TYPE));
        bkVar.e(new rc("start_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("start_position_lat", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("start_position_long", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("end_position_lat", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("end_position_long", 6, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("total_elapsed_time", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("total_timer_time", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("total_distance", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("total_cycles", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "cycles", false, znVar4));
        bkVar.f19753c.get(12).f20460i.add(new pw("total_strides", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides"));
        bkVar.f19753c.get(12).f20460i.get(0).b(25, 1L);
        bkVar.f19753c.get(12).f20460i.get(0).b(25, 11L);
        bkVar.f19753c.get(12).f20460i.add(new pw("total_strokes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strokes"));
        bkVar.f19753c.get(12).f20460i.get(1).b(25, 2L);
        bkVar.f19753c.get(12).f20460i.get(1).b(25, 5L);
        bkVar.f19753c.get(12).f20460i.get(1).b(25, 15L);
        bkVar.f19753c.get(12).f20460i.get(1).b(25, 37L);
        bkVar.f19753c.get(12).f20460i.add(new pw("total_pushes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "pushes"));
        bkVar.f19753c.get(12).f20460i.get(2).b(25, 66L);
        bkVar.f19753c.get(12).f20460i.get(2).b(25, 65L);
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("total_fat_calories", 12, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("avg_speed", 13, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.f19753c.get(15).f20459h.add(new vc(110, false, 16, 1000.0d, 0.0d));
        bkVar.e(new rc("max_speed", 14, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.f19753c.get(16).f20459h.add(new vc(111, false, 16, 1000.0d, 0.0d));
        zn znVar6 = zn.UINT8;
        bkVar.e(new rc("avg_heart_rate", 15, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("max_heart_rate", 16, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("avg_cadence", 17, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bkVar.f19753c.get(19).f20460i.get(0).b(25, 1L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_swimming_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(19).f20460i.get(1).b(25, 5L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_paddlesport_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(19).f20460i.get(2).b(25, 15L);
        bkVar.f19753c.get(19).f20460i.get(2).b(25, 37L);
        bkVar.f19753c.get(19).f20460i.add(new pw("avg_push_cadence", 2, 1.0d, 0.0d, "pushes/min"));
        bkVar.f19753c.get(19).f20460i.get(3).b(25, 66L);
        bkVar.f19753c.get(19).f20460i.get(3).b(25, 65L);
        bkVar.e(new rc("max_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.f19753c.get(20).f20460i.add(new pw("max_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bkVar.f19753c.get(20).f20460i.get(0).b(25, 1L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_swimming_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(20).f20460i.get(1).b(25, 5L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_paddlesport_cadence", 2, 1.0d, 0.0d, "strokes/min"));
        bkVar.f19753c.get(20).f20460i.get(2).b(25, 15L);
        bkVar.f19753c.get(20).f20460i.get(2).b(25, 37L);
        bkVar.f19753c.get(20).f20460i.add(new pw("max_push_cadence", 2, 1.0d, 0.0d, "pushes/min"));
        bkVar.f19753c.get(20).f20460i.get(3).b(25, 66L);
        bkVar.f19753c.get(20).f20460i.get(3).b(25, 65L);
        bkVar.e(new rc("avg_power", 19, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("max_power", 20, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("total_ascent", 21, 132, 1.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("total_descent", 22, 132, 1.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("intensity", 23, 0, 1.0d, 0.0d, "", false, zn.INTENSITY));
        bkVar.e(new rc("lap_trigger", 24, 0, 1.0d, 0.0d, "", false, zn.LAP_TRIGGER));
        bkVar.e(new rc("sport", 25, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("event_group", 26, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("nec_lat", 27, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("nec_long", 28, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("swc_lat", 29, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("swc_long", 30, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("name", 31, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("num_lengths", 32, 132, 1.0d, 0.0d, "lengths", false, znVar5));
        bkVar.e(new rc("normalized_power", 33, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("left_right_balance", 34, 132, 1.0d, 0.0d, "", false, zn.LEFT_RIGHT_BALANCE_100));
        bkVar.e(new rc("first_length_index", 35, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_stroke_distance", 37, 132, 100.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("swim_stroke", 38, 0, 1.0d, 0.0d, "", false, zn.SWIM_STROKE));
        bkVar.e(new rc("sub_sport", 39, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("num_active_lengths", 40, 132, 1.0d, 0.0d, "lengths", false, znVar5));
        bkVar.e(new rc("total_work", 41, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "J", false, znVar4));
        bkVar.e(new rc("avg_altitude", 42, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(43).f20459h.add(new vc(112, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("max_altitude", 43, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(44).f20459h.add(new vc(114, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("gps_accuracy", 44, 2, 1.0d, 0.0d, "m", false, znVar6));
        zn znVar7 = zn.SINT16;
        bkVar.e(new rc("avg_grade", 45, 131, 100.0d, 0.0d, "%", false, znVar7));
        bkVar.e(new rc("avg_pos_grade", 46, 131, 100.0d, 0.0d, "%", false, znVar7));
        bkVar.e(new rc("avg_neg_grade", 47, 131, 100.0d, 0.0d, "%", false, znVar7));
        bkVar.e(new rc("max_pos_grade", 48, 131, 100.0d, 0.0d, "%", false, znVar7));
        bkVar.e(new rc("max_neg_grade", 49, 131, 100.0d, 0.0d, "%", false, znVar7));
        zn znVar8 = zn.SINT8;
        bkVar.e(new rc("avg_temperature", 50, 1, 1.0d, 0.0d, "C", false, znVar8));
        bkVar.e(new rc("max_temperature", 51, 1, 1.0d, 0.0d, "C", false, znVar8));
        bkVar.e(new rc("total_moving_time", 52, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("avg_pos_vertical_speed", 53, 131, 1000.0d, 0.0d, "m/s", false, znVar7));
        bkVar.e(new rc("avg_neg_vertical_speed", 54, 131, 1000.0d, 0.0d, "m/s", false, znVar7));
        bkVar.e(new rc("max_pos_vertical_speed", 55, 131, 1000.0d, 0.0d, "m/s", false, znVar7));
        bkVar.e(new rc("max_neg_vertical_speed", 56, 131, 1000.0d, 0.0d, "m/s", false, znVar7));
        bkVar.e(new rc("time_in_hr_zone", 57, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_speed_zone", 58, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_cadence_zone", 59, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_power_zone", 60, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("repetition_num", 61, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("min_altitude", 62, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(63).f20459h.add(new vc(113, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("min_heart_rate", 63, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("reserved_1_jira_478", 64, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("reserved_2_jira_478", 65, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("reserved_3_jira_478", 66, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("reserved_4_jira_478", 67, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("reserved_5_jira_478", 68, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("reserved_6_jira_478", 69, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("active_time", 70, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("wkt_step_index", 71, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport_event", 72, 0, 1.0d, 0.0d, "", false, zn.SPORT_EVENT));
        bkVar.e(new rc("avg_swolf", 73, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("opponent_score", 74, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("stroke_count", 75, 132, 1.0d, 0.0d, "counts", false, znVar5));
        bkVar.e(new rc("zone_count", 76, 132, 1.0d, 0.0d, "counts", false, znVar5));
        bkVar.e(new rc("avg_vertical_oscillation", 77, 132, 10.0d, 0.0d, "mm", false, znVar5));
        bkVar.e(new rc("avg_stance_time_percent", 78, 132, 100.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_stance_time", 79, 132, 10.0d, 0.0d, "ms", false, znVar5));
        bkVar.e(new rc("avg_fractional_cadence", 80, 2, 128.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("max_fractional_cadence", 81, 2, 128.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("total_fractional_cycles", 82, 2, 128.0d, 0.0d, "cycles", false, znVar6));
        bkVar.e(new rc("player_score", 83, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_total_hemoglobin_conc", 84, 132, 100.0d, 0.0d, "g/dL", false, znVar5));
        bkVar.e(new rc("min_total_hemoglobin_conc", 85, 132, 100.0d, 0.0d, "g/dL", false, znVar5));
        bkVar.e(new rc("max_total_hemoglobin_conc", 86, 132, 100.0d, 0.0d, "g/dL", false, znVar5));
        bkVar.e(new rc("avg_saturated_hemoglobin_percent", 87, 132, 10.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("min_saturated_hemoglobin_percent", 88, 132, 10.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("max_saturated_hemoglobin_percent", 89, 132, 10.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("avg_strokes_per_length", 90, 132, 10.0d, 0.0d, "strokes / length", false, znVar5));
        bkVar.e(new rc("avg_left_torque_effectiveness", 91, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_right_torque_effectiveness", 92, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_left_pedal_smoothness", 93, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_right_pedal_smoothness", 94, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_combined_pedal_smoothness", 95, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("front_gear_shift_count", 96, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("rear_gear_shift_count", 97, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("time_standing", 98, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("stand_count", 99, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_left_pco", 100, 1, 1.0d, 0.0d, "mm", false, znVar8));
        bkVar.e(new rc("avg_right_pco", 101, 1, 1.0d, 0.0d, "mm", false, znVar8));
        bkVar.e(new rc("avg_left_power_phase", 102, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_left_power_phase_peak", 103, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_right_power_phase", 104, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_right_power_phase_peak", 105, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_power_position", 106, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("max_power_position", 107, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("avg_cadence_position", 108, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("max_cadence_position", 109, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("enhanced_avg_speed", 110, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("enhanced_max_speed", 111, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("enhanced_avg_altitude", 112, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("enhanced_min_altitude", 113, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("enhanced_max_altitude", 114, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("avg_lev_motor_power", 115, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("max_lev_motor_power", 116, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("lev_battery_consumption", 117, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_vertical_ratio", 118, 132, 100.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_stance_time_balance", 119, 132, 100.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_step_length", 120, 132, 10.0d, 0.0d, "mm", false, znVar5));
        bkVar.e(new rc("avg_vam", 121, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.e(new rc("avg_depth", 122, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("max_depth", 123, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("min_temperature", 124, 1, 1.0d, 0.0d, "C", false, znVar8));
        bkVar.e(new rc("floors_climbed", 125, 132, 1.0d, 0.0d, "floors", false, znVar5));
        bkVar.e(new rc("floors_descended", 126, 132, 1.0d, 0.0d, "floors", false, znVar5));
        bkVar.e(new rc("min_cda", 127, 132, 1000.0d, 0.0d, "m^2", false, znVar5));
        bkVar.e(new rc("max_cda", 128, 132, 1000.0d, 0.0d, "m^2", false, znVar5));
        bkVar.e(new rc("avg_cda", 129, 132, 1000.0d, 0.0d, "m^2", false, znVar5));
        bkVar.e(new rc("avg_wind_yaw_angle", 130, 131, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar7));
        bkVar.e(new rc("avg_crr", 131, 132, 100000.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("min_air_speed", 132, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.e(new rc("max_air_speed", 133, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.e(new rc("avg_air_speed", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.e(new rc("avg_watts_per_cda", TsExtractor.TS_STREAM_TYPE_E_AC3, 132, 1.0d, 0.0d, "Watts/m^2", false, znVar5));
        bkVar.e(new rc("enhanced_avg_respiration_rate", SyslogConstants.LOG_LOCAL1, 132, 100.0d, 0.0d, "Breaths/min", false, znVar5));
        bkVar.e(new rc("enhanced_max_respiration_rate", 137, 132, 100.0d, 0.0d, "Breaths/min", false, znVar5));
        bkVar.e(new rc("power_percent_friction", TsExtractor.TS_STREAM_TYPE_DTS, 1, 1.0d, 0.0d, "percent", false, znVar8));
        bkVar.e(new rc("power_percent_grade", 139, 1, 1.0d, 0.0d, "percent", false, znVar8));
        bkVar.e(new rc("power_percent_user", 140, 1, 1.0d, 0.0d, "percent", false, znVar8));
        bkVar.e(new rc("power_percent_wind", 141, 1, 1.0d, 0.0d, "percent", false, znVar8));
        bkVar.e(new rc("avg_power_net", 142, 131, 1.0d, 0.0d, "Watts", false, znVar7));
        bkVar.e(new rc("calories_estimated", 143, 132, 1.0d, 0.0d, "kCal", false, znVar5));
        bkVar.e(new rc("water_estimated", 145, 132, 1.0d, 0.0d, "mL", false, znVar5));
        bkVar.e(new rc("avg_respiration_rate", 147, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.f19753c.get(146).f20459h.add(new vc(SyslogConstants.LOG_LOCAL1, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("max_respiration_rate", 148, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.f19753c.get(147).f20459h.add(new vc(137, false, 8, 1.0d, 0.0d));
        zn znVar9 = zn.FLOAT32;
        bkVar.e(new rc("total_grit", 149, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar9));
        bkVar.e(new rc("total_flow", 150, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar9));
        bkVar.e(new rc("jump_count", 151, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("workout_compliance_score", SyslogConstants.LOG_LOCAL3, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("avg_grit", 153, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar9));
        bkVar.e(new rc("avg_flow", 154, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar9));
        bkVar.e(new rc("metabolic_calories", ModuleDescriptor.MODULE_VERSION, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("total_fractional_ascent", 156, 2, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("total_fractional_descent", 157, 2, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("avg_core_temperature", 158, 132, 100.0d, 0.0d, "C", false, znVar5));
        bkVar.e(new rc("min_core_temperature", 159, 132, 100.0d, 0.0d, "C", false, znVar5));
        bkVar.e(new rc("max_core_temperature", SyslogConstants.LOG_LOCAL4, 132, 100.0d, 0.0d, "C", false, znVar5));
        bkVar.e(new rc("avg_grade_adjusted_speed", 161, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("swim_drill", 162, 0, 1.0d, 0.0d, "", false, zn.WKT_STEP_SWIM_DRILL));
        bkVar.e(new rc("surface_type_unpaved_percentage", 163, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_step_speed_loss", 164, 132, 100.0d, 0.0d, "cm/s", false, znVar5));
        bkVar.e(new rc("avg_step_speed_loss_percent", 165, 132, 100.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("avg_force", 166, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("max_force", 167, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("normalized_force", 168, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ti() {
        super(wb.b(19));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(26);
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

    public ti(bk bkVar) {
        super(bkVar);
    }
}
