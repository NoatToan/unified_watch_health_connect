package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class s00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20472e;

    static {
        bk bkVar = new bk("vector_cadence_truth", 153);
        f20472e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.f19753c.get(1).f20459h.add(new vc(4, false, 0, 256.0d, 0.0d));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("crank_angle", 1, 132, 65536.0d, 0.0d, "brads", false, znVar));
        bkVar.e(new rc("revolution_count", 2, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("fractional_timestamp", 4, 132, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public s00() {
        super(wb.b(153));
    }

    public s00(bk bkVar) {
        super(bkVar);
    }
}
