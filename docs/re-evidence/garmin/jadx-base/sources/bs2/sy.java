package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class sy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20564e;

    static {
        bk bkVar = new bk("training_plan", 137);
        f20564e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.LOCAL_DATE_TIME;
        bkVar.e(new rc(FirebaseAnalytics.Param.START_DATE, 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(FirebaseAnalytics.Param.END_DATE, 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_workout_date", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_plan_type", 4, 0, 1.0d, 0.0d, "", false, zn.TRAINING_PLAN_TYPE));
        bkVar.e(new rc("training_plan_difficulty", 5, 0, 1.0d, 0.0d, "", false, zn.TRAINING_PLAN_DIFFICULTY));
        bkVar.e(new rc("training_plan_method", 6, 0, 1.0d, 0.0d, "", false, zn.TRAINING_PLAN_METHOD));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("weeks", 7, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("workout_count", 8, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("goal_description", 9, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("goal_capability", 10, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("time_created", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sy() {
        super(wb.b(137));
    }

    public sy(bk bkVar) {
        super(bkVar);
    }
}
