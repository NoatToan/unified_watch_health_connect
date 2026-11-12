package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class px extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20417e;

    static {
        bk bkVar = new bk("time_in_zone", 216);
        f20417e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("reference_mesg", 0, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("reference_index", 1, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("time_in_hr_zone", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("time_in_speed_zone", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("time_in_cadence_zone", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("time_in_power_zone", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("hr_zone_high_boundary", 6, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("speed_zone_high_boundary", 7, 132, 1000.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("cadence_zone_high_bondary", 8, 2, 1.0d, 0.0d, "rpm", false, znVar2));
        bkVar.e(new rc("power_zone_high_boundary", 9, 132, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("hr_calc_type", 10, 0, 1.0d, 0.0d, "", false, zn.HR_ZONE_CALC));
        bkVar.e(new rc("max_heart_rate", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("resting_heart_rate", 12, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("threshold_heart_rate", 13, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pwr_calc_type", 14, 0, 1.0d, 0.0d, "", false, zn.PWR_ZONE_CALC));
        bkVar.e(new rc("functional_threshold_power", 15, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("time_spent_in_gear", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        zn znVar4 = zn.UINT8Z;
        bkVar.e(new rc("front_gear", 17, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("rear_gear", 18, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public px() {
        super(wb.b(216));
    }

    public px(bk bkVar) {
        super(bkVar);
    }
}
