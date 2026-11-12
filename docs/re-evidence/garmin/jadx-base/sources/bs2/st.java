package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class st extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20539e;

    static {
        bk bkVar = new bk("sleep_restless_moments", 382);
        f20539e = bkVar;
        bkVar.e(new rc("sleep_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCALTIME_INTO_DAY));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("count", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("delta_minutes", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public st() {
        super(wb.b(382));
    }

    public st(bk bkVar) {
        super(bkVar);
    }
}
