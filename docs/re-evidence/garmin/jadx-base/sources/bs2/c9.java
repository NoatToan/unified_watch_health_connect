package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class c9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19777e;

    static {
        bk bkVar = new bk("ecg_raw_sample", 337);
        f19777e = bkVar;
        bkVar.e(new rc("raw_value", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c9() {
        super(wb.b(337));
    }

    public c9(bk bkVar) {
        super(bkVar);
    }
}
