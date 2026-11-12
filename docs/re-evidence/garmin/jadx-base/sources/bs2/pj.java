package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class pj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20402e;

    static {
        bk bkVar = new bk("max_met_data", 229);
        f20402e = bkVar;
        bkVar.e(new rc("update_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("max_met", 1, 133, 65536.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("vo2_max", 2, 132, 10.0d, 0.0d, "mL/kg/min", false, znVar2));
        zn znVar3 = zn.SINT8;
        bkVar.e(new rc("fitness_age", 3, 1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("fitness_age_desc", 4, 1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sport", 5, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 6, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("analyzer_method", 7, 0, 1.0d, 0.0d, "", false, zn.FIRSTBEAT_ANALYZER_METHOD));
        bkVar.e(new rc("max_met_category", 8, 0, 1.0d, 0.0d, "", false, zn.MAX_MET_CATEGORY));
        bkVar.e(new rc("calibrated_data", 9, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("maximal_met_heat_alti", 10, 133, 65536.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("maximal_met_uncorrected", 11, 133, 65536.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hr_source", 12, 0, 1.0d, 0.0d, "", false, zn.MAX_MET_HEART_RATE_SOURCE));
        bkVar.e(new rc("speed_source", 13, 0, 1.0d, 0.0d, "", false, zn.MAX_MET_SPEED_SOURCE));
        bkVar.e(new rc("maximal_met_confidence_interval", 14, 132, 1000.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pj() {
        super(wb.b(229));
    }

    public pj(bk bkVar) {
        super(bkVar);
    }
}
