package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class a8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19659e;

    static {
        bk bkVar = new bk("dive_gas", 259);
        f19659e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("helium_content", 0, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("oxygen_content", 1, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("status", 2, 0, 1.0d, 0.0d, "", false, zn.DIVE_GAS_STATUS));
        bkVar.e(new rc("mode", 3, 0, 1.0d, 0.0d, "", false, zn.DIVE_GAS_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a8() {
        super(wb.b(259));
    }

    public a8(bk bkVar) {
        super(bkVar);
    }
}
