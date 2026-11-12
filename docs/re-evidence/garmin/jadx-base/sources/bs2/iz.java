package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class iz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20225e;

    static {
        bk bkVar = new bk("tsb_settings", 365);
        f20225e = bkVar;
        bkVar.e(new rc("tx_enable", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("proportional_gain", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "dB", false, znVar));
        bkVar.e(new rc("integral_gain", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "dB", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("fixed_gain", 3, 2, 1.0d, 0.0d, "dB", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("rssi_setpoint", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("plt_thresh_mult", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("plt_thresh", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("transducer_spacing", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("calib_accel", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calib_gyro", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calib_mag", 10, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calib_mag_soft_x", 11, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calib_mag_soft_y", 12, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calib_mag_soft_z", 13, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("max_tx_duty_cycle", 14, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("tx_chan", 15, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("search_gain", 16, 2, 1.0d, 0.0d, "dB", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public iz() {
        super(wb.b(365));
    }

    public iz(bk bkVar) {
        super(bkVar);
    }
}
