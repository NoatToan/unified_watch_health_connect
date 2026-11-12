package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class mg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20312e;

    static {
        bk bkVar = new bk("hr_zone", 8);
        f20312e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("high_bpm", 1, 2, 1.0d, 0.0d, "bpm", false, zn.UINT8));
        bkVar.e(new rc("name", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mg() {
        super(wb.b(8));
    }

    public mg(bk bkVar) {
        super(bkVar);
    }
}
