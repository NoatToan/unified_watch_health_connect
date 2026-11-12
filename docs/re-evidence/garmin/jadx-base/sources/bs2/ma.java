package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ma extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20308e;

    static {
        bk bkVar = new bk("eqn_recovery_summary", 497);
        f20308e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("recovery_heart_rate", 0, 2, 1.0d, 0.0d, "bpm", false, zn.UINT8));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("recovery_time", 1, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("recovery_time_to_target", 2, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ma() {
        super(wb.b(497));
    }

    public ma(bk bkVar) {
        super(bkVar);
    }
}
