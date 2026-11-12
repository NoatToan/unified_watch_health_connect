package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class w20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20637e;

    static {
        bk bkVar = new bk("zones_target", 7);
        f20637e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("max_heart_rate", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("threshold_heart_rate", 2, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("functional_threshold_power", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hr_calc_type", 5, 0, 1.0d, 0.0d, "", false, zn.HR_ZONE_CALC));
        bkVar.e(new rc("pwr_calc_type", 7, 0, 1.0d, 0.0d, "", false, zn.PWR_ZONE_CALC));
        bkVar.e(new rc("max_met", 8, 132, 1024.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.BOOL;
        bkVar.e(new rc("hr_zones_default", 9, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("auto_max_hr_enabled", 10, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("threshold_heart_rate_auto_detected", 11, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("ftp_auto_detected", 12, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("power_zone_mode", 13, 0, 1.0d, 0.0d, "", false, zn.POWER_ZONE_MODE));
        bkVar.e(new rc("coefficient_of_drag_area", 14, 132, 1000.0d, 0.0d, "m^2", false, znVar2));
        bkVar.e(new rc("critical_swim_speed", 15, 132, 1.0d, 0.0d, "mm/s", false, znVar2));
        bkVar.e(new rc("critical_swim_speed_timestamp", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public w20() {
        super(wb.b(7));
    }

    public w20(bk bkVar) {
        super(bkVar);
    }
}
