package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class bv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19762e;

    static {
        bk bkVar = new bk("spindle_force_self_check", SyslogConstants.LOG_LOCAL1);
        f19762e = bkVar;
        bkVar.e(new rc("message_index", 0, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("force", 1, 132, 16.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("force_error_avg", 2, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("force_error_min", 3, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("force_error_max", 4, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("force_error_var", 5, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pco", 6, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pco_error_avg", 7, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pco_error_min", 8, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pco_error_max", 9, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pco_error_var", 10, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("force_error_fraction", 11, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pco_error_fraction", 12, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bv() {
        super(wb.b(SyslogConstants.LOG_LOCAL1));
    }

    public bv(bk bkVar) {
        super(bkVar);
    }
}
