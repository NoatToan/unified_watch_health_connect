package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class uy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20604e;

    static {
        bk bkVar = new bk("training_readiness", 369);
        f20604e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("level", 1, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_LEVEL));
        bkVar.e(new rc("feedback_short", 2, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FEEDBACK_SHORT));
        bkVar.e(new rc("feedback_long", 3, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FEEDBACK_LONG));
        bkVar.e(new rc("sleep_score", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_score_factor_percent", 5, 2, 1.0d, 0.0d, "%", false, znVar));
        zn znVar2 = zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK;
        bkVar.e(new rc("sleep_score_factor_feedback", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("recovery_time", 7, 132, 1.0d, 0.0d, "min", false, znVar3));
        bkVar.e(new rc("recovery_time_factor_percent", 8, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("recovery_time_factor_feedback", 9, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("acwr_factor_percent", 10, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("acwr_factor_feedback", 11, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("stress_history_factor_percent", 12, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("stress_history_factor_feedback", 13, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hrv_factor_percent", 14, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("hrv_factor_feedback", 15, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_history_factor_percent", 16, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("sleep_history_factor_feedback", 17, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("valid_sleep", 18, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("input_context", 19, 0, 1.0d, 0.0d, "", false, zn.LHA_INPUT_CONTEXT));
        bkVar.e(new rc("local_timestamp", 20, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("hrv_weekly_average", 21, 132, 128.0d, 0.0d, "ms", false, znVar3));
        bkVar.e(new rc("acute_load", 22, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("acwr_optimal_upper_limit", 23, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("acwr_optimal_lower_limit", 24, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sleep_score_factor_feedback_phrase", 25, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_SLEEP_SCORE));
        bkVar.e(new rc("recovery_time_factor_feedback_phrase", 26, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_RECOVERY_TIME));
        bkVar.e(new rc("acwr_factor_feedback_phrase", 27, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_ACWR));
        bkVar.e(new rc("stress_history_factor_feedback_phrase", 28, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_STRESS_HISTORY));
        bkVar.e(new rc("hrv_factor_feedback_phrase", 29, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_HRV));
        bkVar.e(new rc("sleep_history_factor_feedback_phrase", 30, 0, 1.0d, 0.0d, "", false, zn.LHA_TRAINING_READINESS_FACTOR_FEEDBACK_SLEEP_HISTORY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public uy() {
        super(wb.b(369));
    }

    public uy(bk bkVar) {
        super(bkVar);
    }
}
