package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class sm extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20538e;

    static {
        bk bkVar = new bk("pace_band", 310);
        f20538e = bkVar;
        bkVar.e(new rc("event_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("segmentation_type", 2, 0, 1.0d, 0.0d, "", false, zn.PACE_BAND_SPLIT_SEGMENTATION));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("goal_total_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("goal_avg_speed", 4, 132, 1000.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("goal_distance", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("split_count", 6, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("user_fixed_split_distance", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("pacing_strategy", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("hill_effort", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("course_serial_number", 10, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("elevation_segment_tolerance", 11, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("elevation_segment_min_length", 12, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("pace_factor", 13, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("contains_manual_pace_edits", 14, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sm() {
        super(wb.b(310));
    }

    public sm(bk bkVar) {
        super(bkVar);
    }
}
