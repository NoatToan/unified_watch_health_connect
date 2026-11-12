package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ju extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20243e;

    static {
        bk bkVar = new bk("sources", 22);
        f20243e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.DEVICE_INDEX;
        bkVar.e(new rc("speed_source", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("distance_source", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cadence_source", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alti_source", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hr_source", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calorie_source", 5, 0, 1.0d, 0.0d, "", false, zn.CALORIE_SOURCE));
        bkVar.e(new rc("power_source", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("grade_source", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("resistance_source", 8, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cycle_length_source", 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reserved1_jira601", 10, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reserved2_jira601", 11, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reserved3_jira601", 12, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reserved4_jira601", 13, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("position_source", 14, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mo2_source", 15, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("run_source", 16, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ju() {
        super(wb.b(22));
    }

    public ju(bk bkVar) {
        super(bkVar);
    }
}
