package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class u9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20594e;

    static {
        bk bkVar = new bk("eqn_horse_gait_updates", 488);
        f20594e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("total_stride_count", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides", false, znVar));
        bkVar.e(new rc("stride_count_per_gait", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides", false, znVar));
        bkVar.e(new rc("total_time_per_gait", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("tail_swish", 3, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("tail_swish_count", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "swishes", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public u9() {
        super(wb.b(488));
    }

    public u9(bk bkVar) {
        super(bkVar);
    }
}
