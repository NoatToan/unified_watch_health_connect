package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class mi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20314e;

    static {
        bk bkVar = new bk("iop", 220);
        f20314e = bkVar;
        bkVar.e(new rc("inst_id", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public mi() {
        super(wb.b(220));
    }

    public mi(bk bkVar) {
        super(bkVar);
    }
}
