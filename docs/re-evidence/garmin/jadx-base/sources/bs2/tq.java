package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class tq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20582e;

    static {
        bk bkVar = new bk("running_economy", 496);
        f20582e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("classification", 2, 0, 1.0d, 0.0d, "", false, zn.RUNNING_ECONOMY_CLASSIFICATION));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tq() {
        super(wb.b(496));
    }

    public tq(bk bkVar) {
        super(bkVar);
    }
}
