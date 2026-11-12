package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class bb extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19746e;

    static {
        bk bkVar = new bk("event", 21);
        f19746e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("event", 0, 0, 1.0d, 0.0d, "", false, zn.EVENT));
        bkVar.e(new rc("event_type", 1, 0, 1.0d, 0.0d, "", false, zn.EVENT_TYPE));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("data16", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(3).f20459h.add(new vc(3, false, 16, 1.0d, 0.0d));
        bkVar.e(new rc("data", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.f19753c.get(4).f20460i.add(new pw("timer_trigger", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("course_point_index", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 10L);
        bkVar.f19753c.get(4).f20460i.add(new pw("battery_level", 132, 1000.0d, 0.0d, "V"));
        bkVar.f19753c.get(4).f20460i.get(2).b(0, 11L);
        bkVar.f19753c.get(4).f20460i.add(new pw("virtual_partner_speed", 132, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(3).b(0, 12L);
        bkVar.f19753c.get(4).f20460i.add(new pw("hr_high_alert", 2, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(4).f20460i.get(4).b(0, 13L);
        bkVar.f19753c.get(4).f20460i.add(new pw("hr_low_alert", 2, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(4).f20460i.get(5).b(0, 14L);
        bkVar.f19753c.get(4).f20460i.add(new pw("speed_high_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(6).b(0, 15L);
        bkVar.f19753c.get(4).f20460i.add(new pw("speed_low_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(7).b(0, 16L);
        bkVar.f19753c.get(4).f20460i.add(new pw("cad_high_alert", 132, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(4).f20460i.get(8).b(0, 17L);
        bkVar.f19753c.get(4).f20460i.add(new pw("cad_low_alert", 132, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(4).f20460i.get(9).b(0, 18L);
        bkVar.f19753c.get(4).f20460i.add(new pw("power_high_alert", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(4).f20460i.get(10).b(0, 19L);
        bkVar.f19753c.get(4).f20460i.add(new pw("power_low_alert", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(4).f20460i.get(11).b(0, 20L);
        bkVar.f19753c.get(4).f20460i.add(new pw("time_duration_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(4).f20460i.get(12).b(0, 23L);
        bkVar.f19753c.get(4).f20460i.add(new pw("distance_duration_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(4).f20460i.get(13).b(0, 24L);
        bkVar.f19753c.get(4).f20460i.add(new pw("calorie_duration_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "calories"));
        bkVar.f19753c.get(4).f20460i.get(14).b(0, 25L);
        bkVar.f19753c.get(4).f20460i.add(new pw("fitness_equipment_state", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(15).b(0, 27L);
        bkVar.f19753c.get(4).f20460i.add(new pw("set_motion_type", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s,"));
        bkVar.f19753c.get(4).f20460i.get(16).b(0, 30L);
        bkVar.f19753c.get(4).f20460i.get(16).a(new vc(5, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(16).a(new vc(6, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("detected_motion_type", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(17).b(0, 29L);
        bkVar.f19753c.get(4).f20460i.add(new pw("sport_point", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(18).b(0, 33L);
        bkVar.f19753c.get(4).f20460i.get(18).a(new vc(7, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(18).a(new vc(8, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("vo2_max", 2, 1.0d, 0.0d, "mL/kg/min"));
        bkVar.f19753c.get(4).f20460i.get(19).b(0, 37L);
        bkVar.f19753c.get(4).f20460i.add(new pw("firstbeat_recovery_time", 132, 1.0d, 0.0d, "min"));
        bkVar.f19753c.get(4).f20460i.get(20).b(0, 38L);
        bkVar.f19753c.get(4).f20460i.get(20).b(0, 39L);
        bkVar.f19753c.get(4).f20460i.add(new pw("gear_change_data", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(21).b(0, 42L);
        bkVar.f19753c.get(4).f20460i.get(21).b(0, 43L);
        bkVar.f19753c.get(4).f20460i.get(21).a(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(21).a(new vc(12, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(21).a(new vc(9, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(21).a(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("sleep_duration", 132, 1.0d, 0.0d, "min"));
        bkVar.f19753c.get(4).f20460i.get(22).b(0, 40L);
        bkVar.f19753c.get(4).f20460i.add(new pw("rider_position", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(23).b(0, 44L);
        bkVar.f19753c.get(4).f20460i.add(new pw("comm_timeout", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(24).b(0, 47L);
        bkVar.f19753c.get(4).f20460i.add(new pw("lt_bpm", 132, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(4).f20460i.get(25).b(0, 49L);
        bkVar.f19753c.get(4).f20460i.add(new pw("lt_speed", 132, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(26).b(0, 50L);
        bkVar.f19753c.get(4).f20460i.add(new pw("lt_watts", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(4).f20460i.get(27).b(0, 51L);
        bkVar.f19753c.get(4).f20460i.add(new pw("ascent_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(28).b(0, 52L);
        bkVar.f19753c.get(4).f20460i.add(new pw("descent_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(4).f20460i.get(29).b(0, 53L);
        bkVar.f19753c.get(4).f20460i.add(new pw("dive_alert", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(30).b(0, 56L);
        bkVar.f19753c.get(4).f20460i.add(new pw("cycling_ftp_calculation_watts", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(4).f20460i.get(31).b(0, 48L);
        bkVar.f19753c.get(4).f20460i.add(new pw("auto_activity_detect_duration", 132, 1.0d, 0.0d, "min"));
        bkVar.f19753c.get(4).f20460i.get(32).b(0, 54L);
        bkVar.f19753c.get(4).f20460i.add(new pw("reps_duration_alert", 132, 1.0d, 0.0d, "reps"));
        bkVar.f19753c.get(4).f20460i.get(33).b(0, 58L);
        bkVar.f19753c.get(4).f20460i.add(new pw("stress_high", 131, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(34).b(0, 61L);
        bkVar.f19753c.get(4).f20460i.add(new pw("low_spo2_alert_threshold", 132, 100.0d, 0.0d, "percent"));
        bkVar.f19753c.get(4).f20460i.get(35).b(0, 62L);
        bkVar.f19753c.get(4).f20460i.add(new pw("spo2_reading", 132, 100.0d, 0.0d, "percent"));
        bkVar.f19753c.get(4).f20460i.get(36).b(0, 63L);
        bkVar.f19753c.get(4).f20460i.add(new pw("nutrition_data", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(37).b(0, 64L);
        bkVar.f19753c.get(4).f20460i.get(37).b(0, 65L);
        bkVar.f19753c.get(4).f20460i.get(37).a(new vc(17, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(37).a(new vc(18, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("sedentary_hr_alert", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(38).b(0, 66L);
        bkVar.f19753c.get(4).f20460i.get(38).a(new vc(19, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(38).a(new vc(20, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("radar_threat_alert", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(39).b(0, 75L);
        bkVar.f19753c.get(4).f20460i.get(39).a(new vc(21, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(39).a(new vc(22, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(39).a(new vc(23, false, 8, 10.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.get(39).a(new vc(24, false, 8, 10.0d, 0.0d));
        bkVar.f19753c.get(4).f20460i.add(new pw("target_effort_adjustment", 132, 1.0d, 0.0d, "percent"));
        bkVar.f19753c.get(4).f20460i.get(40).b(0, 77L);
        bkVar.f19753c.get(4).f20460i.add(new pw("body_battery_version", 132, 100.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(41).b(0, 78L);
        bkVar.f19753c.get(4).f20460i.add(new pw("accel_roughness_version", 132, 100.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(42).b(0, 79L);
        bkVar.f19753c.get(4).f20460i.add(new pw("radar_threat_alert_version", 132, 100.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(43).b(0, 80L);
        bkVar.f19753c.get(4).f20460i.add(new pw("target_effort_adjustment_for_stamina", 132, 1.0d, 0.0d, "percent"));
        bkVar.f19753c.get(4).f20460i.get(44).b(0, 88L);
        bkVar.f19753c.get(4).f20460i.add(new pw("stamina_effort_adjustment_prompt", 132, 1.0d, 0.0d, "percent"));
        bkVar.f19753c.get(4).f20460i.get(45).b(0, 87L);
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("event_group", 4, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("motion_type_timeout", 5, 132, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("motion_type", 6, 132, 1.0d, 0.0d, "", false, zn.MOTION_TYPE));
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("opponent_score", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        zn znVar4 = zn.UINT8Z;
        bkVar.e(new rc("front_gear_num", 9, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("front_gear", 10, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("rear_gear_num", 11, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("rear_gear", 12, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("device_index", 13, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        bkVar.e(new rc("activity_type", 14, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_TYPE));
        bkVar.e(new rc("start_timestamp", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(16).f20460i.add(new pw("auto_activity_detect_start_timestamp", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s"));
        bkVar.f19753c.get(16).f20460i.get(0).b(0, 54L);
        bkVar.e(new rc("activity_subtype", 16, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_SUBTYPE));
        bkVar.e(new rc("nutrition_progress", 17, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("nutrition_total", 18, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sedentary_hr_alert_threshold", 19, 2, 1.0d, 0.0d, "bpm", false, znVar3));
        bkVar.e(new rc("sedentary_hr_alert_avg_hr", 20, 2, 1.0d, 0.0d, "bpm", false, znVar3));
        bkVar.e(new rc("radar_threat_level_max", 21, 0, 1.0d, 0.0d, "", false, zn.RADAR_THREAT_LEVEL_TYPE));
        bkVar.e(new rc("radar_threat_count", 22, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("radar_threat_avg_approach_speed", 23, 2, 10.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("radar_threat_max_approach_speed", 24, 2, 10.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bb() {
        super(wb.b(21));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(4);
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

    public bb(bk bkVar) {
        super(bkVar);
    }
}
