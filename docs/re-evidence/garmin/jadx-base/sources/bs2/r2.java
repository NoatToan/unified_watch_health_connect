package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class r2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20448e;

    static {
        bk bkVar = new bk("beat_intervals", 290);
        f20448e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("time", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r2() {
        super(wb.b(290));
    }

    public r2(bk bkVar) {
        super(bkVar);
    }
}
