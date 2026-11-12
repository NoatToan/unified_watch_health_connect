package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class o extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20365e;

    static {
        bk bkVar = new bk("accelerometer_data", 165);
        f20365e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("accel_x", 2, 132, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("accel_y", 3, 132, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("accel_z", 4, 132, 1.0d, 0.0d, "counts", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("calibrated_accel_x", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar2));
        bkVar.e(new rc("calibrated_accel_y", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar2));
        bkVar.e(new rc("calibrated_accel_z", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar2));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("compressed_calibrated_accel_x", 8, 131, 1.0d, 0.0d, "mG", false, znVar3));
        bkVar.e(new rc("compressed_calibrated_accel_y", 9, 131, 1.0d, 0.0d, "mG", false, znVar3));
        bkVar.e(new rc("compressed_calibrated_accel_z", 10, 131, 1.0d, 0.0d, "mG", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o() {
        super(wb.b(165));
    }

    public o(bk bkVar) {
        super(bkVar);
    }
}
