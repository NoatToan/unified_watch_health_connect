package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class c0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19766e;

    static {
        bk bkVar = new bk("adaptive_coaching_training_plan", 426);
        f19766e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_start_date", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_program", 1, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_TRAINING_PROGRAM));
        bkVar.e(new rc("training_mode", 2, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_TRAINING_MODE));
        zn znVar2 = zn.ADAPTIVE_COACHING_SPORT_BITS;
        bkVar.e(new rc("primary_sport", 3, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("user_sports", 4, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(FirebaseAnalytics.Param.START_DATE, 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.LOCAL_DATE_TIME;
        bkVar.e(new rc("local_start_date", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc(FirebaseAnalytics.Param.END_DATE, 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("local_end_date", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("has_gym_access", 9, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("lha_training_mode", 10, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_LHA_TRAINING_MODE));
        bkVar.e(new rc("swim_ability", 11, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_SWIM_ABILITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c0() {
        super(wb.b(426));
    }

    public c0(bk bkVar) {
        super(bkVar);
    }
}
