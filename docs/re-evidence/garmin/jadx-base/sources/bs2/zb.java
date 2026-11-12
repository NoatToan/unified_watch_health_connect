package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class zb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20712e;

    static {
        bk bkVar = new bk("fbt_lha_daily_data", 384);
        f20712e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("minimal_hr_daily_estimate", 0, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("minimal_hr_daily_estimate_reliability", 1, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("sleep_score", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("awake_duration", 3, 132, 1.0d, 0.0d, "minutes", false, znVar3));
        zn znVar4 = zn.SINT8;
        bkVar.e(new rc("relax_stress_intensity_average_awake", 4, 1, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.SINT32;
        bkVar.e(new rc("state_recovery_duration_awake", 5, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("state_stress_duration_awake", 6, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("rmssd_average_sleep", 7, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("local_timestamp", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("sleep_begin_time_utc", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar6 = zn.SINT16;
        bkVar.e(new rc("sleep_begin_time_timezone_offset", 10, 131, 1.0d, 0.0d, "minutes", false, znVar6));
        bkVar.e(new rc("sleep_end_time_utc", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_end_time_timezone_offset", 12, 131, 1.0d, 0.0d, "minutes", false, znVar6));
        bkVar.e(new rc("acclimatization_type", 13, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_before_sleep", 14, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_after_sleep_yesterday", 15, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_after_sleep_today", 16, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_level", 17, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_LEVEL));
        bkVar.e(new rc("physical_activity_duration_scaled", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("relax_stress_intensity_average_close_to_sleep_start", 19, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sleep_duration_score", 20, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sleep_feedback", 21, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_pressure", 22, 131, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("sleep_recovery_score", 23, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sleep_awake_duration", 24, 132, 1.0d, 0.0d, "minutes", false, znVar3));
        bkVar.e(new rc("sleep_quality_score", 25, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zb() {
        super(wb.b(384));
    }

    public zb(bk bkVar) {
        super(bkVar);
    }
}
