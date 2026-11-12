package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class a9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19660e;

    static {
        bk bkVar = new bk("ecg_filtered_sample", 338);
        f19660e = bkVar;
        bkVar.e(new rc("filtered_value", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a9() {
        super(wb.b(338));
    }

    public a9(bk bkVar) {
        super(bkVar);
    }
}
