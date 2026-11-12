package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ky extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20270e;

    static {
        bk bkVar = new bk("training_history_results", 232);
        f20270e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("training_status", 2, 0, 1.0d, 0.0d, "", false, zn.TRAINING_HISTORY_TRAINING_STATUS));
        bkVar.e(new rc("fitness_level_trend", 3, 0, 1.0d, 0.0d, "", false, zn.TRAINING_HISTORY_VO2MAX_TREND));
        bkVar.e(new rc("load_level_trend", 4, 0, 1.0d, 0.0d, "", false, zn.TRAINING_HISTORY_TRAINING_LOAD_TREND));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("weekly_training_load_sum", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("load_tunnel_min", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("load_tunnel_max", 7, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("load_tunnel_overreaching", 8, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fitness_trend_sport", 9, 0, 1.0d, 0.0d, "", false, zn.TRAINING_HISTORY_VO2MAX_TREND_SPORT));
        bkVar.e(new rc("training_status_feedback_phrase", 10, 0, 1.0d, 0.0d, "", false, zn.TRAINING_STATUS_FEEDBACK_PHRASE));
        bkVar.e(new rc("training_status_2_feedback_phrase", 11, 0, 1.0d, 0.0d, "", false, zn.TRAINING_STATUS_2_FEEDBACK_PHRASE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ky() {
        super(wb.b(232));
    }

    public ky(bk bkVar) {
        super(bkVar);
    }
}
