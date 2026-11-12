package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20255e;

    static {
        bk bkVar = new bk("endurance_score", 403);
        f20255e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("overall_score", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification", 1, 0, 1.0d, 0.0d, "", false, zn.ENDURANCE_SCORE_CLASSIFICATION));
        bkVar.e(new rc("feedback_phrase", 2, 0, 1.0d, 0.0d, "", false, zn.ENDURANCE_SCORE_FEEDBACK));
        bkVar.e(new rc("classification_lower_limit_intermediate", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_lower_limit_trained", 4, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_lower_limit_well_trained", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_lower_limit_expert", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_lower_limit_superior", 7, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_lower_limit_elite", 8, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gauge_lower_limit", 9, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gauge_upper_limit", 10, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k9() {
        super(wb.b(403));
    }

    public k9(bk bkVar) {
        super(bkVar);
    }
}
