package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ot extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20386e;

    static {
        bk bkVar = new bk("sleep_level", 275);
        f20386e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("sleep_level", 0, 0, 1.0d, 0.0d, "", false, zn.SLEEP_LEVEL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ot() {
        super(wb.b(275));
    }

    public ot(bk bkVar) {
        super(bkVar);
    }
}
