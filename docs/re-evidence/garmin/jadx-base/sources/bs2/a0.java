package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class a0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19654e;

    static {
        bk bkVar = new bk("adaptive_coaching_training_period", 427);
        f19654e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.START_DATE, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.END_DATE, 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("period", 2, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_TRAINING_PERIOD));
        zn znVar2 = zn.LOCAL_DATE_TIME;
        bkVar.e(new rc("local_start_date", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("local_end_date", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a0() {
        super(wb.b(427));
    }

    public a0(bk bkVar) {
        super(bkVar);
    }
}
