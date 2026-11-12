package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class no extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20333e;

    static {
        bk bkVar = new bk("rally_x10_accel_tempcal", 443);
        f20333e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("temp_offset", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_offset", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ax_temp_coef", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ay_temp_coef", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("az_temp_coef", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public no() {
        super(wb.b(443));
    }

    public no(bk bkVar) {
        super(bkVar);
    }
}
