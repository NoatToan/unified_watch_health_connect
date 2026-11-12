package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class ro extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20464e;

    static {
        bk bkVar = new bk("rally_x10_cal_info", 438);
        f20464e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("force", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc("hanger", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc("pedal_weight", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc("pedal_pco", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("temperature", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("handedness", 5, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ro() {
        super(wb.b(438));
    }

    public ro(bk bkVar) {
        super(bkVar);
    }
}
