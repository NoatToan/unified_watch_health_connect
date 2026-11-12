package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20336e;

    static {
        bk bkVar = new bk("sdm_profile", 5);
        f20336e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sdm_ant_id", 1, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("sdm_cal_factor", 2, 132, 10.0d, 0.0d, "%", false, zn.UINT16));
        bkVar.e(new rc("odometer", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("speed_source", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sdm_ant_id_trans_type", 5, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("led_blink_min_speed", 6, 2, 16.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("odometer_rollover", 7, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nr() {
        super(wb.b(5));
    }

    public nr(bk bkVar) {
        super(bkVar);
    }
}
