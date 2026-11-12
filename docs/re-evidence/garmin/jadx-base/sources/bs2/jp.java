package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class jp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20236e;

    static {
        bk bkVar = new bk("rally_x10_strain_tempcal", 442);
        f20236e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("temp_offset", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("strain_offset", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ip_temp_coef", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("in_temp_coef", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("op_temp_coef", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("on_temp_coef", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jp() {
        super(wb.b(442));
    }

    public jp(bk bkVar) {
        super(bkVar);
    }
}
