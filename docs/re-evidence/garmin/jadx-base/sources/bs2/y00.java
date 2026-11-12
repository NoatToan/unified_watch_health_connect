package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class y00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20681e;

    static {
        bk bkVar = new bk("vector_research_log", 146);
        f20681e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(1).f20459h.add(new vc(4, false, 0, 256.0d, 0.0d));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("force", 1, 131, 16.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("accel", 2, 131, 256.0d, 0.0d, "m/s^2", false, znVar2));
        bkVar.e(new rc("pco", 3, 131, 16.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("fractional_timestamp", 4, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("cycle_count", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y00() {
        super(wb.b(146));
    }

    public y00(bk bkVar) {
        super(bkVar);
    }
}
