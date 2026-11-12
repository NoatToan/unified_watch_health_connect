package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20140e;

    static {
        bk bkVar = new bk("respiration_rate_wake_average", 298);
        f20140e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("respiration_rate_daily_wake_average", 0, 131, 100.0d, 0.0d, "breaths/min", false, znVar));
        bkVar.e(new rc("respiration_rate_long_term_wake_average", 1, 131, 100.0d, 0.0d, "breaths/min", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fq() {
        super(wb.b(298));
    }

    public fq(bk bkVar) {
        super(bkVar);
    }
}
