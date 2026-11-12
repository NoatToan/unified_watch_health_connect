package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class l2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20273e;

    static {
        bk bkVar = new bk("bbi_confidence", 400);
        f20273e = bkVar;
        bkVar.e(new rc("confidence", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public l2() {
        super(wb.b(400));
    }

    public l2(bk bkVar) {
        super(bkVar);
    }
}
