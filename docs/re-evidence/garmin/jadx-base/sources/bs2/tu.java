package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class tu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20585e;

    static {
        bk bkVar = new bk("spindle_do_spin_cal", 92);
        f20585e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("pco", 1, 131, 16.0d, 0.0d, "mm", false, zn.SINT16));
        bkVar.e(new rc("mass", 2, 132, 256.0d, 0.0d, "kg", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc(FirebaseAnalytics.Param.INDEX, 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("g_range", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tu() {
        super(wb.b(92));
    }

    public tu(bk bkVar) {
        super(bkVar);
    }
}
