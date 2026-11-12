package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class br extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19758e;

    static {
        bk bkVar = new bk("save_offsets", 126);
        f19758e = bkVar;
        bkVar.e(new rc("flash_key", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public br() {
        super(wb.b(126));
    }

    public br(bk bkVar) {
        super(bkVar);
    }
}
