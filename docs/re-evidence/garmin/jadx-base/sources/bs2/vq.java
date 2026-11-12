package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20628e;

    static {
        bk bkVar = new bk("running_tolerance_history", 486);
        f20628e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("total_impact_load", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("total_distance", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("tolerance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("week_index", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vq() {
        super(wb.b(486));
    }

    public vq(bk bkVar) {
        super(bkVar);
    }
}
