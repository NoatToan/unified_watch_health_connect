package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class xn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20670e;

    static {
        bk bkVar = new bk("premium_map_layers", 381);
        f20670e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("layer_type", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xn() {
        super(wb.b(381));
    }

    public xn(bk bkVar) {
        super(bkVar);
    }
}
