package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class qk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20435e;

    static {
        bk bkVar = new bk("metronome_settings", SyslogConstants.LOG_LOCAL3);
        f20435e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("cadence", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("frequency", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alerts", 3, 0, 1.0d, 0.0d, "", false, zn.TONE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qk() {
        super(wb.b(SyslogConstants.LOG_LOCAL3));
    }

    public qk(bk bkVar) {
        super(bkVar);
    }
}
