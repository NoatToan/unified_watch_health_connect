package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class w00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20635e;

    static {
        bk bkVar = new bk("vector_field_data", 102);
        f20635e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 1, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT32Z;
        bkVar.e(new rc("serial_number", 2, 140, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8Z;
        bkVar.e(new rc("hardware_minor_version", 3, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("hardware_major_version", 4, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("product", 5, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("software_minor_version", 6, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("software_major_version", 7, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("software_development_version", 8, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("special", 9, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("customization", 10, 10, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.UINT16Z;
        bkVar.e(new rc("control_bits", 11, 139, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("operating_time", 12, 140, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("rf_on_time", 13, 140, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("resets", 14, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("accel_on_time", 15, 140, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("watchdog_resets", 16, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("hardware_resets", 17, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("min_temperature", 18, 139, 32.0d, 273.0d, "C", false, znVar4));
        bkVar.e(new rc("max_temperature", 19, 139, 32.0d, 273.0d, "C", false, znVar4));
        bkVar.e(new rc("accel_sleep_time", 20, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("clock_error_count", 21, 10, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("query_count", 22, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sample_count", 23, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("query_fail_count", 24, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sample_fail_count", 25, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("spindle_disconnect_count", 26, 139, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("spindle_consecutive_fail_count", 27, 139, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("spindle_on_time", 28, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("spindle_off_time", 29, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("cycle_count", 30, 139, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("install_angle", 31, 132, 182.04444d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar));
        bkVar.e(new rc("crank_length", 32, 132, 65536.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("prev_reset_type", 33, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public w00() {
        super(wb.b(102));
    }

    public w00(bk bkVar) {
        super(bkVar);
    }
}
