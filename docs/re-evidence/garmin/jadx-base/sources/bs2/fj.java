package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20132e;

    static {
        bk bkVar = new bk("manual_stress_level", 228);
        f20132e = bkVar;
        bkVar.e(new rc("stress_level_value", 0, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("stress_level_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fj() {
        super(wb.b(228));
    }

    public fj(bk bkVar) {
        super(bkVar);
    }
}
