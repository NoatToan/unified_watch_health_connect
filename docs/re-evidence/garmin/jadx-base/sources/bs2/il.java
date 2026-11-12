package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class il extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20218e;

    static {
        bk bkVar = new bk("multisport_transition_detection", WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED);
        f20218e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("gps_spd", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gps_snr", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_xhigh_1hz", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_xlow_1hz", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_yhigh_1hz", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_ylow_1hz", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_mag_1hz", 6, 132, 4096.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("accel_prdc_1hz", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public il() {
        super(wb.b(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED));
    }

    public il(bk bkVar) {
        super(bkVar);
    }
}
