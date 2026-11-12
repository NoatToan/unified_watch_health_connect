package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class c8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19776e;

    static {
        bk bkVar = new bk("dive_readiness", 418);
        f19776e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("lha_input_context", 0, 0, 1.0d, 0.0d, "", false, zn.LHA_INPUT_CONTEXT));
        bkVar.e(new rc("local_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("overall_score", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("feedback_phrase", 3, 0, 1.0d, 0.0d, "", false, zn.LHA_DIVE_READINESS_FEEDBACK_PHRASE));
        bkVar.e(new rc("overall_classification", 4, 0, 1.0d, 0.0d, "", false, zn.LHA_DIVE_READINESS_CLASSIFICATION));
        zn znVar3 = zn.LHA_DIVE_READINESS_FACTOR_CLASSIFICATION;
        bkVar.e(new rc("classification_factor_sleep", 5, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sleep_score", 6, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar4 = zn.LHA_DIVE_READINESS_SLEEP_QUALITY;
        bkVar.e(new rc("sleep_quality", 7, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("classification_factor_sleep_history", 8, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sleep_history_quality", 9, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("classification_factor_body_battery", 10, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("body_battery", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("classification_factor_training", 12, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("training_status", 13, 0, 1.0d, 0.0d, "", false, zn.TRAINING_HISTORY_TRAINING_STATUS));
        bkVar.e(new rc("classification_factor_recovery_time", 14, 0, 1.0d, 0.0d, "", false, znVar3));
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("recovery_time", 15, 132, 1.0d, 0.0d, "min", false, znVar5));
        bkVar.e(new rc("classification_factor_dive_history", 16, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("classification_factor_jetlag", 17, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("jetlag_severity", 18, 0, 1.0d, 0.0d, "", false, zn.LHA_DIVE_READINESS_JETLAG_SEVERITY));
        zn znVar6 = zn.BOOL;
        bkVar.e(new rc("decompression_sickness_warning", 19, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("no_sleep_data", 20, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("no_recent_dive_history", 21, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("classification_blocked", 22, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("residual_tissue_load", 23, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("recent_gauge_dive", 24, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("cns", 25, 132, 1.0d, 0.0d, "percent", false, znVar5));
        bkVar.e(new rc("otus", 26, 132, 1.0d, 0.0d, "OTUs", false, znVar5));
        bkVar.e(new rc("last_dive_timestamp_utc", 27, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification_factor_recent_dive", 28, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c8() {
        super(wb.b(418));
    }

    public c8(bk bkVar) {
        super(bkVar);
    }
}
