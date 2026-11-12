package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class p3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20395e;

    static {
        bk bkVar = new bk("blood_pressure", 51);
        f20395e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("systolic_pressure", 0, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("diastolic_pressure", 1, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("mean_arterial_pressure", 2, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("map_3_sample_mean", 3, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("map_morning_values", 4, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("map_evening_values", 5, 132, 1.0d, 0.0d, "mmHg", false, znVar));
        bkVar.e(new rc("heart_rate", 6, 2, 1.0d, 0.0d, "bpm", false, zn.UINT8));
        bkVar.e(new rc("heart_rate_type", 7, 0, 1.0d, 0.0d, "", false, zn.HR_TYPE));
        bkVar.e(new rc("status", 8, 0, 1.0d, 0.0d, "", false, zn.BP_STATUS));
        bkVar.e(new rc("user_profile_index", 9, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("multi_measurement_mode", 10, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public p3() {
        super(wb.b(51));
    }

    public p3(bk bkVar) {
        super(bkVar);
    }
}
