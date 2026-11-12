package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class lu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20286e;

    static {
        bk bkVar = new bk("speed_zone", 53);
        f20286e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("high_value", 0, 132, 1000.0d, 0.0d, "m/s", false, zn.UINT16));
        bkVar.e(new rc("name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lu() {
        super(wb.b(53));
    }

    public lu(bk bkVar) {
        super(bkVar);
    }
}
