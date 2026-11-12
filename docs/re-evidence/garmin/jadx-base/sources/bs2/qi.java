package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class qi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20434e;

    static {
        bk bkVar = new bk("jump", 285);
        f20434e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("distance", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("height", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("rotations", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("hang_time", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("position_lat", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("position_long", 6, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("speed", 7, 132, 1000.0d, 0.0d, "m/s", false, zn.UINT16));
        bkVar.f19753c.get(8).f20459h.add(new vc(8, false, 16, 1000.0d, 0.0d));
        bkVar.e(new rc("enhanced_speed", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qi() {
        super(wb.b(285));
    }

    public qi(bk bkVar) {
        super(bkVar);
    }
}
