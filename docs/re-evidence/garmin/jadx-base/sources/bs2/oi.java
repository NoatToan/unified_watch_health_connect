package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class oi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20381e;

    static {
        bk bkVar = new bk("jet_lag_settings", 392);
        f20381e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("notifications_enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("notification_types", 2, 140, 1.0d, 0.0d, "", false, zn.JET_LAG_NOTIFICATION_TYPE_BITS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public oi() {
        super(wb.b(392));
    }

    public oi(bk bkVar) {
        super(bkVar);
    }
}
