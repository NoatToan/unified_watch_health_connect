package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class ul extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20601e;

    static {
        bk bkVar = new bk("nav_alert_settings", 231);
        f20601e = bkVar;
        bkVar.e(new rc("distance", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("time", 1, 133, 1.0d, 0.0d, "", false, zn.SINT32));
        bkVar.e(new rc("enabled", 2, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("alert_type", 3, 0, 1.0d, 0.0d, "", false, zn.NAV_ALERT_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ul() {
        super(wb.b(231));
    }

    public ul(bk bkVar) {
        super(bkVar);
    }
}
