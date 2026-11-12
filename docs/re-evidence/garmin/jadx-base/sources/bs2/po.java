package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class po extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20404e;

    static {
        bk bkVar = new bk("rally_x10_afe_tempcal", 454);
        f20404e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("setup", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pga_setting", 1, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("offset_coef", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("gain_coef", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public po() {
        super(wb.b(454));
    }

    public po(bk bkVar) {
        super(bkVar);
    }
}
