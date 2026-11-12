package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class u8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20593e;

    static {
        bk bkVar = new bk("ebike_assist_mode_info", 367);
        f20593e = bkVar;
        bkVar.e(new rc("ebike_assist_mode", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("ebike_assist_mode_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public u8() {
        super(wb.b(367));
    }

    public u8(bk bkVar) {
        super(bkVar);
    }
}
