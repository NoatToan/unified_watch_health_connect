package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class eg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20079e;

    static {
        bk bkVar = new bk("hill_score", 402);
        f20079e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("overall_score", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("strength_score", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("endurance_score", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("trend", 3, 0, 1.0d, 0.0d, "", false, zn.HILL_SCORE_TREND));
        bkVar.e(new rc("classification", 4, 0, 1.0d, 0.0d, "", false, zn.HILL_SCORE_CLASSIFICATION));
        bkVar.e(new rc("feedback_phrase", 5, 0, 1.0d, 0.0d, "", false, zn.HILL_SCORE_FEEDBACK));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public eg() {
        super(wb.b(402));
    }

    public eg(bk bkVar) {
        super(bkVar);
    }
}
