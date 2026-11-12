package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class h1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20173e;

    static {
        bk bkVar = new bk("archery_x", 500);
        f20173e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 0, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("distance", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("aim_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("aim_std_dev", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("moa_avg", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("moa_std_dev", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("shot_break_moa_avg", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("shot_break_moa_std_dev", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("group_size", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("maximum_scale", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        zn znVar4 = zn.SINT32;
        bkVar.e(new rc("position_lat", 10, 133, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("position_lon", 11, 133, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("end_number", 12, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("shot_execution_time", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("vertical_motion_summary", 14, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("horizontal_motion_summary", 15, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("avg_aim_time", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("avg_shot_time", 17, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("shot_heart_rate", 18, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("shot_stress", 19, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("shot_respiration", 20, 2, 1.0d, 0.0d, "breaths/min", false, znVar));
        bkVar.e(new rc("aim_bias", 21, 0, 1.0d, 0.0d, "", false, zn.ARCHERY_AIM_BIAS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public h1() {
        super(wb.b(500));
    }

    public h1(bk bkVar) {
        super(bkVar);
    }
}
