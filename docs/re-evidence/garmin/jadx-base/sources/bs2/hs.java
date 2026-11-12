package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class hs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20197e;

    static {
        bk bkVar = new bk("session_state", 60);
        f20197e = bkVar;
        bkVar.e(new rc("start_time", 0, 2, 1.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.e(new rc("stop_time", 1, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hs() {
        super(wb.b(60));
    }

    public hs(bk bkVar) {
        super(bkVar);
    }
}
