package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class dp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20057e;

    static {
        bk bkVar = new bk("rally_x10_pedal_install_data", 459);
        f20057e = bkVar;
        bkVar.e(new rc("install_vector", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, zn.FLOAT32));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("install_angle", 1, 132, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("data_flags", 2, 132, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dp() {
        super(wb.b(459));
    }

    public dp(bk bkVar) {
        super(bkVar);
    }
}
