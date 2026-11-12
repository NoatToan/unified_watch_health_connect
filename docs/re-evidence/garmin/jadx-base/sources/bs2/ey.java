package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ey extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20085e;

    static {
        bk bkVar = new bk("training_balance_results", 294);
        f20085e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("monthly_load_aerobic_low", 0, 133, 65536.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("monthly_load_aerobic_high", 1, 133, 65536.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("monthly_load_anaerobic", 2, 133, 65536.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("monthly_load_aerobic_low_target_min", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("monthly_load_aerobic_low_target_max", 4, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("monthly_load_aerobic_high_target_min", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("monthly_load_aerobic_high_target_max", 6, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("monthly_load_anaerobic_target_min", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("monthly_load_anaerobic_target_max", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_balance_feedback_phrase", 9, 0, 1.0d, 0.0d, "", false, zn.TRAINING_BALANCE_FEEDBACK_PHRASE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ey() {
        super(wb.b(294));
    }

    public ey(bk bkVar) {
        super(bkVar);
    }
}
