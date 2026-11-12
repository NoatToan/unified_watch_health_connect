package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class a10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19656e;

    static {
        bk bkVar = new bk("vector_rider_position_truth", 163);
        f19656e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.f19753c.get(1).f20459h.add(new vc(1, false, 0, 256.0d, 0.0d));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 1, 132, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.INDEX, 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("position_truth", 3, 0, 1.0d, 0.0d, "", false, zn.RIDER_POSITION));
        bkVar.e(new rc("comments", 4, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a10() {
        super(wb.b(163));
    }

    public a10(bk bkVar) {
        super(bkVar);
    }
}
