package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class zo extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21021e;

    static {
        bk bkVar = new bk("rally_x10_gyro_tempcal", 444);
        f21021e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("temp_offset", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gyro_offset", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gx_temp_coef", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gy_temp_coef", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gz_temp_coef", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zo() {
        super(wb.b(444));
    }

    public zo(bk bkVar) {
        super(bkVar);
    }
}
