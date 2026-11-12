package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class aa extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19661e;

    static {
        bk bkVar = new bk("eqn_horse_post_activity_gait_summary", 482);
        f19661e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("time_in_activity", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("percentage_rest", 1, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("percentage_walk", 2, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("percentage_trot", 3, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("percentage_canter", 4, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("percentage_gallop", 5, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("total_strides", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public aa() {
        super(wb.b(482));
    }

    public aa(bk bkVar) {
        super(bkVar);
    }
}
