package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class zj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20715e;

    static {
        bk bkVar = new bk("menu_item", 182);
        f20715e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("message_number", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("field_number", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("parent_index", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("applicability", 3, 10, 1.0d, 0.0d, "", false, zn.FIELD_CONFIG_APPLICABILITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zj() {
        super(wb.b(182));
    }

    public zj(bk bkVar) {
        super(bkVar);
    }
}
