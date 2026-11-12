package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class el extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20082e;

    static {
        bk bkVar = new bk("multisport_leg", SyslogConstants.LOG_LOCAL2);
        f20082e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("leg_sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("leg_sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("leg_sport_event", 2, 0, 1.0d, 0.0d, "", false, zn.SPORT_EVENT));
        bkVar.e(new rc("leg_name", 3, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public el() {
        super(wb.b(SyslogConstants.LOG_LOCAL2));
    }

    public el(bk bkVar) {
        super(bkVar);
    }
}
