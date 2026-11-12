package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class np extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20334e;

    static {
        bk bkVar = new bk("rally_x10_tempcal_quality", 455);
        f20334e = bkVar;
        zn znVar = zn.SINT16;
        bkVar.e(new rc("start_temp", 0, 131, 256.0d, 0.0d, "degC", false, znVar));
        bkVar.e(new rc("min_temp", 1, 131, 256.0d, 0.0d, "degC", false, znVar));
        bkVar.e(new rc("end_temp", 2, 131, 256.0d, 0.0d, "degC", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("strain_fit", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("exc_fit", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_fit", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("gyro_fit", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("afe_fit", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public np() {
        super(wb.b(455));
    }

    public np(bk bkVar) {
        super(bkVar);
    }
}
