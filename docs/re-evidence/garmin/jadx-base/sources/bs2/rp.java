package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class rp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20465e;

    static {
        bk bkVar = new bk("rally_x10_verification", 441);
        f20465e = bkVar;
        zn znVar = zn.BYTE;
        bkVar.e(new rc("segment", 0, 13, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("force", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("force_error_avg", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("force_error_min", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("force_error_max", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("force_error_stdev", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar2));
        bkVar.e(new rc("pco", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("pco_error_avg", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("pco_error_min", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("pco_error_max", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("pco_error_stdev", 10, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public rp() {
        super(wb.b(441));
    }

    public rp(bk bkVar) {
        super(bkVar);
    }
}
