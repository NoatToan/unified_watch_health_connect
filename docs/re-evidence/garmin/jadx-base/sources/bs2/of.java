package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class of extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20378e;

    static {
        bk bkVar = new bk("group_ride_competition_section", 420);
        f20378e = bkVar;
        bkVar.e(new rc("competition_id", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("start_distance", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("end_distance", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public of() {
        super(wb.b(420));
    }

    public of(bk bkVar) {
        super(bkVar);
    }
}
