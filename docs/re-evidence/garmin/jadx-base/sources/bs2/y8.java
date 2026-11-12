package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class y8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20684e;

    static {
        bk bkVar = new bk("ebike_range_model_info", 350);
        f20684e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("manufacturer", 0, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("ant_channel_id", 1, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("ebike_assist_mode", 2, 2, 1.0d, 0.0d, "depends on sensor", false, znVar));
        bkVar.e(new rc("range_model_version", 3, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("distance_coefficient", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ascent_coefficient", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("distance_momentum", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ascent_momentum", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("model_error", 8, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y8() {
        super(wb.b(350));
    }

    public y8(bk bkVar) {
        super(bkVar);
    }
}
