package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class kt extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20269e;

    static {
        bk bkVar = new bk("sleep_disruption_overnight_severity", 471);
        f20269e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("severity", 0, 0, 1.0d, 0.0d, "", false, zn.SLEEP_DISRUPTION_SEVERITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kt() {
        super(wb.b(471));
    }

    public kt(bk bkVar) {
        super(bkVar);
    }
}
