package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class vr extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20629e;

    static {
        bk bkVar = new bk("segment_lap", 142);
        f20629e = bkVar;
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
        bkVar.f19753c.get(12).f20460i.add(new pw("total_strokes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strokes"));
        bkVar.f19753c.get(12).f20460i.get(0).b(23, 2L);
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("total_fat_calories", 12, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("avg_speed", 13, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        bkVar.e(new rc("max_speed", 14, 132, 1000.0d, 0.0d, "m/s", false, znVar5));
        zn znVar6 = zn.UINT8;
        bkVar.e(new rc("avg_heart_rate", 15, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("max_heart_rate", 16, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("avg_cadence", 17, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("max_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("avg_power", 19, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("max_power", 20, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("total_ascent", 21, 132, 1.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("total_descent", 22, 132, 1.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("sport", 23, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("event_group", 24, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("nec_lat", 25, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("nec_long", 26, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("swc_lat", 27, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("swc_long", 28, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        zn znVar7 = zn.STRING;
        bkVar.e(new rc("name", 29, 7, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("normalized_power", 30, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("left_right_balance", 31, 132, 1.0d, 0.0d, "", false, zn.LEFT_RIGHT_BALANCE_100));
        bkVar.e(new rc("sub_sport", 32, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("total_work", 33, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "J", false, znVar4));
        bkVar.e(new rc("avg_altitude", 34, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(36).f20459h.add(new vc(91, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("max_altitude", 35, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(37).f20459h.add(new vc(92, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("gps_accuracy", 36, 2, 1.0d, 0.0d, "m", false, znVar6));
        zn znVar8 = zn.SINT16;
        bkVar.e(new rc("avg_grade", 37, 131, 100.0d, 0.0d, "%", false, znVar8));
        bkVar.e(new rc("avg_pos_grade", 38, 131, 100.0d, 0.0d, "%", false, znVar8));
        bkVar.e(new rc("avg_neg_grade", 39, 131, 100.0d, 0.0d, "%", false, znVar8));
        bkVar.e(new rc("max_pos_grade", 40, 131, 100.0d, 0.0d, "%", false, znVar8));
        bkVar.e(new rc("max_neg_grade", 41, 131, 100.0d, 0.0d, "%", false, znVar8));
        zn znVar9 = zn.SINT8;
        bkVar.e(new rc("avg_temperature", 42, 1, 1.0d, 0.0d, "C", false, znVar9));
        bkVar.e(new rc("max_temperature", 43, 1, 1.0d, 0.0d, "C", false, znVar9));
        bkVar.e(new rc("total_moving_time", 44, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("avg_pos_vertical_speed", 45, 131, 1000.0d, 0.0d, "m/s", false, znVar8));
        bkVar.e(new rc("avg_neg_vertical_speed", 46, 131, 1000.0d, 0.0d, "m/s", false, znVar8));
        bkVar.e(new rc("max_pos_vertical_speed", 47, 131, 1000.0d, 0.0d, "m/s", false, znVar8));
        bkVar.e(new rc("max_neg_vertical_speed", 48, 131, 1000.0d, 0.0d, "m/s", false, znVar8));
        bkVar.e(new rc("time_in_hr_zone", 49, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_speed_zone", 50, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_cadence_zone", 51, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("time_in_power_zone", 52, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("repetition_num", 53, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("min_altitude", 54, 132, 5.0d, 500.0d, "m", false, znVar5));
        bkVar.f19753c.get(56).f20459h.add(new vc(93, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("min_heart_rate", 55, 2, 1.0d, 0.0d, "bpm", false, znVar6));
        bkVar.e(new rc("active_time", 56, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("wkt_step_index", 57, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport_event", 58, 0, 1.0d, 0.0d, "", false, zn.SPORT_EVENT));
        bkVar.e(new rc("avg_left_torque_effectiveness", 59, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_right_torque_effectiveness", 60, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_left_pedal_smoothness", 61, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_right_pedal_smoothness", 62, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("avg_combined_pedal_smoothness", 63, 2, 2.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("status", 64, 0, 1.0d, 0.0d, "", false, zn.SEGMENT_LAP_STATUS));
        bkVar.e(new rc("uuid", 65, 7, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("avg_fractional_cadence", 66, 2, 128.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("max_fractional_cadence", 67, 2, 128.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("total_fractional_cycles", 68, 2, 128.0d, 0.0d, "cycles", false, znVar6));
        bkVar.e(new rc("front_gear_shift_count", 69, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("rear_gear_shift_count", 70, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("time_standing", 71, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("stand_count", 72, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avg_left_pco", 73, 1, 1.0d, 0.0d, "mm", false, znVar9));
        bkVar.e(new rc("avg_right_pco", 74, 1, 1.0d, 0.0d, "mm", false, znVar9));
        bkVar.e(new rc("avg_left_power_phase", 75, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_left_power_phase_peak", 76, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_right_power_phase", 77, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_right_power_phase_peak", 78, 2, 0.7111111d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar6));
        bkVar.e(new rc("avg_power_position", 79, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("max_power_position", 80, 132, 1.0d, 0.0d, "watts", false, znVar5));
        bkVar.e(new rc("avg_cadence_position", 81, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("max_cadence_position", 82, 2, 1.0d, 0.0d, "rpm", false, znVar6));
        bkVar.e(new rc("manufacturer", 83, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        zn znVar10 = zn.FLOAT32;
        bkVar.e(new rc("total_grit", 84, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar10));
        bkVar.e(new rc("total_flow", 85, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar10));
        bkVar.e(new rc("avg_grit", 86, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kGrit", false, znVar10));
        bkVar.e(new rc("avg_flow", 87, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "Flow", false, znVar10));
        bkVar.e(new rc("metabolic_calories", 88, 132, 1.0d, 0.0d, "kcal", false, znVar5));
        bkVar.e(new rc("total_fractional_ascent", 89, 2, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("total_fractional_descent", 90, 2, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("enhanced_avg_altitude", 91, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("enhanced_max_altitude", 92, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("enhanced_min_altitude", 93, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("avg_force", 94, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("max_force", 95, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("normalized_force", 96, 133, 1000.0d, 0.0d, "N", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vr() {
        super(wb.b(142));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(24);
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

    public vr(bk bkVar) {
        super(bkVar);
    }
}
