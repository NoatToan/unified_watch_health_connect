package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class tn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20579e;

    static {
        bk bkVar = new bk("power_zone", 9);
        f20579e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("high_value", 1, 132, 1.0d, 0.0d, "watts", false, zn.UINT16));
        bkVar.e(new rc("name", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tn() {
        super(wb.b(9));
    }

    public tn(bk bkVar) {
        super(bkVar);
    }
}
