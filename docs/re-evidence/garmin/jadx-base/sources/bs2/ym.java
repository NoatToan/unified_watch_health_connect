package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ym extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20694e;

    static {
        bk bkVar = new bk("pages_map", 254);
        f20694e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("map", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("default_to_last", 1, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ym() {
        super(wb.b(254));
    }

    public ym(bk bkVar) {
        super(bkVar);
    }
}
