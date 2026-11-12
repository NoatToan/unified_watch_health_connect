package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class a extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19653e;

    static {
        bk bkVar = new bk("aad_accel_features", 289);
        f19653e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("time", 0, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("energy_total", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("zero_cross_cnt", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("instance", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("time_above_threshold", 4, 132, 25.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a() {
        super(wb.b(289));
    }

    public a(bk bkVar) {
        super(bkVar);
    }
}
