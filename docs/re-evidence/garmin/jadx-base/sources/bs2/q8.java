package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class q8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20426e;

    static {
        bk bkVar = new bk("dog_training", 348);
        f20426e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("gps_fix_type", 2, 0, 1.0d, 0.0d, "", false, zn.DOG_TRACKER_GPS_FIX_TYPE));
        bkVar.e(new rc("dog_type", 3, 0, 1.0d, 0.0d, "", false, zn.DOG_TYPE));
        bkVar.e(new rc("dog_status", 4, 0, 1.0d, 0.0d, "", false, zn.DOG_STATUS));
        bkVar.e(new rc("barks_per_minute", 5, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("battery_voltage", 6, 132, 1000.0d, 0.0d, "V", false, zn.UINT16));
        bkVar.e(new rc("charging_status", 7, 0, 1.0d, 0.0d, "", false, zn.PMIC_CHARGING_STATUS));
        bkVar.e(new rc("training_type", 8, 0, 1.0d, 0.0d, "", false, zn.DOG_TRAINING_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public q8() {
        super(wb.b(348));
    }

    public q8(bk bkVar) {
        super(bkVar);
    }
}
