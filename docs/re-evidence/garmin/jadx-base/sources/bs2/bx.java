package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class bx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19764e;

    static {
        bk bkVar = new bk("swing_path", TsExtractor.TS_STREAM_TYPE_AC4);
        f19764e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("qx", 0, 131, 10000.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("qy", 1, 131, 10000.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("qz", 2, 131, 10000.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("qs", 3, 131, 10000.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sx", 4, 131, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sy", 5, 131, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sz", 6, 131, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bx() {
        super(wb.b(TsExtractor.TS_STREAM_TYPE_AC4));
    }

    public bx(bk bkVar) {
        super(bkVar);
    }
}
