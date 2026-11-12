package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ds extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20060e;

    static {
        bk bkVar = new bk("session_config", 59);
        f20060e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("stop_time_reset", 0, 2, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("start_time_reset", 1, 2, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("reset_stop_time", 2, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("reset_factor", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ds() {
        super(wb.b(59));
    }

    public ds(bk bkVar) {
        super(bkVar);
    }
}
