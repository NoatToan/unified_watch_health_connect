package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ug extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20598e;

    static {
        bk bkVar = new bk("hrv", 78);
        f20598e = bkVar;
        bkVar.e(new rc("time", 0, 132, 1000.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ug() {
        super(wb.b(78));
    }

    public ug(bk bkVar) {
        super(bkVar);
    }
}
