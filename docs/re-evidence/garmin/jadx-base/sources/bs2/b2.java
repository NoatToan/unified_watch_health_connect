package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class b2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19685e;

    static {
        bk bkVar = new bk("bat_swing_metrics", 237);
        f19685e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("bat_speed", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kph", false, znVar));
        bkVar.e(new rc("hand_speed", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kph", false, znVar));
        bkVar.e(new rc("time_to_impact", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("attack_angle", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar));
        bkVar.e(new rc("elevation_angle", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar));
        bkVar.e(new rc("sampling_interval", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("coaching_tip_index", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("num_bat_swing_path_records", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("swing_start_time", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public b2() {
        super(wb.b(237));
    }

    public b2(bk bkVar) {
        super(bkVar);
    }
}
