package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class l5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20275e;

    static {
        bk bkVar = new bk("climb_pro", 317);
        f20275e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("climb_pro_event", 2, 0, 1.0d, 0.0d, "", false, zn.CLIMB_PRO_EVENT));
        bkVar.e(new rc("climb_number", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("climb_category", 4, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("current_dist", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public l5() {
        super(wb.b(317));
    }

    public l5(bk bkVar) {
        super(bkVar);
    }
}
