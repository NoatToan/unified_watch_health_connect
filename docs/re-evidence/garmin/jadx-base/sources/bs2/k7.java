package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20253e;

    static {
        bk bkVar = new bk("device_aux_battery_info", 375);
        f20253e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        bkVar.e(new rc("battery_voltage", 1, 132, 256.0d, 0.0d, "V", false, zn.UINT16));
        bkVar.e(new rc("battery_status", 2, 2, 1.0d, 0.0d, "", false, zn.BATTERY_STATUS));
        bkVar.e(new rc("battery_identifier", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k7() {
        super(wb.b(375));
    }

    public k7(bk bkVar) {
        super(bkVar);
    }
}
