package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20055e;

    static {
        bk bkVar = new bk("magnetometer_data", 208);
        f20055e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("mag_x", 2, 132, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("mag_y", 3, 132, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("mag_z", 4, 132, 1.0d, 0.0d, "counts", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("calibrated_mag_x", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "G", false, znVar2));
        bkVar.e(new rc("calibrated_mag_y", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "G", false, znVar2));
        bkVar.e(new rc("calibrated_mag_z", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "G", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dj() {
        super(wb.b(208));
    }

    public dj(bk bkVar) {
        super(bkVar);
    }
}
