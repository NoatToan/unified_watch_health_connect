package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class v extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20606e;

    static {
        bk bkVar = new bk("activity_monitor_profile", 83);
        f20606e = bkVar;
        bkVar.e(new rc("logging_interval", 0, 132, 1.0d, 0.0d, "mins", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v() {
        super(wb.b(83));
    }

    public v(bk bkVar) {
        super(bkVar);
    }
}
