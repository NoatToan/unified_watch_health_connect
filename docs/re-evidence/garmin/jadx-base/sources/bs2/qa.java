package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qa extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20428e;

    static {
        bk bkVar = new bk("eqn_sensor_status", 475);
        f20428e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("is_sensor_misaligned", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("is_sensor_slipping", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("has_sensor_fallen_off", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("is_battery_low", 3, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("battery_percentage", 4, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("device_receive_rssi", 5, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("device_id", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("battery_voltage", 7, 132, 1000.0d, 0.0d, "V", false, zn.UINT16));
        bkVar.e(new rc("num_connected_clients", 8, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qa() {
        super(wb.b(475));
    }

    public qa(bk bkVar) {
        super(bkVar);
    }
}
