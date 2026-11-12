package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class td extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20575e;

    static {
        bk bkVar = new bk("garmin_iop_data", SyslogConstants.LOG_LOCAL6);
        f20575e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("fragment_index", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fragment_count", 2, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("data", 3, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("data_size", 4, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public td() {
        super(wb.b(SyslogConstants.LOG_LOCAL6));
    }

    public td(bk bkVar) {
        super(bkVar);
    }
}
