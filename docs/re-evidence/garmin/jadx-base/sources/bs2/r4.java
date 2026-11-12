package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class r4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20450e;

    static {
        bk bkVar = new bk("cadence_zone", 131);
        f20450e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("high_value", 0, 2, 1.0d, 0.0d, "rpm", false, zn.UINT8));
        bkVar.e(new rc("name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r4() {
        super(wb.b(131));
    }

    public r4(bk bkVar) {
        super(bkVar);
    }
}
