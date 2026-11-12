package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class cg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19780e;

    static {
        bk bkVar = new bk("hfd_data", 495);
        f19780e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("data", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cg() {
        super(wb.b(495));
    }

    public cg(bk bkVar) {
        super(bkVar);
    }
}
