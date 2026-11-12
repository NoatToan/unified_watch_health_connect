package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class l3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20274e;

    static {
        bk bkVar = new bk("ble_data_ext", 246);
        f20274e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("data_length", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("data", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("packet_id", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public l3() {
        super(wb.b(246));
    }

    public l3(bk bkVar) {
        super(bkVar);
    }
}
